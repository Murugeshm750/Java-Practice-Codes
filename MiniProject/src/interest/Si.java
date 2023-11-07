package interest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Si extends JFrame {

	private JPanel contentPane;
	private JTextField principle;
	private JTextField time;
	private JTextField interest;
	private JTextField displaybox;
	private JButton clear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Si frame = new Si();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Si() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 527);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIMPLE INTEREST");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(252, 20, 221, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRINCIPLE AMOUNT  :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(100, 117, 222, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("TIME  :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(252, 185, 70, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RATE OF INTEREST  :");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(115, 259, 210, 24);
		contentPane.add(lblNewLabel_1_2);
		
		principle = new JTextField();
		principle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		principle.setBackground(SystemColor.controlHighlight);
		principle.setForeground(new Color(0, 0, 0));
		principle.setBounds(332, 107, 303, 48);
		contentPane.add(principle);
		principle.setColumns(10);
		
		time = new JTextField();
		time.setForeground(Color.BLACK);
		time.setFont(new Font("Times New Roman", Font.BOLD, 20));
		time.setColumns(10);
		time.setBackground(SystemColor.controlHighlight);
		time.setBounds(332, 173, 303, 48);
		contentPane.add(time);
		
		interest = new JTextField();
		interest.setForeground(Color.BLACK);
		interest.setFont(new Font("Times New Roman", Font.BOLD, 20));
		interest.setColumns(10);
		interest.setBackground(SystemColor.controlHighlight);
		interest.setBounds(332, 247, 303, 48);
		contentPane.add(interest);
		
		JButton calculate = new JButton("CALCULATE");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CALCULATE
				try
				{
				long p=Integer.valueOf(principle.getText());
				int n=Integer.valueOf(time.getText());
				int r=Integer.valueOf(interest.getText());
				
				float result=(p*n*r)/100;
			//	float result=(float) (p*(Math.pow(1+r/100, n))-p);
				
				String msg="";
				msg=msg+" "+result;
				displaybox.setText(msg);	
				}
				catch(Exception e1)
				{
					String message="Enter valid Input !!";
					JOptionPane.showMessageDialog(contentPane, message);
					principle.setText("");
					time.setText("");
					interest.setText("");
				}
			}
		});
		calculate.setForeground(SystemColor.window);
		calculate.setBackground(SystemColor.windowBorder);
		calculate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		calculate.setBounds(122, 369, 185, 48);
		contentPane.add(calculate);
		
		displaybox = new JTextField();
		displaybox.setForeground(Color.BLACK);
		displaybox.setFont(new Font("Times New Roman", Font.BOLD, 20));
		displaybox.setColumns(10);
		displaybox.setBackground(SystemColor.controlHighlight);
		displaybox.setBounds(332, 369, 303, 48);
		contentPane.add(displaybox);
		
		clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for clear
				principle.setText("");
				time.setText("");
				interest.setText("");
				displaybox.setText("");
				
			}
		});
		clear.setBackground(new Color(255, 0, 0));
		clear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		clear.setBounds(490, 433, 145, 33);
		contentPane.add(clear);
	}
}

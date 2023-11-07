package interest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Pi extends JFrame {

	private JPanel contentPane;
	private JTextField principle;
	private JTextField time;
	private JTextField interest;
	private JTextField displaybox;
	private double ci;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pi frame = new Pi();
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
	public Pi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPOUND INTEREST");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(203, 24, 293, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRINCIPLE AMOUNT   :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(50, 114, 227, 24);
		contentPane.add(lblNewLabel_1);
		
		principle = new JTextField();
		principle.setFont(new Font("Times New Roman", Font.BOLD, 20));
		principle.setBounds(308, 109, 235, 39);
		contentPane.add(principle);
		principle.setColumns(10);
		
		JButton calculate = new JButton("CALCULATE");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for calculation
				try
				{
				int p=Integer.valueOf(principle.getText());
				int n=Integer.valueOf(time.getText());
				int r=Integer.valueOf(interest.getText());
				
				ci=(int) (p*(Math.pow(1+r/100, n))-p);
				
				
				String msg="";
				msg=msg+" "+ci;
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
		calculate.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		calculate.setBounds(36, 357, 227, 39);
		contentPane.add(calculate);
		
		JLabel lblNewLabel_1_1 = new JLabel("TIME  :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(194, 192, 70, 24);
		contentPane.add(lblNewLabel_1_1);
		
		time = new JTextField();
		time.setFont(new Font("Times New Roman", Font.BOLD, 20));
		time.setColumns(10);
		time.setBounds(308, 181, 235, 39);
		contentPane.add(time);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("RATE OF INTEREST  :");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(50, 264, 210, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		interest = new JTextField();
		interest.setFont(new Font("Times New Roman", Font.BOLD, 20));
		interest.setColumns(10);
		interest.setBounds(308, 259, 235, 39);
		contentPane.add(interest);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Times New Roman", Font.BOLD, 20));
		displaybox.setColumns(10);
		displaybox.setBounds(308, 357, 235, 39);
		contentPane.add(displaybox);
		
		JButton clear = new JButton("CLEAR");
		clear.setBackground(new Color(255, 0, 51));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				principle.setText("");
				time.setText("");
				interest.setText("");
				displaybox.setText("");
				
			}
		});
		clear.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		clear.setBounds(355, 406, 188, 39);
		contentPane.add(clear);
	}
}

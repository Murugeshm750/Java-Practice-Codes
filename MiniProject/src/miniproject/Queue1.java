package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue1 extends JFrame {

	private JPanel contentPane;
	private JTextField qsize;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue1 frame = new Queue1();
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
	public Queue1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 593);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA  STRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(240, 28, 264, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE  :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(90, 113, 198, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT  :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(90, 204, 204, 22);
		contentPane.add(lblNewLabel_1_1);
		
		qsize = new JTextField();
		qsize.setBounds(319, 110, 96, 35);
		contentPane.add(qsize);
		qsize.setColumns(10);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(319, 201, 96, 35);
		contentPane.add(element);
		
		JButton createqueue = new JButton("CREATE QUEUE ");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for queue creation
				int len=Integer.valueOf(qsize.getText());
				q=new int[len];
				String message="Queue created @ "+len;
				JOptionPane.showMessageDialog(contentPane, message);
				size=q.length;
				
			}
		});
		createqueue.setFont(new Font("Times New Roman", Font.BOLD, 18));
		createqueue.setBounds(487, 113, 211, 46);
		contentPane.add(createqueue);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
				
				if(r == size-1)
				{
					String message="Insertion Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
					r++;
					q[r]=elem;
				}
				element.setText("");
			}
		});
		insert.setFont(new Font("Times New Roman", Font.BOLD, 18));
		insert.setBounds(487, 198, 211, 46);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for Dleteion
				
				if(r==-1 || f>r)
				{
					String message="Delete Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					//int elem=Integer.valueOf(element.getText());
					String message="Element Deleted @ "+q[f];
					++f;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				
			}
		});
		delete.setFont(new Font("Times New Roman", Font.BOLD, 18));
		delete.setBounds(487, 294, 211, 46);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Display
				if(r==-1 || f>r)
				{
					String message="Display Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					String msg="";
					for(int i=0;i<=r;i++)
					{
						msg=msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
				
			}
		});
		display.setFont(new Font("Times New Roman", Font.BOLD, 18));
		display.setBounds(77, 403, 211, 46);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Times New Roman", Font.BOLD, 17));
		displaybox.setColumns(10);
		displaybox.setBounds(354, 403, 281, 46);
		contentPane.add(displaybox);
	}
}

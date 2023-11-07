package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deleteposition;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 436);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(154, 10, 215, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(69, 70, 203, 21);
		contentPane.add(lblNewLabel_1);
		
		JTextArea length = new JTextArea();
		length.setBounds(282, 71, 55, 22);
		contentPane.add(length);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for creating array
				
				
			}
		});
		create.setFont(new Font("Tahoma", Font.BOLD, 15));
		create.setBounds(401, 68, 151, 27);
		contentPane.add(create);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER AN INTEGER ELEMENT :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(10, 138, 262, 21);
		contentPane.add(lblNewLabel_2);
		
		JTextArea element = new JTextArea();
		element.setBounds(282, 139, 55, 22);
		contentPane.add(element);
		
		JLabel lblNewLabel_3 = new JLabel("POSITION :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(174, 172, 98, 21);
		contentPane.add(lblNewLabel_3);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(477, 171, -36, 22);
		contentPane.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(499, 171, -52, 22);
		contentPane.add(textArea_3);
		
		JTextArea insertposition = new JTextArea();
		insertposition.setBounds(282, 173, 55, 22);
		contentPane.add(insertposition);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 15));
		insert.setBounds(398, 170, 91, 27);
		contentPane.add(insert);
		
		JLabel lblNewLabel_2_1 = new JLabel("ENTER THE POSITION :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_1.setBounds(75, 235, 197, 21);
		contentPane.add(lblNewLabel_2_1);
		
		JTextArea deletepos = new JTextArea();
		deletepos.setBounds(282, 236, 55, 22);
		contentPane.add(deletepos);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 15));
		delete.setBounds(398, 233, 91, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 15));
		display.setBounds(58, 325, 99, 27);
		contentPane.add(display);
		
		JTextArea displaybox = new JTextArea();
		displaybox.setBackground(new Color(144, 238, 144));
		displaybox.setBounds(183, 328, 324, 22);
		contentPane.add(displaybox);
	}
}

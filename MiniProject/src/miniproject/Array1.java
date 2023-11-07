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

public class Array1 extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JButton insert;
	private JLabel lblEnterAnElement;
	private JTextField insertposition;
	private JButton CreateArray;
	private JLabel lblEnterPosition;
	private JTextField deleteposition;
	private JButton delete;
	private JButton display;
	private JTextField displaybox;
	private int arr[];


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array1 frame = new Array1();
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
	public Array1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 694);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(302, 49, 216, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterArrayLength = new JLabel("ENTER ARRAY LENGTH :");
		lblEnterArrayLength.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterArrayLength.setBounds(103, 165, 205, 21);
		contentPane.add(lblEnterArrayLength);
		
		length = new JTextField();
		length.setBounds(333, 158, 96, 40);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel lblPosition = new JLabel("POSITION :");
		lblPosition.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPosition.setBounds(223, 335, 90, 21);
		contentPane.add(lblPosition);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(333, 252, 96, 40);
		contentPane.add(element);
		
		insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert
				
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="Element "+elem+" Inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
				
				
			}
		});
		insert.setBackground(new Color(139, 0, 0));
		insert.setForeground(new Color(255, 255, 255));
		insert.setFont(new Font("Times New Roman", Font.BOLD, 17));
		insert.setBounds(504, 331, 135, 29);
		contentPane.add(insert);
		
		lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterAnElement.setBounds(132, 263, 181, 21);
		contentPane.add(lblEnterAnElement);
		
		insertposition = new JTextField();
		insertposition.setColumns(10);
		insertposition.setBounds(333, 328, 96, 40);
		contentPane.add(insertposition);
		
		CreateArray = new JButton("CREATE ARRAY");
		CreateArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for create array
				
				int len=Integer.valueOf(length.getText());
				arr= new int[len];
				String message="Array of Length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				
				
			}
		});
		CreateArray.setForeground(new Color(255, 255, 255));
		CreateArray.setBackground(new Color(139, 0, 0));
		CreateArray.setFont(new Font("Times New Roman", Font.BOLD, 17));
		CreateArray.setBounds(504, 161, 187, 29);
		contentPane.add(CreateArray);
		
		lblEnterPosition = new JLabel("ENTER POSITION :");
		lblEnterPosition.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterPosition.setBounds(162, 405, 150, 21);
		contentPane.add(lblEnterPosition);
		
		deleteposition = new JTextField();
		deleteposition.setColumns(10);
		deleteposition.setBounds(333, 390, 96, 40);
		contentPane.add(deleteposition);
		
		delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//code for delete
				
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="Element Deleted @ the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				delete.setText("");
				deleteposition.setText("");
			}
		});
		delete.setBackground(new Color(139, 0, 0));
		delete.setForeground(new Color(255, 255, 255));
		delete.setFont(new Font("Times New Roman", Font.BOLD, 17));
		delete.setBounds(504, 397, 150, 29);
		contentPane.add(delete);
		
		display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for (int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(255, 255, 255));
		display.setBackground(new Color(139, 0, 0));
		display.setFont(new Font("Times New Roman", Font.BOLD, 17));
		display.setBounds(88, 531, 127, 36);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(173, 255, 47));
		displaybox.setColumns(10);
		displaybox.setBounds(252, 527, 414, 40);
		contentPane.add(displaybox);
	}
}

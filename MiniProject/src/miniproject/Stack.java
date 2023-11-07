package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField stacksize;
	private JTextField element;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 429);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(147, 22, 213, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterStackSize = new JLabel("ENTER STACK SIZE :");
		lblEnterStackSize.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterStackSize.setBounds(23, 88, 171, 21);
		contentPane.add(lblEnterStackSize);
		
		stacksize = new JTextField();
		stacksize.setBounds(218, 88, 96, 23);
		contentPane.add(stacksize);
		stacksize.setColumns(10);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.setFont(new Font("Tahoma", Font.BOLD, 17));
		createstack.setBounds(343, 88, 159, 29);
		contentPane.add(createstack);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement.setBounds(23, 149, 180, 21);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(218, 149, 96, 23);
		contentPane.add(element);
		
		JButton pop = new JButton("POP");
		pop.setFont(new Font("Tahoma", Font.BOLD, 17));
		pop.setBounds(343, 152, 159, 29);
		contentPane.add(pop);
		
		JButton push = new JButton("PUSH");
		push.setFont(new Font("Tahoma", Font.BOLD, 17));
		push.setBounds(343, 201, 159, 29);
		contentPane.add(push);
		
		JButton display = new JButton("DISPLAY");
		display.setFont(new Font("Tahoma", Font.BOLD, 17));
		display.setBounds(35, 303, 159, 29);
		contentPane.add(display);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(234, 303, 268, 31);
		contentPane.add(textField_2);
	}

}

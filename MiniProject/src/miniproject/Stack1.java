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

public class Stack1 extends JFrame {

	private JPanel contentPane;
	private JTextField stacksize;
	private JTextField element;
	private JTextField displaybox;
	private int arr[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack1 frame = new Stack1();
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
	public Stack1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 626);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(279, 42, 213, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterStackSize = new JLabel("ENTER STACK SIZE :");
		lblEnterStackSize.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterStackSize.setBounds(82, 136, 171, 21);
		contentPane.add(lblEnterStackSize);
		
		stacksize = new JTextField();
		stacksize.setBounds(279, 134, 96, 31);
		contentPane.add(stacksize);
		stacksize.setColumns(10);
		
		JButton createstack = new JButton("CREATE STACK");
		createstack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create a stack
				int len=Integer.valueOf(stacksize.getText());
				arr= new int[len];
				String message="Array of Length "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				size=arr.length;
				
			}
		});
		createstack.setFont(new Font("Tahoma", Font.BOLD, 17));
		createstack.setBounds(409, 133, 194, 32);
		contentPane.add(createstack);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement.setBounds(82, 207, 180, 21);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(279, 205, 96, 31);
		contentPane.add(element);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				
				if(top==-1)
				{
					String message="Pop Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
					--top;
					String message="Element Deleted is "+arr[top];
					JOptionPane.showMessageDialog(contentPane, message);
				}
				element.setText("");
			}
		});
		pop.setFont(new Font("Tahoma", Font.BOLD, 17));
		pop.setBounds(409, 277, 159, 29);
		contentPane.add(pop);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//code for push
				if(top==size-1)
				{
					String message="Push not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
					++top;
					arr[top]=elem;
					String message="Element Push @ "+top;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				element.setText("");
			}
		});
		push.setFont(new Font("Tahoma", Font.BOLD, 17));
		push.setBounds(409, 207, 159, 29);
		contentPane.add(push);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				if(top==-1)
				{
					String message="Display Not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					String msg="";
					for(int i=0;i<=arr.length-1;i++)
					{
						msg=msg+" "+arr[i];
					}
					displaybox.setText(msg);
				}
				
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 17));
		display.setBounds(66, 399, 159, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(279, 399, 361, 31);
		contentPane.add(displaybox);
	}
}

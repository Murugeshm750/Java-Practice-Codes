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

public class SLL extends JFrame {

	private JPanel contentPane;
	private JTextField ielement;
	private JTextField ifelement;
	private JTextField displaybox;
	
	class Node
	{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SLL frame = new SLL();
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
	public SLL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 592);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(161, 31, 336, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement.setBounds(10, 110, 180, 21);
		contentPane.add(lblEnterAnElement);
		
		JLabel lblEnterAnElement_1 = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement_1.setBounds(10, 206, 180, 21);
		contentPane.add(lblEnterAnElement_1);
		
		ielement = new JTextField();
		ielement.setBounds(211, 103, 96, 30);
		contentPane.add(ielement);
		ielement.setColumns(10);
		
		ifelement = new JTextField();
		ifelement.setColumns(10);
		ifelement.setBounds(211, 205, 96, 30);
		contentPane.add(ifelement);
		
		JButton irear = new JButton("INSERT REAR");
		irear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for Insertion Rear
				try
				{
				Node temp;
				int elem=Integer.valueOf(ielement.getText());
				Node newnode = new Node();
				newnode.data=elem;
				newnode.link=null;
				
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.link !=null)
					{
						temp=temp.link;
					}
					temp.link= newnode;
				}
				ielement.setText("");
				}
				catch(Exception e1)
				{
					String msessage="Please Enter an Element";
					JOptionPane.showMessageDialog(contentPane, msessage);
				}
				
			}
		});
		irear.setFont(new Font("Tahoma", Font.BOLD, 17));
		irear.setBounds(350, 106, 194, 35);
		contentPane.add(irear);
		
		JButton ifront = new JButton("INSERT FRONT");
		ifront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Insert Front
				
				try
				{
				int elem=Integer.valueOf(ifelement.getText());
				Node newnode= new Node();
				newnode.data=elem;
				newnode.link=null;
				
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.link=first;
					first=newnode;
				}
				ifelement.setText("");
				}
				catch(Exception e2)
				{
					String msessage="Please Enter an Element";
					JOptionPane.showMessageDialog(contentPane, msessage);
				}
			}
		});
		ifront.setFont(new Font("Tahoma", Font.BOLD, 17));
		ifront.setBounds(361, 199, 194, 35);
		contentPane.add(ifront);
		
		JButton drear = new JButton("DELETE REAR");
		drear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for Delete Rear
				Node temp;
				if(first == null)
				{
					String message="Delete Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.link==null)
				{
					String message="Element Deleted is "+first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					temp=first;
					while(temp.link.link !=null)
					{
						temp=temp.link;
					}
					String message="Element Deleted is "+temp.link.data;
					temp.link=null;
					JOptionPane.showMessageDialog(contentPane,message);
				}
			}
		});
		drear.setFont(new Font("Tahoma", Font.BOLD, 17));
		drear.setBounds(161, 317, 194, 35);
		contentPane.add(drear);
		
		JButton dfront = new JButton("DELETE FRONT");
		dfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete Front
				
				if(first==null)
				{
					String message="Delete Not Possible";
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else if(first.link== null)
				{
					String message="Element Deleted is "+first.data;
					first=null;
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else
				{
					String message="Element Deleted is "+first.data;
					first=first.link;
					JOptionPane.showMessageDialog(contentPane,message);
				}
			}
		});
		dfront.setFont(new Font("Tahoma", Font.BOLD, 17));
		dfront.setBounds(427, 317, 194, 35);
		contentPane.add(dfront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for Display
				
				Node temp;
				if(first == null)
				{
					String message="Display Not Possible";
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else if(first.link == null)
				{
					String msg="";
					msg=msg+" "+first.data;	
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						String msg="";
						msg=msg+" "+first.data;
						temp=temp.link;
						displaybox.setText(msg);
						
					}
					
				}
				
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 17));
		display.setBounds(94, 419, 169, 45);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(102, 205, 170));
		displaybox.setColumns(10);
		displaybox.setBounds(354, 422, 355, 46);
		contentPane.add(displaybox);
	}

}

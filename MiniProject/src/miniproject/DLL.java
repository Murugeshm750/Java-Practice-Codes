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

public class DLL extends JFrame {

	private JPanel contentPane;
	private JTextField relement;
	private JTextField felement;
	private JTextField displaybox;
	
	class Node
	{
		int data;
		Node prelink;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DLL frame = new DLL();
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
	public DLL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 620);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(148, 23, 342, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement.setBounds(41, 116, 180, 21);
		contentPane.add(lblEnterAnElement);
		
		JLabel lblEnterAnElement_1 = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement_1.setBounds(41, 186, 180, 21);
		contentPane.add(lblEnterAnElement_1);
		
		relement = new JTextField();
		relement.setColumns(10);
		relement.setBounds(253, 110, 96, 40);
		contentPane.add(relement);
		
		felement = new JTextField();
		felement.setColumns(10);
		felement.setBounds(253, 177, 96, 40);
		contentPane.add(felement);
		
		JButton inrear = new JButton("INSERT REAR");
		inrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insert rear
				
				Node temp;
				int elem=Integer.valueOf(relement.getText());
				Node newnode =new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					temp=first;
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
						temp.nextlink=newnode;
						newnode.prelink=temp;
					}
				}
				relement.setText("");
			}
		});
		inrear.setFont(new Font("Tahoma", Font.BOLD, 17));
		inrear.setBounds(401, 113, 245, 41);
		contentPane.add(inrear);
		
		JButton infront = new JButton("INSERT FRONT");
		infront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				
				int elem=Integer.valueOf(felement.getText());
				Node newnode =new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				
				if(first == null)
				{
					first = newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
				felement.setText("");
				
			}
		});
		infront.setFont(new Font("Tahoma", Font.BOLD, 17));
		infront.setBounds(401, 176, 245, 41);
		contentPane.add(infront);
		
		JButton drear = new JButton("DELETE REAR");
		drear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for delete rear
				Node temp;
				if( first == null)
				{
					String message="Delete Not possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.nextlink == null)
				{
					String message="Element Deleted is "+first.data;
					first = null;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					temp= first;
					while(temp.nextlink.nextlink != null)
					{
						temp=temp.nextlink;
					}
					String message="Element Deleted is "+temp.nextlink.data;
					temp.nextlink=null;
					JOptionPane.showMessageDialog(contentPane, message);
				}
			}
		});
		drear.setFont(new Font("Tahoma", Font.BOLD, 17));
		drear.setBounds(401, 247, 245, 41);
		contentPane.add(drear);
		
		JButton dfront = new JButton("DELETE FRONT");
		dfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				if (first == null)
				{
					String message="Delete Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.nextlink == null)
				{
					String message="Element Deleted is "+first.data;
					first = null;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		dfront.setFont(new Font("Tahoma", Font.BOLD, 17));
		dfront.setBounds(401, 316, 245, 47);
		contentPane.add(dfront);
		
		JButton displayf = new JButton("DISPLAY FORWARD");
		displayf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display forward
				
				Node temp;
				if(first == null)
				{
					String message="Display Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else if(first.nextlink == null)
				{
					String msg="";
					msg=msg+" "+first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp =first;
					while(temp!=null)
					{
						String msg="";
						msg=msg+" "+temp.data;
						temp=temp.nextlink;				
						displaybox.setText(msg);
					}
				}
			}
		});
		displayf.setFont(new Font("Tahoma", Font.BOLD, 17));
		displayf.setBounds(66, 397, 245, 41);
		contentPane.add(displayf);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(230, 230, 250));
		displaybox.setBounds(119, 496, 527, 45);
		contentPane.add(displaybox);
		
		JButton displayr = new JButton("DISPLAY REVERSE");
		displayr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display reverse
				
				Node temp;
				if(first==null)
				{
					String message="Display Not Possible";
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else if(first.nextlink==null)
				{
					String msg="";
					msg=msg+" "+first.data;
					displaybox.setText(msg);
				}
				else
				{
					temp=first;
					while(temp.nextlink != null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						String msg="";
						msg=msg+" "+temp.data;
						temp=temp.prelink;
						displaybox.setText(msg);
					}
				}
			}
		});
		displayr.setFont(new Font("Tahoma", Font.BOLD, 17));
		displayr.setBounds(401, 399, 245, 37);
		contentPane.add(displayr);
	}
}

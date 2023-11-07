import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class JavaCrud {

	private JFrame frame;
	private JTextField bookname;
	private JTextField txtedition;
	private JTextField txtprice;
	private JTable table_2;
	private JTable table_3;
	private JTextField txtbookid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCrud window = new JavaCrud();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaCrud() {
		initialize();
		connect();
		table_load();
	}

	
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/Javacrud","root","");
		}
		catch (ClassNotFoundException ex)
		{
			
		}
		catch (SQLException ex)
		{
			
		}
	}
	
	public void table_load()
	{
		try
		{
			pst=con.prepareStatement("select * from book");
			rs=pst.executeQuery();
			table_3.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 1182, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOOK SHOP");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(144, 238, 144));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(423, 21, 256, 58);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221, 160, 221));
		panel.setBounds(31, 110, 521, 326);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "REGISTRATION", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BOOK NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(47, 50, 126, 24);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("EDITION");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(47, 116, 126, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("PRICE");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(47, 183, 126, 24);
		panel.add(lblNewLabel_1_2);
		
		bookname = new JTextField();
		bookname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		bookname.setBounds(204, 47, 239, 36);
		panel.add(bookname);
		bookname.setColumns(10);
		
		txtedition = new JTextField();
		txtedition.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtedition.setColumns(10);
		txtedition.setBounds(204, 104, 239, 36);
		panel.add(txtedition);
		
		txtprice = new JTextField();
		txtprice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtprice.setColumns(10);
		txtprice.setBounds(204, 167, 239, 36);
		panel.add(txtprice);
		
		JButton save = new JButton("SAVE");
		save.setBackground(new Color(144, 238, 144));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for save
				
				String bname,edition,price;
				
				bname=bookname.getText();
			    edition=txtedition.getText();
			    price=txtprice.getText();
				/*
				
				int edition=Integer.valueOf(txtedition.getText());
				int price=Integer.valueOf(txtprice.getText());*/
			    try
			    {
			    	pst= con.prepareStatement("insert into book(name,edition,price)values(?,?,?)");
			    	pst.setString(1, bname);
			    	pst.setString(2, edition);
			    	pst.setString(3, price);
			    	pst.executeUpdate();
			    	String msg="Record Added Successfully !!!";
			    	JOptionPane.showMessageDialog(null, msg);
			    	table_load();
			    	bookname.setText("");
			    	txtedition.setText("");
			    	txtprice.setText("");
			    	bookname.requestFocus();	
			    }
			    catch (Exception e3)
				{
					String msg="Enter some Details !";
					JOptionPane.showMessageDialog(null, msg);
				}
				
				
			}
		});
		save.setFont(new Font("Times New Roman", Font.BOLD, 20));
		save.setBounds(20, 252, 147, 45);
		panel.add(save);
		
		JButton exit = new JButton("EXIT");
		exit.setBackground(new Color(255, 69, 0));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for exit
				
				System.exit(0);
			}
		});
		exit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		exit.setBounds(193, 252, 147, 45);
		panel.add(exit);
		
		JButton clear = new JButton("CLEAR");
		clear.setBackground(new Color(255, 215, 0));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for clear
				try
				{
				
				bookname.setText("");
		    	txtedition.setText("");
		    	txtprice.setText("");
		    	txtbookid.setText("");
		    	bookname.requestFocus();
				}
				catch (Exception e3)
				{
					String msg="Enter some Details !";
					JOptionPane.showMessageDialog(null, msg);
				}
			}
		});
		clear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		clear.setBounds(364, 252, 147, 45);
		panel.add(clear);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new LineBorder(UIManager.getColor("Button.light")));
		scrollPane_1.setBounds(707, 378, 224, -183);
		frame.getContentPane().add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 120, -81);
		panel_1.add(scrollPane);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		
		JScrollPane table1 = new JScrollPane();
		table1.setBounds(583, 110, 555, 328);
		frame.getContentPane().add(table1);
		
		table_3 = new JTable();
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setBackground(new Color(255, 255, 153));
		table_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		table1.setViewportView(table_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(221, 160, 221));
		panel_2.setBorder(new TitledBorder(null, "SEARCH", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(31, 446, 520, 94);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("BOOK ID");
		lblNewLabel_1_2_1.setBounds(45, 44, 102, 24);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_2.add(lblNewLabel_1_2_1);
		
		txtbookid = new JTextField();
		txtbookid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtbookid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try
				{
					String id = txtbookid.getText();
					
					pst = con.prepareStatement("select name,edition,price from book where id=?");
					pst.setString(1, id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next() == true)
					{
						String name = rs.getString(1);
						String edition = rs.getString(2);
						String price = rs.getString(3);
						
						
						bookname.setText(name);
						txtedition.setText(edition);
						txtprice.setText(price);
						
						
					}
					else
					{
						String msg="Data is Deleted !";
						JOptionPane.showMessageDialog(null, msg);
						
						txtbookid.setText("");

						bookname.setText("");
						txtedition.setText("");
						txtprice.setText("");
					}
				}
				catch (Exception e2)
				{
					
				}
				 
				
			/*	
				try
				{
				
				if(rs.next() == false)
				{
					String msg="Data is Deleted !";
					JOptionPane.showMessageDialog(null, msg);
					txtbookid.setText("");
				}
				}
				catch (Exception e3)
				{
					
				}
				*/
				
			}
		});
		txtbookid.setColumns(10);
		txtbookid.setBounds(176, 32, 282, 36);
		panel_2.add(txtbookid);
		
		JButton update = new JButton("UPDATE");
		update.setBackground(new Color(144, 238, 144));
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for update
				
			
				try
			    {	
				
				String bname,edition,price,bid;
				
				bname=bookname.getText();
			    edition=txtedition.getText();
			    price=txtprice.getText();
			    bid=txtbookid.getText();
				/*
				
				int edition=Integer.valueOf(txtedition.getText());
				int price=Integer.valueOf(txtprice.getText());*/
				
				
			    
			    
			    	pst= con.prepareStatement("update book set name=?,edition=?,price=? where id=?");
			    	pst.setString(1, bname);
			    	pst.setString(2, edition);
			    	pst.setString(3, price);
			    	pst.setString(4, bid);
			    	pst.executeUpdate();
			    	String msg="Updated Successfully !!!";
			    	JOptionPane.showMessageDialog(null, msg);
			    	table_load();
			    	bookname.setText("");
			    	txtedition.setText("");
			    	txtprice.setText("");
			    	bookname.requestFocus();
			    	
			    	
			    	
			    }
			    catch (Exception e1)
			    {
			    	String msg="Enter Valid Input !";
					JOptionPane.showMessageDialog(null, msg);
			    }
				
				
				
				
			}
		});
		update.setFont(new Font("Times New Roman", Font.BOLD, 20));
		update.setBounds(665, 477, 147, 45);
		frame.getContentPane().add(update);
		
		JButton delete = new JButton("DELETE");
		delete.setBackground(new Color(255, 0, 0));
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete
				

				String bid;
				
				
			    bid=txtbookid.getText();
				
			    
			    try
			    {
			    	pst= con.prepareStatement("delete from book where id=?");
			    	
			    	pst.setString(1, bid);
			    	pst.executeUpdate();
			    	String msg="Deleted Successfully !!!";
			    	JOptionPane.showMessageDialog(null, msg);
			    	table_load();
			    	bookname.setText("");
			    	txtedition.setText("");
			    	txtprice.setText("");
			    	bookname.requestFocus();
			    	
			    	
			    	
			    }
			    catch (Exception e1)
			    {
			    	String msg="Enter valid Input !";
					JOptionPane.showMessageDialog(null, msg);
			    }
			    
				
				
			}
		});
		delete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		delete.setBounds(860, 477, 147, 45);
		frame.getContentPane().add(delete);
		
		JLabel lblNewLabel_2 = new JLabel("Copyright © 2023 Murugesh M. All Rights Reserved.");
		lblNewLabel_2.setForeground(Color.GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(145, 550, 879, 25);
		frame.getContentPane().add(lblNewLabel_2);
	}
}

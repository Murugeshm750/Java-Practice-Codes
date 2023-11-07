package com.bill;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BillApp extends JFrame {
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillApp frame = new BillApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	
	public void connect()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
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
			pst=con.prepareStatement("select * from bill");
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public BillApp() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 457, 481);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton q1 = new JButton("");
		q1.setIcon(new ImageIcon("D:\\pic\\1.png"));
		q1.setBounds(10, 10, 115, 88);
		panel.add(q1);
		
		JButton q2 = new JButton("");
		q2.setIcon(new ImageIcon("D:\\pic\\2.png"));
		q2.setBounds(161, 10, 115, 88);
		panel.add(q2);
		
		JButton q3 = new JButton("");
		q3.setIcon(new ImageIcon("D:\\pic\\3.png"));
		q3.setBounds(319, 10, 115, 88);
		panel.add(q3);
		
		JButton q4 = new JButton("");
		q4.setIcon(new ImageIcon("D:\\pic\\4.png"));
		q4.setBounds(10, 167, 115, 88);
		panel.add(q4);
		
		JButton q5 = new JButton("");
		q5.setIcon(new ImageIcon("D:\\pic\\1.png"));
		q5.setBounds(161, 167, 115, 88);
		panel.add(q5);
		
		JButton q6 = new JButton("");
		q6.setIcon(new ImageIcon("D:\\pic\\2.png"));
		q6.setBounds(319, 167, 115, 88);
		panel.add(q6);
		
		JButton q7 = new JButton("");
		q7.setIcon(new ImageIcon("D:\\pic\\3.png"));
		q7.setBounds(10, 342, 115, 88);
		panel.add(q7);
		
		JButton q8 = new JButton("");
		q8.setIcon(new ImageIcon("D:\\pic\\4.png"));
		q8.setBounds(161, 342, 115, 88);
		panel.add(q8);
		
		JButton q9 = new JButton("");
		q9.setIcon(new ImageIcon("D:\\pic\\3.png"));
		q9.setBounds(319, 342, 115, 88);
		panel.add(q9);
		
		JLabel l1 = new JLabel("0");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l1.setBounds(10, 112, 115, 27);
		panel.add(l1);
		
		JLabel l2 = new JLabel("0");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l2.setBounds(161, 108, 115, 27);
		panel.add(l2);
		
		JLabel l3 = new JLabel("0");
		l3.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l3.setBounds(319, 112, 115, 27);
		panel.add(l3);
		
		JLabel l4 = new JLabel("0");
		l4.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l4.setBounds(10, 277, 115, 27);
		panel.add(l4);
		
		JLabel l5 = new JLabel("0");
		l5.setHorizontalAlignment(SwingConstants.CENTER);
		l5.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l5.setBounds(161, 277, 115, 27);
		panel.add(l5);
		
		JLabel l6 = new JLabel("0");
		l6.setHorizontalAlignment(SwingConstants.CENTER);
		l6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l6.setBounds(319, 277, 115, 27);
		panel.add(l6);
		
		JLabel l7 = new JLabel("0");
		l7.setHorizontalAlignment(SwingConstants.CENTER);
		l7.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l7.setBounds(10, 440, 115, 27);
		panel.add(l7);
		
		JLabel l8 = new JLabel("0");
		l8.setHorizontalAlignment(SwingConstants.CENTER);
		l8.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l8.setBounds(161, 440, 115, 27);
		panel.add(l8);
		
		JLabel l9 = new JLabel("0");
		l9.setHorizontalAlignment(SwingConstants.CENTER);
		l9.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l9.setBounds(319, 440, 115, 27);
		panel.add(l9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(467, 0, 900, 711);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setFont(new Font("Times New Roman", Font.BOLD, 25));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"ID", "ITEM", "QTY", "PRICE"
			}
		));
		table.setBounds(6, 15, 411, 512);
		panel_1.add(table);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(427, 14, 445, 673);
		panel_1.add(textArea);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btndelete.setBounds(282, 547, 135, 39);
		panel_1.add(btndelete);
		
		JButton btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pay button
			}
		});
		btnPay.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPay.setBounds(6, 613, 202, 74);
		panel_1.add(btnPay);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnPrint.setBounds(218, 613, 196, 74);
		panel_1.add(btnPrint);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 486, 457, 225);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TOTAL :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 35, 135, 30);
		panel_2.add(lblNewLabel);
		
		JLabel lblBalance = new JLabel("BALANCE :");
		lblBalance.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblBalance.setBounds(10, 157, 135, 30);
		panel_2.add(lblBalance);
		
		JLabel lblCash = new JLabel("CASH :");
		lblCash.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCash.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblCash.setBounds(10, 93, 135, 30);
		panel_2.add(lblCash);
		
		JLabel lblNewLabel_1 = new JLabel("00");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(166, 35, 188, 30);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("00");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(166, 157, 188, 30);
		panel_2.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(155, 88, 199, 40);
		panel_2.add(textField);
		textField.setColumns(10);
	}
}

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LaptopApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtram;
	private JTextField txtcolor;
	private JTextField txtpros;
	private JTextField txtprice;
	private JTable table;
	private JTextField txtid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaptopApp frame = new LaptopApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LaptopApp()
	{
		initialize();
		connect();
		table_load();
	}
	
	/**
	 * Create the frame.
	 */

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs= null;
	
	public void connect()
	{
		String path="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost/school";
		String un="root";
		String pw="";
		try {
			Class.forName(path);
			con=DriverManager.getConnection(url, un, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void table_load()
	{
		try {
			pst=con.prepareStatement("select * from laptop");
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(169, 169, 169));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LAPTOP DATA FORM");
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 35));
		lblNewLabel.setBounds(0, 0, 797, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME  :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 79, 177, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("RAM  :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(10, 133, 177, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("COLOR  :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(10, 188, 177, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("PROCESSOR  :");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(10, 242, 208, 30);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("PRICE  :");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_4.setBounds(10, 294, 177, 30);
		contentPane.add(lblNewLabel_1_4);
		
		txtname = new JTextField();
		txtname.setFont(new Font("Arial", Font.BOLD, 20));
		txtname.setBounds(197, 78, 229, 31);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtram = new JTextField();
		txtram.setFont(new Font("Arial", Font.BOLD, 20));
		txtram.setColumns(10);
		txtram.setBounds(197, 133, 229, 31);
		contentPane.add(txtram);
		
		txtcolor = new JTextField();
		txtcolor.setFont(new Font("Arial", Font.BOLD, 20));
		txtcolor.setColumns(10);
		txtcolor.setBounds(197, 188, 229, 31);
		contentPane.add(txtcolor);
		
		txtpros = new JTextField();
		txtpros.setFont(new Font("Arial", Font.BOLD, 20));
		txtpros.setColumns(10);
		txtpros.setBounds(197, 243, 229, 31);
		contentPane.add(txtpros);
		
		txtprice = new JTextField();
		txtprice.setFont(new Font("Arial", Font.BOLD, 20));
		txtprice.setColumns(10);
		txtprice.setBounds(197, 295, 229, 31);
		contentPane.add(txtprice);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code for Insert
				
				String name,ram,color,pros,price;
				String insert="insert into laptop(name,ram,color,processor,price) values(?,?,?,?,?)";

					name=txtname.getText();
					ram=txtram.getText();
					color=txtcolor.getText();
					pros=txtpros.getText();
					price=txtprice.getText();
					
					
					try {
						pst=con.prepareStatement(insert);
						pst.setString(1, name);
						pst.setString(2, ram);
						pst.setString(3, color);
						pst.setString(4, pros);
						pst.setString(5, price);
						
						pst.executeUpdate();
						String msg="Data Inserted Successfully..!";
						JOptionPane.showMessageDialog(null, msg);
						
						txtname.setText("");
						txtram.setText("");
						txtcolor.setText("");
						txtpros.setText("");
						txtprice.setText("");
					
						
					} catch (SQLException e1) {
						String msg="Enter Details..!";
						JOptionPane.showMessageDialog(null, msg);
					}
			
			}
		});
		insert.setFont(new Font("Arial", Font.BOLD, 25));
		insert.setBounds(514, 75, 171, 39);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Delete
				String delete="delete from laptop where id=?";
				 String lid=txtid.getText();
				 
				 try {
					pst=con.prepareStatement(delete);
					pst.setString(1, lid);
					pst.executeUpdate();
					String msg="Data Deleted Successfully..!";
					JOptionPane.showMessageDialog(null, msg);
					
					txtname.setText("");
					txtram.setText("");
					txtcolor.setText("");
					txtpros.setText("");
					txtprice.setText("");
					
							
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		delete.setFont(new Font("Arial", Font.BOLD, 25));
		delete.setBounds(514, 133, 171, 39);
		contentPane.add(delete);
		
		JButton update = new JButton("UPDATE");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for update
				String name,ram,color,pros,price,lid;
				String update="update laptop set name=?,ram=?,color=?,processor=?,price=? where id=?";
				
				name=txtname.getText();
				ram=txtram.getText();
				color=txtcolor.getText();
				pros=txtpros.getText();
				price=txtprice.getText();
				lid=txtid.getText();
				
				
				try {
					pst=con.prepareStatement(update);
					pst.setString(1, name);
					pst.setString(2, ram);
					pst.setString(3, color);
					pst.setString(4, pros);
					pst.setString(5, price);
					pst.setString(6, lid);
					
					pst.executeUpdate();
					String msg="Data Updated Successfully..!";
					JOptionPane.showMessageDialog(null, msg);
					
					txtname.setText("");
					txtram.setText("");
					txtcolor.setText("");
					txtpros.setText("");
					txtprice.setText("");
				
					
				} catch (SQLException e1) {
					String msg="Enter New Details..!";
					JOptionPane.showMessageDialog(null, msg);
				}
	
			}
		});
		update.setFont(new Font("Arial", Font.BOLD, 25));
		update.setBounds(514, 188, 171, 39);
		contentPane.add(update);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code for Display
				
				try {
						table_load();
						
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				
				
			}
		});
		display.setFont(new Font("Arial", Font.BOLD, 25));
		display.setBounds(514, 249, 171, 39);
		contentPane.add(display);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 436, 672, 158);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 250, 205));
		table.setFont(new Font("Arial", Font.BOLD, 15));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBounds(33, 358, 668, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("ID");
		lblNewLabel_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_1_4_1.setBounds(65, 28, 78, 30);
		panel.add(lblNewLabel_1_4_1);
		
		txtid = new JTextField();
		txtid.setFont(new Font("Arial", Font.BOLD, 20));
		txtid.setColumns(10);
		txtid.setBounds(163, 29, 229, 31);
		panel.add(txtid);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for search
				
				String lid=txtid.getText();
				
				String search="select name,ram,color,processor,price from laptop where id=? ";
				
				try {
					pst=con.prepareStatement(search);
					pst.setString(1, lid);
					rs=pst.executeQuery();
					
					if(rs.next()==true)
					{
						String name=rs.getString(1);
						String ram=rs.getString(2);
						String color=rs.getString(3);
						String pros=rs.getString(4);
						String price=rs.getString(5);
						
						txtname.setText(name);
						txtram.setText(ram);
						txtcolor.setText(color);
						txtpros.setText(pros);
						txtprice.setText(price);
					}
					else
					{
						String msg="Data is Deleted..!";
						JOptionPane.showMessageDialog(null, msg);
						
						txtname.setText("");
						txtram.setText("");
						txtcolor.setText("");
						txtpros.setText("");
						txtprice.setText("");
						txtid.setText("");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSearch.setFont(new Font("Arial", Font.BOLD, 25));
		btnSearch.setBounds(476, 24, 171, 39);
		panel.add(btnSearch);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for Reset
							
				txtname.setText("");
				txtram.setText("");
				txtcolor.setText("");
				txtpros.setText("");
				txtprice.setText("");
				txtid.setText("");
				txtname.requestFocus();

			}
		});
		btnReset.setFont(new Font("Arial", Font.BOLD, 25));
		btnReset.setBounds(514, 309, 171, 39);
		contentPane.add(btnReset);
	}
}

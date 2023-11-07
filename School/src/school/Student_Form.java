package school;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Student_Form {

	private JFrame frame;
	private JTable table;
	private JTextField txtname;
	private JTextField txtage;
	private JTextField txtdegree;
	private JTextField txtgender;
	private JTextField txtfname;
	private JTextField txtmname;
	private JTextField txtaddress;
	private JTextField txtcontact;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Form window = new Student_Form();
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
	public Student_Form() {
		initialize();
		connect();
		table_load();
	}
	
	
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JTextField txtsid;
	
	public void connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
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
			pst=con.prepareStatement("select * from student");
			rs=pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
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
		frame.setBounds(100, 100, 1281, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 153));
		panel.setBounds(0, 10, 1267, 52);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("STUDENT FORM");
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 255, 204));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "REGISTRATION-FORM", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(230, 230, 250));
		panel_1.setBounds(41, 84, 1186, 244);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(24, 24, 97, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("FATHER NAME");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(431, 24, 156, 24);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("MOTHER NAME");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(431, 79, 156, 24);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("ADDRESS");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(431, 135, 149, 24);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("AGE");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(24, 79, 97, 24);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("DEGREE");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(24, 135, 97, 24);
		panel_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("CONTACT");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(431, 191, 156, 24);
		panel_1.add(lblNewLabel_1_6);
		
		txtname = new JTextField();
		txtname.setBackground(new Color(255, 255, 204));
		txtname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtname.setBounds(139, 10, 216, 38);
		panel_1.add(txtname);
		txtname.setColumns(10);
		
		txtage = new JTextField();
		txtage.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtage.setBackground(new Color(255, 255, 204));
		txtage.setColumns(10);
		txtage.setBounds(139, 68, 216, 38);
		panel_1.add(txtage);
		
		txtdegree = new JTextField();
		txtdegree.setBackground(new Color(255, 255, 204));
		txtdegree.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtdegree.setColumns(10);
		txtdegree.setBounds(139, 126, 216, 38);
		panel_1.add(txtdegree);
		
		txtgender = new JTextField();
		txtgender.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtgender.setBackground(new Color(255, 255, 204));
		txtgender.setColumns(10);
		txtgender.setBounds(139, 177, 216, 38);
		panel_1.add(txtgender);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("GENDER");
		lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_6_1.setBounds(32, 191, 97, 24);
		panel_1.add(lblNewLabel_1_6_1);
		
		txtfname = new JTextField();
		txtfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtfname.setBackground(new Color(255, 255, 204));
		txtfname.setColumns(10);
		txtfname.setBounds(607, 10, 216, 38);
		panel_1.add(txtfname);
		
		txtmname = new JTextField();
		txtmname.setBackground(new Color(255, 255, 204));
		txtmname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtmname.setColumns(10);
		txtmname.setBounds(607, 68, 216, 38);
		panel_1.add(txtmname);
		
		txtaddress = new JTextField();
		txtaddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtaddress.setBackground(new Color(255, 255, 204));
		txtaddress.setColumns(10);
		txtaddress.setBounds(607, 121, 216, 38);
		panel_1.add(txtaddress);
		
		txtcontact = new JTextField();
		txtcontact.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtcontact.setBackground(new Color(255, 255, 204));
		txtcontact.setColumns(10);
		txtcontact.setBounds(607, 177, 216, 38);
		panel_1.add(txtcontact);
		
		JButton btnsave = new JButton("SAVE");
		btnsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR SAVE
				
				String sname,sage,sdegree,sgender,sfather,smother,scontact,saddress;
				
				sname = txtname.getText();
				sage = txtage.getText();
				sdegree = txtdegree.getText();
				sgender = txtgender.getText();
				sfather = txtfname.getText();
				smother = txtmname.getText();
				saddress = txtaddress.getText();
				scontact = txtcontact.getText();
				
				try
				{
				pst = con.prepareStatement("insert into student (NAME,AGE,DEGREE,GENDER,F_NAME,M_NAME,ADDRESS,CONTACT) values (?,?,?,?,?,?,?,?)");
				pst.setString(1, sname);
				pst.setString(2, sage);
				pst.setString(3, sdegree);
				pst.setString(4, sgender);
				pst.setString(5, sfather);
				pst.setString(6, smother);
				pst.setString(7, saddress);
				pst.setString(8, scontact);
				pst.executeUpdate();
				String msg="Record Added Successfully !!!";
		    	JOptionPane.showMessageDialog(null, msg);
		    	//table_load();
		    	
		    	txtname.setText("");
		    	txtage.setText("");
		    	txtdegree.setText("");
		    	txtgender.setText("");
		    	txtfname.setText("");
		    	txtmname.setText("");
		    	txtaddress.setText("");
		    	txtcontact.setText("");
		    	txtname.requestFocus();
				}
				catch (Exception e1)
				{
					String msg="Enter some Details !";
					JOptionPane.showMessageDialog(null, msg);
					//e1.printStackTrace();
				}
			
			}
		});
		btnsave.setBackground(new Color(51, 204, 51));
		btnsave.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnsave.setBounds(944, 13, 174, 43);
		panel_1.add(btnsave);
		
		JButton btnreset = new JButton("RESET");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR RESET

		    	txtname.setText("");
		    	txtage.setText("");
		    	txtdegree.setText("");
		    	txtgender.setText("");
		    	txtfname.setText("");
		    	txtmname.setText("");
		    	txtaddress.setText("");
		    	txtcontact.setText("");
		    	txtsid.setText("");
		    	txtname.requestFocus();
			}
		});
		btnreset.setBackground(new Color(204, 204, 51));
		btnreset.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnreset.setBounds(944, 83, 174, 43);
		panel_1.add(btnreset);
		
		JButton btnshow = new JButton("SHOW");
		btnshow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR SHOW
				
				try
				{
				
					table_load();
			
				}
				catch (Exception e1)
				{
					String msg="Show Not Available";
					JOptionPane.showMessageDialog(null, msg);
				}
				
			
			}
		});
		btnshow.setBounds(944, 151, 174, 43);
		panel_1.add(btnshow);
		btnshow.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnshow.setBackground(new Color(153, 204, 51));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 352, 1186, 208);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 102));
		table.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		scrollPane.setViewportView(table);
		
		JButton btnupdate = new JButton("UPDATE");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	CODE FOR UPDATE
				
				String sname,sage,sdegree,sgender,sfather,smother,scontact,saddress,sid;
				
				sname = txtname.getText();
				sage = txtage.getText();
				sdegree = txtdegree.getText();
				sgender = txtgender.getText();
				sfather = txtfname.getText();
				smother = txtmname.getText();
				saddress = txtaddress.getText();
				scontact = txtcontact.getText();
				sid=txtsid.getText();
				
				try
				{
				pst = con.prepareStatement("update student set NAME=?,AGE=?,DEGREE=?,GENDER=?,F_NAME=?,M_NAME=?,ADDRESS=?,CONTACT=? where S_ID=?");
				pst.setString(1, sname);
				pst.setString(2, sage);
				pst.setString(3, sdegree);
				pst.setString(4, sgender);
				pst.setString(5, sfather);
				pst.setString(6, smother);
				pst.setString(7, saddress);
				pst.setString(8, scontact);
				pst.setString(9, sid);
				pst.executeUpdate();
				String msg="Record Added Successfully !!!";
		    	JOptionPane.showMessageDialog(null, msg);
		    	//table_load();
		    	
		    	txtname.setText("");
		    	txtage.setText("");
		    	txtdegree.setText("");
		    	txtgender.setText("");
		    	txtfname.setText("");
		    	txtmname.setText("");
		    	txtaddress.setText("");
		    	txtcontact.setText("");
		    	txtname.requestFocus();
				}
				catch (Exception e1)
				{
					/*String msg="Enter some Details !";
					JOptionPane.showMessageDialog(null, msg);*/
					e1.printStackTrace();
				}
			
			}
		});
		btnupdate.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnupdate.setBackground(new Color(0, 204, 51));
		btnupdate.setBounds(663, 584, 174, 43);
		frame.getContentPane().add(btnupdate);
		
		JButton btndelete = new JButton("DELETE");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DELETE
				
				String sid;
				
				
				sid=txtsid.getText();
				
				try
				{
				pst = con.prepareStatement("delete from student where S_ID=?");
				
				pst.setString(1, sid);
				pst.executeUpdate();
				String msg="Deleted Successfully !!!";
		    	JOptionPane.showMessageDialog(null, msg);
		    	//table_load();
		    	
		    	txtname.setText("");
		    	txtage.setText("");
		    	txtdegree.setText("");
		    	txtgender.setText("");
		    	txtfname.setText("");
		    	txtmname.setText("");
		    	txtaddress.setText("");
		    	txtcontact.setText("");
		    	txtname.requestFocus();
				}
				catch (Exception e1)
				{
					/*String msg="Enter some Details !";
					JOptionPane.showMessageDialog(null, msg);*/
					e1.printStackTrace();
				}
			
			}
		});
		btndelete.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btndelete.setBackground(new Color(0, 128, 128));
		btndelete.setBounds(858, 584, 174, 43);
		frame.getContentPane().add(btndelete);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR EXIT
				System.exit(0);
			}
		});
		btnexit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnexit.setBackground(new Color(255, 0, 51));
		btnexit.setBounds(1053, 584, 174, 43);
		frame.getContentPane().add(btnexit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(189, 183, 107));
		panel_2.setBorder(new TitledBorder(null, "SEARCH", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_2.setBounds(41, 584, 574, 75);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_6_1_1 = new JLabel("S_ID");
		lblNewLabel_1_6_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_6_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_6_1_1.setBounds(10, 25, 97, 24);
		panel_2.add(lblNewLabel_1_6_1_1);
		
		txtsid = new JTextField();
		txtsid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				/*
				try
				{
					String s_id = txtsid.getText();
					
					pst = con.prepareStatement("select NAME,AGE,DEGREE,GENDER,F_NAME,M_NAME,ADDRESS,CONTACT from student where S_ID=?");
					pst.setString(1, s_id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next() == true)
					{
						String sname = rs.getString(1);
						String sage = rs.getString(2);
						String sdegree = rs.getString(3);
						String sgender = rs.getString(4);
						String sfname = rs.getString(5);
						String smname = rs.getString(6);
						String saddress = rs.getString(7);
						String scontact = rs.getString(8);
						
						
						txtname.setText(sname);
						txtage.setText(sage);
						txtdegree.setText(sdegree);
						txtgender.setText(sgender);
						txtfname.setText(sfname);
						txtmname.setText(smname);
						txtaddress.setText(saddress);
						txtcontact.setText(scontact);
						
						
						
					}
					else
					{
						String msg="Data is Deleted !";
						JOptionPane.showMessageDialog(null, msg);
						
						txtname.setText("");
				    	txtage.setText("");
				    	txtdegree.setText("");
				    	txtgender.setText("");
				    	txtfname.setText("");
				    	txtmname.setText("");
				    	txtaddress.setText("");
				    	txtcontact.setText("");
					}
				}
				catch (Exception e2)
				{
					
				}
				*/
			}
		});
		txtsid.setToolTipText("");
		txtsid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtsid.setColumns(10);
		txtsid.setBackground(new Color(255, 255, 204));
		txtsid.setBounds(128, 11, 216, 38);
		panel_2.add(txtsid);
		
		JButton btnsearch = new JButton("SEARCH");
		btnsearch.addKeyListener(new KeyAdapter() {
			/*
			@Override
			public void keyReleased(KeyEvent e) {
				try
				{
					String s_id = txtsid.getText();
					
					pst = con.prepareStatement("select NAME,AGE,DEGREE,GENDER,F_NAME,M_NAME,ADDRESS,CONTACT from student where S_ID=?");
					pst.setString(1, s_id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next() == true)
					{
						String sname = rs.getString(1);
						String sage = rs.getString(2);
						String sdegree = rs.getString(3);
						String sgender = rs.getString(4);
						String sfname = rs.getString(5);
						String smname = rs.getString(6);
						String saddress = rs.getString(7);
						String scontact = rs.getString(8);
						
						
						txtname.setText(sname);
						txtage.setText(sage);
						txtdegree.setText(sdegree);
						txtgender.setText(sgender);
						txtfname.setText(sfname);
						txtmname.setText(smname);
						txtaddress.setText(saddress);
						txtcontact.setText(scontact);
						
						
						
					}
					else
					{
						String msg="Data is Deleted !";
						JOptionPane.showMessageDialog(null, msg);
						
						txtname.setText("");
				    	txtage.setText("");
				    	txtdegree.setText("");
				    	txtgender.setText("");
				    	txtfname.setText("");
				    	txtmname.setText("");
				    	txtaddress.setText("");
				    	txtcontact.setText("");
					}
				}
				catch (Exception e2)
				{
					
				}
			}
			*/
		});
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for search
				try
				{
					String s_id = txtsid.getText();
					
					pst = con.prepareStatement("select NAME,AGE,DEGREE,GENDER,F_NAME,M_NAME,ADDRESS,CONTACT from student where S_ID=?");
					pst.setString(1, s_id);
					ResultSet rs=pst.executeQuery();
					
					if(rs.next() == true)
					{
						String sname = rs.getString(1);
						String sage = rs.getString(2);
						String sdegree = rs.getString(3);
						String sgender = rs.getString(4);
						String sfname = rs.getString(5);
						String smname = rs.getString(6);
						String saddress = rs.getString(7);
						String scontact = rs.getString(8);
						
						
						txtname.setText(sname);
						txtage.setText(sage);
						txtdegree.setText(sdegree);
						txtgender.setText(sgender);
						txtfname.setText(sfname);
						txtmname.setText(smname);
						txtaddress.setText(saddress);
						txtcontact.setText(scontact);
						
						
						
					}
					else
					{
						String msg="Data is Deleted !";
						JOptionPane.showMessageDialog(null, msg);
						
						txtname.setText("");
				    	txtage.setText("");
				    	txtdegree.setText("");
				    	txtgender.setText("");
				    	txtfname.setText("");
				    	txtmname.setText("");
				    	txtaddress.setText("");
				    	txtcontact.setText("");
					}
				}
				catch (Exception e2)
				{
					
				}
				
				 
			}
		});
		btnsearch.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnsearch.setBackground(new Color(72, 209, 204));
		btnsearch.setBounds(378, 11, 174, 43);
		panel_2.add(btnsearch);
	}
}

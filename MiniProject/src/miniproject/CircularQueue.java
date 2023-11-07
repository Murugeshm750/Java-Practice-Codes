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

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField cqsize;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(222, 26, 302, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblQueueSize = new JLabel("QUEUE SIZE :");
		lblQueueSize.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblQueueSize.setBounds(173, 91, 114, 21);
		contentPane.add(lblQueueSize);
		
		cqsize = new JTextField();
		cqsize.setBounds(338, 90, 96, 29);
		contentPane.add(cqsize);
		cqsize.setColumns(10);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for creation
				int len=Integer.valueOf(cqsize.getText());
				cq= new int[len];
				String message="Circular Queue size "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				size=cq.length;
				
				
			}
		});
		createqueue.setFont(new Font("Tahoma", Font.BOLD, 17));
		createqueue.setBounds(553, 87, 180, 44);
		contentPane.add(createqueue);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement.setBounds(107, 193, 180, 21);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(338, 185, 96, 29);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
				
				if(count == size)
				{
					String message="Insert Not possible";
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
				}
				element.setText("");
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 17));
		insert.setBounds(567, 177, 135, 38);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for deletion
				
				if(count ==0)
				{
					String message="Delete Not possible";
					JOptionPane.showMessageDialog(contentPane,message);	
				}
				else
				{
					String message="Deleted Element is "+cq[f];
					f=(f+1)%size;
					count--;
					JOptionPane.showMessageDialog(contentPane,message);
				}
				
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 17));
		delete.setBounds(567, 267, 135, 38);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display
				int f1=f;
				if(count == 0)
				{
					String message="Display Not possible";
					JOptionPane.showMessageDialog(contentPane,message);
				}
				else
				{
					String msg="";
					for (int i=0;i<=count;i++)
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
					
				}
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 17));
		display.setBounds(88, 423, 165, 47);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(102, 205, 170));
		displaybox.setColumns(10);
		displaybox.setBounds(306, 411, 328, 59);
		contentPane.add(displaybox);
	}

}

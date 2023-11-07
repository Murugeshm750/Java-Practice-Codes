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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField queuesize;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(144, 238, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(308, 30, 217, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE :");
		lblEnterQueueSize.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterQueueSize.setBounds(79, 91, 175, 21);
		contentPane.add(lblEnterQueueSize);
		
		queuesize = new JTextField();
		queuesize.setFont(new Font("Tahoma", Font.BOLD, 14));
		queuesize.setBounds(291, 85, 126, 40);
		contentPane.add(queuesize);
		queuesize.setColumns(10);
		
		JButton createqueue = new JButton("CREATE QUEUE");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Create Queue
				
				int len =Integer.valueOf(queuesize.getText());
				String message="Queue size "+len+" created";
				JOptionPane.showMessageDialog(contentPane, message);
				size=q.length;
				
			}
		});
		createqueue.setFont(new Font("Tahoma", Font.BOLD, 17));
		createqueue.setBounds(513, 91, 196, 40);
		contentPane.add(createqueue);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterAnElement.setBounds(74, 162, 180, 21);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setFont(new Font("Tahoma", Font.BOLD, 14));
		element.setColumns(10);
		element.setBounds(295, 159, 122, 33);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				if(r==size-1)
				{
					String message ="Insert Not Possible";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else
				{
					int elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					String message ="Element insert @ "+r;
					JOptionPane.showMessageDialog(contentPane, message);
				}
				element.setText("");
				
			}
		});
		insert.setFont(new Font("Tahoma", Font.BOLD, 17));
		insert.setBounds(513, 172, 196, 40);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Delete
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 17));
		delete.setBounds(513, 260, 196, 40);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for Display
			}
		});
		display.setFont(new Font("Tahoma", Font.BOLD, 17));
		display.setBounds(74, 445, 180, 42);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 14));
		displaybox.setBackground(new Color(255, 250, 205));
		displaybox.setColumns(10);
		displaybox.setBounds(351, 439, 369, 48);
		contentPane.add(displaybox);
	}
}

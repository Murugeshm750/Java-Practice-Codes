package miniproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Boss extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Boss frame = new Boss();
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
	public Boss() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 606);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE DATA STRUCTURE\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(239, 23, 296, 26);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARAAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place array window opening code here
				//Array1 array1= new Array1();
			//	array1.setVisible(true);
				new Array1().setVisible(true);
				
			}
		});
		array.setFont(new Font("Times New Roman", Font.BOLD, 20));
		array.setBounds(239, 73, 311, 44);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place stack window opening code here
				new Stack1().setVisible(true);
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 20));
		stack.setBounds(239, 159, 311, 44);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place queue window opening code here
				new Queue().setVisible(true);
			}
		});
		queue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		queue.setBounds(239, 235, 311, 44);
		contentPane.add(queue);
		
		JButton cq = new JButton("CIRCULAR QUEUE");
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place circular queue window opening code here
				new CircularQueue().setVisible(true);
			}
		});
		cq.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cq.setBounds(239, 313, 311, 44);
		contentPane.add(cq);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place singly linked list window opening code here
				new SLL().setVisible(true);
			}
		});
		sll.setFont(new Font("Times New Roman", Font.BOLD, 20));
		sll.setBounds(239, 402, 311, 52);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place doubly linked list window opening code here
				new DLL().setVisible(true);
			}
		});
		dll.setFont(new Font("Times New Roman", Font.BOLD, 20));
		dll.setBounds(239, 484, 311, 44);
		contentPane.add(dll);
	}
}

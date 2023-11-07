package interest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interest_App extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interest_App frame = new Interest_App();
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
	public Interest_App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INTEREST APPLICATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(182, 29, 305, 30);
		contentPane.add(lblNewLabel);
		
		JButton SI = new JButton("SIMPLE INTEREST");
		SI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Si().setVisible(true);
			}
		});
		SI.setForeground(new Color(178, 34, 34));
		SI.setBackground(new Color(250, 250, 210));
		SI.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		SI.setBounds(197, 125, 290, 57);
		contentPane.add(SI);
		
		JButton PI = new JButton("COMPOUND INTEREST");
		PI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Pi().setVisible(true);
			}
		});
		PI.setBackground(new Color(250, 250, 210));
		PI.setForeground(new Color(178, 34, 34));
		PI.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		PI.setBounds(197, 256, 290, 57);
		contentPane.add(PI);
	}
}

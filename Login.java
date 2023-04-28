import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class Login {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1418, 876);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginAdmin loginadmin = new LoginAdmin();
				loginadmin.frame3.setVisible(true);
				frame.dispose();
				
				
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setIcon(new ImageIcon(Login.class.getResource("/image/adminloginbttn.png")));
		btnNewButton_1.setBounds(315, 398, 289, 265);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginLibrarian loginadmin = new LoginLibrarian();
				loginadmin.LoginLibrarianframe.setVisible(true);
				frame.dispose();
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/image/librarianloginbutton.png")));
		btnNewButton.setBounds(800, 398, 279, 265);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/image/LibrarySystemHPBackground.jpg")));
		lblNewLabel_1.setBounds(0, 142, 1425, 698);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/image/HeaderLogin.png")));
		lblNewLabel.setBounds(0, 0, 1401, 143);
		frame.getContentPane().add(lblNewLabel);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginLibrarian {

	 JFrame LoginLibrarianframe;
	 private final JLabel lblNewLabel = new JLabel("Username:");
	 private JTextField UserNametextField;
	 private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginLibrarian window = new LoginLibrarian();
					window.LoginLibrarianframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginLibrarian() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LoginLibrarianframe = new JFrame();
		LoginLibrarianframe.setBounds(100, 100, 460, 553);
		LoginLibrarianframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginLibrarianframe.getContentPane().setLayout(null);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBounds(48, 199, 98, 31);
		LoginLibrarianframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_1.setBounds(48, 260, 98, 25);
		LoginLibrarianframe.getContentPane().add(lblNewLabel_1);
		
		UserNametextField = new JTextField();
		UserNametextField.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		UserNametextField.setBounds(48, 226, 331, 31);
		LoginLibrarianframe.getContentPane().add(UserNametextField);
		UserNametextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		passwordField.setBounds(48, 284, 331, 31);
		LoginLibrarianframe.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = passwordField.getText();
				String username = UserNametextField.getText();

				if(password.contains("LibOne")&& username.contains("Librarian_01") //This is the pattern or format in logins 
				   || password.contains("LibTwo") && username.contains("Librarian_02")
				   || password.contains("LibThree") && username.contains("Librarian_03")) {
					passwordField.setText(null);
					UserNametextField.setText(null);
					JOptionPane.showMessageDialog(null, "SUCCESSFULLY LOGIN.");
					
					BooksPage bookpage = new BooksPage();
					BooksPage.main(null);
					LoginLibrarianframe.dispose();
				}
				else {

					JOptionPane.showMessageDialog(null, "Incorrect Username or Password. "
							+ "\nPlease try again!");
					passwordField.setText(null);
					UserNametextField.setText(null);
				}
			
				
				
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(LoginLibrarian.class.getResource("/image/loginbttn.png")));
		btnNewButton.setBounds(48, 326, 331, 31);
		LoginLibrarianframe.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Please Sign in your");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_2.setBounds(119, 91, 202, 31);
		LoginLibrarianframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Librarian Account");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblNewLabel_3.setBounds(129, 120, 192, 31);
		LoginLibrarianframe.getContentPane().add(lblNewLabel_3);
		
		JLabel LibrarianLoginbg = new JLabel("");
		LibrarianLoginbg.setIcon(new ImageIcon(LoginLibrarian.class.getResource("/image/LibrarySystemHPBackground.jpg")));
		LibrarianLoginbg.setBounds(0, 0, 444, 514);
		LoginLibrarianframe.getContentPane().add(LibrarianLoginbg);
	}
}

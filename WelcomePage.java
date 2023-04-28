import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class WelcomePage {

	JFrame Welcomeframe;
	private final JLabel WelcomePageLabel = new JLabel("Welcome to National University Library System!");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
					window.Welcomeframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Welcomeframe = new JFrame();
		Welcomeframe.setBounds(100, 100, 1426, 300);
		Welcomeframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Welcomeframe.getContentPane().setLayout(null);
		WelcomePageLabel.setForeground(Color.WHITE);
		WelcomePageLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 40));
		WelcomePageLabel.setBounds(249, 108, 927, 54);
		Welcomeframe.getContentPane().add(WelcomePageLabel);
		
		JLabel NULogo = new JLabel("");
		NULogo.setIcon(new ImageIcon(WelcomePage.class.getResource("/image/HomepgLogo.png")));
		NULogo.setBounds(138, 94, 101, 97);
		Welcomeframe.getContentPane().add(NULogo);
		
		JLabel WelcomePagebg = new JLabel("");
		WelcomePagebg.setIcon(new ImageIcon(WelcomePage.class.getResource("/image/LibrarySystemHPBackground.jpg")));
		WelcomePagebg.setBounds(0, 0, 1424, 261);
		Welcomeframe.getContentPane().add(WelcomePagebg);
	}

}

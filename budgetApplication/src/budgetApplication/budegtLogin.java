package budgetApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class budegtLogin {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					budegtLogin window = new budegtLogin();
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
	public budegtLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(180, 49, 186, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(92, 52, 55, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(180, 85, 186, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(92, 88, 55, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(180, 157, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		JLabel lblNewLabel_2 = new JLabel("Sign up right here ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(236, 231, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
	}
}

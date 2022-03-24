package budgetApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class budgetSignUp {

	private JFrame frame;
	private JTextField txtSignUpUsername;
	private JTextField txtSignUpPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					budgetSignUp window = new budgetSignUp();
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
	public budgetSignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtSignUpUsername = new JTextField();
		txtSignUpUsername.setBackground(Color.WHITE);
		txtSignUpUsername.setBounds(178, 94, 171, 20);
		frame.getContentPane().add(txtSignUpUsername);
		txtSignUpUsername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(99, 97, 52, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(99, 137, 52, 14);
		frame.getContentPane().add(lblPassword);
		
		txtSignUpPassword = new JTextField();
		txtSignUpPassword.setColumns(10);
		txtSignUpPassword.setBackground(Color.WHITE);
		txtSignUpPassword.setBounds(178, 134, 171, 20);
		frame.getContentPane().add(txtSignUpPassword);
		
		JButton btnNewButton = new JButton("SIgn Up");
		btnNewButton.setBounds(178, 203, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}

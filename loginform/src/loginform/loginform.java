package loginform;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginform extends JFrame implements ActionListener{
	
	JLabel lblUsername = new JLabel();
	JLabel lblPassword = new JLabel();
	
	JTextField txtUsername = new JTextField();
	JPasswordField txtPassword = new JPasswordField();
	
	JButton btnLogin = new JButton();
	JButton btnCancel = new JButton();
	
	String username = "admin";
	String password = "admin123";
	
	String name = "JOHN CARLO BORNEL";
	
	 void loginform(){
		
		this.setTitle("Login");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.orange);
		
		
		lblUsername.setText("Username:");
		lblUsername.setBounds(50, 30, 150, 30);
		
		lblPassword.setText("Password: ");
		lblPassword.setBounds(50, 70, 150, 30);
		
		txtUsername.setBounds(130, 30, 170, 30);
		
		txtPassword.setBounds(130, 70, 170, 30);
		txtPassword.setEchoChar('*');
			
		btnCancel.setBounds(130, 140, 80, 30);
		btnCancel.setText("Cancel");
		btnCancel.setFocusable(false);
		btnCancel.addActionListener(this);
		
		btnLogin.setBounds(220, 140, 80, 30);
		btnLogin.setText("Login");
		btnLogin.setFocusable(false);
		btnLogin.addActionListener(this);
	
		this.add(lblUsername);
		this.add(lblPassword);
		this.add(txtUsername);
		this.add(txtPassword);
		this.add(btnLogin);
		this.add(btnCancel);
		
		this.setLayout(null);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(btnLogin)) {
			if(username.equals(txtUsername.getText()) && password.equals(new String (txtPassword.getPassword()))) {
				JOptionPane.showMessageDialog(this, "Successfully Login!");
				this.dispose();
				//new DashBoard();
			}
			else {
				JOptionPane.showMessageDialog(this, "Incorrect Username/Password!", "Incorrect Credentials", JOptionPane.WARNING_MESSAGE);
			}
		}
		if (e.getSource().equals(btnCancel)) {
			int res = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
			if(res == JOptionPane.YES_OPTION) {
				this.dispose();
			}
		}
		
	}
}


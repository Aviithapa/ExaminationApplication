
package Login;

/**
 *
 * @author Abhishek
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AdminPage.*;
public class Login extends JFrame implements ActionListener {
    public static void main(String[] args){
        Login login1 = new Login();
        login1.show();
    }
    JLabel Heading, UserName, Password;
 JTextField UserNameField;
 JButton login,signin;
 JPasswordField PasswordField;
 Login() {
  JFrame frame = new JFrame("Login Form");
  
  
  
  Heading = new JLabel("Login Form");
  Heading.setForeground(Color.blue);
  Heading.setFont(new Font("Serif", Font.BOLD, 30));
  Heading.setBounds(150, 40, 400, 50);
  frame.add(Heading);

  UserName = new JLabel("Username");
  UserNameField = new JTextField();
  UserName.setBounds(150, 100, 200, 50);
  UserNameField.setBounds(150, 150, 230, 30);
  frame.add(UserName);frame.add(UserNameField);
  
  Password = new JLabel("Password");
  PasswordField = new JPasswordField();
  Password.setBounds(150, 200, 200, 30);
  PasswordField.setBounds(150, 250, 230, 30);
  frame.add(Password); frame.add(PasswordField);
  
  login = new JButton("Login");
  login.setBounds(150, 320, 110, 30);
  login.addActionListener(this);
  frame.add(login);
  
  signin=new JButton("Signin");
  signin.setBounds(270, 320, 110, 30);
  signin.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            new Registration();
        }  
    }); 
  frame.add(signin);

  
  
  frame.setSize(600, 600);
  frame.setLayout(null);
  frame.setVisible(true);

 }
 
 public void actionPerformed(ActionEvent ae)
 {
	 
	 String ch=ae.getActionCommand();
	 String username=UserName.getText();
	 String password=Password.getText();
	   if(username.equals("abhi") && password.equals("thapa")) {
		AdminDashBoard ad=new AdminDashBoard();
                     
		 }
 }
}



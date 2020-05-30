package eventDriven.example;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

// this app creates a GUI log in screen in which it has username and password fields with an action listener that contains an if statement
public class Eventdriven {

	public static void main(String[] args) {

		JFrame frm = new JFrame();
		frm.setLayout(new FlowLayout());
		frm.setTitle("Log-In Screen");
		frm.setSize(300, 200);
		frm.setLocationRelativeTo(null);
		JTextField txt = new JTextField(10);
		JLabel label = new JLabel("Enter your username: ");
		label.setLabelFor(txt);
		JPasswordField psw = new JPasswordField(10);
		JLabel label2 = new JLabel("Enter your password: ");
		label.setLabelFor(psw);
		JButton btn = new JButton("Log in");

		btn.addActionListener(new ActionListener() {

			@override
			public void actionPerformed(ActionEvent e) {
				String userName = txt.getText();
				String password = psw.getText();
				if (userName.trim().equals("Jihad") && password.trim().equals("htu123")) {
					JOptionPane.showMessageDialog(frm, "You have signed in successfully, enjoy your day.");

				} else {
					JOptionPane.showMessageDialog(frm, "Invalid log in");
				}

			}

		});

		frm.add(label);
		frm.add(txt);
		frm.add(label2);
		frm.add(psw);
		frm.add(btn);
		frm.setVisible(true);

	}

}

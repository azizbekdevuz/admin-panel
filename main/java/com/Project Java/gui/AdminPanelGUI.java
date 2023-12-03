import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanelGUI extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public AdminPanelGUI() {
        setTitle("Admin Panel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        getContentPane().add(panel, "Center");
        panel.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 50, 80, 25);
        panel.add(lblUsername);

        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 150, 25);
        panel.add(usernameField);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 100, 80, 25);
        panel.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 25);
        panel.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 150, 80, 25);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login(usernameField.getText(), new String(passwordField.getPassword()));
            }
        });
        panel.add(btnLogin);
    }

    private void login(String username, String password) {
        // Implement login logic
        // This is where you connect to the backend for authentication
        // Display the admin dashboard on successful login
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdminPanelGUI gui = new AdminPanelGUI();
            gui.setVisible(true);
        });
    }
}

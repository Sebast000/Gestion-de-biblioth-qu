import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Authentification");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (authenticate(username, password)) {
                    if (username.equals("bibliothecaire")) {
                        new BibliothecaireDashboard();
                    } else {
                        new EtudiantDashboard();
                    }
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Identifiants incorrects");
                }
            }
        });
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Nom d'utilisateur");
        userLabel.setBounds(10, 20, 120, 25);
        panel.add(userLabel);

        usernameField = new JTextField(20);
        usernameField.setBounds(150, 20, 200, 25);
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Mot de passe");
        passwordLabel.setBounds(10, 50, 120, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 50, 200, 25);
        panel.add(passwordField);

        loginButton = new JButton("Se connecter");
        loginButton.setBounds(150, 100, 200, 25);
        panel.add(loginButton);
    }

    private boolean authenticate(String username, String password) {
        // Remplace ceci par une vraie vérification des identifiants
        return (username.equals("bibliothecaire") && password.equals("1234")) ||
               (username.equals("etudiant") && password.equals("1234"));
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}

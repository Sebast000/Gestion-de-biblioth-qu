// src/IHM.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IHM {
    public static void main(String[] args) {
        // Créer la fenêtre principale
        JFrame frame = new JFrame("Système de Gestion de Bibliothèque");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Créer un panneau pour ajouter des éléments graphiques
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        // Rendre la fenêtre visible
        frame.setVisible(true);
    }
    
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        
        // Étiquette de bienvenue
        JLabel welcomeLabel = new JLabel("Bienvenue au système de gestion");
        welcomeLabel.setBounds(10, 20, 300, 25);
        panel.add(welcomeLabel);
        
        // Bouton pour se connecter en tant qu'étudiant
        JButton studentButton = new JButton("Connexion Étudiant");
        studentButton.setBounds(10, 50, 160, 25);
        panel.add(studentButton);

        // Action lors du clic sur le bouton étudiant
        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Connecté en tant qu'étudiant !");
            }
        });
        
        // Bouton pour se connecter en tant que bibliothécaire
        JButton librarianButton = new JButton("Connexion Bibliothécaire");
        librarianButton.setBounds(10, 90, 160, 25);
        panel.add(librarianButton);
        
        // Action lors du clic sur le bouton bibliothécaire
        librarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel, "Connecté en tant que bibliothécaire !");
            }
        });
    }
}

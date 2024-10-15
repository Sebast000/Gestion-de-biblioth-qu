import javax.swing.*;

public class BibliothecaireDashboard extends JFrame {

    public BibliothecaireDashboard() {
        setTitle("Tableau de bord - Bibliothécaire");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton addBookButton = new JButton("Ajouter un livre");
        JButton removeBookButton = new JButton("Supprimer un livre");

        JPanel panel = new JPanel();
        panel.add(addBookButton);
        panel.add(removeBookButton);

        add(panel);
        setVisible(true);

        // Actions des boutons (ajout et suppression de livres)
        addBookButton.addActionListener(e -> new AddBookForm());
        removeBookButton.addActionListener(e -> new RemoveBookForm());
    }
}

import javax.swing.*;

public class BibliothecaireDashboard extends JFrame {
    private Bibliotheque bibliotheque;

    public BibliothecaireDashboard(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
        setTitle("Tableau de bord - Bibliothécaire");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addBookButton = new JButton("Ajouter un livre");
        addBookButton.addActionListener(e -> new AddBookForm(bibliotheque).setVisible(true));

        JButton removeBookButton = new JButton("Supprimer un livre");
        removeBookButton.addActionListener(e -> new RemoveBookForm(bibliotheque).setVisible(true));

        JPanel panel = new JPanel();
        panel.add(addBookButton);
        panel.add(removeBookButton);

        add(panel);
    }
}

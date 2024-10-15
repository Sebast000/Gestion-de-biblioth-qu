import javax.swing.*;

public class EtudiantDashboard extends JFrame {
    private Bibliotheque bibliotheque;

    public EtudiantDashboard(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
        setTitle("Tableau de bord - Étudiant");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton searchBookButton = new JButton("Rechercher un livre");
        searchBookButton.addActionListener(e -> new SearchBookForm(bibliotheque).setVisible(true));

        JPanel panel = new JPanel();
        panel.add(searchBookButton);

        add(panel);
    }
}

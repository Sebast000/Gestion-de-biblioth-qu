import javax.swing.*;

public class EtudiantDashboard extends JFrame {

    public EtudiantDashboard() {
        setTitle("Tableau de bord - Étudiant");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton searchBookButton = new JButton("Rechercher un livre");
        JButton borrowBookButton = new JButton("Emprunter un livre");

        JPanel panel = new JPanel();
        panel.add(searchBookButton);
        panel.add(borrowBookButton);

        add(panel);
        setVisible(true);

        // Actions des boutons
        searchBookButton.addActionListener(e -> new SearchBookForm());
        borrowBookButton.addActionListener(e -> new BorrowBookForm());
    }
}

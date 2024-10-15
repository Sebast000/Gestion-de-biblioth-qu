import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EtudiantDashboard extends JFrame {
    private JButton searchBookButton;

    public EtudiantDashboard() {
        setTitle("Tableau de Bord Étudiant");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        searchBookButton = new JButton("Rechercher un Livre");

        panel.add(searchBookButton);
        add(panel);

        searchBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchBookForm().setVisible(true); // Assure-toi que cette classe existe
            }
        });
    }
}

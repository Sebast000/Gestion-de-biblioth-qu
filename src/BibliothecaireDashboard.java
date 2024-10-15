import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliothecaireDashboard extends JFrame {
    private JButton addBookButton;
    private JButton removeBookButton;

    public BibliothecaireDashboard() {
        setTitle("Tableau de Bord Bibliothécaire");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        addBookButton = new JButton("Ajouter un Livre");
        removeBookButton = new JButton("Supprimer un Livre");

        panel.add(addBookButton);
        panel.add(removeBookButton);
        add(panel);

        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddBookForm().setVisible(true);
            }
        });

        removeBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveBookForm().setVisible(true); // Assure-toi que cette classe existe
            }
        });
    }
}

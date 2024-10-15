import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBookForm extends JFrame {
    private JTextField searchField;
    private JButton searchButton;

    public SearchBookForm() {
        setTitle("Rechercher un Livre");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        searchField = new JTextField(20);
        searchButton = new JButton("Rechercher");

        panel.add(new JLabel("Titre ou Auteur:"));
        panel.add(searchField);
        panel.add(searchButton);
        add(panel);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = searchField.getText();
                // Logique pour rechercher un livre
                System.out.println("Recherche pour : " + query);
                dispose();
            }
        });
    }
}

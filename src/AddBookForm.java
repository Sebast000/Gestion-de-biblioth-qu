import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookForm extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JTextField yearField;
    private JButton addButton;

    public AddBookForm() {
        setTitle("Ajouter un Livre");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        titleField = new JTextField(20);
        authorField = new JTextField(20);
        yearField = new JTextField(4);
        addButton = new JButton("Ajouter");

        panel.add(new JLabel("Titre :"));
        panel.add(titleField);
        panel.add(new JLabel("Auteur :"));
        panel.add(authorField);
        panel.add(new JLabel("Année :"));
        panel.add(yearField);
        panel.add(addButton);
        add(panel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                String year = yearField.getText();
                Bibliotheque.addLivre(new Livre(title, author, Integer.parseInt(year))); // Assure-toi que la méthode addLivre existe
                dispose();
            }
        });
    }
}

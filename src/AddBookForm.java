import com.example.package.RemoveBookForm;
import com.example.package.SearchBookForm;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookForm extends JFrame {
    private JTextField titleField, authorField, yearField;
    private Bibliotheque bibliotheque;

    public AddBookForm(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
        setTitle("Ajouter un livre");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Titre:");
        titleLabel.setBounds(10, 20, 80, 25);
        panel.add(titleLabel);

        titleField = new JTextField(20);
        titleField.setBounds(100, 20, 165, 25);
        panel.add(titleField);

        JLabel authorLabel = new JLabel("Auteur:");
        authorLabel.setBounds(10, 50, 80, 25);
        panel.add(authorLabel);

        authorField = new JTextField(20);
        authorField.setBounds(100, 50, 165, 25);
        panel.add(authorField);

        JLabel yearLabel = new JLabel("Année:");
        yearLabel.setBounds(10, 80, 80, 25);
        panel.add(yearLabel);

        yearField = new JTextField(20);
        yearField.setBounds(100, 80, 165, 25);
        panel.add(yearField);

        JButton addButton = new JButton("Ajouter");
        addButton.setBounds(10, 110, 150, 25);
        panel.add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                int year = Integer.parseInt(yearField.getText());
                bibliotheque.addLivre(new Livre(title, author, year));
                JOptionPane.showMessageDialog(null, "Livre ajouté avec succès!");
                dispose();
            }
        });
    }
}

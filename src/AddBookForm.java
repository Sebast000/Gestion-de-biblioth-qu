import javax.swing.*;

public class AddBookForm extends JFrame {

    private JTextField titleField;
    private JTextField authorField;
    private JTextField yearField;
    private JButton addButton;

    public AddBookForm() {
        setTitle("Ajouter un livre");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        addButton.addActionListener(e -> {
            String title = titleField.getText();
            String author = authorField.getText();
            int year = Integer.parseInt(yearField.getText());
            Bibliotheque.addLivre(new Livre(title, author, year));
            dispose();
        });

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Titre");
        titleLabel.setBounds(10, 20, 120, 25);
        panel.add(titleLabel);

        titleField = new JTextField(20);
        titleField.setBounds(150, 20, 200, 25);
        panel.add(titleField);

        JLabel authorLabel = new JLabel("Auteur");
        authorLabel.setBounds(10, 50, 120, 25);
        panel.add(authorLabel);

        authorField = new JTextField(20);
        authorField.setBounds(150, 50, 200, 25);
        panel.add(authorField);

        JLabel yearLabel = new JLabel("Année de publication");
        yearLabel.setBounds(10, 80, 120, 25);
        panel.add(yearLabel);

        yearField = new JTextField(20);
        yearField.setBounds(150, 80, 200, 25);
        panel.add(yearField);

        addButton = new JButton("Ajouter");
        addButton.setBounds(150, 150, 200, 25);
        panel.add(addButton);
    }
}

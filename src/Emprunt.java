import java.util.Date;

public class Emprunt {
    private Livre livre;
    private Etudiant emprunteur;
    private Date dateEmprunt;

    public Emprunt(Livre livre, Etudiant emprunteur) {
        this.livre = livre;
        this.emprunteur = emprunteur;
        this.dateEmprunt = new Date();  // Date actuelle
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public Livre getLivre() {
        return livre;
    }

    public Etudiant getEmprunteur() {
        return emprunteur;
    }
}

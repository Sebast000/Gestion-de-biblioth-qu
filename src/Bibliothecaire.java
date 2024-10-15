public class Bibliothecaire extends Utilisateur {

    public Bibliothecaire(String nomUtilisateur, String motDePasse) {
        super(nomUtilisateur, motDePasse);
    }

    public void ajouterLivre(Bibliotheque bibliotheque, Livre livre) {
        bibliotheque.ajouterLivre(livre);
        System.out.println("Livre ajouté : " + livre.getTitre());
    }
}

public class Etudiant extends Utilisateur {

    public Etudiant(String nomUtilisateur, String motDePasse) {
        super(nomUtilisateur, motDePasse);
    }

    public void emprunterLivre(Bibliotheque bibliotheque, String titre) {
        Livre livre = bibliotheque.rechercherParTitre(titre);
        if (livre != null && livre.isDisponible()) {
            livre.setDisponible(false);
            System.out.println("Livre emprunté : " + livre.getTitre());
        } else {
            System.out.println("Livre non disponible.");
        }
    }
}

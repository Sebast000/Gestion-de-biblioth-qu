public class GestionnaireDeBibliotheque {
    private Bibliotheque bibliotheque;

    public GestionnaireDeBibliotheque(Bibliotheque bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public void afficherLivres() {
        for (Livre livre : bibliotheque.getLivres()) {
            System.out.println("Titre : " + livre.getTitre() + " | Disponible : " + livre.isDisponible());
        }
    }
}

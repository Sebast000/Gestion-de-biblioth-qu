import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;

    public Bibliotheque() {
        livres = new ArrayList<>();
    }

   public void addLivre(Livre livre) {
        livres.add(livre);
        System.out.println("Livre ajouté : " + livre.getTitle());
    }

    public void removeLivre(String titre) {
        livres.removeIf(livre -> livre.getTitre().equals(titre));
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public Livre searchLivre(String titre) {
        for (Livre livre : livres) {
            if (livre.getTitre().equalsIgnoreCase(titre)) {
                return livre;
            }
        }
        return null;
    }
}

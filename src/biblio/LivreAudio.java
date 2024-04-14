package biblio;

public class LivreAudio extends Livre {
    private int duree;

    public LivreAudio(String titre, String auteur, int anneePublication, String ISBN, int duree) {
        super(titre, auteur, anneePublication, ISBN);
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "titre='" + getTitre() + '\'' +
                ", auteur='" + getAuteur() + '\'' +
                ", anneePublication=" + getAnneePublication() +
                ", ISBN='" + getISBN() + '\'' +
                ", duree=" + duree +
                '}';
    }
}

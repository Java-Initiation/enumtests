public class Pays {

    private String nom;
    private int nombreHabitants;
    private Continent continent;

    public Pays(String nom, int nombreHabitants, Continent continent) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nombreHabitants=" + nombreHabitants +
                ", continent=" + continent +
                '}';
    }
}

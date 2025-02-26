public class Arme {

    protected String nom;
    protected int degats;

    public Arme(String nom, int degats) {
        this.nom = nom;
        this.degats = degats;
    }

    public int getDegats() {
        return this.degats;
    }
}

public class Personnage {

    protected String nom;
    protected int pointVie;
    protected TypeAttaque typeAttaque;
    protected Arme a;

    public Personnage(String nom, int pointVie, Arme a, TypeAttaque typeAttaque) {
        this.nom = nom;
        this.pointVie = pointVie;
        this.a = a;
        this.typeAttaque = typeAttaque;
    }

    public Arme getArme() {
        return a;
    }

    public void prendDegats(int degats) {
        this.pointVie -= degats;
    }

    public String getNom() {
        return nom;
    }
}

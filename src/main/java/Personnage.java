public class Personnage {

    protected String nom;
    protected int pointVie;
    protected TypeAttaque typeAttaque;
    protected Arme a;

    public Personnage(String nom, Arme a, TypeAttaque typeAttaque, int pointVie) {
        this.nom = nom;
        this.a = a;
        this.typeAttaque = typeAttaque;
        this.pointVie = pointVie;
    }

    public Arme getArme() {
        return a;
    }

    public void prendDegats(int degats) {
        this.pointVie -= degats;
    }
    public void rendPv(int Pv) {
        this.pointVie += Pv;
    }

    public String getNom() {
        return nom;
    }

    public int getPointVie() {
        return pointVie;
    }
}

public class Soigneur extends Personnage{

    int pointMana;

    public Soigneur(String nom, Arme a) {
        super(nom, a, new SoinMagique(), 20);
        this.pointMana = 150;
    }

    public int getPointMana() {
        return pointMana;
    }

    public void setPointMana(int pointMana) {
        this.pointMana = pointMana;
    }

    public void consommeMana(int pointMana) {
        this.pointMana -= pointMana;
    }


}

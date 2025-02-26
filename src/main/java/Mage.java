public class Mage extends Personnage{

    int pointMana;

    public Mage(String nom, Arme a) {
        super(nom, a, new attaqueMagique(), 35);
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

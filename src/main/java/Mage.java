public class Mage extends Personnage{

    int pointMana;

    public Mage(String nom, int pointVie, Arme a, TypeAttaque typeAttaque, int mana) {
        super(nom, pointVie, a, typeAttaque);
        this.pointMana = mana;
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

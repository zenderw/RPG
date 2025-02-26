import Attacks.Heal;
import Characters.Character;
import Weapons.Weapon;

public class Soigneur extends Character {

    int pointMana;

    public Soigneur(String nom, Weapon a) {
        super(nom, a, new Heal(), 20);
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

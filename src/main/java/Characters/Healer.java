package Characters;

import Attacks.Heal;
import Weapons.Weapon;

public class Healer extends Character{

    int manaPoints;

    public Healer(String nom, Weapon a) {
        super(nom, a, new Heal(), 20);
        this.manaPoints = 150;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void consommeMana(int pointMana) {
        this.manaPoints -= pointMana;
    }


}

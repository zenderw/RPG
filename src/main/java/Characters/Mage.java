package Characters;

import Weapons.Weapon;
import Attacks.Magic;

public class Mage extends Character {

    int manaPoints;

    public Mage(String name, Weapon a) {
        super(name, a, new Magic(), 35);
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

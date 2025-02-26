package Characters;

import Weapons.Weapon;
import Attacks.Melee;

public class Warrior extends Character {
    public Warrior(String name, Weapon a) {
        super(name, a, new Melee(), 60);
    }
}

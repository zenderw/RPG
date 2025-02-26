package Characters;

import Weapons.Weapon;
import Attacks.Range;

public class Bowman extends Character {

    public Bowman(String name, Weapon weapon) {
        super(name, weapon, new Range(), 45);
    }
}

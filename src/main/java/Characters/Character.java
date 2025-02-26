package Characters;

import Weapons.Weapon;
import Attacks.AttackType;

public abstract class Character {

    protected String name;
    protected int healthPoints;
    public AttackType attackType;
    protected Weapon a;

    public Character(String name, Weapon a, AttackType attackType, int healthPoints) {
        this.name = name;
        this.a = a;
        this.attackType = attackType;
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return a;
    }

    public void takeDamages(int damages) {
        this.healthPoints -= damages;
    }
    public void rendPv(int Pv) {
        this.healthPoints += Pv;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}

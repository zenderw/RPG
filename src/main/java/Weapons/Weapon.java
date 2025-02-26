package Weapons;

public class Weapon {

    protected String name;
    protected int damages;

    public Weapon(String name, int damages) {
        this.name = name;
        this.damages = damages;
    }

    public int getDamages() {
        return this.damages;
    }
}

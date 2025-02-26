package Attacks;

import Characters.Character;

public class Melee implements AttackType {

    @Override
    public void attack(Character shooteur, Character target) {
        int damages = shooteur.getWeapon().getDamages();
        target.takeDamages(damages);
        System.out.println(shooteur.getName() + " frappe " + target.getName() + "et lui inflige " + damages + " dégâts !");
    }
}

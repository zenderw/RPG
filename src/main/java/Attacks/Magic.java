package Attacks;

import Characters.Mage;
import Characters.Character;

public class Magic implements AttackType {

    @Override
    public void attack(Character shooteur, Character target) {
        Mage mage = (Mage) shooteur;
        int damages = shooteur.getWeapon().getDamages();
        if(mage.getManaPoints() >= 30) {
            target.takeDamages(damages);
            System.out.println(shooteur.getName() + " lance un sort sur " + target.getName() + " et lui inflige " + damages + " dégâts !");
            mage.consommeMana(30);
        } else {
            System.out.println("Le mage n'a pas assez de mana !");
        }

    }
}

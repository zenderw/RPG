package Attacks;

import Characters.Character;
import Characters.Healer;

public class Heal implements AttackType {

    @Override
    public void attack(Character shooter, Character target) {
        Healer soigneur = (Healer) shooter;
        int pv = shooter.getWeapon().getDamages();
    if(soigneur.getManaPoints() >= 15) {
            target.rendPv(pv);
            System.out.println(shooter.getName() + " lance un sort sur " + target.getName() + " et lui rend " + pv + " pv !");
            soigneur.consommeMana(30);
        } else {
            System.out.println("Le soigneur n'a pas assez de mana !");
        }
    }
}
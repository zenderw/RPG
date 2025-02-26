import Attacks.Heal;
import Characters.*;
import Characters.Character;
import Weapons.Weapon;

public class Main {

    public static void main(String[] args) {
        Weapon arc = new Weapon("Arc en bois", 5);
        Weapon epee = new Weapon("Epee en bois", 5);
        Weapon baguette = new Weapon("Baguette en bois ancien", 8);
        Weapon sceptre = new Weapon("Baguette en fer", 15);


        Character mage = new Mage("Randy", baguette);
        Character guerrier = new Warrior("Wayl", epee);
        Character archer = new Bowman("Théo le noob", arc);
        Character soigneur = new Healer("Pierre",sceptre);

        mage.attackType.attack(mage, archer);
        System.out.println(archer.getHealthPoints());
        mage.attackType.attack(mage, archer);
        System.out.println(archer.getHealthPoints());

        soigneur.attackType.attack(soigneur, archer);
        System.out.println(archer.getHealthPoints());


    }
}

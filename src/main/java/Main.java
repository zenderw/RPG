public class Main {

    public static void main(String[] args) {
        Arme arc = new Arme("Arc en bois", 5);
        Arme epee = new Arme("Epee en bois", 5);
        Arme baguette = new Arme("Baguette en bois ancien", 8);

        Personnage mage = new Mage("Randy", baguette);
        Personnage guerrier = new Guerrier("Wayl", epee);
        Personnage archer = new Archer("Archer", arc);

        mage.typeAttaque.attaque(mage, archer);

    }
}

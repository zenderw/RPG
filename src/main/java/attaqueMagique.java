public class attaqueMagique implements TypeAttaque{

    @Override
    public void attaque(Personnage tireur, Personnage cible) {
        Mage mage = (Mage) tireur;
        int degats = tireur.getArme().getDegats();
        if(mage.getPointMana() >= 30) {
            cible.prendDegats(degats);
            System.out.println(tireur.getNom() + " lance un sort sur " + cible.getNom() + " et lui inflige " + degats + " dégâts !");
            mage.consommeMana(30);
        } else {
            System.out.println("Le mage n'a pas assez de mana !");
        }

    }
}

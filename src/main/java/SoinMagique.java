public class SoinMagique implements TypeAttaque{

    @Override
    public void attaque(Personnage tireur, Personnage cible) {
        Soigneur soigneur = (Soigneur) tireur;
        int pv = tireur.getArme().getDegats();
    if(soigneur.getPointMana() >= 15) {
            cible.rendPv(pv);
            System.out.println(tireur.getNom() + " lance un sort sur " + cible.getNom() + " et lui rend " + pv + " pv !");
            soigneur.consommeMana(30);
        } else {
            System.out.println("Le soigneur n'a pas assez de mana !");
        }
    }


}
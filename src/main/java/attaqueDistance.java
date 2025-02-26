public class attaqueDistance implements TypeAttaque{

    @Override
    public void attaque(Personnage tireur, Personnage cible) {
        int degats = tireur.getArme().getDegats();
        cible.prendDegats(degats);
        System.out.println(tireur.getNom() + " tire sur  " + cible.getNom() + "et lui inflige " + degats + " dégâts !");
    }
}

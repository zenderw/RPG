public class attaqueMelee implements TypeAttaque{

    @Override
    public void attaque(Personnage tireur, Personnage cible) {
        int degats = tireur.getArme().getDegats();
        cible.prendDegats(degats);
        System.out.println(tireur.getNom() + " frappe " + cible.getNom() + "et lui inflige " + degats + " dégâts !");
    }
}

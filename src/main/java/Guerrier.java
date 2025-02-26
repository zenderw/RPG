public class Guerrier extends Personnage{
    public Guerrier(String nom, Arme a) {
        super(nom, a, new attaqueMelee(), 60);
    }
}

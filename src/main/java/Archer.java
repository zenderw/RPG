public class Archer extends Personnage {

    public Archer(String nom, Arme a) {
        super(nom, a, new attaqueDistance(), 45);
    }
}

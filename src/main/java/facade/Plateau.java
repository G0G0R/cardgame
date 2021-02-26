package facade;

import model.Personnage;

public interface Plateau {

    void chargerJoueurs();

    Personnage choisir_joueur();

    public void lancerPartie();

}

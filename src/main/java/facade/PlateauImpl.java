package facade;

import model.Chrono;
import model.Personnage;

import java.util.Scanner;

public class PlateauImpl implements Plateau {

    Personnage player1;
    Personnage player2;
    Chrono chrono;
    Scanner clavier;

    public PlateauImpl() {
        this.chrono = new Chrono();
        this.clavier = new Scanner(System.in);
    }

    @Override
    public void chargerJoueurs() {
        this.player1 = choisir_joueur();
        this.player2 = new Personnage("Garrosh", 40);
    }

    @Override
    public Personnage choisir_joueur() {
        System.out.print("Liste des héros: Garrosh, Jaina, Thrall\nChoisissez votre héros: ");
        String name = clavier.nextLine();
        if (name.equalsIgnoreCase("Jaina")){
            return new Personnage("Jaina", 30);
        }
        else if (name.equalsIgnoreCase("Garrosh")){
            return new Personnage("Garrosh",40);
        }
        else if (name.equalsIgnoreCase("Thrall")){
            return new Personnage("Garrosh",40);
        }
        System.out.println("Vous n'avez pas saisi un nom valide!");
        return choisir_joueur();
    }


    @Override
    public void lancerPartie() {
        int degat;
        chargerJoueurs();
        while ((this.player1.getVie() > 0) && (this.player2.getVie() > 0)) {
            degat = this.clavier.nextInt();
            this.player1.ajouterMana();
            this.player2.ajouterMana();
            this.player1.infligerDegat(degat);
            System.out.println(this.player1);
            System.out.println(this.player2);
        }
        clavier.close();
    }

    @Override
    public String toString() {
        return "facade.Plateau{" +
                "player1=" + player1 +
                ", player2=" + player2 +
                '}';
    }

}

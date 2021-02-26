package model;

public class Personnage {

    String nom;
    int pdv;
    int mana;

    public Personnage(String name, int vie) {
        this.nom = name;
        this.pdv = vie;
        this.mana = 1;
    }

    @Override
    public String toString() {
        return "model.Personnage{" +
                "nom='" + this.nom + '\'' +
                ", pdv=" + this.pdv + '\'' +
                ", mana=" + this.mana +
                '}';
    }

    public void ajouterMana() {
        if (this.mana < 10) {
            this.mana++;
        }
    }

    public int getVie() {
        return this.pdv;
    }

    public void infligerDegat(int degat) {
        this.pdv -= degat;
    }
}

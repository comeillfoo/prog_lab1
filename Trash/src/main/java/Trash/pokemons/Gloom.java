package Trash.pokemons;

import Trash.moves.SweetScent;

public class Gloom extends Oddish {

    public Gloom(String name, int level) {
        super(name, level);
        setStats(60,65,70,85,75,40);
        if (this.getLevel() >= 5) addMove(new SweetScent());
    }
}

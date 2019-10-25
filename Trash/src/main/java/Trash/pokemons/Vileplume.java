package Trash.pokemons;

import Trash.moves.SweetScent;

public class Vileplume extends Gloom {
    public Vileplume(String name, int level) {
        super(name, level);
        setStats(75,80,85,110,90,50);
        addMove(new SweetScent());
    }
}
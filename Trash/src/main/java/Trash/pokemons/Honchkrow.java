package Trash.pokemons;

import Trash.moves.NightSlash;
import Trash.moves.Swagger;

public class Honchkrow extends Murkrow {
    public Honchkrow(String name, int level) {
        super(name, level);
        setStats(100,125,52,105,52,71);
        if (this.getLevel() >= 55) addMove(new NightSlash());
        if (this.getLevel() >= 25) addMove(new Swagger());
    }
}
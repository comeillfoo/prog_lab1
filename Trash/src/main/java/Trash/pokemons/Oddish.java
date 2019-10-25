package Trash.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Trash.moves.DoubleTeam;
import Trash.moves.MegaDrain;

public class Oddish extends Pokemon {
    public Oddish(String name, int level) {
        super(name, level);
        setStats(45,50,55,75,65,30);
        addType(Type.GRASS);
        addType(Type.POISON);
        addMove(new DoubleTeam());
        if (this.getLevel() >= 19) addMove(new MegaDrain());
    }
}

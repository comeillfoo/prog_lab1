package Trash.pokemons;

import Trash.moves.CalmMind;
import Trash.moves.Swagger;
import Trash.moves.FoulPlay;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Murkrow extends Pokemon {
    public Murkrow(String name, int level) {
        super(name, level);
        setStats(60,85,42,85,42,91);
        addType(Type.DARK);
        addType(Type.FLYING);
        addMove(new CalmMind());
        addMove(new Swagger());
        if (this.getLevel() >= 45)
            addMove(new FoulPlay());
    }
}

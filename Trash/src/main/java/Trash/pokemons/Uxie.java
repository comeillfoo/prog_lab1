package Trash.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Trash.moves.ChargeBeam;
import Trash.moves.DazzlingGleam;
import Trash.moves.Thunder;
import Trash.moves.CalmMind;

public class Uxie extends Pokemon {
    public Uxie(String name, int level) {
        super(name, level);
        setStats(75,75,130,75,130,95);
        setType(Type.PSYCHIC);
        addMove(new ChargeBeam());
        addMove(new DazzlingGleam());
        addMove(new Thunder());
        addMove(new CalmMind());
    }
}

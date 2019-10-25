package Trash.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NightSlash extends PhysicalMove {
    public NightSlash() {super(Type.DARK, 70, 100);}
    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return 1.0/8;
    }

    @Override
    protected String describe() {
        return "slashes black whip like night";
    }
}

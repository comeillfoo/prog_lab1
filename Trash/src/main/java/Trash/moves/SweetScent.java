package Trash.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class SweetScent extends StatusMove {
    public SweetScent() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.EVASION, -1));
    }

    @Override
    protected String describe() {
        return "smells sweetly";
    }
}

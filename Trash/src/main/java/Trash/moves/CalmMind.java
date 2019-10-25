package Trash.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.confuse();
        pokemon.addEffect(new Effect().turns(1).stat(Stat.SPECIAL_ATTACK, 3).stat(Stat.SPECIAL_DEFENSE, 3));
    }

    @Override
    protected String describe() {
        return "studies zen";
    }
}

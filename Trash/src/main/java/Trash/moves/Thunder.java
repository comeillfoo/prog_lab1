package Trash.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (!pokemon.hasType(Type.ELECTRIC))
            pokemon.setCondition(new Effect().chance(0.3).condition(Status.PARALYZE));
    }

    @Override
    protected String describe() {
        return "*PICA-CHUU* cast the light from their ass";
    }
}

package Trash.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class MegaDrain extends SpecialMove {
    public MegaDrain() {
        super(Type.GRASS, 40, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        pokemon.addEffect(new Effect().stat(Stat.HP, (int)(pokemon.getStat(Stat.HP) - pokemon.getHP())/2));
    }

    @Override
    protected String describe() {
        return "has drained at all";
    }
}

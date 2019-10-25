package Trash.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FoulPlay extends PhysicalMove {
    public FoulPlay() {
        super(Type.DARK, 95, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcBaseDamage(pokemon1, pokemon);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcCriticalHit(pokemon1, pokemon);
    }

    @Override
    protected double calcRandomDamage(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcRandomDamage(pokemon1, pokemon);
    }

    @Override
    protected double calcSameTypeAttackBonus(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcSameTypeAttackBonus(pokemon1, pokemon);
    }

    @Override
    protected double calcTypeEffect(Pokemon pokemon, Pokemon pokemon1) {
        return super.calcTypeEffect(pokemon1, pokemon);
    }

    @Override
    protected String describe() {
        return "cheates";
    }
}


package Trash;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import Trash.pokemons.*;

import java.util.ArrayList;

public class GameBoy {

    public static void main(String[] args) {
        ArrayList<Pokemon> zoo = new ArrayList<Pokemon>();
        zoo.add(new Pokemon("HPV", 100));
        zoo.add(new Uxie("Hope", 50));
        zoo.add(new Oddish("Syphilis", 19));
        zoo.add(new Murkrow("Ivan Loev", 45));
        zoo.add(new Honchkrow("Gonorrhea", 55));
        zoo.add(new Gloom("Krasnopolskaya-sama", 5));
        zoo.add(new Vileplume("Trichomoniasis", 25));
        Battle b = new Battle();
        int i = 0;
        for (Pokemon p: zoo) {
            if (i % 2 == 0)
                b.addAlly(zoo.get(i++));
            else b.addFoe(zoo.get(i++));
        }
        b.go();
    }
}
package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Willian Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");


        Manga manga1 = new Manga(5L, "Hellsing", 19.9);
        Manga manga2 = new Manga(1L, "Boku no hero", 9.5);
        Manga manga3 = new Manga(3L, "Pokemon", 3.2);
        Manga manga4 = new Manga(2L, "Dragon ball Z", 11.20);
        Manga manga5 = new Manga(1L, "Attk", 2.99);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();

        


    }
}

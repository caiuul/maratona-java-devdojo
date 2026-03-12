package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparactor implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparactor());
        Smartphone smartphone = new Smartphone("123", "nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Hellsing", 19.9, 0));
        mangas.add(new Manga(1L, "Boku no hero", 9.5, 5));
        mangas.add(new Manga(3L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.20, 2));
        mangas.add(new Manga(1L, "Attk", 2.99,0));

        for (Manga manga : mangas) {
            System.out.println(manga);

        }


    }
}

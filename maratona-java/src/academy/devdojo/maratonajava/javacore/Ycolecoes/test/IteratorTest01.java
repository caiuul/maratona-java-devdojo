package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "hellsing", 19.9, 0));
        mangas.add(new Manga(1L, "boku no hero", 9.5, 5));
        mangas.add(new Manga(3L, "pokemon", 3.2, 0));
        mangas.add(new Manga(2L, "Dragon ball Z", 11.20, 2));
        mangas.add(new Manga(1L, "Attk", 2.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }


        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}

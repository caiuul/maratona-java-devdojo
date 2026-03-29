package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        List<Barco> barcos = List.of(new Barco("lancha"), new Barco("Canoa"));
        barcos.sort();


    }
}

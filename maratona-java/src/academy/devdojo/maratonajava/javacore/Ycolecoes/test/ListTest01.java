package academy.devdojo.maratonajava.javacore.Ycolecoes.test;


import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(); //1.5
        List<String> nomes2 = new ArrayList<>(); //1.5
        nomes.add("Caiul");
        nomes.add("Java");

        nomes2.add("Soffia");
        nomes2.add("Java");

        nomes.addAll(nomes2);
        
        for (String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("---------------------");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));

        } // lista com for indexavel

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);






    }
}

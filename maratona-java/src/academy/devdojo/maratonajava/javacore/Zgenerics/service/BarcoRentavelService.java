package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {

    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("iate")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barco disponivel...");

        Barco c = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + c);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return c;

    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco : " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}

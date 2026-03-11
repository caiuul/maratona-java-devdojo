package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("goku");
        list.add("kuririn");
        list.add("vegeta");
        System.out.println(list);

    }
}

package academy.devdojo.maratonajava.javacore.Oexption.exception.test;

import academy.devdojo.maratonajava.javacore.Oexption.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexption.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexption.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}

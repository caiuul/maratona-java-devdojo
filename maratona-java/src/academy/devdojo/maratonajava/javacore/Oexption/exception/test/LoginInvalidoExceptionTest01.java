package academy.devdojo.maratonajava.javacore.Oexption.exception.test;

import academy.devdojo.maratonajava.javacore.Oexption.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar () throws LoginInvalidoException{
        Scanner sc = new Scanner(System.in);
        String usernameDB = "goku";
        String senhaDB = "ssj";
        System.out.println("Usuario: ");
        String userNameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();

        if (!usernameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        } System.out.println("Usuario logado com sucesso");
    }
}

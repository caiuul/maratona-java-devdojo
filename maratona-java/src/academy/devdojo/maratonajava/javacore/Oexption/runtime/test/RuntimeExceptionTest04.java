package academy.devdojo.maratonajava.javacore.Oexption.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{}
}

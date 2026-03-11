package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("O dev dojo e lindo, e o melhor curso do brasilllll\nContinuando o proximo capitulo");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

package academy.devdojo.maratonajava.javacore.MInterfaces.teste;

import academy.devdojo.maratonajava.javacore.MInterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.MInterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.MInterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
    }
}

package academy.devdojo.maratonajava.javacore.MInterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    public default void checkPermission(){
        System.out.println("fazendo checagem de permissoes");
    };

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }

}

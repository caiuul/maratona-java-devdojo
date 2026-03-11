package academy.devdojo.maratonajava.javacore.MInterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{

    //private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando dados do bancos de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do bancos de dados");
    }


}

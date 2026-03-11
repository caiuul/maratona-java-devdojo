package academy.devdojo.maratonajava.javacore.Oexption.error.test;

public class STackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public  static void recursividade(){
        recursividade();
    }
}

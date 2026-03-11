package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformaceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para string " + (fim -inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para stringBuilder " + (fim -inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("tempo gasto para stringBuffer " + (fim -inicio) + "ms");

    }



    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto +=i; //0,01,012,013
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }

}

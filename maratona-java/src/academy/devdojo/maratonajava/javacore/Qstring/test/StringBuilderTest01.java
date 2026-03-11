package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome =  "Caiul";
        nome.concat("DevDojo");
        nome = nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Caiul");
        sb.append(" Dev Dojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);



    }
    
}

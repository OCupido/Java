import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String txt = "Olá pessoal da IOS";
        // imprime o tamanho da String
        System.out.println("O tamanho da String txt é:" + txt.length());
        //imprime os caracteres da string em maiusculo
        System.out.println(txt.toUpperCase());
        //imprime os caracteres da string em minusculo
        System.out.println(txt.toLowerCase());
        //imprime a posição da primeira ocorrencia de um valor na string
        System.out.println(txt.indexOf("s"));
        System.out.println(txt.indexOf("IO"));
        //não encontra o texto na string
        System.out.println(txt.indexOf("io")); // case sensitive
    }
}

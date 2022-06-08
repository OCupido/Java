public class Strings2 {
    public static void main(String[] args) {
        String txt = "olá Pessoal do IOS";
        String myStr1 = "Hello";
        String myStr2 = "hello";

        char result = txt.charAt (0); //caractere na posição zero
        System.out.println("char na posição zero:" + result);
        result = txt.charAt(10); //caractere na posição dez
        System.out.println("char na posição dez:" + result);

        //compara strings
        System.out.println("Compara myStr1 com myStr2:" + myStr1.compareTo (myStr2)); //retorna 0
        System.out.println("Compara txt com myStr2:" + txt.compareTo(myStr2)); //return um valor < 0

        System.out.println("compara myStr1 com txt:" + myStr1.compareTo(txt)); // retorna um valor < 0

        //Verifica o ínicio e o final de uma String
        System.out.println("Verifica inicio da string txt:" + txt.startsWith("olá"));//retorna true
        System.out.println("verifica inicio da string txt:" + txt.startsWith("o")); //retorna true
        System.out.println("Verifica inicio da string txt:" + txt.startsWith("o")); //retorna false

        System.out.println("verificar final da string txt:" + txt.endsWith("IOS")); //retorna true
        System.out.println("verifica final da string txt:" + txt.endsWith("S")); //retorna true
        System.out.println("verifica dinal da string txt:" + txt.endsWith("s")); //retorna false
    }
}

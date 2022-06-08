public class Strings3 {
    public static void main(String[] args) {
        String txt1 = "Olá aa Pessoal aa do aa Ios";
        String txt2 = "";
        String txt3 = "    Ola mundo!    ";

        //verifica se a string está vazia
        System.out.println("String txt1 está vazia?" + txt1.isEmpty());
        System.out.println("String txt2 está vazia?" + txt2.isEmpty());

        System.out.println("ultima posição do aa:" + txt1.lastIndexOf("aa"));

        //substituir algo na string
        String txt4 = txt1.replace('a', 'x');
        System.out.println(txt4);

        //retira espaços no inicio e no final
        System.out.println("string original:" + txt3);
        System.out.println("string sem espaços:" + txt3.trim());
    }
}

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // Tipos Primitivos
        byte idade_tipo_byte = 127;
        short ano_tipo_short = 32767;
        int inteiro_ipo_int = 2147483647;
        double preco_tipo_double = 2500.09;
        float valor_tipo_float = 3.14f;
        long longo_tipo_long = 9223372036854775807L;

        char letra_tipo_char = 'H';
        boolean tipo_boolean = true;
        String nome_tipo_string = "Hender Berigo";

        // Tipos complexos

        String[] listaNomes = { "Hender", "Laila", "José", "Meg" };
        int[] listaIdades = { 49, 42, 17, 12 };

        System.out.println(listaNomes[3]);
        System.out.println(listaIdades[3]);

        // Constantes

        final int NUMERO = 49; // constante, não pode ter seu valor alterado
        // numero = 40; // error: cannot assign a value to final variable numero
        final double VALOR_PI = 3.14; // constante, não pode ter seu valor alterado
        // VALOR_PI = 40; // error: cannot assign a value to final variable numero
    }
}

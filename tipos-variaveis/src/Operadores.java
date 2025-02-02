public class Operadores {
    public static void main(String[] args) {

        // Operadores de atribuição '=' atribuir um valor a uma variável
        String nome = "Hender";
        System.out.println("Nome: " + nome);

        // Operadores aritméticos
        // *** adição (+)
        double resultado0 = 15.5 + 20;
        System.out.println("Adição: " + resultado0);

        // *** contatenação (+)
        String resultado1 = 15 + "20"; // concatena os valores
        System.out.println("Concatenação: " + resultado1);

        // *** subtração
        double resultado2 = 15.5 - 20;
        System.out.println("Subtração: " + resultado2);

        // *** divisão
        double resultado3 = 15.5 / 20;
        System.out.println("Divisão: " + resultado3);

        // *** multiplicação
        double resultado4 = 15.5 * 20;
        System.out.println("Multiplicação: " + resultado4);

        // *** mod
        double resultado5 = 45 % 20; // resto da divisão
        System.out.println("Módulo: " + resultado5);

        // *** exponenciação
        double resultado6 = Math.pow(8, 2); // 8 elevado a 2ª potência
        System.out.println("Exponenciação: " + resultado6);

        // regras
        double resultado7 = 6 + 6 / 2; // regra de prioridades
        System.out.println("Regra aritimética 01: " + resultado7);

        // regras
        double resultado8 = (6 + 6) / 2; // regra de prioridades
        System.out.println("Regra aritimética 02: " + resultado8);

        // Operadores unários
        int numero10 = 10;
        numero10 += 5;
        --numero10;
        System.out.println("Unário: " + numero10);

        // Operadores relacionais: ==, >, >=, <, <=, !=
        String nome1 = "Hender";
        String nome2 = "Henders";
        System.out.println("Relacional - '==': " + nome1 == nome2); // igual a...?
        System.out.println("Relacional - '!=': " + nome1 != nome2); // diferente de...?
        System.out.println("Relacional - '==' : " + (10 == 11)); // igual a...?
        System.out.println("Relacional - '>' : " + (10 > 11)); // maior que...?
        System.out.println("Relacional - '>=' : " + (10 >= 11)); // maior ou igual que...?
        System.out.println("Relacional - '<' : " + (10 < 11)); // menor que...?
        System.out.println("Relacional - '<=' : " + (10 <= 11)); // menor ou igual que...?
        System.out.println("Relacional - '!=' : " + (10 != 11)); // diferente?
        System.out.println(nome1.equals(nome2)); // método equals

        // Opreradores boleanos
        boolean falso = false;
        System.out.println("Boleano: " + !falso);

        // Operadores lógicos: &&(E) , ||(OU)
        int ano = 2025;
        String mes = "Dezembro";

        if (ano == 2025 && mes != "dezembro") {
            System.out.println("E lógico");
        } else if (ano == 2025 || mes == "dezembro") {
            System.out.println("OU lógico");
        }

        // Operdaor ternário
        int numero15 = 14;
        // if (numero15 == 15) {
        // System.out.println("Verdadeiro");
        // } else {

        // System.out.println("Verdadeiro");
        // }

        String reultado = numero15 == 15 - 1 ? "Verdade" : "Falso"; // ternário com string
        int resultado = numero15 == 15 - 1 ? 1 : 0; // ternário com números
        System.out.println("Ternário 01: " + reultado);
        System.out.println("Ternário 02: " + resultado);
    }
}

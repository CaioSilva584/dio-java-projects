import java.text.DecimalFormat;

/**
 * Operadores
 */
public class Operadores {

    public static void main(String[] args) {

        // Concatenação (apenas com string ou char)
        String concatenacao = "";

        concatenacao = "1" + 1 + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1" + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1 + 1);

        System.out.println(concatenacao);

        // Unários
        int numero = 5;

        System.out.println(numero);

        System.out.println(-numero);

        numero = -numero;

        System.out.println(numero);

        numero = +numero;

        System.out.println(-numero);

        // Resumidos
        numero++;

        System.out.println(numero);

        // Valores booleanos

        boolean verdadeiro = false;

        System.out.println(!verdadeiro);

        // Ternário
        int a = 3;
        int b = 5;
        String expressao = a==b ? "Verdade" : "Mentira";

        System.out.println(expressao);
    }
}
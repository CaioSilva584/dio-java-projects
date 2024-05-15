import java.text.DecimalFormat;

/**
 * Operadores
 */
public class Operadores {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##0,00");

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
    }
}
import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##0,00");
        double mesada = 50.00;

        while (mesada > 0) {
            double valorDoce = ThreadLocalRandom.current().nextDouble(2, 8);
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce de valor: " +
                    valorDoce + " adicionado ao carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada!");
    }
}
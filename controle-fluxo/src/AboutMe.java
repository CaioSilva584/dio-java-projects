import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutMe {
    public static void main(String[] args) {
        try {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scan.next();

            System.out.println("Digite seu nome: ");
            String sobrenome = scan.next();

            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scan.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() +
                    " " + sobrenome.toUpperCase() + "\nTenho " + idade +
                    " anos\nMinha altura é " + altura + "m");

            scan.close();
        } catch (InputMismatchException e) {
            System.out.println("*** Os campos idade e altura devem ser numéricos ***");
        }
    }
}
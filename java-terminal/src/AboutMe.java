import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "m ");

        System.out.println("Digite seu último nome: ");
        String ultimoNome = scanner.next();

        System.out.println("Seu nome inteiro é: " + nome +  " " + sobrenome + " " + ultimoNome);
    }
}

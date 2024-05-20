import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Olá! Seja bem vindo ao sistema de banco!");
        System.out.println("Vamos criar uma conta: \n");

        System.out.println("Por favor, digite o número da agência!");
        numero = scanner.nextInt();

        System.out.println("\nDigite o código da agência!");
        agencia = scanner.next();
    
        System.out.println("\nDigite o nome do titular!");
        nomeCliente = scanner.next();

        System.out.println("\nDigite o saldo inicial da conta!");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " + 
        "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

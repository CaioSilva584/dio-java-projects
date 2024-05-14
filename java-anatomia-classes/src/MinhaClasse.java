public class MinhaClasse {
    public static void main(String[] args) {

        String nome = "Caio";
        String sobrenome = "Gomes Silva";

        int anoCodigo = 2023;

        boolean verdadeira = false;

        anoCodigo = 2024;

        System.out.println("Classe criada manualmente por " + nomeCompleto(nome, sobrenome) + ".");
    }

    public static String nomeCompleto(String primeiroNome, String sobrenome) {

        return primeiroNome + sobrenome;
    }
}

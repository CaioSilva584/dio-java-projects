public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tratamento de tipos
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;      // Necessário casting para conversão;

        double salario = 10.5;
        long numeroGrande = 124354545454L;      // Deve conter o L ao final;
        float preco = 12.90F;       // Deve conter o F ao final;

        final double PI = 3.14;     // Definição de constante;

    }
}

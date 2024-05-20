public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota1 = 8;
        int nota2 = 5;
        String resultado = nota1 >= 7 ? "Aprovado" : nota1 >= 5 && nota1 < 7 ? "Prova de Recuperação" : "Reprovado";

        System.out.println(resultado);

        if (nota2 >= 7) {
            System.out.println("Aprovado");
        } else if (nota2 >= 5 && nota2 <7){
            System.out.println("Prova de Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}

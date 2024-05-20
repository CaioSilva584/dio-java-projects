public class ExemploForArray {
    public static void main(String[] args) {
        String  alunos []  = {"Felipe", "Carlinho", "Giba", "Meriva"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println("Nome do aluno do índice " + x + ": " + alunos[x]);
        }

        // Ou

        // Assim é feito o foreach em Java
        for (String aluno : alunos){
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}

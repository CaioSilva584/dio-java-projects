package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * ProcessoSeletivo
 */
public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

        String[] selecionados = selecaoCandidato();

        for (String candidato : selecionados) {
            entrarEmContato(candidato);
        }

        imprimirSelecinados(selecionados);
    }

    static void entrarEmContato(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativaRealizadas++;
            } else {
                System.out.println("Candidato contatado com sucesso");
            }
        } while (tentativaRealizadas < 3 && continuarTentando);

        if (atendeu) {
            System.out.println(
                    "Conseguimos contato com candidato " + candidato + " na " + tentativaRealizadas + "° tentativa");
        } else {
            System.out.println("Não conseguimos contato com candidato " + candidato + ". " + tentativaRealizadas
                    + " tentativas realizadas.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecinados(String[] selecionados) {
        System.out.println("Lista de candidatos selecionados: ");

        for (int x = 0; x < selecionados.length; x++) {
            System.out.println("Candidato n° " + (x + 1) + " : " + selecionados[x]);
        }
    }

    static String[] selecaoCandidato() {
        String[] candidatos = { "AUGUSTO", "JEFFERSON", "FABIOLA",
                "HEITOR", "ROGERIO", "VERONICA", "DEREK",
                "JOAO", "KARLA", "TONHAO" };
        String[] selecionados = new String[5];

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário "
                    + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

        return selecionados;
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase < salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
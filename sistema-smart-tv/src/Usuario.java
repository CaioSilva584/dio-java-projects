import edu.caio.model.SmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligarDesligar();

        System.out.println("Lelevisão está " + (smartTv.isLigada() ? "ligada" : "desligada"));

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.selecionarCanal(30);

        System.out.println("Assitindo ao canal " + smartTv.getCanal() + " no volume " + smartTv.getVolume());

        smartTv.ligarDesligar();

        System.out.println("Lelevisão está " + (smartTv.isLigada() ? "ligada" : "desligada"));

    }
}

public class Planooperadora {
    public static void main(String[] args) throws Exception {
        String plano = "M";

        // Sempre utilizar o switch case sem break para fluxos complementares 
        switch (plano) {
            case "T":{
                System.out.println("5GB Youtube");
            }

            case "M":{
                System.out.println("Whats e Instagram grátis");
            }

            case "B":{
                System.out.println("100 minutos de ligação"); 
            }
        }

        for (String string : args) {
            
        }
    }
}

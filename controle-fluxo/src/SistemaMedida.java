public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        String medida = "M";

        switch (medida) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
                
        
            case "M":{
                System.out.println("MEDIO");
                break;
            }

            case "G":{
                System.out.println("GRANDE");
                break;
            }

        }
    }
}

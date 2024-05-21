public class FormatadorCep {
    public static void main(String[] args) {
        // Tratamento decorrente do uso da classe "Exception"
        try {
            String cep = formatarCep("23765064");

            System.out.println(cep);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

/* O uso de "throws Exception" torna obrigatório o tratamento de erro
 * quando o método é utilizado.
 */
    public static String formatarCep (String cep) throws Exception{
        if (cep.length() != 8){
            throw new CepInvalidoException();
        }

        return "23.765-064";
    }
}

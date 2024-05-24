public class ExemploBreakContinue {
    public static void main(String[] args) {

        // Exemplo do break
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                break;
            }
            System.out.println(x);
            ;
        }

        // Exemplo continue
        for (int x = 1; x <= 5; x++) {
            if (x == 3) {
                continue;
            }
            System.out.println(x);

        }
    }
}
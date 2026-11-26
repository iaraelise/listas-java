public class Q01 {
    public static void main(String[] args) {

        // O laço externo controla quantas vezes o bloco de texto será impresso.
        
        for(int i = 1; i <= 3; i++) {

            // O laço interno imprime o texto cinco vezes.

            for(int j = 1; j <= 5; j++) {

                System.out.println("Olá, mundo!");
            }
            System.out.println();
        }
    }
}
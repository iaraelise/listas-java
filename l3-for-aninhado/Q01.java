public class Q01 {
    public static void main(String[] args) {

        /* O laço externo controla quantas vezes o bloco de mensagens será executado.
           A cada iteração do laço externo, o laço interno imprime a mensagem cinco vezes. */
        
        for(int i = 1; i <= 3; i++) {

            for(int j = 1; j <= 5; j++) {

                System.out.println("Olá, mundo!");
            }

            System.out.println();
        }
    }
}
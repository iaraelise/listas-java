public class Q03 {
    public static void main(String[] args) {

        /* O laço externo controla qual lado do primeiro dado será exibido, percorrendo os números de 1 a 6.
           A cada iteração, um novo lado é exibido.*/
        
        for(int i = 1; i <= 6; i++) {

            /* O laço interno percorre todos os resultados possíveis do segundo dado e combina cada um deles
               com o lado selecionado pelo laço externo. */

            for(int j = 1; j <= 6; j++) {

                System.out.println("Dado 1: " + i + " | Dado 2: " + j);
            }
            System.out.println();
        }
    }
}
public class Q04 {
    public static void main(String[] args) {

        /* O laço externo percorre as letras de A até D. A cada iteração, uma nova letra é selecionada. */

        for(char letra = 'A'; letra <= 'D'; letra++) {

            /* O laço interno percorre os números de 1 a 3, combinando cada número com a letra selecionada
            pelo laço externo. */

            for(int i = 1; i <= 3; i++) {

                System.out.println("Combinação: " + letra + i);
            }
            System.out.println();
        }
    }
}
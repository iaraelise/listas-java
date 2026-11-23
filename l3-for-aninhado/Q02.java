public class Q02 {
    public static void main(String[] args) {

        /* O laço externo controla qual tabuada será exibida, percorrendo os números de 1 a 5.
           A cada iteração, uma nova tabuada é iniciada. */
        
        for(int i = 1; i <= 5; i++) {

            System.out.println("Tabuada do " + i + ":");

            /* O laço interno percorre os multiplicadores de 1 a 10 e calcula os resultados
               da tabuada selecionada pelo laço externo. */
               
            for(int j = 1; j <= 10; j++) {

                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
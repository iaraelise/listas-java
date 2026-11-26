public class Q05 {
    public static void main(String[] args) {

        // O laço externo percorre os números de 1 a 5 e seleciona o primeiro elemento de cada par.
        
        for(int i = 1; i <= 5; i++) {

            // O laço interno percorre os números de 1 a 5, seleciona o segundo elemento e o combina com o valor de i.

            for(int j = 1; j <=5; j++) {

                // A condicional verifica se os valores de i e j são diferentes. Caso sejam, o par é exibido na saída.

                if(i != j) {
                    System.out.println(i + ", " + j);
                }
            }
            System.out.println();
        }
    }
}
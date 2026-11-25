import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");

        int num = input.nextInt();

        input.close();

        /* A variável primeiroNum controla a impressão dos números perfeitos,
        e identifica quando o primeiro número é encontrado. */

        boolean primeiroNum = true;

        /* O laço externo percorre os números de 1 até num,
        e verifica quais deles são números perfeitos. */

        for(int i = 1; i <= num; i++) {

            int somadorDivisores = 0;

            /* O laço interno percorre os possíveis divisores próprios de i,
            e verifica cada valor de 1 até < i. */

            for(int j = 1; j < i; j++) {

                /* A condicional verifica se a divisão de i por j possui resto zero.
                Caso possua, j é identificado como divisor de i e seu valor
                é adicionado à variável somadorDivisores. */

                if(i % j == 0) {

                    somadorDivisores += j;
                }
            }

            /* A condicional verifica se a soma dos divisores próprios
            é igual a i. Caso seja, ele é identificado como um número perfeito. */

            if(i == somadorDivisores) {

                /* A segunda condicional verifica se o número perfeito encontrado
                é o primeiro. Caso seja, o cabeçalho é exibido junto com o número. */

                if(primeiroNum == true) {

                    System.out.println();
                    System.out.print("Números perfeitos encontrados: " + i);

                    /* Após a impressão do primeiro número perfeito, a variável primeiroNum
                    recebe false para que os próximos números sejam separados por vírgula. */

                    primeiroNum = false;
                }
                else {
                    System.out.print(", " + i);
                }
            }
        }
        System.out.println();
    }
}
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");

        int num = input.nextInt();

        input.close();

        /* O laço externo percorre os números de 1 até num,
        e seleciona cada número que terá seus divisores identificados. */

        for(int i = 1; i <= num; i++) {

            boolean primeiroDivisor = true;

            /* O laço interno percorre os possíveis divisores de i,
            verificando cada valor de 1 até o próprio número. */

            for(int j = 1; j <= i; j++) {

                /* A condicional verifica se a divisão de i por j possui resto zero.
                Caso possua, j é identificado como divisor de i. */

                if(i % j == 0) {

                    /* A segunda condicional verifica se o divisor encontrado é o primeiro.
                    Caso seja, o texto é exibido junto com o divisor, sem vírgula. */

                    if(primeiroDivisor == true) {

                        System.out.println();
                        System.out.print("Divisores de " + i + ": " + j);

                        /* Após a impressão do primeiro divisor, a variável primeiroDivisor
                        recebe false para que os próximos divisores sejam separados por vírgula. */

                        primeiroDivisor = false;

                    }
                    else {
                        System.out.print(", " + j);
                    }
                }
            }

        }
        System.out.println();
    }
}

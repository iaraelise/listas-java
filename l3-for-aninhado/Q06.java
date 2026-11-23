import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de números que deseja verificar: ");

        int qtdNumeros = input.nextInt();

        /* O laço externo controla a quantidade de números que serão informados pelo usuário e verificados pelo programa. */

        for(int i = 1; i <= qtdNumeros; i++) {

            int contador = 0;

            int num = input.nextInt();

            /* O laço interno percorre os possíveis divisores de num e verifica cada valor de 1 até num. */

            for(int j = 1; j <= num; j++) {

                /* A condicional verifica se a divisão de num por j possui resto zero. Caso possua, o contador é incrementado. */

                if(num % j == 0) {
                    contador++;
                }
            }

            /* Após verificar todos os divisores, a condicional verifica se o contador possui exatamente dois divisores.
               Caso possua, ele é classificado como primo. */

            if(contador == 2) {
                System.out.println(num + " é primo.");
            }
            else {
                System.out.println(num + " não é primo.");
            }
        }
        input.close();
    }
}
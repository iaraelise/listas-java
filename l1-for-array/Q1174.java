import java.util.Scanner;

public class Q1174 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Declara o tamanho do array

        float numeros[] = new float[10];
        
        System.out.println("Informe 10 números:");

        // 1° laço recebe os números informados pelo usuário e os armazena no array 

        for(int i = 0; i < numeros.length; i++) {

            numeros[i] = input.nextFloat();
        }

        input.close();

        /* 2° laço percorre o array, enquanto o if verifica se o número armazenado atende à condição.
           Se a condição for verdadeira, o índice e o número armazenados serão impressos na tela. */

        for(int j = 0; j < numeros.length; j++) {

            if(numeros[j] <= 10) {

                System.out.printf("A[%d] = %.1f%n", j, numeros[j]);

                // %d = representa números inteiros. Neste caso, representa o índice do array
                // %f = representa números decimais (float/double). Neste caso, representa o valor armazenado na posição do array
            }
        }
    }
}

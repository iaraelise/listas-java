import java.util.Scanner;

public class Q1172 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Declara o tamanho o array

        int numeros[] = new int[10];

        System.out.println("Informe 10 números:");

        /* 1° laço percorre o array, enquanto o if verifica se o número armazenado atende à condição.
           Se a condição for verdadeira, o número informado pelo usuário será substituído por 1. */

        for(int i = 0; i < numeros.length; i++) {

            numeros[i] = input.nextInt();

            if(numeros[i] <= 0) {
                numeros[i] = 1;
            }
        }

        input.close();

        // 2° laço percorre o array e imprime seu conteúdo na tela.

        for(int j = 0; j < numeros.length; j++) {

            System.out.println("Números[" + j + "] = " + numeros[j]);
        }

    }
}
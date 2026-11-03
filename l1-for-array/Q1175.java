import java.util.Scanner;

public class Q1175 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int aux = 0;
        
        System.out.println("Informe 10 números:");
        int numeros[] = new int [10];

        // 1° laço recebe os números informados pelo usuário e os armazena no array

        for(int i = 0; i < numeros.length; i++ ) {
            numeros[i] = input.nextInt();
        }

        input.close();

        /* 2° laço percorre metade do array e troca os valores armazenados nas posições correspondentes
           do início e do final, invertendo sua ordem */

        for(int j = 0; j < numeros.length / 2; j++) {

            aux = numeros[numeros.length - 1 - j];
            numeros[numeros.length - 1 - j] = numeros[j];
            numeros[j] = aux;
        }

        // 3° laço percorre o array e imprime seu conteúdo na tela

        for(int k = 0; k < numeros.length; k++) {

            System.out.println("Números[" + k + "] = " + numeros[k]);
        }
    }
}
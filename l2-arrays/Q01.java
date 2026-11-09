import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declara o tamanho do array

        int[] numeros = new int[10];

        // Declara o contador de númros pares

        int contador = 0;

        System.out.println("Informe 10 números:");

        for(int i = 0; i < numeros.length; i++) {

            numeros[i] = input.nextInt();

            if(numeros[i] % 2 == 0 && numeros[i] != 0) {
                contador++;
            }
        }

        input.close();

        System.out.print("Quantidade de números par: " + contador);
    }
}
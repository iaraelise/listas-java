import java.util.Scanner;

public class Q1173 {
    public static void main(String[] args) {

        // Instancia a classe Scanner
        
        Scanner input = new Scanner(System.in);

        // Recebe dado do usuário

        System.out.print("Informe um número: ");
        int num = input.nextInt();

        // Fecha a classe Scanner

        input.close();

        // Declara um array de 10 posições

        int[] numeros = new int[10];

        // O laço percorre o tamanho do array
        // Dentro do laço, o valor informado pelo usuário é alocado na posição i do array e num é multiplicado por 2, garantindo que o próximo valor seja o dobro do anterior

        for(int i = 0; i < numeros.length; i++) {

            numeros[i] = num;
            num *= 2;

            System.out.println(numeros[i]);
        }
    }
}
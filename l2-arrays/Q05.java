import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de números da sua lista: ");

        int qtdNumeros = input.nextInt();

        // Declara o tamanho do array com base na entrada do usuário

        int[] listaNumeros = new int[qtdNumeros];

        System.out.println("Informe " + qtdNumeros + " números: ");

        // O laço percorre listaNumeros e o preenche com os valores informados pelo usuário

        for(int i = 0; i < listaNumeros.length; i++) {

            listaNumeros[i] = input.nextInt();
        }

        input.close();

        System.out.print("Informe uma String: ");

        String letras = input.next();

        // O while garante que a String informada pelo usuário possua o mesmo tamanho do array

        while(letras.length() != listaNumeros.length) {

            System.out.print("Informe uma String com " + qtdNumeros + " caracteres: ");

            letras = input.next();
        }

        /* O laço percorre listaNumeros e a condicional verifica se a posição j é par

           Se for verdadeiro, o programa imprime o valor em listaNumeros[j]
           Se for falso, o programa imprime o caractere na posição j da String informada pelo usuário
        
        */

        for(int j = 0; j < listaNumeros.length; j++) {

            if(j % 2 == 0) {

                System.out.print(listaNumeros[j] + " ");
            }
            else {
                System.out.print(letras.charAt(j) + " ");
            }
        }
    }
}

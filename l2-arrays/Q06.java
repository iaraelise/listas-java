import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int somadorImpar = 0;

        System.out.println("Informe uma determinada quantidade de números:");

        String numeros = input.nextLine();

        input.close();

        /* Utiliza o método split() para dividir a String numeros em partes, utilizando o espaço
           em branco como delimitador. O método split() retorna um array de String. */

        String[] listaNumeros = numeros.split(" ");

        /* Declara um novo array do tipo int e listasNumeros.length determina que ele terá a mesma
           quantidade de posições do array original. */

        int[] numerosConvertidos = new int[listaNumeros.length];

        /* O laço percorre o array numerosConvertidos e, a cada repetição, o método Integer.parseInt()
           converte o elemento na posição i de String para int. */

        for(int i = 0; i < numerosConvertidos.length; i++) {

            numerosConvertidos[i] = Integer.parseInt(listaNumeros[i]);

            if(numerosConvertidos[i] % 2 != 0) {

                somadorImpar += numerosConvertidos[i];
            }
        }

        System.out.println();

    }
}
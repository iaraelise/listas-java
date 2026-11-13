import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int somador = 0;

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

        boolean primeiroNumero = true;

        for(int i = 0; i < numerosConvertidos.length; i++) {

            numerosConvertidos[i] = Integer.parseInt(listaNumeros[i]);

            /* A primeira condicional verifica se o índice i é ímpar. Caso a condição seja verdadeira,
               o valor armazenado em numerosConvertidos[i] é adicionado à variável somador. */

            if(i % 2 != 0) {
                somador += numerosConvertidos[i];

                /* A segunda condicional verifica se o número atual é o primeiro a ser impresso. Caso não seja,
                   o sinal de + é impresso antes do número. */

                if(primeiroNumero == true) {
                    System.out.print(numerosConvertidos[i]);

                    primeiroNumero = false;
                }
                else {
                    System.out.print(" + " + numerosConvertidos[i]);
                }
            }
        }
        System.out.print(" = " + somador);
    }
}
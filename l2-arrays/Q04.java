import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores do intervalo: ");

        int qtdValoresIntervalo = input.nextInt();

        // Declara o tamanho do array com base na entrada do usuário

        int[] valoresIntervalo = new int[qtdValoresIntervalo];

        /* Declara as variáveis que armazenam o menor e o maior valor, além da variável somadorValores,
           responsável por acumular a soma de todos os valores informados */

        int menorValor = 1;
        int maiorValor = 0;
        int somadorValores = 0;
        
        // O for preenche valoresIntervalo com os valores informados pelo usuário

        for (int i =  0; i < valoresIntervalo.length; i++) {

            valoresIntervalo[i] = input.nextInt();

            somadorValores += valoresIntervalo[i];

           // A condicional verifica qual é o menor e o maior valor e os atribui às suas respectivas variáveis 

            if (valoresIntervalo[i] <= menorValor) {

                menorValor = valoresIntervalo[i];
            }
            else if (valoresIntervalo[i] >= maiorValor) {

                maiorValor = valoresIntervalo[i];
            }
        }

        input.close();

        // A variável mediaAritmetica calcula a média aritmética dos valores informados

        int mediaAritmetica = somadorValores / qtdValoresIntervalo;

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Média aritmética: " + mediaAritmetica);
    }
}
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contador = 0;
        System.out.print("Informe uma frase: ");

        String frase = input.nextLine();

        input.close();

        /* Utiliza o método split() para dividir a String frase em partes, utilizando o espaço
           em branco como delimitador. */

        String[] palavra = frase.split(" ");

        // 1° laço percorre o array e remove os pontos e as vírgulas de cada palavra.

        for (int i = 0; i < palavra.length; i++) {

            palavra[i] = palavra[i].replace(".", "");
            palavra[i] = palavra[i].replace(",", "");
        }

        // 2° laço seleciona cada palavra do array para verificar suas ocorrências.

        for (int j = 0; j < palavra.length; j++) {

            boolean palavraContabilizada = false;

            // Reinicia o contador para contabilizar uma nova palavra.

            contador = 0;

            /* O 3° laço percorre o array e a primeira condicional verifica se a palavra selecionada
               já apareceu em uma posição anterior. Caso contrário, a segunda condicional verifica se
               as palavras são iguais e incrementa a variável contador. */

            for (int k = 0; k < palavra.length; k++) {

                if (k < j && palavra[j].equals(palavra[k])) {
                    palavraContabilizada = true;
                }

                if (palavra[j].equals(palavra[k])) {
                    contador++;
                }
            }

            // Imprime somente as palavras que ainda não foram contabilizadas.

            if (!palavraContabilizada) {
                System.out.print(palavra[j] + " = " + contador);

                // Evita imprimir o ponto e vírgula após a última palavra.

                if (j < palavra.length - 1) {
                    System.out.print("; ");
                }
            }
        }
    }
}

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho das listas: ");

        int tamanhoListas = input.nextInt();

        // Declara o tamanho do array com base na entrada do usuário

        int[] lista1 = new int[tamanhoListas];
        int[] lista2 = new int[tamanhoListas];

        // Cria uma terceira lista e multiplica tamanhoListas por 2, porque o tamanho de lista3 precisa ser o dobro de tamanhoLista

        int[] lista3 = new int[tamanhoListas * 2];

        // FOR 1 - Preenche lista1 com os valores informados pelo usuário

        System.out.println("Informe os valores da lista 1:");

        for (int i = 0; i < lista1.length; i++) {

            lista1[i] = input.nextInt();
        }

        // FOR 2 - Preenche lista2 com os valores informados pelo usuário

        System.out.println("Informe os valores da lista 2:");

        for (int j = 0; j < lista2.length; j++) {

            lista2[j] = input.nextInt();
        }

        input.close();

        /* FOR 3 - Percorre lista3 e verifica, através de uma condicional se a posição k é par

           Se for verdadeiro, lista3[k] recebe o valor armazenado no índice k / 2 da lista1
           Se for falso, lista[k] recebe o valor armazenado no índice k / 2 da lista2
        
        */

        for (int k = 0; k < lista3.length; k++) {

            if (k % 2 == 0) {

                lista3[k] = lista1[k / 2];
            }
            else {

                lista3[k] = lista2[k / 2];
            }
        }

        // FOR 4 - Imprime na tela do usuário os valores armazenados na lista3

        for(int l = 0; l < lista3.length; l++) {
            System.out.println(lista3[l]);
        }
    }
}

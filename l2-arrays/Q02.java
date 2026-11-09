import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");

        int numero = input.nextInt();

        // Declara o tamanho do array com base na entrada do usuário

        int[] lista1 = new int[numero];
        int[] lista2 = new int[numero];

        // Declara somadores pares

        int somadorParL1 = 0;
        int somadorParL2 = 0;

        // Declara somadores ímpares

        int somadorImparL1 = 0;
        int somadorImparL2 = 0;

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

        /*
          FOR 3 - Percorre lista1 e verifica, através de uma condicional, se o número na posição k é par.

          Se for verdadeiro, somadorParL1 soma à variável o valor armazenado em lista1[k].
          
          Se for falso, somadorImparL1 soma à variável o valor armazenado em lista1[k].
          
         */

        for (int k = 0; k < lista1.length; k++) {

            if (lista1[k] % 2 == 0) {
                somadorParL1 += lista1[k];
            }
            else if (lista1[k] % 2 != 0) {
                somadorImparL1 += lista1[k];
            }
        }

        /*
          FOR 4 - Percorre lista2 e verifica, através de uma condicional, se o número na posição l é par.

          Se for verdadeiro, somadorParL2 soma à variável o valor armazenado em lista2[l].
          
          Se for falso, somadorImparL2 soma à variável o valor armazenado em lista2[l].
          
         */

        for (int l = 0; l < lista2.length; l++) {

            if (lista2[l] % 2 == 0) {
                somadorParL2 += lista2[l];
            }
            else if (lista2[l] % 2 != 0) {
                somadorImparL2 += lista2[l];
            }
        }

        System.out.println("Lista 1 - Soma de números pares: " + somadorParL1);
        System.out.println("Lista 2 - Soma de números pares: " + somadorParL2);

        // A condicional verifica qual lista par entre lista1 e lista2 possui o maior somatório.

        if(somadorParL1 > somadorParL2) {

            System.out.println("L1 par > L2 par");
        }
        else {
            System.out.println("L2 par > L1 par");
        }

        System.out.println();

        System.out.println("Lista 1 Soma de números ímpares: " + somadorImparL1);
        System.out.println("Lista 2 Soma de números ímpares: " + somadorImparL2);

        // A condicional verifica qual lista impar entre lista1 e lista2 possui o maior somatório.

        if(somadorImparL1 > somadorImparL2) {

            System.out.println("L1 impar > L2 impar");
        }
        else {
            System.out.println("L2 impar > L1 impar");
        }
    }
}
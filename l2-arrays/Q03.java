import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho das listas: ");

        int tamanhoListas = input.nextInt();

        // Declara o tamanho do array com base na entrada do usuário

        int[] lista1 = new int[tamanhoListas];
        int[] lista2 = new int[tamanhoListas];

        // FOR 1 - Preenche lista1 com os valores informados pelo usuário

        System.out.println("Informe os valores da lista 1:");

        for(int i = 0; i < lista1.length; i++) {
            
           lista1[i] = input.nextInt();
        }

        // FOR 2 - Preenche lista2 com os valores informados pelo usuário

        System.out.println("Informe os valores da lista 2:");

        for(int j = 0; j < lista2.length; j++) {

            lista2[j] = input.nextInt();
        }

        input.close();
    }
}
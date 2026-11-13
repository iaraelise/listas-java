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

        for(int i = 0; i < palavra.length; i++) {

            palavra[i] = palavra[i].replace(".", "");
            palavra[i] = palavra[i].replace(",", "");
        }

        for(int j = 0; j < palavra.length; j++) {

            boolean palavraContabilizada = false;

            contador = 0;

            for(int k = 0; k < palavra.length; k++) {

                if(k < j && palavra[j].equals(palavra[k])) {
                    palavraContabilizada = true;
                }

                if(palavra[j].equals(palavra[k])) {
                    contador++;
                }
            }
        }

    }
}

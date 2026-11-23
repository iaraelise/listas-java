import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        /* O laço externo controla a quantidade de alunos que terão suas notas verificadas pelo programa. */

        for(int i = 1; i <= 5; i++) {

            double somador = 0;
            
            System.out.println("Informe as notas do " + i + "° aluno:");

            /* O laço interno controla a quantidade de notas informadas pelo usuário e acumula seus valores na variável somadorNota. */

            for(int j = 1; j <= 3; j++) {

                double nota = input.nextDouble();

                somador += nota;
            }

            /* A variável media armazena o resultado do cálculo da média das notas informadas pelo usuário.
               O método printf() exibe esse resultado formatado com uma casa decimal. */

            double media = somador / 3.0;

            System.out.printf("A média do aluno é: %.1f%n", media);
            System.out.println();
        }
        input.close();
    }
}
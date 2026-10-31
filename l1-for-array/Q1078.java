import java.util.Scanner;

public class Q1078 {

    public static void main(String[] args) {

        // Instancia a classe Scanner

        Scanner input = new Scanner(System.in);


        // Recebe dado do usuário

        System.out.print("Informe um número: ");
        int num = input.nextInt();


        // Fecha a classe Scanner

        input.close();

        // Percorre os números de 1 a 10 e multiplica cada um pelo número informado pelo usuário, formando a tabuada 

        for(int i = 1; i <= 10; i++) {

            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
    
}
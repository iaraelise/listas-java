public class Q08 {
    public static void main(String[] args) {

        // O 1° laço percorre as camisetas, de 1 a 3. A cada iteração, uma nova camiseta é selecionada.

        for(int i = 1; i <= 3; i++) {

            // O 2° laço percorre as calças, de 1 a 4, e combina cada uma delas com a camiseta selecionada.

            for(int j = 1; j <= 4; j++) {

                // O 3° laço percorre os sapatos, de 1 a 2, e combina cada sapato com a camiseta e a calça selecionadas.

                for(int k = 1; k <= 2; k++) {

                    // A impressão exibe a combinação formada pelas três peças.

                    System.out.println("Camiseta " + i + " - Calça " + j + " - Sapato " + k);
                }
            }
        }
    }
}

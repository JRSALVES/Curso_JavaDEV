package Aula_1;

public class ArvoreNatal {

    public static void main(String[] args) {
        
        int altura = 6; // Altura da copa da árvore

        // Enfeite no topo
        System.out.println("   *");

        // Copa da árvore
        for (int i = 1; i <= altura; i++) { 
            // Espaços em branco antes dos asteriscos
            for (int j = altura - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Asteriscos na linha
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Muda para a próxima linha
            System.out.println();
        }

        // Tronco da árvore
        for (int i = 0; i < 2; i++) { // Altura do tronco
            for (int j = 1; j < altura; j++) { // Espaços antes do tronco
                System.out.print(" ");
            }
            System.out.println("*"); // Tronco
        }
    }
}

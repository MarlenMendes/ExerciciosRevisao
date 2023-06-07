import java.util.Scanner;

public class ExercicioCincodeNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 20;
        int contador = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador++;

            }
        }
        System.out.println("Quantidade de números entre 0 e 100: " + contador);


    }
}

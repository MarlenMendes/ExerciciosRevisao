import java.util.Scanner;

public class ExercicioDoisdeNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        int resultado;

        if (valor % 2 == 0) {
            resultado = valor + 5;
        } else {
            resultado = valor + 8;


        }
        System.out.println("O resultado da operação é: " + resultado);

    }
}

import java.util.Scanner;

public class ExercicioSetedeNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de vezes que deseja repetir seu nome: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(nome);


        }

    }
}

import java.util.Scanner;

public class ExercicioTresdeNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        int numeroIdentificacao = scanner.nextInt();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        System.out.println("Número de identificação: " + numeroIdentificacao);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);

        String conceito;
        String situacao;

        if (mediaAproveitamento >= 90) {
            conceito = "A";
            situacao = "Aprovado";
        } else if (mediaAproveitamento >= 75) {
            conceito = "B";
            situacao = "Aprovado";
        } else if (mediaAproveitamento >= 60) {
            conceito = "C";
            situacao = "Aprovado";
        } else if (mediaAproveitamento >= 40) {
            conceito = "D";
            situacao = "Reprovado";
        } else {
            conceito = "E";
            situacao = "Reprovado";

        }

        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

    }
}

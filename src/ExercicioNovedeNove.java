public class ExercicioNovedeNove {
    public static void main(String[] args) {
        int tamanhoVetor = 50;
        int[] vetor = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = 101 + i;

        }
        System.out.println("Valores do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);

        }
    }
}

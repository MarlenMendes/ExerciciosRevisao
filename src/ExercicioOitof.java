import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioOitof {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList();
        ArrayList<Double> reajustados = new ArrayList();
        int i = 0;
        double salario = 0;
        System.out.println("Para encerrar o ciclo digite -1");

            i++;
            System.out.println("Digite o " + i + "º salario");

            salario = entrada.nextDouble();


            salarios.add(salario);
            while (salario > -1);
        salarios.remove(salarios.size() - 1);
        System.out.println("Qual foi o valor do reajuste?");
        double valor = entrada.nextDouble();
        for (double sal : salarios) {
            double reajuste = sal + valor;
            reajustados.add(reajuste);

        }
        System.out.println(salarios);
        System.out.println(reajustados);






        }
    }

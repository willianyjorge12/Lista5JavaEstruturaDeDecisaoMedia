package exerciciosLista05;
import java.util.Scanner;
public class Ex05 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita as três notas
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	        // Calcula a média
	        double media = (nota1 + nota2 + nota3) / 3;

	        System.out.printf("Média: %.2f\n", media);

	        // Classificação
	        if (media >= 7.0) {
	            System.out.println("Classificação: Aprovado");
	        } else if (media >= 5.0) {
	            System.out.println("Classificação: Recuperação");
	        } else {
	            System.out.println("Classificação: Reprovado");
	        }

	        scanner.close();
	    }
}

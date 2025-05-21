package exerciciosLista05;
import java.util.Scanner;
public class Ex06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        // Verifica par ou ímpar
	        if (numero % 2 == 0) {
	            System.out.println(numero + " é par.");
	        } else {
	            System.out.println(numero + " é ímpar.");
	        }

	        // Verifica positivo, negativo ou zero
	        if (numero > 0) {
	            System.out.println(numero + " é positivo.");
	        } else if (numero < 0) {
	            System.out.println(numero + " é negativo.");
	        } else {
	            System.out.println("O número é zero.");
	        }

	        scanner.close();
	    }
}

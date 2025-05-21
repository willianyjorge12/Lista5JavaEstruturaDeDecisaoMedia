package exerciciosLista05;
import java.util.Scanner;
public class Ex10 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        if (numero % 3 == 0 && numero % 5 == 0) {
	            System.out.println(numero + " é divisível por 3 e por 5.");
	        } else {
	            System.out.println(numero + " não é divisível por 3 e por 5.");
	        }

	        scanner.close();
	    }
}

package exerciciosLista05;
import java.util.Scanner;
public class Ex01 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicita o número inteiro
	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        boolean isPrimo = true;

	        if (numero <= 1) {
	            isPrimo = false;
	        } else {
	            // Verifica se o número tem algum divisor além de 1 e ele mesmo
	            for (int i = 2; i <= Math.sqrt(numero); i++) {
	                if (numero % i == 0) {
	                    isPrimo = false;
	                    break;
	                }
	            }
	        }

	        // Exibe o resultado
	        if (isPrimo) {
	            System.out.println(numero + " é um número primo.");
	        } else {
	            System.out.println(numero + " não é um número primo.");
	        }

	        scanner.close();
	    }
}

package exerciciosLista05;
import java.util.Scanner;
public class Ex04 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um ano: ");
	        int ano = scanner.nextInt();

	        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

	        if (bissexto) {
	            System.out.println("O ano " + ano + " é bissexto.");
	        } else {
	            System.out.println("O ano " + ano + " não é bissexto.");
	        }

	        scanner.close();
	    }
}

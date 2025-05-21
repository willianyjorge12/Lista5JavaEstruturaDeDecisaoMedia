package exerciciosLista05;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else if (idade <= 12) {
            System.out.println("Categoria: Criança");
        } else if (idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idade <= 59) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Idoso");
        }

        scanner.close();
    }
}

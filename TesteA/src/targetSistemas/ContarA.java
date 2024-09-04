package targetSistemas;

import java.util.Scanner;

public class ContarA {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite uma string: ");
		String texto = scanner.nextLine();
		int quantidade = contarA(texto);

		if (quantidade > 0) {
			System.out.println("A letra 'a' aparece " + quantidade + " vezes na string.");
		} else {
			System.out.println("A letra 'a' não aparece na string.");
		}
		scanner.close();
	}

	public static int contarA(String string) {
		return (int) string.toLowerCase().chars().filter(ch -> ch == 'a').count();
	}
}

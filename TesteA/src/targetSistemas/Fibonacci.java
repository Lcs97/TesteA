package targetSistemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Informe um número: ");
	        int numero = scanner.nextInt();
	        List<Integer> fibSequence = fibonacci(numero);

	        if (fibSequence.contains(numero)) {
	            System.out.println("O número " + numero + " pertence à sequência de Fibonacci: " + fibSequence);
	        } else {
	            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci: " + fibSequence);
	        }
	        scanner.close();
	    }

	    public static List<Integer> fibonacci(int n) {
	        List<Integer> sequence = new ArrayList<>();
	        int a = 0, b = 1;
	        sequence.add(a);
	        sequence.add(b);

	        while (b < n) {
	            int next = a + b;
	            sequence.add(next);
	            a = b;
	            b = next;
	        }
	        return sequence;
	    }
	}
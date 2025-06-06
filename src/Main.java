import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício1

		Scanner sc = new Scanner(System.in);

		int x, y, soma;

		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = y + x;
		
		System.out.println("SOMA = " + soma);

		sc.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Exercício1, faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, 
		// conforme exemplos.

		Scanner sc = new Scanner(System.in);

		int x, y, soma;

		x = sc.nextInt();
		y = sc.nextInt();

		soma = y + x;

		System.out.println("SOMA = " + soma);

		sc.close();
	}

}

package atividade01;

public class TorreDeHanoi {

	public static void listarMovimentos(int n) {
		char origem = 'a';
		char destino = 'b';
		char aux = 'c';

		movimentar(n, origem, destino, aux);
	}

	private static void movimentar(int n, char origem, char destino, char aux) {
		if (n == 1) {
			System.out.printf("\nMover %d de %c para %c", n, origem, destino);
			return;
		}

		movimentar(n - 1, origem, aux, destino);
		System.out.printf("\nMover %d de %c para %c", n, origem, destino);
		movimentar(n - 1, aux, destino, origem);
	}

	public static void main(String[] args) {
		TorreDeHanoi.listarMovimentos(3);
	}
}

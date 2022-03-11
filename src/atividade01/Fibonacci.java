package atividade01;

public class Fibonacci {

	public static void calcular(int n) {
		if (n < 2) {
			System.out.println(n);
			return;
		}

		fibonacci(n, 0, 1);
	}

	private static void fibonacci(int n, int anteAnterior, int anterior) {
		if (n < 3) {
			System.out.println(anteAnterior + anterior);
			return;
		}

		fibonacci(n - 1, anterior, (anteAnterior + anterior));
	}

	public static void main(String[] args) {
		Fibonacci.calcular(7);
	}
}

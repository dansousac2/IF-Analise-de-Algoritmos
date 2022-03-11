package atividade01;
//questão 01
public class Fatorial {

	public static void calcular(int n) {
		if(n < 2) {
			System.out.println(1);
			return;
		}
		fatorial(n - 1, n);
	}

	private static void fatorial(int i, int resultado) {
		
		if (i < 2) {
			System.out.println(resultado);
			return;
		}

		fatorial(i - 1, i * resultado);
	}

	public static void main(String[] args) {
		Fatorial.calcular(3);
	}
}

package atividade01;

public class QuantidadeDeDigitos {

	public static void buscar(int n) {
		quantidadeDeDigitos("" + n, 0);
	}

	private static void quantidadeDeDigitos(String entrada, int resultado) {
		if (entrada.isBlank() || entrada.isEmpty()) {
			System.out.println(resultado);
			return;
		}

		quantidadeDeDigitos(entrada.substring(1), resultado + 1);
	}

	public static void main(String[] args) {
		QuantidadeDeDigitos.buscar(111);
	}
}

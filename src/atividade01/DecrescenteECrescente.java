package atividade01;

public class DecrescenteECrescente {

	public static void listar(int n) {
		decrescenteECrescente(n, "");
	}

	private static void decrescenteECrescente(int n, String resultado) {
		if (n == 0) {
			resultado += "0";
			StringBuilder builderResultado = new StringBuilder(resultado);
			String reverso = " " + builderResultado.reverse();
			System.out.println(resultado + reverso);
			return;
		}

		decrescenteECrescente(n - 1, resultado + n + " ");
	}

	public static void main(String[] args) {
		DecrescenteECrescente.listar(5);
	}
}

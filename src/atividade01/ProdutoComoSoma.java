package atividade01;

public class ProdutoComoSoma {

	public static void calcular(int n1, int n2) {
		int maior = n1;
		int menor = n2;

		if (n1 < n2) {
			maior = n2;
			menor = n1;
		}

		produtoComoSoma(maior, menor, "0");
	}

	private static void produtoComoSoma(int maior, int menor, String resultado) {
		if (menor == 0) {
			System.out.println(resultado);
			return;
		}

		int soma = Integer.parseInt(resultado) + maior;
		produtoComoSoma(maior, menor - 1, "" + soma);
	}

	public static void main(String[] args) {
		ProdutoComoSoma.calcular(5, 80);
	}
}

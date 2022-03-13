package atividade01;

public class MenorNumeroDoVetor {

	public static void buscar(int[] numeros, int qtd) {
		menorNumeroDoVetor(numeros, qtd, numeros[0]);
	}

	private static void menorNumeroDoVetor(int[] numeros, int qtd, int resultado) {
		if (qtd == 1) {
			System.out.println(resultado);
			return;
		}

		if (numeros[qtd - 1] < resultado) {
			resultado = numeros[qtd - 1];
		}

		menorNumeroDoVetor(numeros, qtd - 1, resultado);
	}

	public static void main(String[] args) {
		MenorNumeroDoVetor.buscar(new int[] {10,3,6,9,6,4}, 6);
	}
}

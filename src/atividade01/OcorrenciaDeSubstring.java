package atividade01;

public class OcorrenciaDeSubstring {

	public static void contar(String palavra, String substring) {
		ocorrenciaDeSubstring(palavra, substring, 0);
	}

	private static void ocorrenciaDeSubstring(String palavra, String substring, int resultado) {
		if (palavra.length() < substring.length()) {
			System.out.println(resultado);
			return;
		}

		if (palavra.substring(0, substring.length()).equals(substring)) {
			resultado++;
		}

		ocorrenciaDeSubstring(palavra.substring(1), substring, resultado);
	}

	public static void main(String[] args) {
		OcorrenciaDeSubstring.contar("partilhar", "ar");
	}
}

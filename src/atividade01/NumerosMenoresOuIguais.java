package atividade01;

public class NumerosMenoresOuIguais {
	
	public static void listar(int n) {
		numerosMenoresOuIguais(n, 1, "0");
	}

	private static void numerosMenoresOuIguais(int n, int cont, String resultado) {
		if(n == 0) {
			System.out.println(resultado);
			return;
		}
		
		String concat = resultado + "\n" + cont;
		numerosMenoresOuIguais(n-1, cont + 1, concat);
	}

	public static void main(String[] args) {
		NumerosMenoresOuIguais.listar(5);
	}
}

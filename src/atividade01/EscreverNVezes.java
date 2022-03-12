package atividade01;

public class EscreverNVezes {

	public static void executar(String msg, int n) {
		if (n < 1) {
			return;
		}

		System.out.println(msg);

		executar(msg, n - 1);
	}

	public static void main(String[] args) {
		EscreverNVezes.executar("olá mundo!!", 3);
	}
}

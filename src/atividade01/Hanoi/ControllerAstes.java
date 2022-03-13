package atividade01.Hanoi;

public class ControllerAstes {
	
	public void mudarPecaDeAste(TorreDeHanoiAste inicio, TorreDeHanoiAste fim) {
		fim.addPeca(inicio.removerPeca());
	}

}

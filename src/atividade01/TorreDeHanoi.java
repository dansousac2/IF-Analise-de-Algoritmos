package atividade01;

import atividade01.Hanoi.ControllerAstes;
import atividade01.Hanoi.TorreDeHanoiAste;

public class TorreDeHanoi {

	private TorreDeHanoiAste[] astes;
	private ControllerAstes controller = new ControllerAstes();
	private String[] nomeAstes = { "Base", "Aux01", "Aux02" };

	public void logDeMovimentos(int d) {
		int movimentos = (int) (Math.pow(2, d) - 1);
		colocarPecas(d);
		criarLog(d, 0, movimentos);
	}

	// tail recursion no método seguinte
	// se como entrada temos 4 peças, então são estas: 1-2-3-4. Onde números maiores
	// representam áreas maiores.
	private void criarLog(int d, int asteBase, int movimentos) {

		if (movimentos == 0) {
			return;
		}

		int pecaDeCimaDaBase = astes[asteBase].pecaDeCima();
		String movimento = "Mover peça %s da aste %s para a aste %s";

		int index;

		if (pecaDeCimaDaBase == d) {
			index = 0;
			TorreDeHanoiAste asteDestino = null;
			boolean encontrou = false;

			for (TorreDeHanoiAste aste : astes) {
				if (aste.pecaDeCima() == pecaDeCimaDaBase + 1) {
					asteDestino = aste;
					encontrou = true;
					break;
				}

				index++;
			}

			if (!encontrou) {
				index = 0;
				
				for (TorreDeHanoiAste aste : astes) {
					if (aste.isVazia()) {
						asteDestino = aste;
						encontrou = true;
						break;
					}
					
					index++;
				}
			}

			if(!encontrou) {
				for (TorreDeHanoiAste aste : astes) {
					
				}
			}
			
			if (encontrou) {
				controller.mudarPecaDeAste(astes[asteBase], asteDestino);
				System.out.printf(movimento, d, nomeAstes[asteBase], nomeAstes[index]);
				movimentos--;
			} else {

			}

		}

	}

	private void colocarPecas(int d) {
		TorreDeHanoiAste base = new TorreDeHanoiAste();
		while (d > 0) {
			base.addPeca(d);
			d--;
		}
		astes[0] = base;
		astes[1] = new TorreDeHanoiAste();
		astes[2] = new TorreDeHanoiAste();
	}

}

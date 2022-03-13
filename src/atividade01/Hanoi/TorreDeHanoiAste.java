package atividade01.Hanoi;

import java.util.ArrayList;
import java.util.List;

public class TorreDeHanoiAste {

	//essa lista utiliza o conceito de pilha, sendo a primeira posição [0] dedicada a maior peça
	private List<Integer> pecas = new ArrayList<>();
	
	public void addPeca(int n) {
		pecas.add(n);
	}
	
	public int removerPeca() {
		return pecas.remove(pecas.size() - 1);
	}
	
	public boolean isVazia() {
		if(pecas.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	public int pecaDeCima() {
		return pecas.get(pecas.size() - 1);
	}
}

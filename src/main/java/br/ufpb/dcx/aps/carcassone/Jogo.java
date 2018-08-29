package br.ufpb.dcx.aps.carcassone;

public class Jogo {

	public Partida criarPartida(BolsaDeTiles tiles, Cor... sequencia) {
		if (tiles == null)
			throw new ExcecaoJogo("A bolsa de tiles deve ser fornecida na criação de uma partida");
		if (sequencia.length < 2)
			throw new ExcecaoJogo("Cada partida deve ter uma sequência de pelo menos dois jogadores");
		if (verficaTilesIguais(sequencia))
			throw new ExcecaoJogo("Não pode haver repetição de cores na sequência de jogadores");

		return new Partida(tiles);
	}

	public boolean verficaTilesIguais(Cor... sequencia) {
		int i = 0;
		int j = 0;
		boolean find = false;
		while (i < sequencia.length && find == false) {
			j++;
			while (j < sequencia.length && find == false) {
				find = sequencia[i].equals(sequencia[j]);
				j++;
			}
			i++;
		}
		return find;
	}
}

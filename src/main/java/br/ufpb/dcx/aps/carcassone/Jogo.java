package br.ufpb.dcx.aps.carcassone;

public class Jogo {
	
	/*Função que é responsável por criar a partida, fazendo a 
	 * verificação se o tile é nulo retornando uma exceção, 
	 * verificando o numero de jogadores retornando uma exceção, 
	 * utilizando da função “verficaTilesIguais” para pode verificar 
	 * se não existe jogadores com as cores repetidas, retornando 
	 * os tiles utilizados na partida mais as cores.*/
	
	public Partida criarPartida(BolsaDeTiles tiles, Cor... sequencia) {
		if (tiles == null)
			throw new ExcecaoJogo("A bolsa de tiles deve ser fornecida na criação de uma partida");
		if (sequencia.length < 2)
			throw new ExcecaoJogo("Cada partida deve ter uma sequência de pelo menos dois jogadores");
		if (verficaTilesIguais(sequencia))
			throw new ExcecaoJogo("Não pode haver repetição de cores na sequência de jogadores");

		return new Partida(tiles,sequencia);
	}
	
	/* 	Função de verificação se Tiles (peças) soa iguais, 
	 *  retornando um boolean como verdadeiro ou falso, 
	 *  através de um while utilizando de duas variáveis 
	 *  contadoras “i”, “j” para determinar o fim do 
	 *  while e o índice de cada tile.*/

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

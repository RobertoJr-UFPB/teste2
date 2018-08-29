package br.ufpb.dcx.aps.carcassone;

public enum Estado {

	PARTIDA_ANDAMENTO("Em_Andamento"), TURNO_INICIO("Início_Turno"), PARTIDA_FINALIZADA(
			"Partida_Finalizada"), TILE_POSICIONADO("Tile_Posicionado"), MEEPLE_POSICIONADO("Meeple_Posicionado");

	final private String nomeEstado;

	Estado(String estado) {
		this.nomeEstado = estado;
	}

	public String getEstado() {
		return this.nomeEstado;
	}

	@Override
	public String toString() {
		return this.nomeEstado;
	}

}

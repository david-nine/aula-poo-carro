package main.model;

/**
 * @author David Hildebrandt
 */
public class Carro {

	private Integer capacidade;
	private Integer combustivel;
	private boolean ligado;
	private Integer velocidade;
	private Integer lugares;

	public Carro() {
		this.capacidade = 10;
	}
	
	public Carro(int capacidade) {
		this.capacidade = capacidade;
		this.ligado = false;
		this.combustivel = 0;
		this.velocidade = 0;
	}

	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}


	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getCombustivel() {
		return this.combustivel;
	}
	
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	public boolean isLigado() {
		return this.ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getCapacidade(){
		return this.capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Carro [capacidade=" + capacidade + ", combustivel=" + combustivel + ", ligado=" + ligado
				+ ", velocidade=" + velocidade + ", lugares=" + lugares + "]";
	}

	
}
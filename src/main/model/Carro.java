package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author David Hildebrandt
 */
@Entity
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Integer capacidade;
	private Integer combustivel;
	private Boolean ligado;
	private Integer velocidade;
	private Integer lugares;
	
	@ManyToOne
	private Motorista motorista;
	
	public Carro() {
	}
	
	public Carro(int capacidade) {
		this.capacidade = capacidade;
		this.ligado = false;
		this.combustivel = 0;
		this.velocidade = 0;
	}
	
	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
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
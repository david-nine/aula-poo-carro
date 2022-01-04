package main.controler;

import main.model.Carro;

public class CarroController {

	public void ligar(Carro carro) {
		if (!carro.isLigado() && carro.getCombustivel() > 0) {
			int combustivel = carro.getCombustivel();
			carro.setCombustivel(combustivel - 1);
			carro.setLigado(true);
		}
	}
	
	public void desligar(Carro carro) {
		if (carro.isLigado() && carro.getVelocidade() == 0) {
			carro.setLigado(false);
		}
	}

	public void acelerar(Carro carro) {
		if (carro.isLigado()) {
			if (carro.getCombustivel() > 0) {
				int combustivel = carro.getCombustivel() - 1;
				int velocidade = carro.getVelocidade() + 1;
				carro.setCombustivel(combustivel);
				carro.setVelocidade(velocidade);
			} else {
				this.desligar(carro);
			}
		}
	}
	
	/**
	 * Abastece o carro caso ele esteja parado e desligado com a quantidade passada 
	 * por parâmetro até chegar na capacidade do carro.
	 * 
	 * @param quantidade quantidade de combustivel a ser adicionado no carro.
	 * @param carro {@link Carro} para abastecer.
	 */
	public void abastecer(int quantidade, Carro carro) {
		if (carro.getVelocidade() == 0 && !carro.isLigado()) {
			int combustivel = carro.getCombustivel() + quantidade;
			int capacidade = carro.getCapacidade();
			if (combustivel > capacidade) {
				carro.setCombustivel(capacidade);
			} else {
				carro.setCombustivel(combustivel);
			}
		}
	}

	public void abastecer(Carro carro) {
		this.abastecer(carro.getCapacidade(), carro);
	}
}
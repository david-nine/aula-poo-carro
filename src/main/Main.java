package main;

import main.controler.CarroController;
import main.model.Carro;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro(10);
		CarroController carroService = new CarroController();
		carroService.abastecer(carro);
		System.out.println(carro);
	}
}
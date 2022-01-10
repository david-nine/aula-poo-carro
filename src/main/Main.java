package main;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import main.controler.CarroController;
import main.model.Carro;
import main.model.DatabaseConnection;
import main.model.Motorista;

public class Main {

	public static void main(String[] args) {
		Motorista motorista = new Motorista();
		motorista.setNome("David");
		motorista.setDataNascimento(LocalDate.of(2003, 1, 9));

		Carro carro = new Carro(10);
		carro.setCombustivel(20);
		carro.setMotorista(motorista);

		CarroController carroService = new CarroController();
		carroService.abastecer(carro);
		// System.out.println(carro);

		EntityManager em = DatabaseConnection.getEntityManager();
		em.persist(motorista);
		em.getTransaction().commit();
		em.close();

	}
}
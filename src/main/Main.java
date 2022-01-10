package main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import main.controler.CarroController;
import main.model.Carro;
import main.model.DatabaseConnection;
import main.model.Motorista;
import main.model.Seguro;
import main.model.TipoResidencia;

public class Main {

	public static void main(String[] args) {
		Motorista motorista = new Motorista();
		motorista.setNome("David");
		motorista.setDataNascimento(LocalDate.of(2003, 1, 9));
		motorista.setTipoResidencia(TipoResidencia.KIT_NET);
		
		Carro carro = new Carro(10);
		carro.setCombustivel(10);
		carro.setMotorista(motorista);
		
		Seguro seguro = new Seguro();
		seguro.setMotorista(motorista);
		seguro.setDataInicio(LocalDate.of(2002, 12, 16));
		seguro.setCarro(carro);

		CarroController carroService = new CarroController();
		carroService.abastecer(carro);
		// System.out.println(carro);

		EntityManager em = DatabaseConnection.getEntityManager();
		/**
		em.persist(motorista);
		em.persist(carro);	
		em.persist(seguro);
		em.getTransaction().commit();
		*/
		
		Motorista newMotorista = em.find(Motorista.class, 15L);
		List<Motorista> motoristaFiltro = em.createQuery("Select m from " + Motorista.class.getSimpleName() + " m where m.tipoResidencia = 2", Motorista.class).getResultList();
		List<Motorista> motoristaFiltroNovo = em.createQuery("Select m from " + Motorista.class.getSimpleName() + " m where m.tipoResidencia = 2 and m.nome = 'Marcos' ", Motorista.class).getResultList();
		List<Carro> carroNew = em.createQuery("Select c from " + Carro.class.getCanonicalName() + " c inner join " + Motorista.class.getSimpleName() + " m on c.motorista = m.id where m.nome = 'Marcos'", Carro.class).getResultList();
		List<Seguro> seguroinner = em.createQuery("Select s from " + Seguro.class.getSimpleName() + " s inner join " + Motorista.class.getSimpleName() + " m on s.motorista = m.id where m.nome = 'Marcos' ", Seguro.class).getResultList();
		List<Seguro> seguroNew = em.createQuery("Select m from " + Seguro.class.getSimpleName() + " m where m.id = 25 ", Seguro.class).getResultList();
		System.out.println(seguroinner.get(0));
		em.close();
	}
}
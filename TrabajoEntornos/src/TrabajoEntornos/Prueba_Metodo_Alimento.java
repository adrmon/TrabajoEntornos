package TrabajoEntornos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Prueba_Metodo_Alimento {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		Alimento brocoli = new Alimento("Brocoli", 0.37, 0.039, 6.64, 1.7, 2.82, 0.08, 34);
		 ArrayList<Alimento> listaAlimentos=new ArrayList<Alimento>();
		 listaAlimentos.add(brocoli);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Pruebas finalizadas");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcularConsumoDiarioDeSal() {
		 ArrayList<Alimento> listaAlimentos=new ArrayList<Alimento>();
		 
		String resultado=Metodo_Alimento.calcularConsumoDiarioDeSal(listaAlimentos);
		assertEquals("Consumo de sal inferior a 5g diarios",resultado);
		
	}

}

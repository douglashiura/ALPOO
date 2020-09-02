package test.br.ies.aula.alpoo;

import org.junit.Before;
import org.junit.Test;

import polimorfismo.animal.Animal;
import polimorfismo.animal.Peixe;
import polimorfismo.animal.Pombo;

public class TesteHabiliadeDoAnimal {

	private Animal animal;

	@Before
	public void setup() {

	}

	@Test
	public void oPomboVoa() throws Exception {
		animal = new Pombo();
		animal.mostreHabilidade();
	}

	@Test
	public void oPeixeNada() throws Exception {
		animal = new Peixe();
		animal.mostreHabilidade();
	}

}
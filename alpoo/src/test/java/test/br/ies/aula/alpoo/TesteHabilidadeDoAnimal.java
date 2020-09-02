package test.br.ies.aula.alpoo;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.alpoo.Pombo;
import br.ies.aula.alpoo.polimorfismo.animal.Animal;
import br.ies.aula.alpoo.polimorfismo.animal.Peixe;

public class TesteHabilidadeDoAnimal {
	private Animal animal;

	@Before
	public void setUp() {
	}

	@Test
	public void oPomboVoa() throws Exception {
		animal = new Pombo();
		animal.mostreAHabilidade();
	}

	@Test
	public void oPeixeNada() throws Exception {
		animal = new Peixe();
		animal.mostreAHabilidade();
	}

}

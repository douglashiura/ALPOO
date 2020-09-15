package test.br.ies.aula.alpoo.habilidade;

import br.ies.aula.alpoo.animal.Animal;
import br.ies.aula.alpoo.animal.Pombo;
import br.ies.aula.alpoo.animal.Peixe;

import org.junit.Test;

public class TesteHabilidadeAnimal {
	public Animal animal;
	
	@Test
	public void TesteHabPombo() {
		animal = new Pombo();
		animal.MostrarHabilidade();
	};
	
	@Test
	public void TesteHabPeixe() {
		animal = new Peixe();
		animal.MostrarHabilidade();
	}

}

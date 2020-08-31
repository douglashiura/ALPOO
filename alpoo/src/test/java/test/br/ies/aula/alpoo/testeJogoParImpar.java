package test.br.ies.aula.alpoo;
import br.ies.aula.alpoo.jogo.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testeJogoParImpar {

	
	
	
	
	@Test
	public void jogarParImpar() throws Exception {		
		jogoParImpar  jogo =  new jogoParImpar();
		int n1 = 2;
		int n2 = 3;
		jogo.jogar(n1, n2);
		
}
	
	
}

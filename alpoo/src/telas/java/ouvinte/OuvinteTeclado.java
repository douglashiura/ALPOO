package ouvinte;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;

import controller.TabuleiroController;
import entities.Vencedor;
import view.SystemView;
import view.TabuleiroView;
import view.TelaVencedorView;

public class OuvinteTeclado implements KeyListener{
	Map<Integer, Runnable> teclas = new HashMap<Integer, Runnable>();
	private TabuleiroController controller;
	private JLabel cimaEsquerda;
	private JLabel cimaMeio;
	private JLabel cimaDireita;
	private JLabel meioEsquerda;
	private JLabel meio;
	private JLabel meioDireita;
	private JLabel inferiorEsquerda;
	private JLabel inferiorMeio;
	private JLabel inferiorDireita;
	private TabuleiroView tela;

	
	public OuvinteTeclado(TabuleiroController controller, JLabel cimaEsquerda, JLabel cimaMeio,
			JLabel cimaDireita, JLabel meioEsquerda, JLabel meio, JLabel meioDireita,
			JLabel inferiorEsquerda, JLabel inferiorMeio, JLabel inferiorDireita, TabuleiroView tela) {
		
		this.controller = controller;
		this.cimaEsquerda = cimaEsquerda;
		this.cimaMeio = cimaMeio;
		this.cimaDireita = cimaDireita;
		this.meioEsquerda = meioEsquerda;
		this.meio = meio;
		this.meioDireita = meioDireita;
		this.inferiorEsquerda = inferiorEsquerda;
		this.inferiorMeio = inferiorMeio;
		this.inferiorDireita = inferiorDireita;
		this.tela = tela;
		
		
	}
	
	public void keyPressed(KeyEvent key) {
		this.teclas.put(KeyEvent.VK_W, () -> controller.moveBaixo());
		this.teclas.put(KeyEvent.VK_S, () -> controller.moveCima());
		this.teclas.put(KeyEvent.VK_A, () -> controller.moveDireita());
		this.teclas.put(KeyEvent.VK_D, () -> controller.moveEsquerda());
		this.teclas.put(KeyEvent.VK_R, () -> controller.resetGame());
		this.teclas.put(KeyEvent.VK_SPACE, () -> controller.resetGame());
		
		this.teclas.get(key.getKeyCode()).run();
		
		this.tela.atualizaTela(this.cimaEsquerda,this.cimaMeio,this.cimaDireita,this.meioEsquerda,this.meio,this.meioDireita,this.inferiorEsquerda,this.inferiorMeio,this.inferiorDireita);
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
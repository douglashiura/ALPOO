package view;
import java.awt.*;
import javax.swing.*;

import ouvinte.OuvinteTeclado;
import tabuleiro.Tabuleiro;
import tabuleiro.TabuleiroController;

import java.awt.event.*;

public class TabuleiroInterface extends JFrame{
	private JFrame frameJogo;
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
	private KeyListener ouvinte;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabuleiroInterface window = new TabuleiroInterface();
					window.getFrameJogo().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TabuleiroInterface() {
		controller = new TabuleiroController(new Tabuleiro());
		this.inicia();
	}
	
	private void inicia() {
			this.criaFrameJogo();
			this.criaCima();
			this.criaMeio();
			this.criaInferior();
			
			this.ouvinte = new OuvinteTeclado(controller, cimaEsquerda, cimaMeio, cimaDireita, meioEsquerda, meio, meioDireita, inferiorEsquerda, inferiorMeio, inferiorDireita, this);
			
			this.atualizaTela(cimaEsquerda, cimaMeio, cimaDireita, meioEsquerda, cimaMeio, meioEsquerda, inferiorEsquerda, inferiorMeio, inferiorDireita);
			
	}
	
    public JFrame getFrameJogo() {
    	return frameJogo;
    }
    
     public void criaFrameJogo() {
    	this.frameJogo = new JFrame();
    	this.getFrameJogo().getContentPane().setBackground(Color.WHITE);
    	this.getFrameJogo().setTitle("|-| Jogo Do Oito |-|");
    	this.getFrameJogo().setBounds(100, 100, 450, 300);
    	this.getFrameJogo().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.getFrameJogo().getContentPane().setLayout(new GridLayout(0, 3, 0, 0));
     }
     
     public void criaCima() {
    	this.cimaEsquerda = new JLabel(controller.getTabuleiro().getCimaEsquerda().toString());
 		cimaEsquerda.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		cimaEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
 		cimaEsquerda.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(cimaEsquerda);

 		this.cimaMeio = new JLabel(controller.getTabuleiro().getCimaMeio().toString());
 		cimaMeio.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		cimaMeio.setHorizontalAlignment(SwingConstants.CENTER);
 		cimaMeio.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(cimaMeio);

 		this.cimaDireita = new JLabel(controller.getTabuleiro().getCimaDireita().toString());
 		cimaDireita.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		cimaDireita.setHorizontalAlignment(SwingConstants.CENTER);
 		cimaDireita.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(cimaDireita);
     }
     
     public void criaMeio() {
    	this.meioEsquerda = new JLabel(controller.getTabuleiro().getMeioEsquerda().toString());
 		meioEsquerda.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		meioEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
 		meioEsquerda.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(meioEsquerda);

 		this.meio = new JLabel(controller.getTabuleiro().getMeio().toString());
 		meio.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		meio.setHorizontalAlignment(SwingConstants.CENTER);
 		meio.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(meio);

 		this.meioDireita = new JLabel(controller.getTabuleiro().getMeioDireita().toString());
 		meioDireita.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		meioDireita.setHorizontalAlignment(SwingConstants.CENTER);
 		meioDireita.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(meioDireita);
     }
     
     public void criaInferior() {
    	 this.inferiorEsquerda = new JLabel(controller.getTabuleiro().getInferiorEsquerda().toString());
 		inferiorEsquerda.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		inferiorEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
 		inferiorEsquerda.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(inferiorEsquerda);

 		this.inferiorMeio = new JLabel(controller.getTabuleiro().getInferiorMeio().toString());
 		inferiorMeio.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		inferiorMeio.setHorizontalAlignment(SwingConstants.CENTER);
 		inferiorMeio.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(inferiorMeio);

 		this.inferiorDireita = new JLabel(controller.getTabuleiro().getInferiorDireita().toString());
 		inferiorDireita.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
 		inferiorDireita.setHorizontalAlignment(SwingConstants.CENTER);
 		inferiorDireita.setBackground(Color.BLACK);
 		getFrameJogo().getContentPane().add(inferiorDireita);
     }

	public void atualizaTela(JLabel cimaEsquerda, JLabel cimaMeio, JLabel cimaDireita, JLabel meioEsquerda, JLabel meio,
			JLabel meioDireita, JLabel inferiorEsquerda, JLabel inferiorMeio, JLabel inferiorDireita) {
		cimaEsquerda.setText(controller.getTabuleiro().getCimaEsquerda().toString());
		cimaMeio.setText(controller.getTabuleiro().getCimaMeio().toString());
		cimaDireita.setText(controller.getTabuleiro().getCimaDireita().toString());
		meioEsquerda.setText(controller.getTabuleiro().getMeioEsquerda().toString());
		meio.setText(controller.getTabuleiro().getMeio().toString());
		meioDireita.setText(controller.getTabuleiro().getMeioDireita().toString());
		
	}
    
    

}


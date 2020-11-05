package view;

import java.awt.*;
import javax.swing.*;

import ouvinte.OuvinteTeclado;
import entities.Tabuleiro;
import controller.TabuleiroController;
import entities.Vencedor;
import impl.JogadorImpl;
import impl.LogImpl;

import java.awt.event.*;

public class TabuleiroView extends JPanel implements InterfaceView {
	private static final long serialVersionUID = 1L;
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

	public TabuleiroView() {
		this.setSettingsView();
	}

	public void criaCima() {
		this.cimaEsquerda = new JLabel(controller.getTabuleiro().getCimaEsquerda().toString());
		cimaEsquerda.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		cimaEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
		cimaEsquerda.setBackground(Color.RED);
		this.add(cimaEsquerda);

		this.cimaMeio = new JLabel(controller.getTabuleiro().getCimaMeio().toString());
		cimaMeio.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		cimaMeio.setHorizontalAlignment(SwingConstants.CENTER);
		cimaMeio.setBackground(Color.BLACK);
		this.add(cimaMeio);

		this.cimaDireita = new JLabel(controller.getTabuleiro().getCimaDireita().toString());
		cimaDireita.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		cimaDireita.setHorizontalAlignment(SwingConstants.CENTER);
		cimaDireita.setBackground(Color.BLACK);
		this.add(cimaDireita);
	}

	public void criaMeio() {
		this.meioEsquerda = new JLabel(controller.getTabuleiro().getMeioEsquerda().toString());
		meioEsquerda.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		meioEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
		meioEsquerda.setBackground(Color.BLACK);
		this.add(meioEsquerda);

		this.meio = new JLabel(controller.getTabuleiro().getMeio().toString());
		meio.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		meio.setHorizontalAlignment(SwingConstants.CENTER);
		meio.setBackground(Color.BLACK);
		this.add(meio);

		this.meioDireita = new JLabel(controller.getTabuleiro().getMeioDireita().toString());
		meioDireita.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		meioDireita.setHorizontalAlignment(SwingConstants.CENTER);
		meioDireita.setBackground(Color.BLACK);
		this.add(meioDireita);
	}

	public void criaInferior() {
		this.inferiorEsquerda = new JLabel(controller.getTabuleiro().getInferiorEsquerda().toString());
		inferiorEsquerda.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		inferiorEsquerda.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorEsquerda.setBackground(Color.BLACK);
		this.add(inferiorEsquerda);

		this.inferiorMeio = new JLabel(controller.getTabuleiro().getInferiorMeio().toString());
		inferiorMeio.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		inferiorMeio.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorMeio.setBackground(Color.BLACK);
		this.add(inferiorMeio);

		this.inferiorDireita = new JLabel(controller.getTabuleiro().getInferiorDireita().toString());
		inferiorDireita.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 22));
		inferiorDireita.setHorizontalAlignment(SwingConstants.CENTER);
		inferiorDireita.setBackground(Color.BLACK);
		this.add(inferiorDireita);
	}

	public void atualizaTela(JLabel cimaEsquerda, JLabel cimaMeio, JLabel cimaDireita, JLabel meioEsquerda, JLabel meio,
			JLabel meioDireita, JLabel inferiorEsquerda, JLabel inferiorMeio, JLabel inferiorDireita) {
		
		cimaEsquerda.setText(controller.getTabuleiro().getCimaEsquerda().toString());
		cimaMeio.setText(controller.getTabuleiro().getCimaMeio().toString());
		cimaDireita.setText(controller.getTabuleiro().getCimaDireita().toString());
		meioEsquerda.setText(controller.getTabuleiro().getMeioEsquerda().toString());
		meio.setText(controller.getTabuleiro().getMeio().toString());
		meioDireita.setText(controller.getTabuleiro().getMeioDireita().toString());
		inferiorEsquerda.setText(controller.getTabuleiro().getInferiorEsquerda().toString());
		inferiorMeio.setText(controller.getTabuleiro().getInferiorMeio().toString());
		inferiorDireita.setText(controller.getTabuleiro().getInferiorDireita().toString());
		
		if(Vencedor.verificaVencedor(this.cimaEsquerda,this.cimaMeio,this.cimaDireita,this.meioEsquerda,this.meio,this.meioDireita,this.inferiorEsquerda,this.inferiorMeio,this.inferiorDireita)){
			JogadorImpl jogadorImpl = new JogadorImpl();
			LogImpl logImpl = new LogImpl();
			try {
				JOptionPane.showMessageDialog(null, "Parabens "+jogadorImpl.pegaNomeJogador()+" voce venceu com um total de "+logImpl.contaLogs().toString()+" jogadas!");
				controller.resetGame();
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void setSettingsView() {
		controller = new TabuleiroController(new Tabuleiro());
		setLayout(new GridLayout(0, 3, 0, 0));
		this.criaCima();
		this.criaMeio();
		this.criaInferior();
		setFocusable(true);
		requestFocusInWindow();

		this.ouvinte = new OuvinteTeclado(controller, cimaEsquerda, cimaMeio, cimaDireita, meioEsquerda, meio,
				meioDireita, inferiorEsquerda, inferiorMeio, inferiorDireita, this);

		this.addKeyListener(this.ouvinte);

	}

	@Override
	public void setBtnListeners() {
		// TODO Auto-generated method stub

	}

}
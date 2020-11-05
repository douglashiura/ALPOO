package view;

import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class SystemView extends JFrame implements InterfaceView{

	private static final long serialVersionUID = 1L;
	private static JLayeredPane layeredPane = new JLayeredPane();
	private JMenuBar menuBar = new JMenuBar();
	
	private JMenu mnCadastro = new JMenu("Cadastro");
	private JMenu mnJogo = new JMenu("Jogo");
	
	private JMenuItem mntmJogador = new JMenuItem("Jogador");
	private JMenuItem mntmJogar = new JMenuItem("Jogar");
	
	private Component cadastroView = new CadastroView();
	private Component jogoView = new TabuleiroView();

	
	public SystemView() {
		this.setSettingsView();
		this.setBtnListeners();
	}
	
	@Override
	public void setSettingsView() {
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(960, 600);
		this.setTitle("|-| Jogo Do Oito |-|");
		
		menuBar.setBounds(0, 0, 960, 21);
		contentPane.add(menuBar);
		
		mnCadastro.add(mntmJogador);
		mnJogo.add(mntmJogar);
		
		menuBar.add(mnCadastro);
		menuBar.add(mnJogo);
		
		layeredPane.setBounds(10, 32, 940, 560);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		layeredPane.add(cadastroView, "cadastroView");
		layeredPane.add(jogoView, "jogoView");

		getContentPane().add(contentPane);
		
	}

	@Override
	public void setBtnListeners() {
		// TODO Auto-generated method stub
		
	}
	public static void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();		
	}		

}

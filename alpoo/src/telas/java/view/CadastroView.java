package view;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entities.Jogador;
import impl.JogadorImpl;

public class CadastroView extends JPanel implements InterfaceView{
	
	private JTextField textName;
	private JButton btnCadastrar;
	private JLabel lblNomeJogador;
	
	
	public CadastroView() {
		this.setSettingsView();
		this.setBtnListeners();
	}

	@Override
	public void setSettingsView() {
		setLayout(null);
		
		lblNomeJogador = new JLabel("Nome do Jogador:");
		lblNomeJogador.setBounds(211, 136, 156, 16);
		this.add(lblNomeJogador);
		
		textName = new JTextField();
		textName.setBounds(370, 131, 124, 28);
		this.add(textName);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(383, 412, 111, 28);
		this.add(btnCadastrar);
		
	}

	@Override
	public void setBtnListeners() {
		btnCadastrar.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Jogador jogador = new Jogador(1, textName.getText());
					JogadorImpl jogadorImpl = new JogadorImpl();
					jogadorImpl.salvaJogador(jogador);
					JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
					SystemView.switchPanels(new TabuleiroView());
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}finally {
					clearTextField();
					
				}
			}

		});
		
	}
	
	private void clearTextField() {
		textName.setText("");
		
	}

}
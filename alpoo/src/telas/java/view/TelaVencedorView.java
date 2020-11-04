package view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaVencedorView extends JPanel implements InterfaceView {
	private static final long serialVersionUID = 1L;
	private JLabel lblVenceu;

	public TelaVencedorView() {
		this.setSettingsView();
		dialogVencedor();
	}
	@Override
	public void setSettingsView() {
		setLayout(null);
		lblVenceu = new JLabel("VOCE VENCEU");
		lblVenceu.setBounds(430, 136, 156, 16);
		this.add(lblVenceu);
	}

	@Override
	public void setBtnListeners() {
		// TODO Auto-generated method stub

	}
	
	public void dialogVencedor() {
		JOptionPane.showMessageDialog(null, "!! - VOCE VENCEU - !!");
	}

}

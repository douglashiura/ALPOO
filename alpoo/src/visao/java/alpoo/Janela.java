package alpoo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.ies.aula.alpoo.jogo.jogoParImpar;



public class Janela extends JFrame {


	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	
	
	
	
	
	public static void main(String[] args) {
		Janela frame = new Janela();
		frame.setVisible(true);
		
	} 
	public Janela() {	

		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(59, 88, 86, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(249, 88, 86, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		JLabel num1Label = new JLabel("Digite o Primeiro Numero");
		num1Label.setBounds(59, 63, 117, 14);
		contentPane.add(num1Label);
		
		JLabel num2Label = new JLabel("Digite o Segundo Numero");
		num2Label.setBounds(249, 63, 117, 14);
		contentPane.add(num2Label);
		
		JButton btnTestar = new JButton("Par ou Impar?");
		btnTestar.setBounds(152, 142, 99, 23);
		btnTestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());				
				String teste = jogoParImpar.jogar(num1,num2);
				JOptionPane.showMessageDialog(null, teste);
			}
		});
		contentPane.add(btnTestar);
	}}
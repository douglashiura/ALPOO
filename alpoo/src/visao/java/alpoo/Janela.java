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
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;



public class Janela extends JFrame {


	private JPanel contentPane;
	private JTextField txtTabelaPlayer2;
	private JTextField txtTabelaPlayer1;
	public String teste;
	public int placarPlayer1 = 0;
	public int placarPlayer2 = 0;
	private JTextField txtApostaPlayer1;
	private JTextField txtApostaPlayer2;
	private JTextField txtAnuncioVencedor;
	private JPasswordField txtNum1;
	private JPasswordField txtNum2;
	
	
	
	
	
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
		
		JLabel num1Label = new JLabel("Digite o Primeiro Numero");
		num1Label.setBounds(39, 63, 142, 14);
		contentPane.add(num1Label);
		
		JLabel num2Label = new JLabel("Digite o Segundo Numero");
		num2Label.setBounds(237, 63, 171, 14);
		contentPane.add(num2Label);
		
		JButton btnTestar = new JButton("Par ou Impar?");
		btnTestar.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTestar.setBounds(164, 152, 99, 23);
		btnTestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());				
				teste = jogoParImpar.jogar(num1,num2);
				JOptionPane.showMessageDialog(null, teste);
				AlteraPlacar();
				inverteAposta();
				txtNum1.setText(null);
				txtNum2.setText(null);
				
			}
		});
		contentPane.add(btnTestar);
		
		JLabel lblPlayer1 = new JLabel("PONTUA\u00C7\u00C3O JOGADOR 1:");
		lblPlayer1.setForeground(Color.BLUE);
		lblPlayer1.setBounds(21, 186, 191, 14);
		contentPane.add(lblPlayer1);
		
		JLabel lblPlayer2 = new JLabel("PONTUA\u00C7\u00C3O JOGADOR 2:");
		lblPlayer2.setForeground(Color.RED);
		lblPlayer2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPlayer2.setBounds(189, 186, 219, 14);
		contentPane.add(lblPlayer2);
		
		txtTabelaPlayer2 = new JTextField();
		txtTabelaPlayer2.setEditable(false);
		txtTabelaPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		txtTabelaPlayer2.setText("0");
		txtTabelaPlayer2.setBounds(320, 211, 30, 23);
		contentPane.add(txtTabelaPlayer2);
		txtTabelaPlayer2.setColumns(10);
		
		txtTabelaPlayer1 = new JTextField();
		txtTabelaPlayer1.setEditable(false);
		txtTabelaPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTabelaPlayer1.setText("0");
		txtTabelaPlayer1.setColumns(10);
		txtTabelaPlayer1.setBounds(75, 211, 30, 23);
		contentPane.add(txtTabelaPlayer1);	
		
		txtApostaPlayer1 = new JTextField();
		txtApostaPlayer1.setEditable(false);
		txtApostaPlayer1.setForeground(Color.BLUE);
		txtApostaPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		txtApostaPlayer1.setText("PAR!");
		txtApostaPlayer1.setColumns(10);
		txtApostaPlayer1.setBounds(59, 142, 59, 23);
		contentPane.add(txtApostaPlayer1);
		
		txtApostaPlayer2 = new JTextField();
		txtApostaPlayer2.setEditable(false);
		txtApostaPlayer2.setForeground(Color.RED);
		txtApostaPlayer2.setText("IMPAR!");
		txtApostaPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		txtApostaPlayer2.setColumns(10);
		txtApostaPlayer2.setBounds(305, 143, 59, 23);
		contentPane.add(txtApostaPlayer2);
		
		txtAnuncioVencedor = new JTextField();
		txtAnuncioVencedor.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnuncioVencedor.setForeground(Color.BLACK);
		txtAnuncioVencedor.setText("P A R   O U    \u00CD M P A R ?");
		txtAnuncioVencedor.setEditable(false);
		txtAnuncioVencedor.setBounds(0, 11, 434, 20);
		contentPane.add(txtAnuncioVencedor);
		txtAnuncioVencedor.setColumns(10);
		
		txtNum1 = new JPasswordField();
		txtNum1.setBounds(59, 87, 59, 21);
		contentPane.add(txtNum1);
		
		txtNum2 = new JPasswordField();
		txtNum2.setBounds(305, 88, 59, 21);
		contentPane.add(txtNum2);
	}
	
	public void comparaResultado(String teste) {	
	}
	
	public String getPlayer1() {
		String apostaPlayer1 = txtApostaPlayer1.getText();
		return apostaPlayer1;
	}
	
	public void setTabelaPlayer1(int temp) {		
	txtTabelaPlayer1.setText(String.valueOf(Integer.valueOf(temp)));
	} 
	
	public void setTabelaPlayer2(int temp) {
	txtTabelaPlayer2.setText(String.valueOf(Integer.valueOf(temp)));
	}
	
    public void AlteraPlacar() {
    	if (teste=="PAR!") {					
			String Player1 = getPlayer1();					
			System.out.println(teste);
			if (Player1.equals(teste)){						
				placarPlayer1++;
				anunciaVencedor1();
				 setTabelaPlayer1(placarPlayer1);												 					 
			                          }
			else { placarPlayer2++;
			anunciaVencedor2();
			 setTabelaPlayer2(placarPlayer2);
		                    }}
		else { 
			String Player1 = getPlayer1();
			if (Player1.equals(teste)){						
				placarPlayer1++;
				anunciaVencedor1();
				 setTabelaPlayer1(placarPlayer1);												 					 
			                          }
			else { placarPlayer2++;
			    anunciaVencedor2();
			       setTabelaPlayer2(placarPlayer2);
				
				
			}
		}
    }
    
    public void inverteAposta() {
    	String temp = txtApostaPlayer1.getText();
    	txtApostaPlayer1.setText(txtApostaPlayer2.getText());
    	txtApostaPlayer2.setText(temp);
    }
    public void anunciaVencedor1() {
    	txtAnuncioVencedor.setText("O Jogador 1 Venceu!!");
    	txtAnuncioVencedor.setForeground(Color.RED);   	
    }
    public void anunciaVencedor2() {
    	txtAnuncioVencedor.setText("O Jogador 2 Venceu!!");
    	txtAnuncioVencedor.setForeground(Color.BLUE);
}
    }
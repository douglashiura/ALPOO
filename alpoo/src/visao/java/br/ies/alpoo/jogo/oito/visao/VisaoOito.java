package br.ies.alpoo.jogo.oito.visao;

import br.ies.aula.alpoo.jogo.oito.modelo.ModeloTabuleiro;
import br.ies.alpoo.jogo.oito.visao.Controles;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class VisaoOito {
	private static JTable table;
	public static void main(String[] args) {
		ModeloTabuleiro modeloTabuleiro = new ModeloTabuleiro();
		JFrame mainFrame = new JFrame();
		Controles control = new Controles();	

		JLabel roundLabel = new JLabel("Jogadas : " + control.getJogadas());
		roundLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		roundLabel.setHorizontalAlignment(SwingConstants.CENTER);
		roundLabel.setBounds(210, 180, 100, 20);
		mainFrame.getContentPane().add(roundLabel);
		
		mainFrame.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
					control.MoveLeft(table);
					control.refreshLabel(roundLabel);
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
					control.MoveRight(table);
					control.refreshLabel(roundLabel);
				}
				else if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W) {
					control.MoveUp(table);
					control.refreshLabel(roundLabel);
				}
				else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S) {
					control.MoveDown(table);
					control.refreshLabel(roundLabel);
				}
			}
		});
		
		JFrame loginFrame = new JFrame();
		JLabel title = new JLabel("Jogo do Oito");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		
		mainFrame.setLocation(400, 200);
		mainFrame.setSize(400,250);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		mainFrame.setTitle("Tela do 8Puzzle");
		
		loginFrame.setLocation(400, 200);
		loginFrame.setSize(400,250);
		loginFrame.getContentPane().setLayout(null);
		loginFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		loginFrame.setTitle("Tela de Login do 8Puzzle");
		
		title.setVisible(true);
		title.setSize(120, 20);
		title.setLocation(25, 11);
		
		mainFrame.getContentPane().add(title);
		
		JLabel nameLabel = new JLabel("Nome :");
		nameLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setBounds(100, 50, 50, 40);
		loginFrame.getContentPane().add(nameLabel);
		
		JTextField nameField = new JTextField();
		nameField.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		nameField.setForeground(Color.BLACK);
		nameField.setBounds(150, 50, 100, 40);
		loginFrame.getContentPane().add(nameField);
		
		JButton EntryButton = new JButton("Entrar");
		EntryButton.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		EntryButton.setBounds(150, 150, 100, 40);
		loginFrame.getContentPane().add(EntryButton);
		
		BasicArrowButton DownButton = new BasicArrowButton(BasicArrowButton.SOUTH);
		DownButton.setFont(new Font("Tw Cen MT", Font.BOLD, 12));
		DownButton.setBounds(50, 170, 40, 20);
		mainFrame.getContentPane().add(DownButton);
		
		BasicArrowButton UpButton = new BasicArrowButton(BasicArrowButton.NORTH);
		UpButton.setFont(new Font("Tw Cen MT", Font.BOLD, 12));
		UpButton.setBounds(50, 130, 40, 20);
		mainFrame.getContentPane().add(UpButton);
		
		BasicArrowButton LeftButton = new BasicArrowButton(BasicArrowButton.WEST);
		LeftButton.setFont(new Font("Tw Cen MT", Font.BOLD, 12));
		LeftButton.setBounds(10, 150, 40, 20);
		mainFrame.getContentPane().add(LeftButton);
		
		BasicArrowButton RightButton = new BasicArrowButton(BasicArrowButton.EAST);
		RightButton.setFont(new Font("Tw Cen MT", Font.BOLD, 12));
		RightButton.setBounds(90, 150, 40, 20);
		mainFrame.getContentPane().add(RightButton);
		
		JLabel nameTitle = new JLabel();
		nameTitle.setHorizontalAlignment(SwingConstants.CENTER);
		nameTitle.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 18));
		nameTitle.setForeground(Color.BLACK);
		nameTitle.setBounds(5, 40, 150, 40);
		mainFrame.getContentPane().add(nameTitle);
		
		EntryButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(nameField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Preencha o nome!");
				}
				else {
					loginFrame.setVisible(false);
					mainFrame.setVisible(true);
					control.setName(nameField.getText());
					nameTitle.setText("Bom jogo " + control.getName() + "!!!");
					mainFrame.getContentPane().requestFocus();
				}
			}
		});
		
		UpButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control.MoveUp(table);
				control.refreshLabel(roundLabel);
				mainFrame.getContentPane().requestFocus();
			}
		});
		
		RightButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control.MoveRight(table);
				control.refreshLabel(roundLabel);
				mainFrame.getContentPane().requestFocus();
			}
		});
		
		LeftButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control.MoveLeft(table);
				control.refreshLabel(roundLabel);
				mainFrame.getContentPane().requestFocus();
			}
		});
		
		DownButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control.MoveDown(table);
				control.refreshLabel(roundLabel);
				mainFrame.getContentPane().requestFocus();
			}
		});
		
		table = new JTable(modeloTabuleiro);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setEnabled(false);
		table.setFont(new Font("Tw Cen MT", Font.BOLD, 32));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(0).setMinWidth(40);
		table.getColumnModel().getColumn(0).setMaxWidth(65);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setMinWidth(40);
		table.getColumnModel().getColumn(1).setMaxWidth(65);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(40);
		table.getColumnModel().getColumn(2).setMinWidth(40);
		table.getColumnModel().getColumn(2).setMaxWidth(65);
		table.setRowHeight(33);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
		table.setBounds(160, 25, 196, 100);
		table.setFocusable(false);
		table.setRowSelectionAllowed(false);
		mainFrame.getContentPane().add(table);
		
		JButton DoneButton = new JButton("Pronto!");
		DoneButton.setFont(new Font("Tw Cen MT", Font.BOLD, 14));
		DoneButton.setBounds(215, 149, 89, 23);
		mainFrame.getContentPane().add(DoneButton);
		
		JLabel WinLabel = new JLabel("GANHOU!!!");
		WinLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WinLabel.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 16));
		WinLabel.setForeground(Color.BLACK);
		WinLabel.setBackground(Color.LIGHT_GRAY);
		WinLabel.setBounds(33, 82, 77, 32);
		WinLabel.setVisible(false);
		
		mainFrame.getContentPane().add(WinLabel);
		
		JButton replayButton = new JButton("Rejogar?");
		replayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rnd = (int) (Math.random()*5 + 1);
				modeloTabuleiro.rejogar(rnd);
				mainFrame.getContentPane().requestFocus();
				table.repaint();
			}
		});
		replayButton.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 14));
		replayButton.setBounds(295, 0, 89, 23);
		mainFrame.getContentPane().add(replayButton);
		
		DoneButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Integer [][] doneArray = new Integer[][] {{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 }};

				if(Arrays.deepEquals(doneArray, modeloTabuleiro.obterTabuleiro())) {
					WinLabel.setVisible(true);
					control.insertToDBNamePlays();
				}
				mainFrame.getContentPane().requestFocus();
			}
		});
		
		loginFrame.setVisible(true);
		mainFrame.setVisible(false);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

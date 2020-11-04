package main;

import java.awt.EventQueue;

import impl.TabuleiroImpl;
import view.SystemView;

public class Main {

	public static void main(String[] args) {
		try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TabuleiroImpl tabuleiroImpl = new TabuleiroImpl();
				tabuleiroImpl.removeTabuleiro();
				tabuleiroImpl.criaTabuleiro();
				SystemView frame = new SystemView();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});

	}

}
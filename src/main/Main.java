package main;

import main.getconnection.GetConnection;
import view.PlayInterface;

public class Main {
	public static void main(String[] args) throws Exception {
		try {
			GetConnection getconnection = new GetConnection();
			getconnection.getConnection();
			
			PlayInterface play = new PlayInterface();
			play.open();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

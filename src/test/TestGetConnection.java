package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.getconnection.GetConnection;

public class TestGetConnection {
	@Test
	public void getConnection() throws Exception {
	GetConnection getconnection = new GetConnection();

	assertEquals(true, getconnection.getConnection().isValid(0));
	}
}

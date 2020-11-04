package br.ies.alpoo.jogo.oito.database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

public class ConnectDB {
	private static String url = "jdbc:postgresql://localhost:5432/TesteJDBC";
    private static String user = "postgres";
    private static String pw = "150801";
    public static Connection connect() {

        Connection connection;
        try {
            connection = DriverManager.getConnection(url, user, pw);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stat) {
        close(conn);
        try {
            if (stat != null) {
                stat.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn, Statement stat, ResultSet rs) {
        close(conn, stat);
        try {
            if ( rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
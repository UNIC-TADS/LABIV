package br.unic.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao{
	//SQLSERVER
 	//private String driver = "net.sourceforge.jtds.jdbc.Driver";
   // private String URL = "jdbc:jtds:sqlserver://localhost/banco_de_dados";
    //MYSQL
	private String driver = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost:3306/locadora";
	private String USER = "root";
    private String SENHA = "";
    private Connection conn;
 
    public Conexao() {
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(URL, USER, SENHA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public Connection getConn() {
        return conn;
    }
 
    public void fecharConexao() {
        try {
            conn.close();
        //PEGA E MOSTRA OS ERROS GERADOS NO METODO
        } catch (SQLException e) { 
            e.printStackTrace();
        }
    }
}

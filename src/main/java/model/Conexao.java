package model;

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexao{
	
	private static final String USERNAME= "root";
	private static final String PASSWORD= "*********";
	private static final String DATABASE_URL= "jdbc:mysql://localhost:3306/******";
	

	public static Connection createConnectionToMySQL() throws Exception{//caso o banco não for encontrado
		// CLASSE NA VIRTUAL MACHINE DO JAVA. ELA FAZ A CONEXÃO COM O BD
		Class.forName("com.myusql.cj.jdbc.Driver");
		
		//CRIA A CONEXÃO COM O BANCO DE DADOS
		Connection connection= DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
	return connection;
	}
}

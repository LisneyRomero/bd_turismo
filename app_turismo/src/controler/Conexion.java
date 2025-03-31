package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	
	public Connection conectarBD () {
		//Crear e inicializar un objeto de la clase connection
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_turismo" ,"root", "2556229");
			System.out.println("Connected Whith the database successfully");
		}catch (SQLException e) {
			System.out.println("Error while connectiong to the database");
		}

		return connection;  //retorna la conexion abierta con la base de datos
	}

}

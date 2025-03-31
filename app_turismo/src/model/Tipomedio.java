package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import controler.Conexion;

public class Tipomedio {
	
	Conexion conector = new Conexion();

	public String nombre; 
	public String observaciones;
	
	
	//Crear constructor
	public Tipomedio( String nombre, String observaciones) {
		super();
		
		this.nombre = nombre;
		this.observaciones = observaciones;
	}
	
	
	
	public Tipomedio() {
		super();
	}



	//Crear getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
	
	public void create (String nombre, String observaciones) {
		
		Connection dbConnection = null;
		PreparedStatement pst =null; //prepara la trx
		
		String script = "INSERT INTO tbltipomedio (nombre,observaciones) VALUES (? , ?)";
		
		try { dbConnection = conector.conectarBD(); //abrir conexion
		pst = dbConnection.prepareStatement(script); //abrir el buffer
		
		
		//parametrizar los campos
		pst.setString(1, nombre);
		pst.setString(2, observaciones);
		
		//ejecutar la trx
		pst.executeUpdate();
		
		JOptionPane.showConfirmDialog(null, "Registrado con exito");
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	
	
	
	
	
	
}

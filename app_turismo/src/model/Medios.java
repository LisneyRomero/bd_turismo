package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Medios {

	Conexion conector = new Conexion();
	
	public String nombre;
	public String observaciones;
	public int idtipomedio;
	
	public Medios( String nombre, String observaciones, int idtipomedio) {
		super();
	
		this.nombre = nombre;
		this.observaciones = observaciones;
		this.idtipomedio = idtipomedio;
	}
	
	
	
	
	
	public Medios() {
		super();
	}

	
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
	public int getIdtipomedio() {
		return idtipomedio;
	}
	public void setIdtipomedio(int idtipomedio) {
		this.idtipomedio = idtipomedio;
	}
	
	
	
	
	
	public void create (String nombre, String observaciones, int idtipomedio) {
		
		Connection dbConnection = null;
		PreparedStatement pst =null; //prepara la trx
		
		String script = "INSERT INTO tblmedios (nombre,observaciones,idtipomedio) VALUES (?,?,?)";
		
		try { dbConnection = conector.conectarBD(); //abrir conexion
		pst = dbConnection.prepareStatement(script); //abrir el buffer
		
		
		//parametrizar los campos
		pst.setString(1, nombre);
		pst.setString(2, observaciones);
		pst.setInt(3, idtipomedio);
		
		//ejecutar la trx
		pst.executeUpdate();
		
		JOptionPane.showMessageDialog(null,"Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	
	
	
	}
	
	
	
}

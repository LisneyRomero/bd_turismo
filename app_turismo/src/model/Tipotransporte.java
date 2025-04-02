package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Tipotransporte {


	Conexion conector = new Conexion();
	
	
	public String nombre;
	public String observaciones;
	
	
	public Tipotransporte(int idtipotransporte, String nombre, String observaciones) {
		super();
	
		this.nombre = nombre;
		this.observaciones = observaciones;
	}


	

	public Tipotransporte() {
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
	
	
	
public void create (String nombre, String observaciones) {
		
		Connection dbConnection = null;
		PreparedStatement pst =null; //prepara la trx
		
		String script = "INSERT INTO tbltipotransporte (nombre,observaciones) VALUES (?,?)";
		
		try { dbConnection = conector.conectarBD(); //abrir conexion
		pst = dbConnection.prepareStatement(script); //abrir el buffer
		
		
		//parametrizar los campos
		pst.setString(1, nombre);
		pst.setString(2, observaciones);
	
		
		//ejecutar la trx
		pst.executeUpdate();
		
		JOptionPane.showMessageDialog(null,"Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	
	
}
//Eliminar registros 
	public void delete(int idtipotransporte) {
		
		Connection dbConnection = null;
		PreparedStatement pst = null; //Preparar la trx
		
		String script = "DELETE FROM tbltipotransporte WHERE idtipotransporte = ?";
		
		try { 
			dbConnection = conector.conectarBD(); //abrir la conexion
			pst = dbConnection.prepareStatement(script); //abrir el buffer
			
			//parametrizar el campo
			pst.setInt(1 , idtipotransporte);
			
			//confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipotransporte +"?");
			
			if (resp == JOptionPane.OK_OPTION) {
				//ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. " + idtipotransporte + " eliminado");			
		}
			}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}
	
	
	
}

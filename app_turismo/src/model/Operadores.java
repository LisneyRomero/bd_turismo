package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Operadores {


	Conexion conector = new Conexion();

	public String tipodocumento;
	public String documento;
	public String nombre;
	public String apellido;
	public String direccion;
	public String correo;
	public String telefono;
	public int idvehiculo;
	
	
	public Operadores( String tipodocumento, String documento, String nombre, String apellido,
			String direccion, String correo, String telefono, int idvehiculo) {
		super();
		
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.idvehiculo = idvehiculo;
	}
	
	
	
	
	
	public Operadores() {
		super();
	}





	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getIdvehiculo() {
		return idvehiculo;
	}
	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}
	
	
	
	public void create ( String tipodocumento, String documento, String nombre, String apellido,
			String direccion, String correo, String telefono, int idvehiculo) {
		
			Connection dbConnection = null;
			PreparedStatement pst =null; //prepara la trx
			
			String script = "INSERT INTO tbloperadores ( tipodocumento,  documento,  nombre,  apellido,\r\n"
					+ "			 direccion,  correo,  telefono,  idvehiculo) VALUES (?,?,?,?,?,?,?,?)";
			
			try { dbConnection = conector.conectarBD(); //abrir conexion
			pst = dbConnection.prepareStatement(script); //abrir el buffer
			
			
			//parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setString(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7,  telefono);
			pst.setInt(8, idvehiculo);
			
			
						
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"Registrado con exito");
	
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	}
	
	
}

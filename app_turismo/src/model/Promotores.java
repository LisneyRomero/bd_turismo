package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Promotores {

	Conexion conector = new Conexion();
	
	public int tipodocumento;
	public int documento;
	public String nombre;
	public String apellido;
	public String direccion;
	public String correopersonal;
	public String correocorp;
	public String fechanacimiento;
	public String telefono;
	
	
	public Promotores( int tipodocumento, int documento, String nombre, String apellido,
			String direccion, String correopersonal, String correocorp, String fechanacimiento, String telefono) {
		super();
		
		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correopersonal = correopersonal;
		this.correocorp = correocorp;
		this.fechanacimiento = fechanacimiento;
		this.telefono = telefono;
	}
	
	
	
	
	
	public Promotores() {
		super();
	}





	public int getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(int tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
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
	public String getCorreopersonal() {
		return correopersonal;
	}
	public void setCorreopersonal(String correopersonal) {
		this.correopersonal = correopersonal;
	}
	public String getCorreocorp() {
		return correocorp;
	}
	public void setCorreocorp(String correocorp) {
		this.correocorp = correocorp;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void create (int tipodocumento, int documento, String nombre, String apellido,
			String direccion, String correopersonal, String correocorp, String fechanacimiento, String telefono) {
		
			Connection dbConnection = null;
			PreparedStatement pst =null; //prepara la trx
			
			String script = "INSERT INTO tblpromotores (tipodocumento,  documento,  nombre,  apellido,\r\n"
					+ "			 direccion,  correopersonal,  correocorp,  fechanacimiento,  telefono) VALUES (?,?,?,?,?,?,?,?,?)";
			
			try { dbConnection = conector.conectarBD(); //abrir conexion
			pst = dbConnection.prepareStatement(script); //abrir el buffer
			
			
			//parametrizar los campos
			pst.setInt(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correopersonal);
			pst.setString(7,  correocorp);
			pst.setString(8, fechanacimiento);
			pst.setString(9, telefono);
			
			
			
			
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"Registrado con exito");
	
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
	
	
	}
	
}

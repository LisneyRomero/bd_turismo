package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controler.Conexion;
import view.frmMenu;

public class Promotores {

	//se instancia la clase conexion
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
	
	//Crear registros nuevos
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
	//Eliminar registros 
			public void delete(int idpromotores) {
				
				Connection dbConnection = null;
				PreparedStatement pst = null; //Preparar la trx
				
				String script = "DELETE FROM tblpromotores WHERE idpromotores = ?";
				
				try { 
					dbConnection = conector.conectarBD(); //abrir la conexion
					pst = dbConnection.prepareStatement(script); //abrir el buffer
					
					//parametrizar el campo
					pst.setInt(1 , idpromotores);
					
					//confirmar la operacion
					int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idpromotores +"?");
					
					if (resp == JOptionPane.OK_OPTION) {
						//ejecutar la Trx
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Registro No. " + idpromotores + " eliminado");			
				}
					}catch (SQLException e) {
						System.out.println(e.getMessage());
					}
				

		}
			// Consultar registros
			public void read(int idpromotores, JTextField tipodocumento ,JTextField documento, JTextField nombre, JTextField apellido,
					JTextField direccion, JTextField correopersonal, JTextField correocorp, JTextField fechanacimiento, JTextField telefono) {

				Connection dbConnection = null;
				PreparedStatement pst = null; // Preparar la trx

				String script = "SELECT * FROM tblpromotores WHERE idpromotores = ?";

				try {
					dbConnection = conector.conectarBD(); // abrir la conexion
					pst = dbConnection.prepareStatement(script); // abrir el buffer

					// parametrizar el campo
					pst.setInt(1, idpromotores);
					ResultSet rs = pst.executeQuery();// Almacenamiento temporal

					// confirmar la operacion
					while (rs.next()) {
						
						tipodocumento.setText(rs.getString(2));
						documento.setText(rs.getString(3));
						nombre.setText(rs.getString(4));
						apellido.setText(rs.getString(5));
						direccion.setText(rs.getString(6));
						correopersonal.setText(rs.getString(7));
						correocorp.setText(rs.getString(8));
						fechanacimiento.setText(rs.getString(9));
						telefono.setText(rs.getString(10));
						

					}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}

			}
			//Acceso de promotores al menu
			public void controlAcceso (int user, String pass ) {
				Connection dbConnection = null;
				PreparedStatement pst = null; // Preparar la trx
				
				String script = "SELECT * FROM tblpromotores WHERE documento = ? and contrasena = ?";
				
				try {
					dbConnection = conector.conectarBD(); // abrir la conexion
					pst = dbConnection.prepareStatement(script); // abrir el buffer
					
					pst.setInt(1, user);
					pst.setString(2, pass);
					ResultSet rs = pst.executeQuery();//Almacenamiento temporal
					
					while (rs.next()) {
						frmMenu menu = new frmMenu();
						menu.show();
					}
					
					
				}catch (SQLException e) {
					System.out.println(e.getMessage());
					
				}
			}
			//actualizar registros 
			public void update (int idpromotores ,int tipodocumento, int documento, String nombre, String apellido,
					String direccion, String correopersonal, String correocorp, String fechanacimiento, String telefono) {
				
					Connection dbConnection = null;
					PreparedStatement pst =null; //prepara la trx
					
					String script = "UPDATE  tblpromotores SET tipodocumento = ?,  documento = ?,  nombre = ?,  apellido = ?,\r\n"
							+ "			 direccion = ?,  correopersonal = ?,  correocorp = ?,  fechanacimiento = ?,  telefono = ? WHERE idpromotores = ? ";
					
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
					pst.setInt(10, idpromotores);
					
					int rs = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro " + idpromotores + "?");

					if (rs == JOptionPane.OK_OPTION) {
						// ejecutar la trx
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Registro Actualizado con Exito");
					} else {
						JOptionPane.showConfirmDialog(null, "Operacion Cancelada");
					}

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}		
}

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Agencias {

	Conexion conector = new Conexion();

	public int idagencia;
	public String nombre;
	public String telefono;
	public String direccion;
	public String correo;
	public String web;
	public int idcompania;

	public Agencias(int idagencia, String nombre, String telefono, String direccion, String correo, String web,
			int idcompania) {
		super();

		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.web = web;
		this.idcompania = idcompania;
	}

	public Agencias() {
		super();
	}

	public Agencias(int idagencia) {
		super();
		this.idagencia = idagencia;
	}

	public int getIdagencia() {
		return idagencia;
	}

	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getIdcompania() {
		return idcompania;
	}

	public void setIdcompania(int idcompania) {
		this.idcompania = idcompania;
	}

	public void create(String nombre, String telefono, String direccion, String correo, String web, int idcompania) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "INSERT INTO tblagencias (nombre,telefono,direccion,correo,web,idcompania) VALUES (?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, web);
			pst.setInt(6, idcompania);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Eliminar registros
	public void delete(int idagencia) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tblagencias WHERE idagencia = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idagencia);

			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idagencia + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idagencia + " eliminado");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar registros
	public void read(int idagencia, JTextField nombre, JTextField telefono, JTextField direccion, JTextField correo,
			JTextField web, JTextField idcompania) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "SELECT * FROM tblagencias WHERE idagencia = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idagencia);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			// confirmar la operacion
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				telefono.setText(rs.getString(3));
				direccion.setText(rs.getString(4));
				correo.setText(rs.getString(5));
				web.setText(rs.getString(6));
				idcompania.setText(rs.getString(7));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	public void update (int idagencia, String nombre, String telefono, String direccion, String correo, String web, int idcompania) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "UPDATE tblagencias SET nombre = ?, telefono = ?, direccion = ?, correo = ? , web = ?, idcompania = ? WHERE idagencia = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
	
			
			pst.setString(1, nombre);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, web);
			pst.setInt(6, idcompania);
			pst.setInt(7, idagencia);		
	

			int rs = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro " + idagencia + "?");

			if (rs == JOptionPane.OK_OPTION) {
			//ejecutar la trx
			pst.executeUpdate();
			JOptionPane.showConfirmDialog(null, "Registro Actualizado con Exito");
			}else {
				JOptionPane.showConfirmDialog(null, "Operacion Cancelada");
			}
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

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

	public Operadores(String tipodocumento, String documento, String nombre, String apellido, String direccion,
			String correo, String telefono, int idvehiculo) {
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

	// Crear nuevos registros en la base de datos
	public void create(String tipodocumento, String documento, String nombre, String apellido, String direccion,
			String correo, String telefono, int idvehiculo) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "INSERT INTO tbloperadores ( tipodocumento,  documento,  nombre,  apellido,\r\n"
				+ "			 direccion,  correo,  telefono,  idvehiculo) VALUES (?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setString(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, telefono);
			pst.setInt(8, idvehiculo);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null, "Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// Eliminar registros
	public void delete(int idoperadores) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tbloperadores WHERE idoperadores = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idoperadores);

			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idoperadores + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. " + idoperadores + " eliminado");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar registros
	public void read(int idoperadores, JTextField tipodocumento, JTextField documento, JTextField nombre,
			JTextField apellido, JTextField direccion, JTextField correo, JTextField telefono, JTextField idvehiculo) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "SELECT * FROM tbloperadores WHERE idoperadores = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idoperadores);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			// confirmar la operacion
			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombre.setText(rs.getString(4));
				apellido.setText(rs.getString(5));
				direccion.setText(rs.getString(6));
				correo.setText(rs.getString(7));
				telefono.setText(rs.getString(8));
				idvehiculo.setText(rs.getString(9));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Actualizar registros
	public void update(int idoperadores, String tipodocumento, String documento, String nombre, String apellido,
			String direccion, String correo, String telefono, int idvehiculo) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "UPDATE tbloperadores SET  tipodocumento = ?,  documento = ?,  nombre = ?,  apellido = ?, direccion = ?,  correo = ?,  telefono = ?,  idvehiculo = ? WHERE idoperadores = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setString(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, direccion);
			pst.setString(6, correo);
			pst.setString(7, telefono);
			pst.setInt(8, idvehiculo);
			pst.setInt(9, idoperadores);

			int rs = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro " + idoperadores + "?");

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

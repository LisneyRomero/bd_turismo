package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Companias {

	Conexion conector = new Conexion();

	public String razonsocial;
	public String telefono;
	public String direccion;
	public String correo;
	public String fechacreacion;
	public String web;

	public Companias(String razonsocial, String telefono, String direccion, String correo, String fechacreacion,
			String web) {
		super();

		this.razonsocial = razonsocial;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.fechacreacion = fechacreacion;
		this.web = web;
	}

	public Companias() {
		super();
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
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

	public String getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(String fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public void create(String razonsocial, String telefono, String direccion, String correo, String fechacreacion,
			String web) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "INSERT INTO tblcompanias (razonsocial, telefono,direccion,correo,fechacreacion, web) VALUES (?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, razonsocial);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null, "Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

	// Eliminar registros
	public void delete(int idcompania) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tblcompanias WHERE idcompania = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idcompania);

			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idcompania + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idcompania + " eliminado");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar registros
	public void read(int idcompania, JTextField razonsocial, JTextField telefono, JTextField direccion,
			JTextField correo, JTextField fechacreacion, JTextField web) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "SELECT * FROM tblcompanias WHERE idcompania = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idcompania);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			// confirmar la operacion
			while (rs.next()) {
				razonsocial.setText(rs.getString(2));
				telefono.setText(rs.getString(3));
				direccion.setText(rs.getString(4));
				correo.setText(rs.getString(5));
				fechacreacion.setText(rs.getString(6));
				web.setText(rs.getString(7));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void update(int idcompania, String razonsocial, String telefono, String direccion, String correo,
			String fechacreacion, String web) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "UPDATE tblcompanias SET razonsocial = ?, telefono = ?,direccion = ?,correo = ?,fechacreacion = ?, web = ? 	WHERE idcompania)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, razonsocial);
			pst.setString(2, telefono);
			pst.setString(3, direccion);
			pst.setString(4, correo);
			pst.setString(5, fechacreacion);
			pst.setString(6, web);
			pst.setInt(7, idcompania);

			int rs = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro " + idcompania + "?");

			if (rs == JOptionPane.OK_OPTION) {
				// ejecutar la trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro Actualizado con Exito");
			} else {
				JOptionPane.showConfirmDialog(null, "Operacion Cancelada");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}

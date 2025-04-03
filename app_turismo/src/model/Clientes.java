package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Clientes {

	Conexion conector = new Conexion();

	public String tipodocumento;
	public int documento;
	public String nombre;
	public String apellido;
	public String eps;
	public String alergias;
	public String fechanacimiento;
	public String correo;
	public String estadocivil;
	public String telefono;
	public String direccion;

	public Clientes(String tipodocumento, int documento, String nombre, String apellido, String eps, String alergias,
			String fechanacimiento, String correo, String estadocivil, String telefono, String direccion) {
		super();

		this.tipodocumento = tipodocumento;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.eps = eps;
		this.alergias = alergias;
		this.fechanacimiento = fechanacimiento;
		this.correo = correo;
		this.estadocivil = estadocivil;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public Clientes() {
		super();
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
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

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
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

	public void create(String tipodocumento, int documento, String nombre, String apellido, String eps, String alergias,
			String fechanacimiento, String correo, String estadocivil, String telefono, String direccion) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "INSERT INTO tblclientes (tipodocumento,documento,  nombre,  apellido, eps,alergias,  fechanacimiento,  correo,  estadocivil,  telefono,\r\n"
				+ "	 direccion) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, tipodocumento);
			pst.setInt(2, documento);
			pst.setString(3, nombre);
			pst.setString(4, apellido);
			pst.setString(5, eps);
			pst.setString(6, alergias);
			pst.setString(7, fechanacimiento);
			pst.setString(8, correo);
			pst.setString(9, estadocivil);
			pst.setString(10, telefono);
			pst.setString(11, direccion);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showConfirmDialog(null, "Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Eliminar registros
	public void delete(int idclientes) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tblclientes WHERE idclientes = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idclientes);

			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idclientes + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idclientes + " eliminado");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar registros
	public void read(int idclientes, JTextField tipodocumento, JTextField documento, JTextField nombre,
			JTextField apellido, JTextField eps, JTextField alergias, JTextField fechanacimiento, JTextField correo,
			JTextField estadocivil, JTextField telefono, JTextField direccion) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "SELECT * FROM tblclientes WHERE idclientes = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idclientes);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			// confirmar la operacion
			while (rs.next()) {
				tipodocumento.setText(rs.getString(2));
				documento.setText(rs.getString(3));
				nombre.setText(rs.getString(4));
				apellido.setText(rs.getString(5));
				eps.setText(rs.getString(6));
				alergias.setText(rs.getString(7));
				fechanacimiento.setText(rs.getString(8));
				correo.setText(rs.getString(9));
				estadocivil.setText(rs.getString(10));
				telefono.setText(rs.getString(11));
				direccion.setText(rs.getString(12));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}

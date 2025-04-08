package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Medios {

	Conexion conector = new Conexion();

	public String nombre;
	public String observaciones;
	public int idtipomedio;

	public Medios(String nombre, String observaciones, int idtipomedio) {
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
	//Crear nuevos registros en la base de datos
	public void create(String nombre, String observaciones, int idtipomedio) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "INSERT INTO tblmedios (nombre,observaciones,idtipomedio) VALUES (?,?,?)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, observaciones);
			pst.setInt(3, idtipomedio);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null, "Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Eliminar registros
	public void delete(int idmedios) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tblmedios WHERE idmedios = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idmedios);

			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idmedios + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showConfirmDialog(null, "Registro No. " + idmedios + " eliminado");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar registros
	public void read(int idmedios, JTextField nombre, JTextField observaciones, JTextField idtipomedio) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "SELECT * FROM tblmedios WHERE idmedios = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idmedios);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			// confirmar la operacion
			while (rs.next()) {
				nombre.setText(rs.getString(2));
				observaciones.setText(rs.getString(3));
				idtipomedio.setText(rs.getString(4));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	public void update(int idmedios, String nombre, String observaciones, int idtipomedio) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "UPDATE tblmedios SET nombre = ?,observaciones = ?,idtipomedio = ? WHERE idmedios = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, observaciones);
			pst.setInt(3, idtipomedio);
			pst.setInt(4, idmedios);
			

			int rs = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro " + idmedios + "?");

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

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controler.Conexion;

public class Tipomedio {

	Conexion conector = new Conexion();

	public String nombre;
	public String observaciones;

	// Crear constructor
	public Tipomedio(String nombre, String observaciones) {
		super();

		this.nombre = nombre;
		this.observaciones = observaciones;
	}

	public Tipomedio() {
		super();
	}

	// Crear getters y setters
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

	//Crear nuevos registros
	public void create(String nombre, String observaciones) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "INSERT INTO tbltipomedio (nombre,observaciones) VALUES (? , ?)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, nombre);
			pst.setString(2, observaciones);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null, "Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Eliminar registros
	public void delete(int idtipomedio) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tbltipomedio WHERE idtipomedio = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idtipomedio);

			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idtipomedio + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. " + idtipomedio + " eliminado");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar registros
		public void read(int idtipomedio, JTextField nombre, JTextArea observaciones) {

			Connection dbConnection = null;
			PreparedStatement pst = null; // Preparar la trx

			String script = "SELECT * FROM tbltipomedio WHERE idtipomedio = ?";

			try {
				dbConnection = conector.conectarBD(); // abrir la conexion
				pst = dbConnection.prepareStatement(script); // abrir el buffer

				// parametrizar el campo
				pst.setInt(1, idtipomedio);
				ResultSet rs = pst.executeQuery();// Almacenamiento temporal

				// confirmar la operacion
				while (rs.next()) {
					nombre.setText(rs.getString(2));
					observaciones.setText(rs.getString(3));
					

				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}

		}
		public void update (int idtipomedio , String nombre, String observaciones) {

			Connection dbConnection = null;
			PreparedStatement pst = null; // prepara la trx

			String script = "UPDATE tbltipomedio SET nombre = ?,observaciones = ? WHERE idtipomedio = ? ";

			try {
				dbConnection = conector.conectarBD(); // abrir conexion
				pst = dbConnection.prepareStatement(script); // abrir el buffer

				// parametrizar los campos
				pst.setString(1, nombre);
				pst.setString(2, observaciones);
				pst.setInt(3,idtipomedio );
				
				int rs = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro " + idtipomedio + "?");

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

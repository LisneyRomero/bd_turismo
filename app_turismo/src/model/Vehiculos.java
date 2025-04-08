package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controler.Conexion;

public class Vehiculos {

	public String placa;
	public String marca;
	public int puestos;
	public String modelo;
	public String numeromotor;
	public String categoria;
	public int idtipotransporte;

	public Vehiculos(String placa, String marca, int puestos, String modelo, String numeromotor, String categoria,
			int idtipotransporte) {
		super();

		this.placa = placa;
		this.marca = marca;
		this.puestos = puestos;
		this.modelo = modelo;
		this.numeromotor = numeromotor;
		this.categoria = categoria;
		this.idtipotransporte = idtipotransporte;
	}

	Conexion conector = new Conexion();

	public Vehiculos() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeromotor() {
		return numeromotor;
	}

	public void setNumeromotor(String numeromotor) {
		this.numeromotor = numeromotor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getIdtipotransporte() {
		return idtipotransporte;
	}

	public void setIdtipotransporte(int idtipotransporte) {
		this.idtipotransporte = idtipotransporte;
	}

	// crear nuevos registros en la base de datos
	public void create(String placa, String marca, int puestos, String modelo, String numeromotor, String categoria,
			int idtipotransporte) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "INSERT INTO tblvehiculo ( placa,  marca,  puestos,  modelo,  numeromotor,\r\n"
				+ "			 categoria,  idtipotransporte) VALUES (?,?,?,?,?,?,?)";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, placa);
			pst.setString(2, marca);
			pst.setInt(3, puestos);
			pst.setString(4, modelo);
			pst.setString(5, numeromotor);
			pst.setString(6, categoria);
			pst.setInt(7, idtipotransporte);

			// ejecutar la trx
			pst.executeUpdate();

			JOptionPane.showMessageDialog(null, "Registrado con exito");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Eliminar registros
	public void delete(int idvehiculo) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "DELETE FROM tblvehiculo WHERE idvehiculo = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idvehiculo);

			// confirmar la operacion
			int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro No. " + idvehiculo + "?");

			if (resp == JOptionPane.OK_OPTION) {
				// ejecutar la Trx
				pst.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registro No. " + idvehiculo + " eliminado");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	// Consultar registros
	public void read(int idvehiculo, JTextField placa, JTextField marca, JTextField puestos, JTextField modelo,
			JTextField numeromotor, JTextField categoria, JTextField idtipotransporte) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // Preparar la trx

		String script = "SELECT * FROM tblvehiculo WHERE idvehiculo = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir la conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar el campo
			pst.setInt(1, idvehiculo);
			ResultSet rs = pst.executeQuery();// Almacenamiento temporal

			// confirmar la operacion
			while (rs.next()) {

				placa.setText(rs.getString(2));
				marca.setText(rs.getString(3));
				puestos.setText(rs.getString(4));
				modelo.setText(rs.getString(5));
				numeromotor.setText(rs.getString(6));
				categoria.setText(rs.getString(7));
				idtipotransporte.setText(rs.getString(8));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
	//Actualizar registros
	public void update(int idvehiculo ,String placa, String marca, int puestos, String modelo, String numeromotor, String categoria,
			int idtipotransporte) {

		Connection dbConnection = null;
		PreparedStatement pst = null; // prepara la trx

		String script = "UPDATE tblvehiculo SET placa  = ?,  marca = ?,  puestos = ?,  modelo = ?,  numeromotor = ?,\r\n"
				+ "			 categoria = ?,  idtipotransporte = ? WHERE idvehiculo = ?";

		try {
			dbConnection = conector.conectarBD(); // abrir conexion
			pst = dbConnection.prepareStatement(script); // abrir el buffer

			// parametrizar los campos
			pst.setString(1, placa);
			pst.setString(2, marca);
			pst.setInt(3, puestos);
			pst.setString(4, modelo);
			pst.setString(5, numeromotor);
			pst.setString(6, categoria);
			pst.setInt(7, idtipotransporte);
			pst.setInt(8, idvehiculo);

			int rs = JOptionPane.showConfirmDialog(null, "¿Desea actualizar el registro " + idvehiculo + "?");

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

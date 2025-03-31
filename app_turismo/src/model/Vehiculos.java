package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Vehiculos {
	
	
	public String placa;
	public String marca;
	public int puestos;
	public String modelo; 
	public String numeromotor; 
	public String categoria;
	public int idtipotransporte;
	
	
	public Vehiculos( String placa, String marca, int puestos, String modelo, String numeromotor,
			String categoria, int idtipotransporte) {
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
	
	
	public void create (String placa, String marca, int puestos, String modelo, String numeromotor,
			String categoria, int idtipotransporte) {
			
			Connection dbConnection = null;
			PreparedStatement pst =null; //prepara la trx
			
			String script = "INSERT INTO tblvehiculos ( placa,  marca,  puestos,  modelo,  numeromotor,\r\n"
					+ "			 categoria,  idtipotransporte) VALUES (?,?,?,?,?,?,?)";
			
			try { dbConnection = conector.conectarBD(); //abrir conexion
			pst = dbConnection.prepareStatement(script); //abrir el buffer
			
			
			//parametrizar los campos
			pst.setString(1, placa);
			pst.setString(2, marca);
			pst.setInt(3, puestos);
			pst.setString(4,modelo);
			pst.setString(5, numeromotor);
			pst.setString(6, categoria);
			pst.setInt(7, idtipotransporte);
			
			
					
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"Registrado con exito");
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}

}

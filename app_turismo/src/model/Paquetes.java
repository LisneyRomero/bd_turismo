package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Paquetes {
	
	
	public int iddestino;
	public int idorigen;
	public String fechaventa;
	public String horaventa;
	public String horasalida;
	public String fechaejecucion;
	public String observaciones;
	public int idpromotores;
	public int idclientes;
	public int idagencia;
	public int idvehiculo;
	public int idmedios;
	public String precios;
	
	
	
	public Paquetes( int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observaciones, int idpromotores, int idclientes, int idagencia,
			int idvehiculo, int idmedios, String precios) {
		super();
		
		this.iddestino = iddestino;
		this.idorigen = idorigen;
		this.fechaventa = fechaventa;
		this.horaventa = horaventa;
		this.horasalida = horasalida;
		this.fechaejecucion = fechaejecucion;
		this.observaciones = observaciones;
		this.idpromotores = idpromotores;
		this.idclientes = idclientes;
		this.idagencia = idagencia;
		this.idvehiculo = idvehiculo;
		this.idmedios = idmedios;
		this.precios = precios;
	}


	Conexion conector = new Conexion();
	

	
	
	
	
	public Paquetes() {
		super();
	}



	public int getIddestino() {
		return iddestino;
	}



	public void setIddestino(int iddestino) {
		this.iddestino = iddestino;
	}



	public int getIdorigen() {
		return idorigen;
	}



	public void setIdorigen(int idorigen) {
		this.idorigen = idorigen;
	}



	public String getFechaventa() {
		return fechaventa;
	}



	public void setFechaventa(String fechaventa) {
		this.fechaventa = fechaventa;
	}



	public String getHoraventa() {
		return horaventa;
	}



	public void setHoraventa(String horaventa) {
		this.horaventa = horaventa;
	}



	public String getHorasalida() {
		return horasalida;
	}



	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}



	public String getFechaejecucion() {
		return fechaejecucion;
	}



	public void setFechaejecucion(String fechaejecucion) {
		this.fechaejecucion = fechaejecucion;
	}



	public String getObservaciones() {
		return observaciones;
	}



	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}



	public int getIdpromotores() {
		return idpromotores;
	}



	public void setIdpromotores(int idpromotores) {
		this.idpromotores = idpromotores;
	}



	public int getIdclientes() {
		return idclientes;
	}



	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}



	public int getIdagencia() {
		return idagencia;
	}



	public void setIdagencia(int idagencia) {
		this.idagencia = idagencia;
	}



	public int getIdvehiculo() {
		return idvehiculo;
	}



	public void setIdvehiculo(int idvehiculo) {
		this.idvehiculo = idvehiculo;
	}



	public int getIdmedios() {
		return idmedios;
	}



	public void setIdmedios(int idmedios) {
		this.idmedios = idmedios;
	}



	public String getPrecios() {
		return precios;
	}



	public void setPrecios(String precios) {
		this.precios = precios;
	}
	
	
	public void create (int iddestino, int idorigen, String fechaventa, String horaventa, String horasalida,
			String fechaejecucion, String observaciones, int idpromotores, int idclientes, int idagencia,
			int idvehiculo, int idmedios, String precios) {
			
			Connection dbConnection = null;
			PreparedStatement pst =null; //prepara la trx
			
			String script = "INSERT INTO tblpaquetes ( iddestino,  idorigen,  fechaventa,  horaventa,  horasalida,\r\n"
					+ "			 fechaejecucion,  observaciones,  idpromotores,  idclientes,  idagencia,\r\n"
					+ "			 idvehiculo,  idmedios,  precios ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			try { dbConnection = conector.conectarBD(); //abrir conexion
			pst = dbConnection.prepareStatement(script); //abrir el buffer
			
			
			//parametrizar los campos
			pst.setInt(1, iddestino);
			pst.setInt(2, idorigen);
			pst.setString(3, fechaventa);
			pst.setString(4,horaventa);
			pst.setString(5, horasalida);
			pst.setString(6, fechaejecucion);
			pst.setString(7, observaciones);
			pst.setInt(8,idpromotores);
			pst.setInt(9,idclientes);
			pst.setInt(10,idagencia);
			pst.setInt(11,idvehiculo);
			pst.setInt(12,idmedios);
			pst.setString(13, precios);
			
					
			//ejecutar la trx
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"Registrado con exito");
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		
	}
	
	
	
	
	
}

package model;

import javax.swing.JOptionPane;

import controler.Conexion;

public class Test {

	public static void main(String[] args) {
		Conexion test = new Conexion();
		
		if (test.conectarBD() != null) {
			JOptionPane.showConfirmDialog(null, "Conectado a la base de datos");
			
		}else {
			JOptionPane.showConfirmDialog(null, "No conectado a la base de datos");
		}
		

	}

}

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;

import model.Vehiculos;

import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmVehiculos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtPuesto;
	private JTextField txtModelo;
	private JTextField txtMotor;
	private JTextField txtIdTipoTransporte;
	private JTextField txtCategoria;
	private static frmVehiculos instancia;
	private JTextField txtidvehiculo;
	Vehiculos cr = new Vehiculos();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVehiculos.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmVehiculos() {
		setResizable(false);
		setTitle("REGISTRO DE VEHICULOS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\autobus.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 323, 543);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);//centrar el formulario
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("REGISTRO DE VEHICULOS");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(76, 21, 155, 14);
		contentPane.add(lblTitle);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(34, 102, 111, 14);
		contentPane.add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPlaca.setBounds(34, 118, 215, 20);
		contentPane.add(txtPlaca);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarca.setBounds(34, 149, 215, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtMarca.setBounds(34, 163, 215, 20);
		contentPane.add(txtMarca);
		
		JLabel lblPuestos = new JLabel("Puestos:");
		lblPuestos.setBounds(34, 194, 215, 14);
		contentPane.add(lblPuestos);
		
		txtPuesto = new JTextField();
		txtPuesto.setColumns(10);
		txtPuesto.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPuesto.setBounds(34, 207, 215, 20);
		contentPane.add(txtPuesto);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(34, 238, 215, 14);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setHorizontalAlignment(SwingConstants.LEFT);
		txtModelo.setColumns(10);
		txtModelo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtModelo.setBounds(34, 251, 215, 20);
		contentPane.add(txtModelo);
		
		JLabel lblMotor = new JLabel("Numero de Motor:");
		lblMotor.setBounds(34, 282, 215, 14);
		contentPane.add(lblMotor);
		
		txtMotor = new JTextField();
		txtMotor.setHorizontalAlignment(SwingConstants.LEFT);
		txtMotor.setColumns(10);
		txtMotor.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtMotor.setBounds(34, 296, 215, 20);
		contentPane.add(txtMotor);
		
		JLabel lblIdTipoTransporte = new JLabel("ID tipo de Transporte:");
		lblIdTipoTransporte.setBounds(34, 367, 215, 14);
		contentPane.add(lblIdTipoTransporte);
		
		txtIdTipoTransporte = new JTextField();
		txtIdTipoTransporte.setHorizontalAlignment(SwingConstants.LEFT);
		txtIdTipoTransporte.setColumns(10);
		txtIdTipoTransporte.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtIdTipoTransporte.setBounds(34, 380, 215, 20);
		contentPane.add(txtIdTipoTransporte);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtPlaca.getText(), txtMarca.getText(), Integer.parseInt (txtPuesto.getText()),  txtModelo.getText(), 
						txtMotor.getText(), txtCategoria.getText(), Integer.parseInt(txtIdTipoTransporte.getText()));
				
				
				
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(83, 431, 123, 32);
		contentPane.add(btnRegistrar);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(33, 325, 215, 14);
		contentPane.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setHorizontalAlignment(SwingConstants.LEFT);
		txtCategoria.setColumns(10);
		txtCategoria.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCategoria.setBounds(33, 339, 215, 20);
		contentPane.add(txtCategoria);
		
		JButton btnMenu = new JButton("");
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
			}
		});
		btnMenu.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\casa.png"));
		btnMenu.setFocusable(false);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu);
		
		JButton btnLimpiar_1 = new JButton("");
		btnLimpiar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtPlaca.setText("");
				txtMarca.setText("");
				txtPuesto.setText("");
				txtModelo.setText("");
				txtMotor.setText("");
				txtCategoria.setText("");
				txtIdTipoTransporte.setText("");
				
				
			}
		});
		btnLimpiar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar_1.setContentAreaFilled(false);
		btnLimpiar_1.setBorder(null);
		btnLimpiar_1.setBackground(new Color(240, 234, 244));
		btnLimpiar_1.setBounds(209, 431, 40, 33);
		contentPane.add(btnLimpiar_1);
		
		JLabel lblIdVehiculos = new JLabel("ID Vehiculo:");
		lblIdVehiculos.setBounds(34, 71, 89, 14);
		contentPane.add(lblIdVehiculos);
		
		txtidvehiculo = new JTextField();
		txtidvehiculo.setColumns(10);
		txtidvehiculo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtidvehiculo.setBounds(127, 68, 46, 20);
		contentPane.add(txtidvehiculo);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidvehiculo.getText()));
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(245, 64, 33, 29);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtidvehiculo.getText()), txtPlaca ,txtMarca,txtPuesto,txtModelo,txtMotor,	txtCategoria,txtIdTipoTransporte);
			}
		});
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\lupa.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(181, 64, 35, 29);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\actualizar.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(214, 64, 35, 29);
		contentPane.add(btnActualizar);

		
		
		addWindowListener(new WindowAdapter() {
		
		public void windowClosing(WindowEvent e) { 

		instancia = null; 

		} 

	}); 

}		 	 
		public static frmVehiculos getInstancia() {// se cambia al nombre correspondiente  

		 if (instancia == null) { 

		 instancia = new frmVehiculos(); 

		 } 

		 return instancia; 

 } 
}

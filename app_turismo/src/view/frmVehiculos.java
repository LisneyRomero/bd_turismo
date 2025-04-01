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
		setTitle("Registro de Vehiculos");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\autobus.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 323, 543);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("REGISTRO DE VEHICULOS");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(76, 21, 155, 14);
		contentPane.add(lblTitle);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setBounds(33, 71, 111, 14);
		contentPane.add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		txtPlaca.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPlaca.setBounds(33, 87, 215, 20);
		contentPane.add(txtPlaca);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarca.setBounds(33, 118, 215, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtMarca.setBounds(33, 132, 215, 20);
		contentPane.add(txtMarca);
		
		JLabel lblPuestos = new JLabel("Puestos:");
		lblPuestos.setBounds(33, 163, 215, 14);
		contentPane.add(lblPuestos);
		
		txtPuesto = new JTextField();
		txtPuesto.setColumns(10);
		txtPuesto.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPuesto.setBounds(33, 176, 215, 20);
		contentPane.add(txtPuesto);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(33, 207, 215, 14);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setHorizontalAlignment(SwingConstants.LEFT);
		txtModelo.setColumns(10);
		txtModelo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtModelo.setBounds(33, 220, 215, 20);
		contentPane.add(txtModelo);
		
		JLabel lblMotor = new JLabel("Numero de Motor:");
		lblMotor.setBounds(33, 251, 215, 14);
		contentPane.add(lblMotor);
		
		txtMotor = new JTextField();
		txtMotor.setHorizontalAlignment(SwingConstants.LEFT);
		txtMotor.setColumns(10);
		txtMotor.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtMotor.setBounds(33, 265, 215, 20);
		contentPane.add(txtMotor);
		
		JLabel lblIdTipoTransporte = new JLabel("ID tipo de Transporte:");
		lblIdTipoTransporte.setBounds(33, 336, 215, 14);
		contentPane.add(lblIdTipoTransporte);
		
		txtIdTipoTransporte = new JTextField();
		txtIdTipoTransporte.setHorizontalAlignment(SwingConstants.LEFT);
		txtIdTipoTransporte.setColumns(10);
		txtIdTipoTransporte.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtIdTipoTransporte.setBounds(33, 349, 215, 20);
		contentPane.add(txtIdTipoTransporte);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Vehiculos cr = new Vehiculos();
				
				cr.create(txtPlaca.getText(), txtMarca.getText(), Integer.parseInt (txtPuesto.getText()),  txtModelo.getText(), 
						txtMotor.getText(), txtCategoria.getText(), Integer.parseInt(txtIdTipoTransporte.getText()));
				
				
				
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\escribir.png"));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(82, 391, 123, 41);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("BORRAR");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
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
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\boton-eliminar.png"));
		btnLimpiar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(88, 443, 111, 33);
		contentPane.add(btnLimpiar);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(32, 294, 215, 14);
		contentPane.add(lblCategoria);
		
		txtCategoria = new JTextField();
		txtCategoria.setHorizontalAlignment(SwingConstants.LEFT);
		txtCategoria.setColumns(10);
		txtCategoria.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCategoria.setBounds(32, 308, 215, 20);
		contentPane.add(txtCategoria);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
				
			}
		});
		btnMenu.setBounds(10, 470, 65, 23);
		contentPane.add(btnMenu);

		
		
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

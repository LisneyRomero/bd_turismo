package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;

import model.Medios;
import model.Promotores;

import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frmPromotores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipoDoc;
	private JTextField txtDoc;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtCorreoCorp;
	private JTextField txtFecha;
	private JTextField txtTelefono;
	private static frmPromotores instancia;
	Promotores cr = new Promotores();
	private JTextField txtidpromotores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPromotores.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmPromotores() {
		setTitle("REGISTRO DE PROMOTORES");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\nueva-cuenta.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setLocationRelativeTo(null);//centrar el formulario

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE PROMOTORES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(99, 33, 235, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbltipoDocumento = new JLabel("Tipo de Documento:");
		lbltipoDocumento.setBounds(42, 89, 155, 14);
		contentPane.add(lbltipoDocumento);
		
		txtTipoDoc = new JTextField();
		txtTipoDoc.setToolTipText("1. Cedula de Ciudadania "
				+ "\r\n2. Cedula de Extrangeria"
				+ "\r\n3. Pasaporte ");
		txtTipoDoc.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTipoDoc.setBounds(42, 102, 155, 20);
		contentPane.add(txtTipoDoc);
		txtTipoDoc.setColumns(10);
		
		JLabel lblDocuemento = new JLabel("Documento:");
		lblDocuemento.setBounds(236, 89, 107, 14);
		contentPane.add(lblDocuemento);
		
		txtDoc = new JTextField();
		txtDoc.setColumns(10);
		txtDoc.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDoc.setBounds(236, 102, 155, 20);
		contentPane.add(txtDoc);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(42, 149, 107, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(42, 162, 155, 20);
		contentPane.add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(236, 149, 107, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtApellido.setBounds(236, 162, 155, 20);
		contentPane.add(txtApellido);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(42, 206, 107, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDireccion.setBounds(42, 219, 155, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblCorreo = new JLabel("Correo Personal:");
		lblCorreo.setBounds(236, 206, 155, 14);
		contentPane.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreo.setBounds(236, 219, 155, 20);
		contentPane.add(txtCorreo);
		
		JLabel lblCorreoCorp = new JLabel("Correo Corporativo:");
		lblCorreoCorp.setBounds(42, 266, 155, 14);
		contentPane.add(lblCorreoCorp);
		
		txtCorreoCorp = new JTextField();
		txtCorreoCorp.setColumns(10);
		txtCorreoCorp.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreoCorp.setBounds(42, 279, 155, 20);
		contentPane.add(txtCorreoCorp);
		
		JLabel lblFecha = new JLabel("Fecha de Nacimiento:");
		lblFecha.setBounds(236, 266, 155, 14);
		contentPane.add(lblFecha);
		
		txtFecha = new JTextField();
		txtFecha.setSelectionColor(new Color(0, 128, 255));
		txtFecha.setToolTipText("AAAA-MM-DD\r\n");
		txtFecha.setColumns(10);
		txtFecha.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtFecha.setBounds(236, 279, 155, 20);
		contentPane.add(txtFecha);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(42, 321, 155, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTelefono.setBounds(42, 334, 155, 20);
		contentPane.add(txtTelefono);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				cr.create(Integer.parseInt(txtTipoDoc.getText()), Integer.parseInt(txtDoc.getText())  ,  txtNombre.getText()
						,  txtApellido.getText(),txtDireccion.getText(),  txtCorreo.getText(),  txtCorreoCorp.getText()
						,  txtFecha.getText(),  txtTelefono.getText());	
				
				
				
			}
		});
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.setBounds(149, 378, 123, 33);
		contentPane.add(btnRegistrar);
		
		JButton btnMenu_1 = new JButton("");
		btnMenu_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\casa.png"));
		btnMenu_1.setFocusable(false);
		btnMenu_1.setContentAreaFilled(false);
		btnMenu_1.setBorder(null);
		btnMenu_1.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu_1);
		
		JButton btnLimpiar_1 = new JButton("");
		btnLimpiar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtTipoDoc.setText("");
				txtDoc.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtCorreoCorp.setText("");
				txtFecha.setText("");
				txtTelefono.setText("");
				
				
				
			}
		});
		btnLimpiar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar_1.setContentAreaFilled(false);
		btnLimpiar_1.setBorder(null);
		btnLimpiar_1.setBackground(new Color(240, 234, 244));
		btnLimpiar_1.setBounds(274, 378, 40, 33);
		contentPane.add(btnLimpiar_1);
		
		JLabel lblCodigo = new JLabel("ID Promotores:");
		lblCodigo.setBounds(21, 432, 93, 14);
		contentPane.add(lblCodigo);
		
		txtidpromotores = new JTextField();
		txtidpromotores.setColumns(10);
		txtidpromotores.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtidpromotores.setBounds(119, 428, 46, 20);
		contentPane.add(txtidpromotores);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidpromotores.getText()));
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(165, 422, 40, 29);
		contentPane.add(btnEliminar);
	
		
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmPromotores getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmPromotores(); 

			 } 

			 return instancia; 

	 } 
			
}
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\agregar-contacto.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

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
		txtTipoDoc.setToolTipText("Colocar el numero correspondiente:\r\n"
				+ "\r\n1. Cedula de Ciudadania "
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
				
				Promotores cr = new Promotores();
				
				cr.create(Integer.parseInt(txtTipoDoc.getText()), Integer.parseInt(txtDoc.getText())  ,  txtNombre.getText()
						,  txtApellido.getText(),txtDireccion.getText(),  txtCorreo.getText(),  txtCorreoCorp.getText()
						,  txtFecha.getText(),  txtTelefono.getText());	
				
				
				
			}
		});
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\escribir.png"));
		btnRegistrar.setBounds(155, 404, 123, 41);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("BORRAR");
		btnLimpiar.addMouseListener(new MouseAdapter() {
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
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\boton-eliminar.png"));
		btnLimpiar.setBounds(161, 456, 111, 33);
		contentPane.add(btnLimpiar);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
				
			}
		});
		btnMenu.setBounds(23, 478, 89, 23);
		contentPane.add(btnMenu);
	
		
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
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import model.Clientes;
import model.Tipomedio;

import java.awt.Component;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipo;
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtEps;
	private JTextField txtAlergias;
	private JTextField txtFecha;
	private JTextField txtCorreo;
	private JTextField txtEstado;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private static frmClientes instancia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClientes.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmClientes() {
		
		
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\nueva-cuenta.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistro = new JLabel("REGISTRO DE CLIENTES ");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setBounds(91, 23, 179, 25);
		contentPane.add(lblRegistro);
		
		JLabel lblTipo = new JLabel("Tipo de Documento:");
		lblTipo.setBounds(25, 81, 120, 14);
		contentPane.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTipo.setBounds(25, 98, 281, 20);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Numero de Documento:");
		lblDocumento.setBounds(25, 129, 140, 14);
		contentPane.add(lblDocumento);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDocumento.setBounds(25, 146, 281, 20);
		contentPane.add(txtDocumento);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(25, 183, 140, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(25, 196, 281, 20);
		contentPane.add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(25, 227, 149, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtApellido.setBounds(25, 240, 281, 20);
		contentPane.add(txtApellido);
		
		JLabel lblEps = new JLabel("EPS:");
		lblEps.setBounds(25, 271, 149, 14);
		contentPane.add(lblEps);
		
		txtEps = new JTextField();
		txtEps.setColumns(10);
		txtEps.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtEps.setBounds(25, 284, 281, 20);
		contentPane.add(txtEps);
		
		JLabel lblAlergias = new JLabel("Alergias:");
		lblAlergias.setBounds(25, 315, 149, 14);
		contentPane.add(lblAlergias);
		
		txtAlergias = new JTextField();
		txtAlergias.setColumns(10);
		txtAlergias.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtAlergias.setBounds(25, 328, 281, 20);
		contentPane.add(txtAlergias);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento (AAAA-MM-DD):");
		lblFechaDeNacimiento.setBounds(25, 358, 281, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtFecha.setBounds(25, 371, 281, 20);
		contentPane.add(txtFecha);
		
		JLabel lblCorreo = new JLabel("Correo Electronico:");
		lblCorreo.setBounds(25, 402, 149, 14);
		contentPane.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreo.setBounds(25, 415, 281, 20);
		contentPane.add(txtCorreo);
		
		JLabel lblEstado = new JLabel("Estado Civil:");
		lblEstado.setBounds(25, 446, 149, 14);
		contentPane.add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtEstado.setBounds(25, 459, 281, 20);
		contentPane.add(txtEstado);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(25, 490, 149, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTelefono.setBounds(25, 503, 281, 20);
		contentPane.add(txtTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(25, 534, 149, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDireccion.setBounds(25, 547, 281, 20);
		contentPane.add(txtDireccion);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Clientes cr = new Clientes();
				cr.create(  txtTipo.getText(), Integer.parseInt(txtDocumento.getText()),txtNombre.getText(), txtApellido.getText(), txtEps.getText(), txtAlergias.getText(),
						txtFecha.getText(), txtCorreo.getText(),  txtEstado.getText(),txtTelefono.getText(), txtDireccion.getText());
			
				
				
			}
		});
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\escribir.png"));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBounds(125, 607, 110, 32);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("BORRAR");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 txtTipo.setText("");
				 txtDocumento.setText("");
				 txtNombre.setText("");
				 txtApellido.setText("");
				 txtEps.setText("");
				 txtAlergias.setText("");
				 txtFecha.setText("");
				 txtCorreo.setText("");
				 txtEstado.setText("");
				 txtTelefono.setText("");
				 txtDireccion.setText("");
				
				
			}
		});
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\boton-eliminar.png"));
		btnLimpiar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(134, 640, 93, 29);
		contentPane.add(btnLimpiar);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
				
			}
		});
		btnMenu.setBounds(10, 657, 89, 23);
		contentPane.add(btnMenu);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblRegistro, lblTipo, txtTipo, lblDocumento, txtDocumento, lblNewLabel_1, txtNombre, lblApellido, txtApellido, lblEps, txtEps, lblAlergias, txtAlergias, lblFechaDeNacimiento, txtFecha, lblCorreo, txtCorreo, lblEstado, txtEstado, lblTelefono, txtTelefono, lblDireccion, txtDireccion, btnRegistrar, btnLimpiar, btnMenu}));
	
		
		
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmClientes getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmClientes(); 

			 } 

			 return instancia; 

	 } 
			
}
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import model.Operadores;
import model.Promotores;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipoDoc;
	private JTextField txtDocumento;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtIdVehiculo;
	private JTextField txtTelefono;
	private static frmOperadores instancia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmOperadores.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmOperadores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\agregar-contacto.png"));
		setTitle("Registro de Operadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 464);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("REGISTRO DE OPERADORES");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(117, 38, 201, 14);
		contentPane.add(lblTitle);
		
		JLabel lbltipoDocumento = new JLabel("Tipo de Documento:");
		lbltipoDocumento.setBounds(43, 90, 155, 14);
		contentPane.add(lbltipoDocumento);
		
		txtTipoDoc = new JTextField();
		txtTipoDoc.setToolTipText("");
		txtTipoDoc.setColumns(10);
		txtTipoDoc.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTipoDoc.setBounds(43, 103, 155, 20);
		contentPane.add(txtTipoDoc);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(237, 90, 107, 14);
		contentPane.add(lblDocumento);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDocumento.setBounds(237, 103, 155, 20);
		contentPane.add(txtDocumento);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(43, 150, 107, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(43, 163, 155, 20);
		contentPane.add(txtNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(237, 150, 107, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtApellido.setBounds(237, 163, 155, 20);
		contentPane.add(txtApellido);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(43, 207, 107, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDireccion.setBounds(43, 220, 155, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblCorreo = new JLabel("Correo Personal:");
		lblCorreo.setBounds(237, 207, 155, 14);
		contentPane.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreo.setBounds(237, 220, 155, 20);
		contentPane.add(txtCorreo);
		
		JLabel lblIdvehiculo = new JLabel("ID vehiculo");
		lblIdvehiculo.setBounds(237, 267, 155, 14);
		contentPane.add(lblIdvehiculo);
		
		txtIdVehiculo = new JTextField();
		txtIdVehiculo.setToolTipText("AAAA-MM-DD\r\n");
		txtIdVehiculo.setSelectionColor(new Color(0, 128, 255));
		txtIdVehiculo.setColumns(10);
		txtIdVehiculo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtIdVehiculo.setBounds(237, 280, 155, 20);
		contentPane.add(txtIdVehiculo);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(43, 267, 155, 14);
		contentPane.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTelefono.setBounds(43, 280, 155, 20);
		contentPane.add(txtTelefono);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				

				Operadores cr = new Operadores();
				
				cr.create(txtTipoDoc.getText(), txtDocumento.getText()  ,  txtNombre.getText()
						,  txtApellido.getText(),txtDireccion.getText(),  txtCorreo.getText(), 
						   txtTelefono.getText(), Integer.parseInt(txtIdVehiculo.getText()));
				
				
				
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\escribir.png"));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(156, 325, 123, 41);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("BORRAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtTipoDoc.setText("");
				txtDocumento.setText("");
				txtNombre.setText("");
				txtApellido.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtTelefono.setText("");
				txtIdVehiculo.setText("");
				
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\boton-eliminar.png"));
		btnLimpiar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(162, 377, 111, 33);
		contentPane.add(btnLimpiar);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				frmMenu.getInstancia().setVisible(true);
				
			}
		});
		btnMenu.setBounds(23, 391, 89, 23);
		contentPane.add(btnMenu);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblTitle, lbltipoDocumento, txtTipoDoc, lblDocumento, txtDocumento, lblNombre, txtNombre, lblApellido, txtApellido, lblDireccion, txtDireccion, lblCorreo, txtCorreo, txtTelefono, lblTelefono, lblIdvehiculo, txtIdVehiculo, btnRegistrar, btnLimpiar, btnMenu}));
	
		
		
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmOperadores getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmOperadores(); 

			 } 

			 return instancia; 

	 } 
			
}
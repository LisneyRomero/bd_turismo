package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;

import model.Agencias;
import model.Tipomedio;

import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class frmAgencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtWeb;
	private JTextField txtCompania;
	private static frmAgencias instancia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAgencias.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmAgencias() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\agencia-de-viajes.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 339, 518);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltITitle = new JLabel("REGISTRO DE AGENCIAS");
		lbltITitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltITitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbltITitle.setBounds(60, 33, 201, 39);
		contentPane.add(lbltITitle);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(37, 101, 111, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(37, 117, 215, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefono:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(37, 148, 215, 14);
		contentPane.add(lblNewLabel);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTelefono.setBounds(37, 162, 215, 20);
		contentPane.add(txtTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(37, 193, 215, 14);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDireccion.setBounds(37, 206, 215, 20);
		contentPane.add(txtDireccion);
		
		JLabel lblCorreo = new JLabel("Correo Electronico:");
		lblCorreo.setBounds(37, 237, 215, 14);
		contentPane.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setHorizontalAlignment(SwingConstants.LEFT);
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreo.setBounds(37, 250, 215, 20);
		contentPane.add(txtCorreo);
		
		JLabel lblWeb = new JLabel("Pagina Web:");
		lblWeb.setBounds(37, 281, 215, 14);
		contentPane.add(lblWeb);
		
		txtWeb = new JTextField();
		txtWeb.setHorizontalAlignment(SwingConstants.LEFT);
		txtWeb.setColumns(10);
		txtWeb.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtWeb.setBounds(37, 295, 215, 20);
		contentPane.add(txtWeb);
		
		JLabel lblIdCompania = new JLabel("Compañia:");
		lblIdCompania.setBounds(37, 326, 215, 14);
		contentPane.add(lblIdCompania);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\escribir.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Agencias cr = new Agencias();
				
				cr.create(txtNombre.getText(),txtTelefono.getText(),txtDireccion.getText(),txtCorreo.getText(),txtWeb.getText(),Integer.parseInt(txtCompania.getText()));
		
			
				
				
			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBounds(111, 389, 101, 29);
		contentPane.add(btnRegistrar);
		
		txtCompania = new JTextField();
		txtCompania.setHorizontalAlignment(SwingConstants.LEFT);
		txtCompania.setColumns(10);
		txtCompania.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCompania.setBounds(37, 339, 215, 20);
		contentPane.add(txtCompania);
		
		JButton btnLimpiar = new JButton("BORRAR");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNombre.setText("");
				txtTelefono.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtWeb.setText("");
				txtCompania.setText("");
				
				
				
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\boton-eliminar.png"));
		btnLimpiar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(116, 422, 91, 29);
		contentPane.add(btnLimpiar);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
				
			}
		});
		btnMenu.setBounds(17, 445, 89, 23);
		contentPane.add(btnMenu);
		
		
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmAgencias getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmAgencias(); 

			 } 

			 return instancia; 

	 } 
			
}
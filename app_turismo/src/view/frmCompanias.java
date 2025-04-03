package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;

import model.Companias;
import model.Tipomedio;

import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;

public class frmCompanias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtCorreo;
	private JTextField txtFechaCreacion;
	private JTextField txtWeb;
	private JButton btnResgistrar;
	private JButton btnLimpiar;
	private static frmCompanias instancia;
	Companias cr = new Companias();
	private JButton btnMenu;
	private JLabel lblidCompanias;
	private JTextField txtidcompanias;
	private JButton btnEliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCompanias.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmCompanias() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\centro-de-negocios.png"));
		setTitle("REGISTRO DE COMPAÑIAS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 542);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreComp = new JLabel("Nombre Compañia:");
		lblNombreComp.setBounds(34, 114, 144, 14);
		contentPane.add(lblNombreComp);
		
		txtNombre = new JTextField();
		txtNombre.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setForeground(new Color(0, 0, 0));
		txtNombre.setBounds(34, 128, 267, 27);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblTelefonocompanias = new JLabel("Telefono: ");
		lblTelefonocompanias.setBounds(34, 166, 102, 14);
		contentPane.add(lblTelefonocompanias);
		
		JLabel lblDireccionComp = new JLabel("Direccion:");
		lblDireccionComp.setBounds(34, 219, 102, 14);
		contentPane.add(lblDireccionComp);
		
		JLabel lblCorreoComp = new JLabel("Correo Electronico:");
		lblCorreoComp.setBounds(34, 272, 165, 14);
		contentPane.add(lblCorreoComp);
		
		JLabel lblWebComp = new JLabel("Pagina Web:");
		lblWebComp.setBounds(34, 383, 102, 14);
		contentPane.add(lblWebComp);
		
		JLabel lblFechacComp = new JLabel("Fecha de Creacion:");
		lblFechacComp.setBounds(34, 323, 144, 14);
		contentPane.add(lblFechacComp);
		
		txtTelefono = new JTextField();
		txtTelefono.setForeground(Color.BLACK);
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTelefono.setBounds(34, 181, 267, 27);
		contentPane.add(txtTelefono);
		
		txtDireccion = new JTextField();
		txtDireccion.setForeground(Color.BLACK);
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDireccion.setBounds(34, 234, 267, 27);
		contentPane.add(txtDireccion);
		
		txtCorreo = new JTextField();
		txtCorreo.setForeground(Color.BLACK);
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreo.setBounds(34, 285, 267, 27);
		contentPane.add(txtCorreo);
		
		txtFechaCreacion = new JTextField();
		txtFechaCreacion.setToolTipText("AAAA-MM-DD\r\n");
		txtFechaCreacion.setForeground(Color.BLACK);
		txtFechaCreacion.setColumns(10);
		txtFechaCreacion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtFechaCreacion.setBounds(34, 340, 267, 27);
		contentPane.add(txtFechaCreacion);
		
		txtWeb = new JTextField();
		txtWeb.setForeground(Color.BLACK);
		txtWeb.setColumns(10);
		txtWeb.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtWeb.setBounds(34, 398, 267, 27);
		contentPane.add(txtWeb);
		
		btnResgistrar = new JButton("REGISTRAR");
		btnResgistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnResgistrar.setBackground(new Color(240, 234, 244));
		btnResgistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnResgistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnResgistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtNombre.getText(), txtTelefono.getText(),txtDireccion.getText(),txtCorreo.getText(),txtFechaCreacion.getText(), txtWeb.getText());
				
			}
		});
		btnResgistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnResgistrar.setBounds(108, 436, 115, 32);
		contentPane.add(btnResgistrar);
		
		JLabel lblNewLabel = new JLabel("REGISTRO DE COMPAÑIAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(60, 11, 211, 36);
		contentPane.add(lblNewLabel);
		
		btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
							
				
				txtNombre.setText("");
				txtTelefono.setText("");
				txtDireccion.setText("");
				txtCorreo.setText("");
				txtFechaCreacion.setText("");
				txtWeb.setText("");
			}
		});
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(230, 439, 40, 27);
		btnLimpiar.setContentAreaFilled(false);
		contentPane.add(btnLimpiar);
		
		btnMenu = new JButton("");
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
			}
		});
		btnMenu.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\casa.png"));
		btnMenu.setFocusable(false);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu);
		
		lblidCompanias = new JLabel("ID Compañia:");
		lblidCompanias.setBounds(34, 77, 78, 14);
		contentPane.add(lblidCompanias);
		
		txtidcompanias = new JTextField();
		txtidcompanias.setColumns(10);
		txtidcompanias.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtidcompanias.setBounds(113, 74, 46, 20);
		contentPane.add(txtidcompanias);
		
		btnEliminar = new JButton("");
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidcompanias.getText()));
				
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(204, 69, 40, 29);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.update(Integer.parseInt(txtidcompanias.getText()),txtNombre.getText(), txtTelefono.getText(),txtDireccion.getText(),txtCorreo.getText(),txtFechaCreacion.getText(), txtWeb.getText());
				
				
				
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\actualizar.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(167, 69, 40, 29);
		contentPane.add(btnActualizar);
	
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmCompanias getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmCompanias(); 

			 } 

			 return instancia; 

	 } 
}
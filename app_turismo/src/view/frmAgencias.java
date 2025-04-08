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
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
	private JTextField txtidagencia;
	Agencias cr = new Agencias();

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
		setTitle("REGISTRO DE AGENCIAS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\agencia-de-viajes.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 292, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));

		this.setLocationRelativeTo(null);
		this.setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbltITitle = new JLabel("REGISTRO DE AGENCIAS");
		lbltITitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltITitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbltITitle.setBounds(37, 33, 201, 39);
		contentPane.add(lbltITitle);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(31, 117, 111, 14);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(31, 133, 215, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblNewLabel = new JLabel("Telefono:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(31, 164, 215, 14);
		contentPane.add(lblNewLabel);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTelefono.setBounds(31, 178, 215, 20);
		contentPane.add(txtTelefono);

		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(31, 209, 215, 14);
		contentPane.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDireccion.setBounds(31, 222, 215, 20);
		contentPane.add(txtDireccion);

		JLabel lblCorreo = new JLabel("Correo Electronico:");
		lblCorreo.setBounds(31, 253, 215, 14);
		contentPane.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setHorizontalAlignment(SwingConstants.LEFT);
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreo.setBounds(31, 266, 215, 20);
		contentPane.add(txtCorreo);

		JLabel lblWeb = new JLabel("Pagina Web:");
		lblWeb.setBounds(31, 297, 215, 14);
		contentPane.add(lblWeb);

		txtWeb = new JTextField();
		txtWeb.setHorizontalAlignment(SwingConstants.LEFT);
		txtWeb.setColumns(10);
		txtWeb.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtWeb.setBounds(31, 311, 215, 20);
		contentPane.add(txtWeb);

		JLabel lblIdCompania = new JLabel("Compañia:");
		lblIdCompania.setBounds(31, 342, 215, 14);
		contentPane.add(lblIdCompania);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.create(txtNombre.getText(), txtTelefono.getText(), txtDireccion.getText(), txtCorreo.getText(),
						txtWeb.getText(), Integer.parseInt(txtCompania.getText()));

			}
		});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBounds(87, 386, 101, 29);
		contentPane.add(btnRegistrar);

		txtCompania = new JTextField();
		txtCompania.setHorizontalAlignment(SwingConstants.LEFT);
		txtCompania.setColumns(10);
		txtCompania.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCompania.setBounds(31, 355, 215, 20);
		contentPane.add(txtCompania);

		JButton btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		btnLimpiar.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar.setBorder(null);
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(190, 386, 46, 29);
		contentPane.add(btnLimpiar);

		JButton btnMenu = new JButton("");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenu.setFocusable(false);
		btnMenu.setBorder(null);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\casa.png"));
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmMenu.getInstancia().setVisible(true);

			}
		});
		btnMenu.setBounds(2, 2, 40, 39);
		contentPane.add(btnMenu);

		JLabel lblidAgencia = new JLabel("ID Agencia: ");
		lblidAgencia.setBounds(31, 92, 69, 14);
		contentPane.add(lblidAgencia);

		txtidagencia = new JTextField();
		txtidagencia.setColumns(10);
		txtidagencia.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtidagencia.setBounds(102, 89, 46, 20);
		contentPane.add(txtidagencia);

		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// invocar metodo para eliminar registro

				cr.delete(Integer.parseInt(txtidagencia.getText()));

			}
		});
		btnEliminar.setBorder(null);
		btnEliminar.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setBounds(216, 83, 35, 29);
		btnEliminar.setContentAreaFilled(false);
		contentPane.add(btnEliminar);
		
		JButton btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.read(Integer.parseInt(txtidagencia.getText()),txtNombre, txtTelefono, txtDireccion, txtCorreo,
						txtWeb, txtCompania);

				
			}
		});
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\lupa.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(149, 83, 35, 29);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.setBorderPainted(false);
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.update(Integer.parseInt(txtidagencia.getText()),txtNombre.getText(), txtTelefono.getText(), txtDireccion.getText(), txtCorreo.getText(),
						txtWeb.getText(), Integer.parseInt(txtCompania.getText()));
			}
		});
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\actualizar.png"));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(183, 83, 35, 29);
		contentPane.add(btnActualizar);

		// permite que la ventana pueda abrirse nuevamente
		addWindowListener(new WindowAdapter() { 

			public void windowClosing(WindowEvent e) {
				//cuando se cierra la ventana, se libera la instanciapara permitir su reapertura 
				instancia = null;

			}

		});

	}
	//metodo singleton para que solo haya una instancia activa a la vez 
	public static frmAgencias getInstancia() {

		//Si no existe una instancia se crea una nueva 
		if (instancia == null) {
			instancia = new frmAgencias();

		}
		//Retorna la unica instancia disponible
		return instancia;

	}
}
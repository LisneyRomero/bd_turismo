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
	Clientes cr = new Clientes();
	private JTextField txtidclientes;

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
		setTitle("REGISTRO CLIENTES");

		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource//agregar-contacto.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 362, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblRegistro = new JLabel("REGISTRO DE CLIENTES ");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setBounds(91, 23, 179, 25);
		contentPane.add(lblRegistro);

		JLabel lblTipo = new JLabel("Tipo de Documento:");
		lblTipo.setBounds(23, 99, 120, 14);
		contentPane.add(lblTipo);

		txtTipo = new JTextField();
		txtTipo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTipo.setBounds(23, 116, 281, 20);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);

		JLabel lblDocumento = new JLabel("Numero de Documento:");
		lblDocumento.setBounds(23, 147, 140, 14);
		contentPane.add(lblDocumento);

		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDocumento.setBounds(23, 164, 281, 20);
		contentPane.add(txtDocumento);

		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(23, 201, 140, 14);
		contentPane.add(lblNewLabel_1);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(23, 214, 281, 20);
		contentPane.add(txtNombre);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(23, 245, 149, 14);
		contentPane.add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtApellido.setBounds(23, 258, 281, 20);
		contentPane.add(txtApellido);

		JLabel lblEps = new JLabel("EPS:");
		lblEps.setBounds(23, 289, 149, 14);
		contentPane.add(lblEps);

		txtEps = new JTextField();
		txtEps.setColumns(10);
		txtEps.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtEps.setBounds(23, 302, 281, 20);
		contentPane.add(txtEps);

		JLabel lblAlergias = new JLabel("Alergias:");
		lblAlergias.setBounds(23, 333, 149, 14);
		contentPane.add(lblAlergias);

		txtAlergias = new JTextField();
		txtAlergias.setColumns(10);
		txtAlergias.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtAlergias.setBounds(23, 346, 281, 20);
		contentPane.add(txtAlergias);

		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento (AAAA-MM-DD):");
		lblFechaDeNacimiento.setBounds(23, 376, 281, 14);
		contentPane.add(lblFechaDeNacimiento);

		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		txtFecha.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtFecha.setBounds(23, 389, 281, 20);
		contentPane.add(txtFecha);

		JLabel lblCorreo = new JLabel("Correo Electronico:");
		lblCorreo.setBounds(23, 420, 149, 14);
		contentPane.add(lblCorreo);

		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCorreo.setBounds(23, 433, 281, 20);
		contentPane.add(txtCorreo);

		JLabel lblEstado = new JLabel("Estado Civil:");
		lblEstado.setBounds(23, 464, 149, 14);
		contentPane.add(lblEstado);

		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtEstado.setBounds(23, 477, 281, 20);
		contentPane.add(txtEstado);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(23, 508, 149, 14);
		contentPane.add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTelefono.setBounds(23, 521, 281, 20);
		contentPane.add(txtTelefono);

		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(23, 552, 149, 14);
		contentPane.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDireccion.setBounds(23, 565, 281, 20);
		contentPane.add(txtDireccion);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Registrar nuevos datos en la base de datos
				cr.create(txtTipo.getText(), Integer.parseInt(txtDocumento.getText()), txtNombre.getText(),
						txtApellido.getText(), txtEps.getText(), txtAlergias.getText(), txtFecha.getText(),
						txtCorreo.getText(), txtEstado.getText(), txtTelefono.getText(), txtDireccion.getText());

			}
		});
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setIcon(new ImageIcon(getClass().getResource("/resource//registro.png")));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBounds(118, 603, 110, 32);
		contentPane.add(btnRegistrar);

		JButton btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Limpiar los campos de texto
				txtidclientes.setText("");
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
		btnLimpiar.setIcon(new ImageIcon(getClass().getResource("/resource//rechazado.png")));
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(227, 605, 34, 29);
		btnLimpiar.setContentAreaFilled(false);
		contentPane.add(btnLimpiar);

		JButton btnMenu = new JButton("");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmMenu.getInstancia().setVisible(true); // llamar al menu

			}
		});
		btnMenu.setIcon(new ImageIcon(getClass().getResource("/resource//casa.png")));
		btnMenu.setFocusable(false);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu);

		JLabel lblidClientes = new JLabel("ID Clientes: ");
		lblidClientes.setBounds(23, 68, 69, 14);
		contentPane.add(lblidClientes);

		txtidclientes = new JTextField();
		txtidclientes.setColumns(10);
		txtidclientes.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtidclientes.setBounds(94, 65, 46, 20);
		contentPane.add(txtidclientes);

		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.delete(Integer.parseInt(txtidclientes.getText()));// borrar en la base de datos

			}
		});
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setIcon(new ImageIcon(getClass().getResource("/resource//borrar.png")));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(221, 59, 34, 29);
		contentPane.add(btnEliminar);

		JButton btnConsultar = new JButton("");
		btnConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// consultar en la base de datos
				cr.read(Integer.parseInt(txtidclientes.getText()), txtTipo, txtDocumento, txtNombre, txtApellido,
						txtEps, txtAlergias, txtFecha, txtCorreo, txtEstado, txtTelefono, txtDireccion);

			}
		});
		btnConsultar.setIcon(new ImageIcon(getClass().getResource("/resource//lupa.png")));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(146, 59, 35, 29);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Actualizar datos de la base de datos
				cr.update(Integer.parseInt(txtidclientes.getText()),txtTipo.getText(), Integer.parseInt(txtDocumento.getText()), txtNombre.getText(),
						txtApellido.getText(), txtEps.getText(), txtAlergias.getText(), txtFecha.getText(),
						txtCorreo.getText(), txtEstado.getText(), txtTelefono.getText(), txtDireccion.getText());
				
				
			}
		});
		btnActualizar.setIcon(new ImageIcon(getClass().getResource("/resource//actualizar.png")));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(181, 59, 35, 29);
		contentPane.add(btnActualizar);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblRegistro, lblTipo, txtTipo, lblDocumento, txtDocumento, lblNewLabel_1, txtNombre, lblApellido, txtApellido, lblEps, txtEps, lblAlergias, txtAlergias, lblFechaDeNacimiento, txtFecha, lblCorreo, txtCorreo, lblEstado, txtEstado, lblTelefono, txtTelefono, lblDireccion, txtDireccion, btnRegistrar, btnLimpiar, btnMenu, lblidClientes, txtidclientes, btnEliminar, btnConsultar, btnActualizar}));

		// permite que la ventana pueda abrirse nuevamente
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				// cuando se cierra la ventana, se libera la instanciapara permitir su
				// reapertura
				instancia = null;

			}

		});

	}

	// metodo singleton para que solo haya una instancia activa a la vez
	public static frmClientes getInstancia() {

		// Si no existe una instancia se crea una nueva
		if (instancia == null) {
			instancia = new frmClientes();

		}
		// Retorna la unica instancia disponible
		return instancia;

	}

}
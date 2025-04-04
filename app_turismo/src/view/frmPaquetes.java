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

import model.Paquetes;

import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class frmPaquetes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDestino;
	private JTextField txtOrigen;
	private JTextField txtVenta;
	private JTextField txtHoraVenta;
	private JTextField txtSalida;
	private JTextField txtEjecucion;
	private JTextField txtPromotores;
	private JTextField txtCliente;
	private JTextField txtAgencia;
	private JTextField txtVehiculo;
	private JTextField txtMedio;
	private JTextField txtPrecio;
	private static frmPaquetes instancia;
	Paquetes cr = new Paquetes();
	private JTextField txtcodigo;
	private JTextArea txtaObservaciones;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPaquetes.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmPaquetes() {
		setTitle("PAQUETES DE VIAJE");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\plano-alt.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 526, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);// centrar el formulario
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("PAQUETES DE VIAJE");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(150, 35, 209, 25);
		contentPane.add(lblTitle);

		JLabel lblidDestino = new JLabel("ID Destino:");
		lblidDestino.setBounds(27, 144, 77, 14);
		contentPane.add(lblidDestino);

		txtDestino = new JTextField();
		txtDestino.setColumns(10);
		txtDestino.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDestino.setBounds(137, 141, 36, 20);
		contentPane.add(txtDestino);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Registrar nuevos datos en la base de datos
				cr.create(Integer.parseInt(txtDestino.getText()), Integer.parseInt(txtOrigen.getText()),
						txtVenta.getText(), txtHoraVenta.getText(), txtSalida.getText(), txtEjecucion.getText(),
						txtaObservaciones.getText(), Integer.parseInt(txtPromotores.getText()),
						Integer.parseInt(txtCliente.getText()), Integer.parseInt(txtAgencia.getText()),
						Integer.parseInt(txtVehiculo.getText()), Integer.parseInt(txtMedio.getText()),
						txtPrecio.getText());

			}
		});
		btnRegistrar.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(193, 365, 123, 33);
		contentPane.add(btnRegistrar);

		JLabel lblidOrigen = new JLabel("ID Origen:");
		lblidOrigen.setBounds(27, 175, 77, 14);
		contentPane.add(lblidOrigen);

		txtOrigen = new JTextField();
		txtOrigen.setColumns(10);
		txtOrigen.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtOrigen.setBounds(137, 172, 36, 20);
		contentPane.add(txtOrigen);

		JLabel lblVenta = new JLabel("Fecha Venta:");
		lblVenta.setBounds(237, 144, 77, 14);
		contentPane.add(lblVenta);

		txtVenta = new JTextField();
		txtVenta.setColumns(10);
		txtVenta.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtVenta.setBounds(359, 141, 111, 20);
		contentPane.add(txtVenta);

		JLabel lblHoraVenta = new JLabel("Hora de Venta:");
		lblHoraVenta.setBounds(237, 175, 89, 14);
		contentPane.add(lblHoraVenta);

		txtHoraVenta = new JTextField();
		txtHoraVenta.setColumns(10);
		txtHoraVenta.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtHoraVenta.setBounds(359, 172, 111, 20);
		contentPane.add(txtHoraVenta);

		JLabel lblSalida = new JLabel("Hora de Salida:");
		lblSalida.setBounds(237, 206, 89, 14);
		contentPane.add(lblSalida);

		txtSalida = new JTextField();
		txtSalida.setColumns(10);
		txtSalida.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtSalida.setBounds(359, 203, 111, 20);
		contentPane.add(txtSalida);

		JLabel lblEjecucion = new JLabel("Fecha de Ejecucion:");
		lblEjecucion.setBounds(237, 234, 123, 14);
		contentPane.add(lblEjecucion);

		txtEjecucion = new JTextField();
		txtEjecucion.setColumns(10);
		txtEjecucion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtEjecucion.setBounds(359, 231, 111, 20);
		contentPane.add(txtEjecucion);

		JLabel lblPromotores = new JLabel("ID Promotores:");
		lblPromotores.setBounds(27, 203, 77, 14);
		contentPane.add(lblPromotores);

		txtPromotores = new JTextField();
		txtPromotores.setColumns(10);
		txtPromotores.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPromotores.setBounds(137, 200, 36, 20);
		contentPane.add(txtPromotores);

		JLabel lblCliente = new JLabel("ID Cliente:");
		lblCliente.setBounds(27, 231, 77, 14);
		contentPane.add(lblCliente);

		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCliente.setBounds(137, 228, 36, 20);
		contentPane.add(txtCliente);

		JLabel lblidAgencia = new JLabel("ID Agencia:");
		lblidAgencia.setBounds(27, 259, 77, 14);
		contentPane.add(lblidAgencia);

		txtAgencia = new JTextField();
		txtAgencia.setColumns(10);
		txtAgencia.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtAgencia.setBounds(137, 256, 36, 20);
		contentPane.add(txtAgencia);

		JLabel lblidVehiculo = new JLabel("ID Vehiculo:");
		lblidVehiculo.setBounds(27, 287, 77, 14);
		contentPane.add(lblidVehiculo);

		txtVehiculo = new JTextField();
		txtVehiculo.setColumns(10);
		txtVehiculo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtVehiculo.setBounds(137, 284, 36, 20);
		contentPane.add(txtVehiculo);

		JLabel lblidMedios = new JLabel("ID Medios:");
		lblidMedios.setBounds(27, 315, 77, 14);
		contentPane.add(lblidMedios);

		txtMedio = new JTextField();
		txtMedio.setColumns(10);
		txtMedio.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtMedio.setBounds(137, 312, 36, 20);
		contentPane.add(txtMedio);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(237, 262, 123, 14);
		contentPane.add(lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPrecio.setBounds(359, 259, 111, 20);
		contentPane.add(txtPrecio);

		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(237, 290, 123, 14);
		contentPane.add(lblObservaciones);

		JTextArea txtaObservaciones = new JTextArea();
		txtaObservaciones.setLineWrap(true);
		txtaObservaciones.setBounds(359, 285, 111, 44);
		contentPane.add(txtaObservaciones);
		
		
		
		JButton btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Limpiar campos del formulario
				txtDestino.setText("");
				txtOrigen.setText("");
				txtVenta.setText("");
				txtHoraVenta.setText("");
				txtSalida.setText("");
				txtEjecucion.setText("");
				txtaObservaciones.setText("");
				txtPromotores.setText("");
				txtCliente.setText("");
				txtAgencia.setText("");
				txtVehiculo.setText("");
				txtMedio.setText("");
				txtPrecio.setText("");

			}
		});
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(319, 366, 40, 33);
		contentPane.add(btnLimpiar);

		JButton btnMenu = new JButton("");
		btnMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmMenu.getInstancia().setVisible(true);// Llamar a la base de datos

			}
		});
		btnMenu.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\casa.png"));
		btnMenu.setFocusable(false);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(27, 108, 53, 14);
		contentPane.add(lblCodigo);

		txtcodigo = new JTextField();
		txtcodigo.setColumns(10);
		txtcodigo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtcodigo.setBounds(80, 105, 46, 20);
		contentPane.add(txtcodigo);

		JButton btnEliminar = new JButton("");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Eliminar de la base de datos
				cr.delete(Integer.parseInt(txtcodigo.getText()));

			}
		});
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(174, 101, 40, 29);
		contentPane.add(btnEliminar);

		JButton btnConsultar = new JButton("");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Consultar datos de la base de datos
				cr.read(Integer.parseInt(txtcodigo.getText()), txtDestino, txtOrigen, txtVenta, txtHoraVenta,
						txtSalida, txtEjecucion, txtaObservaciones, txtPromotores, txtCliente, txtAgencia, txtVehiculo,
						txtMedio, txtPrecio);

			}
		});
		btnConsultar.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\lupa.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(138, 101, 35, 29);
		contentPane.add(btnConsultar);
		
		

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
	public static frmPaquetes getInstancia() {

		// Si no existe una instancia se crea una nueva
		if (instancia == null) {
			instancia = new frmPaquetes();

		}
		// Retorna la unica instancia disponible
		return instancia;

	}
}
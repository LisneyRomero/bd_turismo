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
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;

import model.Medios;
import model.Tipotransporte;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmTipoTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private static frmTipoTransporte instancia;
	Tipotransporte cr = new Tipotransporte();
	private JTextField txtidtransporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipoTransporte.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmTipoTransporte() {
		setTitle("REGISTRO DE TRANSPORTE");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\autobus.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 323, 287);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);// centrar el formulario

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("REGISTRO DE TIPOS DE TRANSPORTE");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(33, 11, 260, 14);
		contentPane.add(lblTitle);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(33, 97, 60, 14);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(132, 94, 117, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(35, 130, 96, 14);
		contentPane.add(lblObservaciones);

		JTextArea txtaObservaciones = new JTextArea();
		txtaObservaciones.setLineWrap(true);
		txtaObservaciones.setBounds(132, 130, 117, 49);
		contentPane.add(txtaObservaciones);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Registrar nuevos datos en la base de datos
				cr.create(txtNombre.getText(), txtaObservaciones.getText());
			}
		});
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.setBounds(102, 205, 117, 27);
		contentPane.add(btnRegistrar);

		JButton btnMenu = new JButton("");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmMenu.getInstancia().setVisible(true);// Llamar al menu
			}
		});
		btnMenu.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\casa.png"));
		btnMenu.setFocusable(false);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu);

		JButton btnLimpiar = new JButton("");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Limpiar campos del formulario
				txtNombre.setText("");
				txtaObservaciones.setText("");
			}
		});
		btnLimpiar.setIcon(new ImageIcon(
				"C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(227, 204, 40, 33);
		contentPane.add(btnLimpiar);

		JLabel lblIdTiposDe = new JLabel("ID Transporte:");
		lblIdTiposDe.setBounds(33, 66, 85, 14);
		contentPane.add(lblIdTiposDe);

		txtidtransporte = new JTextField();
		txtidtransporte.setColumns(10);
		txtidtransporte.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtidtransporte.setBounds(133, 60, 46, 20);
		contentPane.add(txtidtransporte);

		JButton btnEliminar = new JButton("");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// eliminar de la base de datos
				cr.delete(Integer.parseInt(txtidtransporte.getText()));
			}
		});
		btnEliminar.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(224, 54, 35, 29);
		contentPane.add(btnEliminar);

		JButton btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// consultar datos de la base de datos
				cr.read(Integer.parseInt(txtidtransporte.getText()), txtNombre, txtaObservaciones);
			}
		});
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setIcon(
				new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\lupa.png"));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(184, 54, 35, 29);
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
	public static frmTipoTransporte getInstancia() {

		// Si no existe una instancia se crea una nueva
		if (instancia == null) {
			instancia = new frmTipoTransporte();

		}

		// Retorna la unica instancia disponible
		return instancia;

	}
}
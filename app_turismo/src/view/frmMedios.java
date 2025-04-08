package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;

import model.Medios;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMedios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservaciones;
	private JTextField txtTipo;
	private static frmMedios instancia;
	Medios cr = new Medios();
	private JTextField txtmedios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMedios.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmMedios() {
		setTitle("MEDIOS DE COMUNICACION");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(
				"/resource//medios-de-comunicacion.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 386, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);// centrar el formulario

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("REGISTRO DE MEDIOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(97, 30, 174, 14);
		contentPane.add(lblNewLabel);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				// Registrar nuevos datos en la base de datos
				cr.create(txtNombre.getText(), txtObservaciones.getText(), Integer.parseInt(txtTipo.getText()));

			}
		});
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setIcon(new ImageIcon(getClass().getResource("/resource//registro.png")));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(120, 279, 130, 33);
		contentPane.add(btnRegistrar);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(35, 113, 70, 14);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(135, 110, 174, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(35, 156, 90, 14);
		contentPane.add(lblObservaciones);

		txtObservaciones = new JTextField();
		txtObservaciones.setColumns(10);
		txtObservaciones.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtObservaciones.setBounds(135, 153, 174, 62);
		contentPane.add(txtObservaciones);

		JLabel lblTipo = new JLabel("Tipo de Medio:");
		lblTipo.setBounds(35, 240, 90, 14);
		contentPane.add(lblTipo);

		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTipo.setBounds(135, 237, 174, 20);
		contentPane.add(txtTipo);

		JButton btnMenu = new JButton("");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmMenu.getInstancia().setVisible(true);// llamar al menu

			}
		});
		btnMenu.setIcon(new ImageIcon(getClass().getResource("/resource//casa.png")));
		btnMenu.setFocusable(false);
		btnMenu.setContentAreaFilled(false);
		btnMenu.setBorder(null);
		btnMenu.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu);

		JLabel lblIdMedios = new JLabel("ID Medios:");
		lblIdMedios.setBounds(35, 79, 78, 14);
		contentPane.add(lblIdMedios);

		txtmedios = new JTextField();
		txtmedios.setColumns(10);
		txtmedios.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtmedios.setBounds(135, 79, 46, 20);
		contentPane.add(txtmedios);

		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//eliminar de la base de datos
				cr.delete(Integer.parseInt(txtmedios.getText()));

			}
		});
		btnEliminar.setIcon(new ImageIcon(getClass().getResource("/resource//borrar.png")));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(258, 74, 35, 29);
		contentPane.add(btnEliminar);

		JButton btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//limpiar campos de formulario
				txtmedios.setText("");
				txtNombre.setText("");
				txtObservaciones.setText("");
				txtTipo.setText("");

			}
		});
		btnLimpiar.setIcon(new ImageIcon(getClass().getResource("/resource//rechazado.png")));
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(256, 284, 40, 27);
		contentPane.add(btnLimpiar);

		JButton btnConsultar = new JButton("");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//consultar datos de la base de datos
				cr.read(Integer.parseInt(txtmedios.getText()), txtNombre, txtObservaciones, txtTipo);
			}
		});
		btnConsultar.setIcon(new ImageIcon(getClass().getResource("/resource//lupa.png")));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(186, 74, 35, 29);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Actualizar Registros de la base de datos
				cr.update(Integer.parseInt(txtmedios.getText()),txtNombre.getText(), txtObservaciones.getText(), Integer.parseInt(txtTipo.getText()));
			}
		});
		btnActualizar.setIcon(new ImageIcon(getClass().getResource("/resource//actualizar.png")));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(223, 72, 35, 29);
		contentPane.add(btnActualizar);

		// permite que la ventana pueda abrirse nuevamente
		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				// cuando se cierra la ventana, se libera la instanciapara permitir su reapertura
				instancia = null;

			}

		});

	}

	// metodo singleton para que solo haya una instancia activa a la vez
	public static frmMedios getInstancia() {

		// Si no existe una instancia se crea una nueva
		if (instancia == null) {
			instancia = new frmMedios();

		}
		// Retorna la unica instancia disponible
		return instancia;

	}

}
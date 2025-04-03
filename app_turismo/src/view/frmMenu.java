package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.ImageIcon;

public class frmMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitle;
	private static frmMenu instancia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmMenu() {
		setTitle("MENU");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource/casa.png")));//mostrar el icono
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 291, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 238, 247));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.setLocation(50, 50); // Formulario en la esquina izq
		this.setResizable(false); // No editable el tamaño del formulario

		lblTitle = new JLabel("FORMULARIOS DE REGISTRO");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 11, 296, 32);
		contentPane.add(lblTitle);

		JLabel lblAgencias = new JLabel("Registro de Agencias...................................................");
		lblAgencias.setBounds(10, 69, 213, 14);
		contentPane.add(lblAgencias);

		JButton btnIrAgencias = new JButton("");
		btnIrAgencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIrAgencias.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png"))); //para que los iconos se sigan mostrando
		btnIrAgencias.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrAgencias.setBackground(new Color(243, 238, 247));
		btnIrAgencias.setBorderPainted(false);
		btnIrAgencias.setBorder(null);
		btnIrAgencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmAgencias.getInstancia().setVisible(true); // llamar al formulario de registro de agencias

			}
		});
		btnIrAgencias.setBounds(223, 65, 43, 23);
		contentPane.add(btnIrAgencias);

		JLabel lblClientes = new JLabel(
				"Registro de Clientes.........................................................");
		lblClientes.setBounds(10, 94, 213, 14);
		contentPane.add(lblClientes);

		JButton btnIrClientes = new JButton("");
		btnIrClientes.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrClientes.setBackground(new Color(243, 238, 247));
		btnIrClientes.setBorderPainted(false);
		btnIrClientes.setBorder(null);
		btnIrClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmClientes.getInstancia().setVisible(true);// llamar al formulario de registro de clientes

			}
		});
		btnIrClientes.setBounds(223, 90, 43, 23);
		contentPane.add(btnIrClientes);

		JLabel lblCompanias = new JLabel("Registro de Compañias...................................");
		lblCompanias.setBounds(10, 119, 213, 14);
		contentPane.add(lblCompanias);

		JButton btnIrCompanias = new JButton("");
		btnIrCompanias.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrCompanias.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrCompanias.setBackground(new Color(243, 238, 247));
		btnIrCompanias.setBorderPainted(false);
		btnIrCompanias.setBorder(null);
		btnIrCompanias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmCompanias.getInstancia().setVisible(true);// llamar al formulario de registro de companias

			}
		});
		btnIrCompanias.setBounds(223, 115, 43, 23);
		contentPane.add(btnIrCompanias);

		JLabel lblMedios = new JLabel("Registro de Medios..........................................");
		lblMedios.setBounds(10, 144, 213, 14);
		contentPane.add(lblMedios);

		JButton btnIrMedios = new JButton("");
		btnIrMedios.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrMedios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrMedios.setBackground(new Color(243, 238, 247));
		btnIrMedios.setBorderPainted(false);
		btnIrMedios.setBorder(null);
		btnIrMedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frmMedios.getInstancia().setVisible(true);// llamar al formulario de registro de medios de comunicacion

			}
		});
		btnIrMedios.setBounds(223, 140, 43, 23);
		contentPane.add(btnIrMedios);

		JLabel lblOperadores = new JLabel(
				"Registro de Operadores...........................................................");
		lblOperadores.setBounds(10, 169, 213, 14);
		contentPane.add(lblOperadores);

		JButton btnIrOperadores = new JButton("");
		btnIrOperadores.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrOperadores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrOperadores.setBackground(new Color(243, 238, 247));
		btnIrOperadores.setBorderPainted(false);
		btnIrOperadores.setBorder(null);
		btnIrOperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmOperadores.getInstancia().setVisible(true);// llamar al formulario de registro de operadores

			}
		});
		btnIrOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIrOperadores.setBounds(223, 165, 43, 23);
		contentPane.add(btnIrOperadores);

		JLabel lblPaquetes = new JLabel("Registro de Paquetes.....................................");
		lblPaquetes.setBounds(10, 194, 213, 14);
		contentPane.add(lblPaquetes);

		JButton btnIrPaquetes = new JButton("");
		btnIrPaquetes.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrPaquetes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrPaquetes.setBackground(new Color(243, 238, 247));
		btnIrPaquetes.setBorderPainted(false);
		btnIrPaquetes.setBorder(null);
		btnIrPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmPaquetes.getInstancia().setVisible(true);// llamar al formulario de registro de Paquetes

			}
		});
		btnIrPaquetes.setBounds(223, 190, 43, 23);
		contentPane.add(btnIrPaquetes);

		JLabel lblPromotores = new JLabel("Registro de Promotores..........................");
		lblPromotores.setBounds(10, 219, 213, 14);
		contentPane.add(lblPromotores);

		JButton btnIrPromotores = new JButton("");
		btnIrPromotores.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrPromotores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrPromotores.setBackground(new Color(243, 238, 247));
		btnIrPromotores.setBorderPainted(false);
		btnIrPromotores.setBorder(null);
		btnIrPromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmPromotores.getInstancia().setVisible(true);// llamar al formulario de registro de promotores

			}
		});
		btnIrPromotores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIrPromotores.setBounds(223, 215, 43, 23);
		contentPane.add(btnIrPromotores);

		JLabel lblTipoMedio = new JLabel("Registro de Tipos de Medios................................");
		lblTipoMedio.setBounds(10, 246, 213, 14);
		contentPane.add(lblTipoMedio);

		JButton btnTipoMedio = new JButton("");
		btnTipoMedio.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnTipoMedio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTipoMedio.setBackground(new Color(243, 238, 247));
		btnTipoMedio.setBorderPainted(false);
		btnTipoMedio.setBorder(null);
		btnTipoMedio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmTipomedio.getInstancia().setVisible(true);// llamar al formulario de registro de tipos de medios
			}
		});
		btnTipoMedio.setBounds(223, 240, 43, 23);
		contentPane.add(btnTipoMedio);

		JLabel lblTipoTransporte = new JLabel("Registro de Tipos de Transporte....................");
		lblTipoTransporte.setBounds(10, 271, 213, 14);
		contentPane.add(lblTipoTransporte);

		JButton btnIrTransporte = new JButton("");
		btnIrTransporte.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrTransporte.setBackground(new Color(243, 238, 247));
		btnIrTransporte.setBorderPainted(false);
		btnIrTransporte.setBorder(null);
		btnIrTransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmTipoTransporte.getInstancia().setVisible(true);// llamar al formulario de registro de tipos de transporte

			}
		});
		btnIrTransporte.setBounds(223, 267, 43, 23);
		contentPane.add(btnIrTransporte);

		JLabel lblVehiculo = new JLabel("Registro de Vehiculos.....................................");
		lblVehiculo.setBounds(10, 296, 213, 14);
		contentPane.add(lblVehiculo);

		JButton btnIrVehiculos = new JButton("");
		btnIrVehiculos.setIcon(new ImageIcon(getClass().getResource("/resource/circulo-de-flecha.png")));
		btnIrVehiculos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIrVehiculos.setBackground(new Color(243, 238, 247));
		btnIrVehiculos.setBorderPainted(false);
		btnIrVehiculos.setBorder(null);
		btnIrVehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmVehiculos.getInstancia().setVisible(true);// llamar al formulario de registro de Vehiculos
			}
		});
		btnIrVehiculos.setBounds(223, 292, 43, 23);
		contentPane.add(btnIrVehiculos);

		// permite que la ventana pueda abrirse nuevamente
		addWindowListener(new WindowAdapter() { 

			public void windowClosing(WindowEvent e) { 
				//cuando se cierra la ventana, se libera la instanciapara permitir su reapertura 
				instancia = null;

			}

		});

	}
	//metodo singleton para que solo haya una instancia activa a la vez 
	public static frmMenu getInstancia() {

		//Si no existe una instancia se crea una nueva 
		if (instancia == null) {
			instancia = new frmMenu();
		}
		//Retorna la unica instancia disponible
		return instancia;

	}

}

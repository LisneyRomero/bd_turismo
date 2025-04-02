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

public class frmTipoTransporte extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtObservaciones;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\autobus.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 337, 290);
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
		lblTitle.setBounds(30, 11, 260, 14);
		contentPane.add(lblTitle);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(33, 67, 60, 14);
		contentPane.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(132, 64, 117, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(35, 100, 96, 14);
		contentPane.add(lblObservaciones);

		txtObservaciones = new JTextField();
		txtObservaciones.setHorizontalAlignment(SwingConstants.LEFT);
		txtObservaciones.setColumns(10);
		txtObservaciones.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtObservaciones.setBounds(132, 99, 117, 49);
		contentPane.add(txtObservaciones);

		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				cr.create(txtNombre.getText(), txtObservaciones.getText());
			}
		});
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar
				.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.setBounds(102, 175, 117, 27);
		contentPane.add(btnRegistrar);
		
		JButton btnMenu = new JButton("");
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
		
		JButton btnLimpiar = new JButton("");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtNombre.setText("");
				txtObservaciones.setText("");
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(227, 174, 40, 33);
		contentPane.add(btnLimpiar);
		
		JLabel lblIdTiposDe = new JLabel("ID Transporte:");
		lblIdTiposDe.setBounds(10, 222, 85, 14);
		contentPane.add(lblIdTiposDe);
		
		txtidtransporte = new JTextField();
		txtidtransporte.setColumns(10);
		txtidtransporte.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtidtransporte.setBounds(99, 219, 46, 20);
		contentPane.add(txtidtransporte);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtidtransporte.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(145, 213, 40, 29);
		contentPane.add(btnEliminar);

		addWindowListener(new WindowAdapter() { // cambio, para que se pueda abrir otra vez la ventana

			public void windowClosing(WindowEvent e) {

				instancia = null;

			}

		});

	}

	public static frmTipoTransporte getInstancia() {// se cambia al nombre correspondiente

		if (instancia == null) {

			instancia = new frmTipoTransporte();

		}

		return instancia;

	}

}
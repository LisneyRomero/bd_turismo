package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import model.Tipomedio;

import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextArea;

public class frmTipomedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private static frmTipomedio instancia;
	Tipomedio cr = new Tipomedio();
	private JTextField txttiposmedios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmTipomedio.getInstancia().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmTipomedio() {
		setPreferredSize(new Dimension(1, 1));
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource//medios-de-comunicacion.png")));
		setTitle("TIPOS DE MEDIOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 310, 358);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);// centrar el formulario

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbltipomedio = new JLabel("Tipo de Medio: ");
		lbltipomedio.setBounds(28, 98, 152, 20);
		contentPane.add(lbltipomedio);

		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(28, 150, 114, 20);
		contentPane.add(lblObservaciones);
		
		JTextArea txtaObservaciones = new JTextArea();
		txtaObservaciones.setLineWrap(true);
		txtaObservaciones.setBounds(28, 169, 221, 70);
		contentPane.add(txtaObservaciones);

		JButton btnregistrartipomedio = new JButton("REGISTRAR");
		btnregistrartipomedio.setIcon(new ImageIcon(getClass().getResource("/resource//registro.png")));
		btnregistrartipomedio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				//Registrar datos en la base de datos
				cr.create(txtNombre.getText(), txtaObservaciones.getText());

			}
		});
		btnregistrartipomedio.setBackground(new Color(240, 234, 244));
		btnregistrartipomedio.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnregistrartipomedio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnregistrartipomedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnregistrartipomedio.setBounds(90, 263, 114, 28);
		contentPane.add(btnregistrartipomedio);

		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setBounds(25, 119, 224, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblTitle = new JLabel("REGISTRO DE TIPOS DE MEDIOS");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(43, 23, 207, 14);
		contentPane.add(lblTitle);

		JButton btnMenu_1 = new JButton("");
		btnMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				frmMenu.getInstancia().setVisible(true);//Llamar al menu
			}
		});
		btnMenu_1.setIcon(new ImageIcon(getClass().getResource("/resource//casa.png")));
		btnMenu_1.setFocusable(false);
		btnMenu_1.setContentAreaFilled(false);
		btnMenu_1.setBorder(null);
		btnMenu_1.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu_1);

		JButton btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				//Limpiar campos de texto
				txttiposmedios.setText("");
				txtNombre.setText("");
				txtaObservaciones.setText("");
			}
		});
		btnLimpiar.setIcon(new ImageIcon(getClass().getResource("/resource//rechazado.png")));
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(208, 262, 40, 33);
		contentPane.add(btnLimpiar);

		JLabel lblIdtiposmedios = new JLabel("ID Tipos de Medios:");
		lblIdtiposmedios.setBounds(25, 63, 112, 14);
		contentPane.add(lblIdtiposmedios);

		txttiposmedios = new JTextField();
		txttiposmedios.setColumns(10);
		txttiposmedios.setBorder(new EmptyBorder(1, 1, 1, 1));
		txttiposmedios.setBounds(138, 60, 46, 20);
		contentPane.add(txttiposmedios);

		JButton btnEliminar = new JButton("");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Borrar datos en la base de datos
				cr.delete(Integer.parseInt(txttiposmedios.getText()));
			}
		});
		btnEliminar.setIcon(new ImageIcon(getClass().getResource("/resource//borrar.png")));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(247, 55, 35, 29);
		contentPane.add(btnEliminar);

		JButton btnConsultar = new JButton("");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Consultar datos de la base de datos
				cr.read(Integer.parseInt(txttiposmedios.getText()), txtNombre, txtaObservaciones);

			}
		});
		btnConsultar.setIcon(new ImageIcon(getClass().getResource("/resource//lupa.png")));
		btnConsultar.setContentAreaFilled(false);
		btnConsultar.setBorder(null);
		btnConsultar.setBounds(188, 55, 35, 29);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("");
		btnActualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Actualizar registros
				cr.update(Integer.parseInt(txttiposmedios.getText()),txtNombre.getText(), txtaObservaciones.getText());
			}
		});
		btnActualizar.setIcon(new ImageIcon(getClass().getResource("/resource//actualizar.png")));
		btnActualizar.setContentAreaFilled(false);
		btnActualizar.setBorderPainted(false);
		btnActualizar.setBorder(null);
		btnActualizar.setBounds(217, 55, 35, 29);
		contentPane.add(btnActualizar);

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
	public static frmTipomedio getInstancia() {

		// Si no existe una instancia se crea una nueva
		if (instancia == null) {
			instancia = new frmTipomedio();

		}
		// Retorna la unica instancia disponible
		return instancia;

	}

}
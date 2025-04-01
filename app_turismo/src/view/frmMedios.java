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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\medios-de-comunicacion.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 386, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		this.setLocationRelativeTo(null);//centrar el formulario
		
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
				
						
				cr.create(txtNombre.getText(), txtObservaciones.getText(), Integer.parseInt(txtTipo.getText()));
				
				
			}
		});
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(120, 279, 130, 33);
		contentPane.add(btnRegistrar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(33, 78, 70, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setBounds(133, 75, 174, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(33, 121, 90, 14);
		contentPane.add(lblObservaciones);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setColumns(10);
		txtObservaciones.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtObservaciones.setBounds(133, 118, 174, 62);
		contentPane.add(txtObservaciones);
		
		JLabel lblTipo = new JLabel("Tipo de Medio:");
		lblTipo.setBounds(33, 205, 90, 14);
		contentPane.add(lblTipo);
		
		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtTipo.setBounds(133, 202, 174, 20);
		contentPane.add(txtTipo);
		
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
		
		JLabel lblIdMedios = new JLabel("ID Medios:");
		lblIdMedios.setBounds(10, 336, 78, 14);
		contentPane.add(lblIdMedios);
		
		txtmedios = new JTextField();
		txtmedios.setColumns(10);
		txtmedios.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtmedios.setBounds(89, 333, 46, 20);
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
				
				cr.delete(Integer.parseInt(txtmedios.getText()));
				
			}
		});
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(135, 327, 40, 29);
		contentPane.add(btnEliminar);
		
		JButton btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtNombre.setText("");
				txtObservaciones.setText("");
				txtTipo.setText("");
				
				
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(256, 284, 40, 27);
		contentPane.add(btnLimpiar);
	
		
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmMedios getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmMedios(); 

			 } 

			 return instancia; 

	 } 
			
}
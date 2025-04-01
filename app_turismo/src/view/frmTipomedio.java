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

public class frmTipomedio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtObservaciones;
	private JTextField txtNombre;
	private static frmTipomedio instancia;
	Tipomedio cr = new Tipomedio();
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\medios-de-comunicacion.png"));
		setTitle("TIPOS DE MEDIOS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 331, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setLocationRelativeTo(null);//centrar el formulario
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbltipomedio = new JLabel("Tipo de Medio: ");
		lbltipomedio.setBounds(37, 48, 152, 28);
		contentPane.add(lbltipomedio);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(37, 106, 114, 28);
		contentPane.add(lblObservaciones);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setName("");
		txtObservaciones.setHorizontalAlignment(SwingConstants.LEFT);
		txtObservaciones.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtObservaciones.setColumns(10);
		txtObservaciones.setBounds(37, 136, 221, 64);
		contentPane.add(txtObservaciones);
		
		JButton btnregistrartipomedio = new JButton("REGISTRAR");
		btnregistrartipomedio.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\escribir.png"));
		btnregistrartipomedio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtNombre.getText(), txtObservaciones.getText());
				
						
				
			}
		});
		btnregistrartipomedio.setBackground(new Color(240, 234, 244));
		btnregistrartipomedio.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnregistrartipomedio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnregistrartipomedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnregistrartipomedio.setBounds(100, 219, 114, 33);
		contentPane.add(btnregistrartipomedio);
		
		txtNombre = new JTextField();
		txtNombre.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setBounds(34, 75, 224, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblTitle = new JLabel("REGISTRO DE TIPOS DE MEDIOS");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(54, 23, 207, 14);
		contentPane.add(lblTitle);
		
		JButton btnLimpiar = new JButton("BORRAR");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtNombre.setText("");
				txtObservaciones.setText("");
				
				
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\boton-eliminar.png"));
		btnLimpiar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(109, 255, 96, 33);
		contentPane.add(btnLimpiar);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
				
			}
		});
		btnMenu.setBounds(10, 265, 65, 23);
		contentPane.add(btnMenu);

		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmTipomedio getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmTipomedio(); 

			 } 

			 return instancia; 

	 } 
			
}
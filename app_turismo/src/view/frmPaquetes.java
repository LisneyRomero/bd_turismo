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
	private JTextField txtObservaciones;
	private static frmPaquetes instancia;
	Paquetes cr = new Paquetes();
	private JTextField txtcodigo;
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\plano-alt.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 526, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLocationRelativeTo(null);//centrar el formulario
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("PAQUETES DE VIAJE");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(150, 35, 209, 25);
		contentPane.add(lblTitle);
		
		JLabel lblidDestino = new JLabel("ID Destino:");
		lblidDestino.setBounds(27, 100, 77, 14);
		contentPane.add(lblidDestino);
		
		txtDestino = new JTextField();
		txtDestino.setColumns(10);
		txtDestino.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtDestino.setBounds(137, 97, 36, 20);
		contentPane.add(txtDestino);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				
				cr.create(Integer.parseInt(txtDestino.getText()),Integer.parseInt(txtOrigen.getText()),txtVenta.getText(),
				 txtHoraVenta.getText(),txtSalida.getText(),txtEjecucion.getText(),txtObservaciones.getText(),Integer.parseInt(txtPromotores.getText()),
				 Integer.parseInt(txtCliente.getText()),Integer.parseInt(txtAgencia.getText()),Integer.parseInt(txtVehiculo.getText()),
				 Integer.parseInt(txtMedio.getText()),txtPrecio.getText());
				
				
				
				
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\registro.png"));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(193, 321, 123, 33);
		contentPane.add(btnRegistrar);
		
		JLabel lblidOrigen = new JLabel("ID Origen:");
		lblidOrigen.setBounds(27, 131, 77, 14);
		contentPane.add(lblidOrigen);
		
		txtOrigen = new JTextField();
		txtOrigen.setColumns(10);
		txtOrigen.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtOrigen.setBounds(137, 128, 36, 20);
		contentPane.add(txtOrigen);
		
		JLabel lblVenta = new JLabel("Fecha Venta:");
		lblVenta.setBounds(237, 100, 77, 14);
		contentPane.add(lblVenta);
		
		txtVenta = new JTextField();
		txtVenta.setColumns(10);
		txtVenta.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtVenta.setBounds(359, 97, 111, 20);
		contentPane.add(txtVenta);
		
		JLabel lblHoraVenta = new JLabel("Hora de Venta:");
		lblHoraVenta.setBounds(237, 131, 89, 14);
		contentPane.add(lblHoraVenta);
		
		txtHoraVenta = new JTextField();
		txtHoraVenta.setColumns(10);
		txtHoraVenta.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtHoraVenta.setBounds(359, 128, 111, 20);
		contentPane.add(txtHoraVenta);
		
		JLabel lblSalida = new JLabel("Hora de Salida:");
		lblSalida.setBounds(237, 162, 89, 14);
		contentPane.add(lblSalida);
		
		txtSalida = new JTextField();
		txtSalida.setColumns(10);
		txtSalida.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtSalida.setBounds(359, 159, 111, 20);
		contentPane.add(txtSalida);
		
		JLabel lblEjecucion = new JLabel("Fecha de Ejecucion:");
		lblEjecucion.setBounds(237, 190, 123, 14);
		contentPane.add(lblEjecucion);
		
		txtEjecucion = new JTextField();
		txtEjecucion.setColumns(10);
		txtEjecucion.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtEjecucion.setBounds(359, 187, 111, 20);
		contentPane.add(txtEjecucion);
		
		JLabel lblPromotores = new JLabel("ID Promotores:");
		lblPromotores.setBounds(27, 159, 77, 14);
		contentPane.add(lblPromotores);
		
		txtPromotores = new JTextField();
		txtPromotores.setColumns(10);
		txtPromotores.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPromotores.setBounds(137, 156, 36, 20);
		contentPane.add(txtPromotores);
		
		JLabel lblCliente = new JLabel("ID Cliente:");
		lblCliente.setBounds(27, 187, 77, 14);
		contentPane.add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setColumns(10);
		txtCliente.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtCliente.setBounds(137, 184, 36, 20);
		contentPane.add(txtCliente);
		
		JLabel lblidAgencia = new JLabel("ID Agencia:");
		lblidAgencia.setBounds(27, 215, 77, 14);
		contentPane.add(lblidAgencia);
		
		txtAgencia = new JTextField();
		txtAgencia.setColumns(10);
		txtAgencia.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtAgencia.setBounds(137, 212, 36, 20);
		contentPane.add(txtAgencia);
		
		JLabel lblidVehiculo = new JLabel("ID Vehiculo:");
		lblidVehiculo.setBounds(27, 243, 77, 14);
		contentPane.add(lblidVehiculo);
		
		txtVehiculo = new JTextField();
		txtVehiculo.setColumns(10);
		txtVehiculo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtVehiculo.setBounds(137, 240, 36, 20);
		contentPane.add(txtVehiculo);
		
		JLabel lblidMedios = new JLabel("ID Medios:");
		lblidMedios.setBounds(27, 271, 77, 14);
		contentPane.add(lblidMedios);
		
		txtMedio = new JTextField();
		txtMedio.setColumns(10);
		txtMedio.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtMedio.setBounds(137, 268, 36, 20);
		contentPane.add(txtMedio);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(237, 218, 123, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPrecio.setBounds(359, 215, 111, 20);
		contentPane.add(txtPrecio);
		
		JLabel lblObservaciones = new JLabel("Observaciones:");
		lblObservaciones.setBounds(237, 246, 123, 14);
		contentPane.add(lblObservaciones);
		
		txtObservaciones = new JTextField();
		txtObservaciones.setColumns(10);
		txtObservaciones.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtObservaciones.setBounds(359, 243, 111, 42);
		contentPane.add(txtObservaciones);
		
		JButton btnLimpiar = new JButton("");
		btnLimpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				txtDestino.setText("");
				txtOrigen.setText("");
				txtVenta.setText("");
				txtHoraVenta.setText("");
				txtSalida.setText("");
				txtEjecucion.setText("");
				txtObservaciones.setText("");
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
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\rechazado.png"));
		btnLimpiar.setContentAreaFilled(false);
		btnLimpiar.setBorder(null);
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(319, 322, 40, 33);
		contentPane.add(btnLimpiar);
		
		JButton btnMenu_1 = new JButton("");
		btnMenu_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
			
				
			}
		});
		btnMenu_1.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\casa.png"));
		btnMenu_1.setFocusable(false);
		btnMenu_1.setContentAreaFilled(false);
		btnMenu_1.setBorder(null);
		btnMenu_1.setBounds(0, 0, 40, 39);
		contentPane.add(btnMenu_1);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(27, 378, 53, 14);
		contentPane.add(lblCodigo);
		
		txtcodigo = new JTextField();
		txtcodigo.setColumns(10);
		txtcodigo.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtcodigo.setBounds(80, 375, 46, 20);
		contentPane.add(txtcodigo);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.delete(Integer.parseInt(txtcodigo.getText()));
				
			}
		});
		btnEliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\git\\formulariosturismo\\app_turismo\\src\\resource\\borrar.png"));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorder(null);
		btnEliminar.setBounds(126, 369, 40, 29);
		contentPane.add(btnEliminar);

		
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana  

			public void windowClosing(WindowEvent e) { 

			instancia = null; 

			} 

		}); 

	}		 	 
			public static frmPaquetes getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

			 instancia = new frmPaquetes(); 

			 } 

			 return instancia; 

	 } 
			
}
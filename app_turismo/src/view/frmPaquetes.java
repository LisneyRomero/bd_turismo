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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\plano-alt.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 234, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

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
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paquetes cr = new Paquetes();
				
				cr.create(Integer.parseInt(txtDestino.getText()),Integer.parseInt(txtOrigen.getText()),txtVenta.getText(),
				 txtHoraVenta.getText(),txtSalida.getText(),txtEjecucion.getText(),txtObservaciones.getText(),Integer.parseInt(txtPromotores.getText()),
				 Integer.parseInt(txtCliente.getText()),Integer.parseInt(txtAgencia.getText()),Integer.parseInt(txtVehiculo.getText()),
				 Integer.parseInt(txtMedio.getText()),txtPrecio.getText());
				
				
				
				
			}
		});
		btnRegistrar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\escribir.png"));
		btnRegistrar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegistrar.setBackground(new Color(240, 234, 244));
		btnRegistrar.setBounds(193, 313, 123, 41);
		contentPane.add(btnRegistrar);
		
		JButton btnLimpiar = new JButton("BORRAR");
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
				txtVehiculo.setText("");
				txtMedio.setText("");
				txtPrecio.setText("");
				
				
				
			}
		});
		btnLimpiar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Documents\\Lisney\\app_turismo\\src\\view\\boton-eliminar.png"));
		btnLimpiar.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLimpiar.setBackground(new Color(240, 234, 244));
		btnLimpiar.setBounds(199, 365, 111, 33);
		contentPane.add(btnLimpiar);
		
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
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmMenu.getInstancia().setVisible(true);
				
			}
		});
		btnMenu.setBounds(27, 399, 89, 23);
		contentPane.add(btnMenu);

		
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
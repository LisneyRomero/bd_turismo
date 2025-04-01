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
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 312, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 202, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setLocation(50,50); 
		
		lblTitle = new JLabel("FORMULARIOS DE REGISTRO");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 11, 296, 32);
		contentPane.add(lblTitle);
		
		JLabel lblAgencias = new JLabel("Registro de Agencias............");
		lblAgencias.setBounds(10, 69, 182, 14);
		contentPane.add(lblAgencias);
		
		JButton btnIrAgencias = new JButton("Ir");
		btnIrAgencias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmAgencias.getInstancia().setVisible(true);
				
			}
		});
		btnIrAgencias.setBounds(223, 65, 43, 23);
		contentPane.add(btnIrAgencias);
		
		JLabel lblClientes = new JLabel("Registro de Clientes............");
		lblClientes.setBounds(10, 94, 182, 14);
		contentPane.add(lblClientes);
		
		JButton btnIrClientes = new JButton("Ir");
		btnIrClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmClientes.getInstancia().setVisible(true);
				
			}
		});
		btnIrClientes.setBounds(223, 90, 43, 23);
		contentPane.add(btnIrClientes);
		
		JLabel lblCompanias = new JLabel("Registro de Compañias............");
		lblCompanias.setBounds(10, 119, 182, 14);
		contentPane.add(lblCompanias);
		
		JButton btnIrCompanias = new JButton("Ir");
		btnIrCompanias.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmCompanias.getInstancia().setVisible(true);
				
			}
		});
		btnIrCompanias.setBounds(223, 115, 43, 23);
		contentPane.add(btnIrCompanias);
		
		JLabel lblMedios = new JLabel("Registro de Medios............");
		lblMedios.setBounds(10, 144, 182, 14);
		contentPane.add(lblMedios);
		
		JButton btnIrMedios = new JButton("Ir");
		btnIrMedios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmMedios.getInstancia().setVisible(true);
				
			}
		});
		btnIrMedios.setBounds(223, 140, 43, 23);
		contentPane.add(btnIrMedios);
		
		JLabel lblOperadores = new JLabel("Registro de Operadores............");
		lblOperadores.setBounds(10, 169, 182, 14);
		contentPane.add(lblOperadores);
		
		JButton btnIrOperadores = new JButton("Ir");
		btnIrOperadores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmOperadores.getInstancia().setVisible(true);
			}
		});
		btnIrOperadores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIrOperadores.setBounds(223, 165, 43, 23);
		contentPane.add(btnIrOperadores);
		
		JLabel lblPaquetes = new JLabel("Registro de Paquetes............");
		lblPaquetes.setBounds(10, 194, 182, 14);
		contentPane.add(lblPaquetes);
		
		JButton btnIrPaquetes = new JButton("Ir");
		btnIrPaquetes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmPaquetes.getInstancia().setVisible(true);
				
			}
		});
		btnIrPaquetes.setBounds(223, 190, 43, 23);
		contentPane.add(btnIrPaquetes);
		
		JLabel lblPromotores = new JLabel("Registro de Promotores............");
		lblPromotores.setBounds(10, 219, 182, 14);
		contentPane.add(lblPromotores);
		
		JButton btnIrPromotores = new JButton("Ir");
		btnIrPromotores.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmPromotores.getInstancia().setVisible(true);
				
			}
		});
		btnIrPromotores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIrPromotores.setBounds(223, 215, 43, 23);
		contentPane.add(btnIrPromotores);
		
		JLabel lblTipoMedio = new JLabel("Registro de Tipos de Medios............");
		lblTipoMedio.setBounds(10, 246, 182, 14);
		contentPane.add(lblTipoMedio);
		
		JButton btnTipoMedio = new JButton("Ir");
		btnTipoMedio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmTipomedio.getInstancia().setVisible(true);
			}
		});
		btnTipoMedio.setBounds(223, 240, 43, 23);
		contentPane.add(btnTipoMedio);
		
		JLabel lblTipoTransporte = new JLabel("Registro de Tipos de Transporte............");
		lblTipoTransporte.setBounds(10, 271, 182, 14);
		contentPane.add(lblTipoTransporte);
		
		JButton btnIrTransporte = new JButton("Ir");
		btnIrTransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmTipoTransporte.getInstancia().setVisible(true);
				
			}
		});
		btnIrTransporte.setBounds(223, 267, 43, 23);
		contentPane.add(btnIrTransporte);
		
		JLabel lblVehiculo = new JLabel("Registro de Vehiculos............");
		lblVehiculo.setBounds(10, 296, 182, 14);
		contentPane.add(lblVehiculo);
		
		JButton btnIrVehiculos = new JButton("Ir");
		btnIrVehiculos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frmVehiculos.getInstancia().setVisible(true);
			}
		});
		btnIrVehiculos.setBounds(223, 292, 43, 23);
		contentPane.add(btnIrVehiculos);
		
		addWindowListener(new WindowAdapter() { //cambio, para que se pueda abrir otra vez la ventana 

			 

		public void windowClosing(WindowEvent e) { 

			instancia = null; 

		} 

	}); 

} 			 
		public static frmMenu getInstancia() {// se cambia al nombre correspondiente  

			 if (instancia == null) { 

				 instancia = new frmMenu(); 
			 } 

			 return instancia; 

			} 
		
			
}

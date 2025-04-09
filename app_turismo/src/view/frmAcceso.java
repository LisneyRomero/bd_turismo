package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import model.Imagen;
import model.Promotores;
import java.awt.Toolkit;
import java.awt.Menu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAcceso extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPass;
	Promotores menu = new Promotores();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAcceso frame = new frmAcceso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmAcceso() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resource//acceso.png")));
		setTitle("INICIAR SESION");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 386, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 236, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JLabel lblidUsuario = new JLabel("ID Usuario:");
		lblidUsuario.setForeground(new Color(83, 48, 83));
		lblidUsuario.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblidUsuario.setBounds(30, 144, 74, 14);
		contentPane.add(lblidUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtUsuario.setBounds(104, 141, 198, 20);
		contentPane.add(txtUsuario);
		
		txtPass = new JPasswordField();
		txtPass.setBorder(new EmptyBorder(1, 1, 1, 1));
		txtPass.setBounds(104, 169, 198, 20);
		contentPane.add(txtPass);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIngresar.setForeground(new Color(83, 48, 83));
		btnIngresar.setFont(new Font("Cambria", Font.PLAIN, 12));
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				//btnIngresar.setBackground(new Color (242,235,242));
				btnIngresar.setBackground(new Color (253, 250, 255));
							
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnIngresar.setBackground(new Color (244,236,244));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				menu.controlAcceso(Integer.parseInt(txtUsuario.getText()), txtPass.getText());
				
				
			}
		});
		btnIngresar.setBackground(new Color(240, 234, 244));
		btnIngresar.setBorder(new LineBorder(new Color(96, 56, 96), 2, true));
		btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIngresar.setBounds(123, 219, 123, 28);
		contentPane.add(btnIngresar);
		
		JLabel lblcontrasenia = new JLabel("Contraseña:");
		lblcontrasenia.setForeground(new Color(83, 48, 83));
		lblcontrasenia.setFont(new Font("Cambria", Font.PLAIN, 12));
		lblcontrasenia.setBounds(30, 172, 74, 14);
		contentPane.add(lblcontrasenia);
		
		Imagen imagen = new Imagen();
		imagen.setRuta("/resource/logo travel.png");
		imagen.setBounds(123, 11, 123, 119);
		contentPane.add(imagen);
	}
}

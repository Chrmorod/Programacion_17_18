import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MIperfil extends JFrame {

	private JPanel contentPane;
	private JTextField Caja_Nombre;
	private JTextField Caja_Apellidos;
	private JTextField Caja_Edad;
	private JTextField Caja_Email;

	/**
	 * Punto de entrada de la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MIperfil frame = new MIperfil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creación de Ventana
	 */
	public MIperfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		
		//Configuración del contenedor
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta Nombre
		
		JLabel Etiqueta_Nombre = new JLabel("Nombre");
		Etiqueta_Nombre.setBounds(70, 20, 60, 20);
		contentPane.add(Etiqueta_Nombre);
		
		//Caja Nombre
		
		Caja_Nombre = new JTextField();
		Caja_Nombre.setText("Christian");
		Caja_Nombre.setBounds(70, 38, 390, 40);
		contentPane.add(Caja_Nombre);
		Caja_Nombre.setColumns(10);
		
		//Etiqueta Apellidos
		
		JLabel Etiqueta_Apellidos = new JLabel("Apellidos");
		Etiqueta_Apellidos.setBounds(70, 82, 60, 20);
		contentPane.add(Etiqueta_Apellidos);
		
		//Caja Apellidos
		
		Caja_Apellidos = new JTextField();
		Caja_Apellidos.setText("Molina");
		Caja_Apellidos.setColumns(10);
		Caja_Apellidos.setBounds(70, 99, 390, 40);
		contentPane.add(Caja_Apellidos);
		
		//Etiqueta Edad
		
		JLabel Etiqueta_Edad = new JLabel("Edad");
		Etiqueta_Edad.setBounds(70, 153, 60, 20);
		contentPane.add(Etiqueta_Edad);
		
		//Caja Edad
		
		Caja_Edad = new JTextField();
		Caja_Edad.setText("24");
		Caja_Edad.setColumns(10);
		Caja_Edad.setBounds(70, 170, 390, 40);
		contentPane.add(Caja_Edad);
		
		//Etiqueta Email
		
		JLabel Etiqueta_Email = new JLabel("Email");
		Etiqueta_Email.setBounds(70, 219, 60, 20);
		contentPane.add(Etiqueta_Email);
		
		//Caja Email
		
		Caja_Email = new JTextField();
		Caja_Email.setText("chmoro@floridauniversitaria.es");
		Caja_Email.setColumns(10);
		Caja_Email.setBounds(70, 236, 390, 40);
		contentPane.add(Caja_Email);
	}
}

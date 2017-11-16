import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BailandoTexto extends JFrame {

	private JPanel contentPane;
	private JTextField Caja1;
	private JTextField Caja2;

	/**
	 * Punto de entrada de la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creación de ventana
	 */
	public BailandoTexto() {
		
		//Configuración de ventana
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 360);
		
		//Configuración del contenedor
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Primera Caja
		
		Caja1 = new JTextField();
		Caja1.setBounds(5, 130, 200, 50);
		contentPane.add(Caja1);
		Caja1.setColumns(10);
		
		//Segunda Caja
		
		Caja2 = new JTextField();
		Caja2.setBounds(325, 130, 200, 50);
		contentPane.add(Caja2);
		Caja2.setColumns(10);
		
		//Botón pasa texto de Caja1 a Caja2
		
		JButton Boton12 = new JButton("-->");
		//LISTENER + EVENTO(Acción del botón: Coge texto de Caja1 a Caja2 y borra de Caja1)
		//-----------------
		Boton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caja2.setText(Caja1.getText());
				Caja1.setText("");
			}
		});
		//-----------------
		Boton12.setBounds(215, 60, 100, 30);
		contentPane.add(Boton12);
		
		//Botón pasa texto de Caja2 a Caja1
		
		JButton Boton21 = new JButton("<---");
		
		//LISTENER + EVENTO(Acción del botón: Coge texto de Caja2 a Caja1 y borra de Caja2)
		//-----------------
		Boton21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caja1.setText(Caja2.getText());
				Caja2.setText("");
			}
		});
		//-----------------
		Boton21.setBounds(215, 270, 100, 30);
		contentPane.add(Boton21);
	}
}

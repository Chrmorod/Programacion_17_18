package Ventanas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Juego.Jugador;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Juego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField boxTiempo;
	private JTextField BienvenidaNombre;

	/**
	 * Inicio ventana Juego y Diseño Juego.
	 */
	public Juego() {
		/*-----Diseño ventana Juego-----*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 560);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(255, 153, 102));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*-----CAJAS-----*/
		
		/*-----Caja Puntos----*/
		
		//Diseño caja Puntos
		
		boxTiempo = new JTextField();
		boxTiempo.setForeground(Color.WHITE);
		boxTiempo.setBackground(Color.DARK_GRAY);
		boxTiempo.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		boxTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		boxTiempo.setText("puntos");
		boxTiempo.setEnabled(false);
		boxTiempo.setBounds(543, 0, 121, 23);
		contentPane.add(boxTiempo);
		boxTiempo.setColumns(10);
		
		/*-----Caja Bienvenida----*/
		
		//Diseño caja Bienvenida
		
		BienvenidaNombre = new JTextField();
		BienvenidaNombre.setEnabled(false);
		BienvenidaNombre.setForeground(Color.WHITE);
		BienvenidaNombre.setBackground(Color.DARK_GRAY);
		BienvenidaNombre.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		BienvenidaNombre.setText("Nombre y  Apellidos");
		BienvenidaNombre.setBounds(0, 0, 501, 23);
		contentPane.add(BienvenidaNombre);
		BienvenidaNombre.setColumns(10);
		
		
		
		
		
	}
			
	/*---Recogemos datos introducidos en la ventana Login---*/
	public void setJugador(Jugador player1){
		BienvenidaNombre.setText("Bienvenido "+player1.getNombre()+" "+player1.getApellidos());
		setTitle("Mathdice - "+player1.getid());
		boxTiempo.setText("00:"+"0"+player1.getMin()+":"+"0"+player1.getSeg());

		
	}
}

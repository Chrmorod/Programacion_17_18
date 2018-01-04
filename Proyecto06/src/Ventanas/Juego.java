package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
public class Juego extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel boxTiempo;
	private int timemin;
	private int timeseg;
	private Timer ts;
	private JTextField BienvenidaNombre;
	private JButton btnVolver;
	/**
	 * Inicio ventana Juego y Diseño Juego
	 */
	private Juego referencia=this;

	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 551);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		referencia=this;
		/*-----ETIQUETAS-----*/
		
		/*-----Etiqueta Tiempo----*/
		boxTiempo = new JLabel("00:00");
		boxTiempo.setBackground(Color.DARK_GRAY);
		boxTiempo.setForeground(Color.RED);
		boxTiempo.setFont(new Font("Yu Gothic", Font.BOLD, 28));
		boxTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		boxTiempo.setBounds(441, 0, 340, 42);
		contentPane.add(boxTiempo);
		boxTiempo.setText("00:00");
		//Timer tm = new Timer (min,this);
		//ts = new Timer(timeseg,this);
		//ts.start();
		//getContentPane().add(boxTiempo);
		
		
		/*-----CAJAS-----*/
		
		/*-----Caja Bienvenidos----*/
		BienvenidaNombre = new JTextField();
		BienvenidaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		BienvenidaNombre.setBackground(Color.DARK_GRAY);
		BienvenidaNombre.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		BienvenidaNombre.setForeground(Color.WHITE);
		BienvenidaNombre.setText("Nombre y Apellidos");
		BienvenidaNombre.setEnabled(false);
		BienvenidaNombre.setBounds(0, 0, 443, 42);
		contentPane.add(BienvenidaNombre);
		BienvenidaNombre.setColumns(10);
		
		
		/*------BOTONES----*/
		
		/*------Boton Volver-----*/
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(Color.RED);
		btnVolver.setBounds(658, 452, 113, 49);
		contentPane.add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login(referencia);
				log.setVisible(true);
				referencia.setVisible(false);
			}
		});
		}
	
	/*---Recogemos datos introducidos en la ventana Login---*/
	public void setJugador(Jugador player1){
		BienvenidaNombre.setText("Bienvenido "+player1.getNombre()+" "+player1.getApellidos());
		setTitle("Mathdice - "+player1.getid());
		boxTiempo.setText("0"+player1.getMin()+":"+"0"+player1.getSeg());
		int seg=player1.getSeg();
		int min=player1.getMin();
		timeseg=seg;
		timemin=min;
		ts = new Timer(timeseg,this);
		ts.start();
		getContentPane().add(boxTiempo);
	}
	
	public void logic(){
		try{
			if (timeseg>0){
				Thread.sleep(1000);
				if(Integer.toString(timeseg).length()==1){
						timeseg--;
						boxTiempo.setText("0"+timemin+":0"+timeseg);
				}else{
						timeseg--;
						boxTiempo.setText("0"+timemin+":"+timeseg);
				}
			}else if(timeseg==0&&timemin!=0){
				Thread.sleep(500);
				timeseg=59;
				timemin--;
			}else{
				ts.stop();
			}
		}catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		logic();
		repaint();
	}
}

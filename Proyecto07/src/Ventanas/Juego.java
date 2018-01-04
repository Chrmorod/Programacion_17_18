package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
public class Juego extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel BienvenidaNombre;
	
	private JLabel boxTiempo;
	private int timemin;
	private int timeseg;
	private Timer ts;
	private JButton btnVolver;
	
	private JLabel lblDado11;
	private JLabel lblDado12;
	private JLabel lblDado13;
	private JLabel lblDado21;
	private JLabel lblDado22;
	private JLabel lblDado3;
	private JLabel lblPuntuacion;
	
	private ImageIcon[] dado1 = new ImageIcon[3];
	private ImageIcon[] dado2 = new ImageIcon[6];
	private ImageIcon[] dado3 = new ImageIcon[12];
	private ImageIcon dadoGris;
	private Random dado = new Random();
	
	private int[] numAlmacenDado1 = new int[3];
	private int[] numAlmacenDado2 = new int[6];
	private int numAlmacenDado3;
	/**
	 * Inicio ventana Juego y Diseño Juego
	 */
	private Juego referencia=this;

	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 703);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		referencia=this;
		
		/*-----ETIQUETAS-----*/
		/*-----Etiqueta Bienvenida----*/
		BienvenidaNombre = new JLabel("Nombre y Apellidos");
		BienvenidaNombre.setForeground(Color.WHITE);
		BienvenidaNombre.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		BienvenidaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		BienvenidaNombre.setBackground(Color.DARK_GRAY);
		BienvenidaNombre.setOpaque(true);
		BienvenidaNombre.setBounds(0, 0, 443, 42);
		contentPane.add(BienvenidaNombre);
		
		/*-----Etiqueta Tiempo----*/
		boxTiempo = new JLabel("00:00");
		boxTiempo.setBackground(Color.DARK_GRAY);
		boxTiempo.setForeground(Color.RED);
		boxTiempo.setFont(new Font("Yu Gothic", Font.BOLD, 28));
		boxTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		boxTiempo.setOpaque(true);
		boxTiempo.setBounds(441, 0, 340, 42);
		contentPane.add(boxTiempo);
		boxTiempo.setText("00:00");
		
		/*------ETIQUETAS DADOS----*/
		
		/*------ETIQUETA DADO 1 GRUPO 1----*/
		
		lblDado11 = new JLabel("Dado11");
		lblDado11.setBackground(Color.DARK_GRAY);
		lblDado11.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado11.setBounds(10, 72, 150, 150);
		contentPane.add(lblDado11);
		lblDado11.setOpaque(true);

		
		/*------ETIQUETA DADO 2 GRUPO 1----*/
		
		lblDado12 = new JLabel("Dado12");
		lblDado12.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado12.setBackground(Color.DARK_GRAY);
		lblDado12.setBounds(170, 72, 150, 150);
		contentPane.add(lblDado12);
		lblDado12.setOpaque(true);

		
		/*------ETIQUETA DADO 3 GRUPO 1----*/
		
		lblDado13 = new JLabel("Dado13");
		lblDado13.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado13.setBackground(Color.DARK_GRAY);
		lblDado13.setBounds(330, 72, 150, 150);
		contentPane.add(lblDado13);
		lblDado13.setOpaque(true);

		
		/*------ETIQUETA DADO 1 GRUPO 2----*/
		
		lblDado21 = new JLabel("Dado21");
		lblDado21.setOpaque(true);
		lblDado21.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado21.setBackground(Color.DARK_GRAY);
		lblDado21.setBounds(10, 233, 150, 150);
		contentPane.add(lblDado21);

		
		/*------ETIQUETA DADO 2 GRUPO 2----*/
		
		lblDado22 = new JLabel("Dado22");
		lblDado22.setOpaque(true);
		lblDado22.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado22.setBackground(Color.DARK_GRAY);
		lblDado22.setBounds(170, 233, 150, 150);
		contentPane.add(lblDado22);
		
		/*------ETIQUETA DADO 1 GRUPO 3----*/
		
		lblDado3 = new JLabel("Dado3");
		lblDado3.setOpaque(true);
		lblDado3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado3.setBackground(Color.DARK_GRAY);
		lblDado3.setBounds(10, 394, 150, 150);
		contentPane.add(lblDado3);
		
		/*------ETIQUETA PUNTUACION----*/
		
		lblPuntuacion = new JLabel("Puntuacion");
		lblPuntuacion.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblPuntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntuacion.setBounds(23, 573, 591, 68);
		contentPane.add(lblPuntuacion);
		
		/*Iniciamos dados aleatoriamente*/
		iniciaDados();
		
		/*------BOTONES----*/
		
		/*------Boton Volver-----*/
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(Color.RED);
		btnVolver.setBounds(658, 604, 113, 49);
		contentPane.add(btnVolver);
	
		/*------Accion Boton Volver-----*/
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

	private void iniciaDados(){
		//Cargamos imagenes diferenciados por los arrays dado1, dado2 , dado3 y escogemos transformando el primer valor de la imagen en un integer más la coletilla que diferencia cada imagen
		//Ejemplo dado1_3.png el numero 1 será el que transformemos en integer e ira seguido _3.png con lo que pertenecera a la primera posicion del bucle primero que se corresponde con dado1
		for(int i=0;i<dado1.length;i++){
			dado1[i] = new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_3.png"));
		}
		for(int i=0;i<dado2.length;i++){
			dado2[i] = new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_6.png"));
		}
		for(int i=0;i<dado3.length;i++){
			dado3[i] = new ImageIcon(getClass().getResource("img/dadodoce_"+String.valueOf(i+1)+".png"));
		}
		dadoGris =new ImageIcon(getClass().getResource("img/dadogris.png"));//Imagen util a la hora de seleccionar un dado para que aparezca esta imagen.

/* Posicionamos los dados FILA 1*/

	for(int i=0; i<numAlmacenDado1.length;i++){
		numAlmacenDado1[i] = dado.nextInt(3);//Aleatoriedad de 3
		lblDado11.setIcon(dado1[numAlmacenDado1[0]]);
		lblDado11.setName("1");
		lblDado12.setIcon(dado1[numAlmacenDado1[1]]);
		lblDado12.setName("2");
		lblDado13.setIcon(dado1[numAlmacenDado1[2]]);
		lblDado13.setName("3");
		//lblDado11.addMouseListener(new ListenerDados());
		//lblDado12.addMouseListener(new ListenerDados());
		//lblDado13.addMouseListener(new ListenerDados());
	}
	for(int i=0; i<numAlmacenDado2.length;i++){
		numAlmacenDado2[i] = dado.nextInt(6);//Aleatoriedad de 6
		lblDado21.setIcon(dado2[numAlmacenDado1[0]]);
		lblDado21.setName("4");
		lblDado22.setIcon(dado2[numAlmacenDado1[1]]);
		lblDado22.setName("5");
		//lblDado21.addMouseListener(new ListenerDados());
		//lblDado22.addMouseListener(new ListenerDados());
	}
		numAlmacenDado3 = dado.nextInt(12);//Aleatoriedad de 12
		lblDado3.setIcon(dado3[numAlmacenDado3]);//dado6
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

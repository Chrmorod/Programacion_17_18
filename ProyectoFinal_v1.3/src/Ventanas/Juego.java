package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
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
import javax.swing.JTextField;

public class Juego extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private ImageIcon dadoGris, img, restar, sumar;
	private ImageIcon[] dado1 = new ImageIcon[4], dado2 = new ImageIcon[7], dado3 = new ImageIcon[13];
	private int numAlmacenDado3, puntos, timemin, timeseg;
	private int[] numAlmacenDado1 = new int[4], numAlmacenDado2 = new int[7];
	private JButton  btnRepetir, btnMathdice, btnVolver;
	private JLabel BienvenidaNombre, boxTiempo, lblAvisofinJuego, lblComprobacion, lblDado11, lblDado12, lblDado13, lblDado21, lblDado22, lblDado3, lblimagen, lblPuntos, lbltxtPuntos, lblResta, lblResultado, lblSuma;
	private JPanel contentPane;
	private JTextField boxOperaciones;
	private Random dado = new Random();
	private Timer ts;
	
	//variables semaforos
	private boolean controlNumOpera=true;
	private boolean sumandos=true;
	private int contenido=0;
	private int numIntro=0;
	
	/**
	 * Inicio ventana Juego y Diseño Juego
	 */
	private Juego referencia=this;
	
	//Juego: constructor de la clase
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 703);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		referencia=this;
		
		/*-----CAJAS-----*/
		
		/*-----Caja Operaciones----*/
		
		boxOperaciones = new JTextField();
		boxOperaciones.setHorizontalAlignment(SwingConstants.CENTER);
		boxOperaciones.setEnabled(false);
		boxOperaciones.setForeground(Color.MAGENTA);
		boxOperaciones.setFont(new Font("Yu Gothic", Font.BOLD, 26));
		boxOperaciones.setBackground(Color.DARK_GRAY);
		boxOperaciones.setBounds(487, 104, 279, 106);
		contentPane.add(boxOperaciones);
		boxOperaciones.setColumns(10);
		
		/*-----Caja texto Puntos----*/
		
		lbltxtPuntos = new JLabel("PUNTOS:");
		lbltxtPuntos.setHorizontalAlignment(SwingConstants.RIGHT);
		lbltxtPuntos.setBackground(Color.DARK_GRAY);
		lbltxtPuntos.setForeground(Color.WHITE);
		lbltxtPuntos.setOpaque(true);
		lbltxtPuntos.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lbltxtPuntos.setBounds(72, 36, 519, 30);
		contentPane.add(lbltxtPuntos);
		
		/*-----Caja Puntos----*/
		
		lblPuntos = new JLabel("Cantidad de Puntos");
		lblPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuntos.setForeground(Color.ORANGE);
		lblPuntos.setBackground(Color.DARK_GRAY);
		lblPuntos.setOpaque(true);
		lblPuntos.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		lblPuntos.setBounds(590, 36, 191, 30);
		contentPane.add(lblPuntos);
		
		/*-----ETIQUETAS-----*/
		
		/*-----Etiqueta Bienvenida----*/
		BienvenidaNombre = new JLabel("Nombre y Apellidos");
		BienvenidaNombre.setForeground(Color.WHITE);
		BienvenidaNombre.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		BienvenidaNombre.setHorizontalAlignment(SwingConstants.CENTER);
		BienvenidaNombre.setBackground(Color.DARK_GRAY);
		BienvenidaNombre.setOpaque(true);
		BienvenidaNombre.setBounds(72, 0, 367, 36);
		contentPane.add(BienvenidaNombre);
		
		/*-----Etiqueta Tiempo----*/
		boxTiempo = new JLabel("00:00");
		boxTiempo.setBackground(Color.DARK_GRAY);
		boxTiempo.setForeground(Color.RED);
		boxTiempo.setFont(new Font("Yu Gothic", Font.BOLD, 28));
		boxTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		boxTiempo.setOpaque(true);
		boxTiempo.setBounds(438, 0, 343, 36);
		contentPane.add(boxTiempo);
		boxTiempo.setText("00:00");
		
		/*----Etiqueta Imagen----*/
		lblimagen = new JLabel("");
		lblimagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblimagen.setBounds(0, 0, 71, 65);
		contentPane.add(lblimagen);
		
		/*------ETIQUETAS DADOS----*/
		
		/*------ETIQUETA DADO 1 GRUPO 1----*/
		
		lblDado11 = new JLabel("11");
		lblDado11.setBackground(Color.DARK_GRAY);
		lblDado11.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado11.setBounds(0, 104, 140, 140);
		contentPane.add(lblDado11);

		
		/*------ETIQUETA DADO 2 GRUPO 1----*/
		
		lblDado12 = new JLabel("12");
		lblDado12.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado12.setBackground(Color.DARK_GRAY);
		lblDado12.setBounds(160, 104, 140, 140);
		contentPane.add(lblDado12);

		
		/*------ETIQUETA DADO 3 GRUPO 1----*/
		
		lblDado13 = new JLabel("13");
		lblDado13.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado13.setBackground(Color.DARK_GRAY);
		lblDado13.setBounds(320, 104, 140, 140);
		contentPane.add(lblDado13);

		
		/*------ETIQUETA DADO 1 GRUPO 2----*/
		
		lblDado21 = new JLabel("21");
		lblDado21.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado21.setBackground(Color.DARK_GRAY);
		lblDado21.setBounds(0, 310, 140, 140);
		contentPane.add(lblDado21);

		
		/*------ETIQUETA DADO 2 GRUPO 2----*/
		
		lblDado22 = new JLabel("22");
		lblDado22.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado22.setBackground(Color.DARK_GRAY);
		lblDado22.setBounds(160, 310, 140, 140);
		contentPane.add(lblDado22);
		
		/*------ETIQUETA DADO 1 GRUPO 3----*/
		
		lblDado3 = new JLabel("");
		lblDado3.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblDado3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDado3.setBackground(Color.DARK_GRAY);
		lblDado3.setBounds(310, 294, 170, 170);
		contentPane.add(lblDado3);
		
		/*------ETIQUETA PUNTUACION----*/
		
		lblResultado = new JLabel("Puntuacion");
		lblResultado.setForeground(Color.ORANGE);
		lblResultado.setFont(new Font("Yu Gothic", Font.BOLD, 22));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(10, 579, 638, 23);
		contentPane.add(lblResultado);
		
		/*------ETIQUETA COMPROBACIÓN----*/
		
		lblComprobacion = new JLabel("Correcto o Incorrecto");
		lblComprobacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprobacion.setForeground(new Color(102, 0, 204));
		lblComprobacion.setFont(new Font("Yu Gothic", Font.BOLD, 26));
		lblComprobacion.setBounds(0, 613, 648, 51);
		contentPane.add(lblComprobacion);
		
		/*------ETIQUETA SUMA----*/
		
		lblSuma = new JLabel("Suma");
		lblSuma.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuma.setBounds(487, 231, 140, 140);
		contentPane.add(lblSuma);
		sumar=new ImageIcon(getClass().getResource("img/suma.png"));
		lblSuma.setIcon(sumar);
		lblSuma.addMouseListener(new selectSuma());

		/*------ETIQUETA RESTA----*/
		
		lblResta = new JLabel("Resta");
		lblResta.setHorizontalAlignment(SwingConstants.CENTER);
		lblResta.setBounds(641, 231, 140, 140);
		contentPane.add(lblResta);
		restar=new ImageIcon(getClass().getResource("img/resta.png"));
		lblResta.setIcon(restar);
		lblResta.addMouseListener(new selectResta());
		
		/*------ETIQUETA AVISO FIN DEL JUEGO----*/
		lblAvisofinJuego = new JLabel("Tiempo!!!");
		lblAvisofinJuego.setForeground(Color.RED);
		lblAvisofinJuego.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvisofinJuego.setFont(new Font("Yu Gothic", Font.BOLD, 50));
		lblAvisofinJuego.setBounds(10, 223, 470, 106);
		
		
		
		/*------Boton Mathdice-----*/
		
		btnMathdice = new JButton("MATHDICE");
		btnMathdice.setForeground(Color.GREEN);
		btnMathdice.setBackground(Color.DARK_GRAY);
		btnMathdice.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		btnMathdice.setBounds(487, 392, 130, 119);
		contentPane.add(btnMathdice);
		btnMathdice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(numIntro>1){
					lblResultado.setText("El resultado es: "+String.valueOf(contenido));
					btnRepetir.setEnabled(true);
					if((numAlmacenDado3)==contenido){
						lblComprobacion.setText("Correcto!!! Ganas 5 puntos");
						btnMathdice.setEnabled(false);
						puntos=puntos+5;//Suma 5 puntos por acierto.
						lblPuntos.setText(String.valueOf(puntos));//Imprime en lblPuntos
					}else{
						lblComprobacion.setText("Fallaste!!! Intentalo de Nuevo");
						btnMathdice.setEnabled(false);
					}
				}
			}
		});
		
		/*------Boton Repetir-----*/
		
		btnRepetir = new JButton("REPETIR");
		btnRepetir.setBackground(Color.DARK_GRAY);
		btnRepetir.setForeground(Color.ORANGE);
		btnRepetir.setFont(new Font("Yu Gothic", Font.BOLD, 17));
		btnRepetir.setBounds(641, 392, 130, 119);
		contentPane.add(btnRepetir);
		btnRepetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciaDados();
				btnMathdice.setEnabled(true);
				btnRepetir.setEnabled(false);
				boxOperaciones.setText("");
			}
		});
		
		/*Iniciamos dados aleatoriamente*/
		
		iniciaDados();
		
		/*------Boton Volver-----*/
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		btnVolver.setForeground(Color.WHITE);
		btnVolver.setBackground(Color.RED);
		btnVolver.setBounds(658, 604, 113, 49);
		//btnVolver.setEnabled(false);
		contentPane.add(btnVolver);
		
		
		/*------Accion Boton Volver-----*/
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ts.stop();
				contentPane.remove(lblAvisofinJuego);
				btnMathdice.setEnabled(true);
				btnRepetir.setEnabled(true);
				lblSuma.setEnabled(true);
				lblResta.setEnabled(true);
				boxOperaciones.setText("");
				iniciaDados();
				/*---------------------------*/
				Login log = new Login(referencia);
				log.setVisible(true);
				referencia.setVisible(false);
				//referencia.dispose();
			}
		});
		}
		
	/*---Recogemos datos introducidos en la ventana Login---*/
	public void setJugador(Jugador player1){
		BienvenidaNombre.setText("Bienvenido "+player1.getNombre()+" "+player1.getApellidos());
		setTitle("Mathdice - "+player1.getid());
		boxTiempo.setText("0"+player1.getMin()+":"+"0"+player1.getSeg());
		puntos=player1.getPuntos();
		lblPuntos.setText(String.valueOf(puntos));
		int seg=player1.getSeg();//Introducimos los valores segundo seleccionados en Login
		int min=player1.getMin();//Introducimos los valores minutos seleccionados en Login
		timeseg=seg;//Los declaramos en una variable private
		timemin=min;//Los declaramos en una variable private
		ts = new Timer(1000,this);//introducimos valores del evento en el Timer
		ts.start();//Inicializamos el timer
		getContentPane().add(boxTiempo);//Añadimos al label tiempo.
		img = new ImageIcon(player1.getImagenEscalado().getImage().getScaledInstance(71, 65, 100));
		lblimagen.setIcon(img);
	}
	
	//Metodo para una tirada aleatoria.
	private void iniciaDados(){
		//Cargamos imagenes diferenciados por los arrays dado1, dado2 , dado3; transformamos el primer valor de la imagen en un integer más la coletilla que diferencia cada imagen
		//Ejemplo dado1_3.png el numero 1 será el que transformemos en integer e ira seguido _3.png con lo que pertenecera a la primera posicion del bucle primero que se corresponde con dado1
		for(int i=1;i<dado1.length;i++){
			dado1[i] = new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i)+"_3.png"));//Cargar imagenes de dados de la fila 1 (Las imagenes estaran dentro de un array con valores de 1 a 3 en la caras)
		}
		for(int i=1;i<dado2.length;i++){
			dado2[i] = new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i)+"_6.png"));//Cargar imagenes de dados de la fila 2 (Las imagenes estaran dentro de un array con valores de 1 a 6 en la caras)
		}
		for(int i=1;i<dado3.length;i++){
			dado3[i] = new ImageIcon(getClass().getResource("img/dadodoce_"+String.valueOf(i)+".png"));//Cargar imagenes de dados de la fila 3 (Las imagenes estaran dentro de un array con valores de 1 a 12 en la caras)
		}
		dadoGris =new ImageIcon(getClass().getResource("img/dadogris.png"));//Imagen util a la hora de seleccionar un dado para que aparezca esta imagen.

	/* Posicionamos los dados3 FILA 1*/

		for(int i=1; i<numAlmacenDado1.length;i++){
			numAlmacenDado1[i] = dado.nextInt(4);//Almacena los 3 numeros ultimos de los dados de la fila_1 con una aleatoriedad de 1 a 3
			
			if (numAlmacenDado1[i]==0){//impide que en nuestro array numAlmacenDado el minimo sea 0 de esta forma recogerá como minimo la imagen 1_3
				numAlmacenDado1[i]=numAlmacenDado1[i]+1;
			}
		}
			lblDado11.setIcon(dado1[numAlmacenDado1[1]]);
			lblDado11.setName("1");
			lblDado12.setIcon(dado1[numAlmacenDado1[2]]);
			lblDado12.setName("2");
			lblDado13.setIcon(dado1[numAlmacenDado1[3]]);
			lblDado13.setName("3");
			
			//Introducimos el valor del setName de cada variable lblDado.. en selectDados
			lblDado11.addMouseListener(new selectDados());
			lblDado12.addMouseListener(new selectDados());
			lblDado13.addMouseListener(new selectDados());
		
		
	/* Posicionamos los dados6 FILA 2*/
		
		for(int i=1; i<numAlmacenDado2.length;i++){
			numAlmacenDado2[i] = dado.nextInt(7);//Almacena 6 utlimos numeros de los dados de la fila 2 con una aleatoriedad de 1 a 6
			
			if (numAlmacenDado2[i]==0){//impide que en nuestro array numAlmacenDado el minimo sea 0 de esta forma recogerá como minimo la imagen 1_6
				numAlmacenDado2[i]=numAlmacenDado2[i]+1;
			}
		}
			lblDado21.setIcon(dado2[numAlmacenDado2[4]]);
			lblDado21.setName("4");
			lblDado22.setIcon(dado2[numAlmacenDado2[5]]);
			lblDado22.setName("5");
			
			//Introducimos el valor del setName de cada variable lblDado.. en selectDados
			lblDado21.addMouseListener(new selectDados());
			lblDado22.addMouseListener(new selectDados());
		
		
	/* Posicionamos los dados12 FILA 3*/
		
			numAlmacenDado3 = dado.nextInt(13);//Almacena 12 numeros aleatorio de la fila 3 con una aleatoriedad de 12
			
			if (numAlmacenDado3==0){//impide que en nuestro array numAlmacenDado el minimo sea 0 de esta forma recogerá como minimo la imagen doce_1
				numAlmacenDado3=numAlmacenDado3+1;
			}
			
			lblDado3.setIcon(dado3[numAlmacenDado3]);
			lblResultado.setText("A\u00F1ade la Operacion y mostraremos tu resultado aqui");
			lblComprobacion.setText("Te diremos si es correcto(+5 puntos) o Incorrecto");
			
	/*Reseteamos las variables semaforos y valores*/
			controlNumOpera=true;
			contenido=0;
			numIntro=0;
			sumandos=true;
	}
	
	/*Metodo logic() para la cuenta atras del juego*/
	//timeseg empezará la cuenta atras en el primer momento dado los valores de inicialización los segundo pasaran de 0 a 59 y se restara 1 a la variable time min
	//Dejamos un Thread.sleep(1000) que es lo que corresponde a 1 segundo (1000 milisegundos).
	//Por ultimo cuando llegue a 0 segundo 0 minutos se parara el timer. Y se notificará de que el tiempo acabado tapando todos los dados y bloqueando todos los botones.
	public void logic(){
		
			if (timeseg>0){
				timeseg--;
				boxTiempo.setText(new DecimalFormat("00").format(timemin)+":"+new DecimalFormat("00").format(timeseg));
				
			}else if(timeseg==0&&timemin!=0){
				timeseg=59;
				timemin--;				
			}else{
				ts.stop();
				contentPane.add(lblAvisofinJuego);//Avisamos del que el tiempo ha acabado por lo que bloqueamos los botones y tapamos imagenes y impedimos acciones con los Jlabel de las imagenes.
				btnMathdice.setEnabled(false);
				btnRepetir.setEnabled(false);
				lblSuma.setEnabled(false);
				lblResta.setEnabled(false);
				lblDado11.setIcon(dadoGris);
				lblDado12.setIcon(dadoGris);
				lblDado13.setIcon(dadoGris);
				lblDado21.setIcon(dadoGris);
				lblDado22.setIcon(dadoGris);
				lblDado3.setIcon(dadoGris);
				controlNumOpera=false;
				boxOperaciones.setText("");
			}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		logic();//implementa el metodo logic
		repaint();//repinta los valores en el boxTiempo
	}
	
	//metodo setOperacion para la resta y la suma de los valores uniendo el contenido que contenga en la caja de las Operaciones.
	private void setOperacion(int num){
		numIntro++;//Numero introducido
		if(numIntro>1){//Si es mayor que 1 suma sino resta.
			if(sumandos){
				contenido=contenido+num;
			}else{
				contenido=contenido-num;
			}
		}else{
			contenido=num;
		}
	}
	
	//Creamos la clase inner llamada selectDados. Implementara la clase mouselisener recogiendo todos sus metodos.
	private class selectDados implements MouseListener{

		@Override//Palabra reservada que avisamos al compilador que hemos modificado un metodo conforme a mis necesidades
		public void mouseClicked(MouseEvent e) {
			JLabel dado = (JLabel) e.getSource();//Identifica el Jlabel sobre el cual he hecho click y lo guardas en dado. (Será los numeros: 1,2,3,4 y 5).Valor recuperado del setName declarado en los bucles for 
			int numDado = Integer.valueOf(dado.getName());//Transformar a numero entero para obtener el valor.
			if(controlNumOpera){//Control de saber si toca un numero o una operacion de esta manera no se pueden duplicar signos ni numeros.
				
				/*Comprobación del array y del valor que se selecciona al pulsar los dados de la fila1*/
				//System.out.println(numAlmacenDado1[1]+" "+numAlmacenDado1[2]+" "+numAlmacenDado1[3]);
				//System.out.println(String.valueOf(numAlmacenDado1[numDado]));
				
				/*Comprobación del array y del valor que se selecciona al pulsar los dados de la fila2*/				
				//System.out.println(numAlmacenDado2[4]+" "+numAlmacenDado2[5]);
				//System.out.println(String.valueOf(numAlmacenDado2[numDado]));

				if(numDado<4){//Corresponde a las variables lblDado11, lblDado12, lblDado13.
					boxOperaciones.setText(boxOperaciones.getText()+String.valueOf(numAlmacenDado1[numDado]));//Ejemplo: lblDado11 numDado-1=0 escogera el numero en posicion 0 del array y lo incrementara 1 lo transformara en valor y lo añadera al getText Contenido
				}else{//Corresponde a las variables lblDado21, lblDado22
					boxOperaciones.setText(boxOperaciones.getText()+String.valueOf(numAlmacenDado2[numDado]));
				}
				dado.removeMouseListener(this);//Borra MouseListener del Jlabel
				dado.setIcon(dadoGris);//Añade imagen del dado gris
				controlNumOpera=false;//Variable semaforo en false (para impedir seleccionar dos dados a la vez o dos signos a la vez).
				
				//Condición para añadir la operacion junto al contenido que haya en la caja "boxOperaciones"
				if(numDado<4){
						setOperacion(numAlmacenDado1[numDado]);
				}else{
						setOperacion(numAlmacenDado2[numDado]);
				}
			}
		}
		//Metodos asociados a la clase MouseListener (deberá tener todos los metodos):

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private class selectSuma implements MouseListener{

			@Override//Palabra reservada que avisamos al compilador que hemos modificado un metodo conforme a mis necesidades
			public void mouseClicked(MouseEvent e) {
					if(!controlNumOpera){
						boxOperaciones.setText(boxOperaciones.getText()+"+");
						controlNumOpera=true;
						sumandos=true;
					}
				}
			//Metodos asociados a la clase MouseListener (deberá tener todos los metodos):
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		}
	
	private class selectResta implements MouseListener{

		@Override//Palabra reservada que avisamos al compilador que hemos modificado un metodo conforme a mis necesidades
		public void mouseClicked(MouseEvent e) {
			if(!controlNumOpera){
				boxOperaciones.setText(boxOperaciones.getText()+"-");
				controlNumOpera=true;
				sumandos=false;
			}
		}
		//Metodos asociados a la clase MouseListener (deberá tener todos los metodos):
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Logica.Jugador;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
public class VentanaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField boxNombre;
	private JTextField boxApellidos;
	private JTextField boxEdad;
	private JTextField boxDificultad;
	private JTextArea boxPantalla;
	private JTextField boxPuntos;
	private JTextField boxId;
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblEdad;
	private JLabel lblDificultad;
	private JLabel lblPuntos;
	private JLabel lblimagen;	
	private JLabel lblId;
	
	//Creamos objeto Jugador
	
	private Jugador player1;
	/**
	 * Inicio de la apliaci�n
	 * 
	 */ 
	public static void main(String[] args) {
		VentanaPrincipal frame = new VentanaPrincipal();
		frame.setVisible(true);
	}
	/**
	 * Dise�o de la aplicaci�n
	 * 
	 */ 
	public VentanaPrincipal() {
		
		//Titulo del juego
		
		setTitle("Mathdice");
		
		/*------ETIQUETAS------*/
		
		//Parametros ventana principal
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 560);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta Nombre
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setForeground(new Color(255, 255, 255));
		lblNombre.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNombre.setBounds(10, 8, 76, 14);
		contentPane.add(lblNombre);
		
		//Etiqueta Apellidos
		
		lblApellidos = new JLabel("APELLIDOS:");
		lblApellidos.setForeground(new Color(255, 255, 255));
		lblApellidos.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblApellidos.setBounds(10, 68, 96, 14);
		contentPane.add(lblApellidos);
		
		//Etiqueta Edad
		
		lblEdad = new JLabel("EDAD:");
		lblEdad.setForeground(new Color(255, 255, 255));
		lblEdad.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblEdad.setBounds(10, 128, 46, 14);
		contentPane.add(lblEdad);
		
		//Etiqueta Dificultad
		
		lblDificultad = new JLabel("DIFICULTAD:");
		lblDificultad.setForeground(new Color(255, 255, 255));
		lblDificultad.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblDificultad.setBounds(10, 188, 96, 14);
		contentPane.add(lblDificultad);
		
		//Etiqueta Puntos
		
		lblPuntos = new JLabel("PUNTOS:");
		lblPuntos.setForeground(Color.WHITE);
		lblPuntos.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblPuntos.setBounds(10, 259, 96, 14);
		contentPane.add(lblPuntos);
		
		//Etiqueta Imagen
		
		lblimagen = new JLabel("");
		lblimagen.setForeground(Color.WHITE);
		lblimagen.setBackground(Color.DARK_GRAY);
		lblimagen.setEnabled(false);
		lblimagen.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon imagen=new ImageIcon(getClass().getResource("img/avatar.png"));
		lblimagen.setIcon(imagen);
		lblimagen.setBounds(496, 8, 161, 177);
		contentPane.add(lblimagen);
		
		//Etiqueta Identificador del Jugador(Id)
		
		lblId = new JLabel("ID JUGADOR:");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblId.setBounds(496, 217, 96, 14);
		contentPane.add(lblId);

		/*------CAJAS------*/
		
		//Caja Nombre
		
		boxNombre = new JTextField();
		boxNombre.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		boxNombre.setForeground(Color.WHITE);
		boxNombre.setBackground(Color.DARK_GRAY);
		boxNombre.setBounds(116, 8, 370, 20);
		contentPane.add(boxNombre);
		boxNombre.setColumns(10);
		
		//Caja Apellidos	
		
		boxApellidos = new JTextField();
		boxApellidos.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		boxApellidos.setForeground(Color.WHITE);
		boxApellidos.setBackground(Color.DARK_GRAY);
		boxApellidos.setColumns(10);
		boxApellidos.setBounds(116, 68, 370, 20);
		contentPane.add(boxApellidos);
		
		//Caja Edad
		
		boxEdad = new JTextField();
		boxEdad.setForeground(Color.WHITE);
		boxEdad.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		boxEdad.setBackground(Color.DARK_GRAY);
		boxEdad.setColumns(10);
		boxEdad.setBounds(116, 128, 370, 20);
		contentPane.add(boxEdad);
		
		//Caja Dificultad
		
		boxDificultad = new JTextField();
		boxDificultad.setForeground(Color.WHITE);
		boxDificultad.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		boxDificultad.setBackground(Color.DARK_GRAY);
		boxDificultad.setColumns(10);
		boxDificultad.setBounds(116, 214, 370, 20);
		contentPane.add(boxDificultad);
		
		//Caja Imprime Pantalla
		
		boxPantalla = new JTextArea();
		boxPantalla.setLineWrap(true);
		boxPantalla.setBackground(Color.DARK_GRAY);
		boxPantalla.setForeground(Color.WHITE);
		boxPantalla.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		boxPantalla.setEnabled(false);
		boxPantalla.setText("BIENVENIDO AL JUEGO MATHDICE!");
		boxPantalla.setBounds(10, 295, 482, 215);
		contentPane.add(boxPantalla);
		
		//Caja Puntos
		
		boxPuntos = new JTextField();
		boxPuntos.setForeground(Color.WHITE);
		boxPuntos.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		boxPuntos.setHorizontalAlignment(SwingConstants.CENTER);
		boxPuntos.setEnabled(false);
		boxPuntos.setColumns(10);
		boxPuntos.setBackground(Color.DARK_GRAY);
		boxPuntos.setBounds(116, 245, 116, 39);
		contentPane.add(boxPuntos);
		
		//Caja Identificador Jugador (Id)
		
		boxId = new JTextField();
		boxId.setHorizontalAlignment(SwingConstants.CENTER);
		boxId.setForeground(Color.WHITE);
		boxId.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		boxId.setEnabled(false);
		boxId.setColumns(10);
		boxId.setBackground(Color.DARK_GRAY);
		boxId.setBounds(496, 241, 161, 50);
		contentPane.add(boxId);
	
		/*------BOTONES------*/
		
		//Boton Jugar
		
		//Propiedades
		
		JButton btnJugar = new JButton("JUGUEMOS!");
		btnJugar.setForeground(Color.WHITE);
		btnJugar.setBackground(new Color(0, 128, 128));
		btnJugar.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		btnJugar.setBounds(496, 385, 161, 57);
		contentPane.add(btnJugar);
		
		//Acciones del boton
		
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//Asigna Nombre
				
				player1.setNombre(boxNombre.getText());
				
				//Asigna Apellidos
				
				player1.setApellidos(boxApellidos.getText());
				
				//Intenta asignar la edad que insertes sino inserta recuerdaselo y ponemos edad por defecto que sera 7 a�os por la condicion Jugador puesta.
				
				try{
				String  Stringedad = boxEdad.getText();
				int edad = Integer.valueOf(Stringedad);
				player1.setEdad(edad);
				player1.setEDAD("\nLa edad que ha introducido es de: ");
				}catch (Exception e){
					player1.setEDAD("\nSe ha olvidado de ingresar el numero, por defecto\nintroducimos la edad de: ");
					player1.setEdad(0);
				}
				
				//En funcion de la dificultad saca una puntuaci�n o otra.
				
					player1.setDificultad(boxDificultad.getText());
			    	if(player1.getDificultad()=="Dificultad Baja"){
				    	player1.setPuntos(Jugador.pbajo);
			    	}else if(player1.getDificultad()=="Dificultad Media"){
			    		player1.setPuntos(Jugador.pmedio);
			    	}else if(player1.getDificultad()=="Dificultad Alta"){
			    		player1.setPuntos(Jugador.palto);
			    	}
			    	
			    //Informa de la cantidad de puntos en la pantalla para puntos.
			    	
			    boxPuntos.setText(""+player1.getPuntos());
			    	
			    //Informa del Identificador elegido para el Jugador
			    	
			    boxId.setText("JPlayer"+player1.getid().nextInt(9999));
			    	
			    //Informa de todo lo que "falte y este completado" (unicamente si falta alguna caja sin completar).	
			    	
				boxPantalla.setText("Saludos!\n"+player1.getNombre()+" "+player1.getApellidos()+player1.getEDAD()+player1.getEdad()+" a�os."+"\n Has elegido: "+player1.getDificultad()+" con lo que tendras "+player1.getPuntos()+" puntos");
				
				//Informa de que TODAS las cajas han sido completadas
				
				String[] revisar = {boxNombre.getText(),boxApellidos.getText(),boxEdad.getText(),boxDificultad.getText()};
				if((revisar[0].length()!=0)&&(revisar[1].length()!=0)&&(revisar[2].length()!=0)&&(revisar[3].length()!=0)){
				boxPantalla.setText("\nCAMPOS COMPLETADOS\nCARGANDO....\nA JUGAR!");
						}
					}
		});
		
		//Boton Ayuda
		
		//propiedades
		
		JButton btnayuda = new JButton("AYUDA");
		btnayuda.setForeground(Color.WHITE);
		btnayuda.setBackground(new Color(255, 0, 0));
		btnayuda.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		btnayuda.setBounds(496, 453, 161, 57);
		contentPane.add(btnayuda);
		
		//Acciones del boton
		
		btnayuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boxPantalla.setText("Debe introducir un nombre,uno o dos apellidos,edad y elegir dificultad. Todo ello en sus casillas correspondientes.\n*En el campo edad si no lo introduce se le avisar� y se le asignara uno por defecto.\n*En el campo dificultad si no lo introduce se le asignara por defecto dificultad media, puede cambiarlo con los botones o introducirlo manualmente.\n*Si todo estuviera completado aparecer� un mensaje en pantalla: CAMPOS COMPLETADOS");
			}
		});
		
		//Boton Dificultad Baja
		
		//propiedades
		
		JButton btnBaja = new JButton("Baja");
		btnBaja.setBackground(Color.DARK_GRAY);
		btnBaja.setForeground(Color.GREEN);
		btnBaja.setBounds(116, 185, 89, 23);
		contentPane.add(btnBaja);
		
		//Acciones del boton
		
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player1.setDificultad(Jugador.bajo);
				boxDificultad.setText(player1.getDificultad());
			    player1.setPuntos(Jugador.pbajo);
			}
		});

		
		//Boton Dificultad Media
		
		//propiedades
		
		JButton btnMedia = new JButton("Media");
		btnMedia.setBackground(Color.DARK_GRAY);
		btnMedia.setForeground(Color.ORANGE);
		btnMedia.setBounds(258, 185, 89, 23);
		contentPane.add(btnMedia);
		
		//Acciones del boton
		
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				player1.setDificultad(Jugador.medio);
				boxDificultad.setText(player1.getDificultad());
			    player1.setPuntos(Jugador.pmedio);
			}
		});

		//Boton Dificultad Alta
		
		//propiedades
		
		JButton btnAlta = new JButton("Alta");
		btnAlta.setBackground(Color.DARK_GRAY);
		btnAlta.setForeground(Color.RED);
		btnAlta.setBounds(398, 185, 89, 23);
		contentPane.add(btnAlta);
		
		//Acciones del boton
		
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player1.setDificultad(Jugador.alto);
				boxDificultad.setText(player1.getDificultad());
			    player1.setPuntos(Jugador.palto);
			}
		});
		
		/*---JUGADOR----*/
		
		player1 = new Jugador();
		player1.setNombre("Christian");
		player1.setApellidos("Molina");
		player1.setEdad(24);
		player1.setDificultad("Dificultad Media");
		player1.setPuntos(45);
	}
}

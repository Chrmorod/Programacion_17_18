package Logica;
import java.util.Random;
public class Jugador {
	//Una clase necesita un nombre y un constructor.
	
	//Atributos o Variables de la clase Jugador se accede mediante metodos/funciones
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int puntos;
	private String dificultad;
	private String EDAD;
	private Random id=new Random();
	
	//CONSTANTES
	
	public static final String bajo="Dificultad Baja";
	public static final int pbajo=100;
	public static final String medio="Dificultad Media";
	public static final int pmedio=45;
	public static final String alto="Dificultad Alta";
	public static final int palto=25;
	
	//Constructor de la clase
	
	public Jugador() {

	}
	/*---------Getters y setters de la clase Jugador----------*/
	
	//getter y setter Nombre
	
	public String getNombre() {
		return nombre;
	}
	
	//Condicion Nombre
	
	public void setNombre(String nombre) {
		if(nombre.length()==0){
			setNombre("Se ha olvidado de escribir el nombre, por favor escribalo");
		}else{
			this.nombre=nombre;
		}
	}
	//getter y setter Apellidos
	
	public String getApellidos() {
		return apellidos;
	}

	//Condicion Apellidos
	
	public void setApellidos(String apellidos) {
		if(apellidos.length()==0){
			setApellidos("\nSe ha olvidado de escribir los apellidos, por favor escribalo");
		}else{
			this.apellidos = apellidos;	
		}
	}
	
	//getter y setter edad
	
	public int getEdad() {
		return edad;
	}
	
	//Condicion edad
	
	public void setEdad(int edad) {
		if(edad<=0){
			this.edad=7;
		}else if(edad>80){
			this.edad=7;
		}else{
			this.edad=edad;
		}
	}
	
	//getter y setter dificultad
	
	public String getDificultad() {
		return dificultad;
	}
	
	//Condicion dificultad
	
	public void setDificultad(String dificultad) {
			switch(dificultad){
			case Jugador.bajo:
				this.dificultad=Jugador.bajo;
				break;
			case Jugador.medio:
				this.dificultad=Jugador.medio;
				break;
			case Jugador.alto:
				this.dificultad= Jugador.alto;
				break;
			default:
				this.dificultad= Jugador.medio;
			}		
	}
	
	//getter y setter puntos
	
	public int getPuntos() {
		return puntos;
	}
	
	//Condicion puntos
	
	public void setPuntos(int puntos) {
		switch(puntos){
		case Jugador.pbajo:
			this.puntos=Jugador.pbajo;
			break;
		case Jugador.pmedio:
			this.puntos=Jugador.pmedio;
			break;
		case Jugador.palto:
			this.puntos= Jugador.palto;
			break;
		default:
			this.puntos= Jugador.pmedio;
		}	
	}
	
	//getter y setter EDAD en String
	
	public String getEDAD() {
		return EDAD;
	}
	public void setEDAD(String EDAD) {
	    this.EDAD = EDAD;
	}
	//getter y setter Id(identificador)
	
	public Random getid() {
		return id;
	}

	public void setid(Random id) {
		this.id=id;

	}
	
	
}

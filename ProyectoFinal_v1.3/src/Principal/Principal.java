package Principal;
import Ventanas.Juego;
import Ventanas.Login;

public class Principal {

	public static void main(String[] args) {
		/*------Ventanas a utilizar----*/
		
		//Ventana del juego
		Juego game=new Juego();
		//Ventana Resumen de puntos, acierto y fallos

		//Generamos la ventana de Login
		Login login=new Login(game);
		login.setVisible(true);
	}

}

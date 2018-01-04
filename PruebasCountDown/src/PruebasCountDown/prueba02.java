package PruebasCountDown;

import java.util.Scanner;

public class prueba02  {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	//Pedimos numero
	System.out.println("Inserte Numero min");
	//Almacenamos en la variable num
	int min=teclado.nextInt();
	System.out.println("Inserte Numero seg");
	int seg=teclado.nextInt();
	System.out.println(min+":"+seg);
	try {
			for(int i=min;i>=0;i--){
				System.out.println("");
					if(min>0){
						min=min--;
							for(int j=seg;j>=0;j--){
								System.out.println("");
								if(seg>0){
									Thread.sleep(500);
									if(Integer.toString(j).length()==1){
										seg=seg--;
										System.out.println(i+":0"+j);
									}else{
										seg=seg--;
										System.out.println(i+":"+j);
									}
								}
							seg=59;
							
							}	
						}
				
	
			}	
	}catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	}
}

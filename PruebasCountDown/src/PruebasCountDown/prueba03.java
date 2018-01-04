package PruebasCountDown;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
public class prueba03 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel caja;
	private int time;
	private Scanner teclado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba03 frame = new prueba03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public prueba03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		caja = new JLabel("caja");
		caja.setBounds(150, 121, 46, 14);
		contentPane.add(caja);
		teclado = new Scanner(System.in);
		//Pedimos numero
		System.out.println("Inserte Numero min");
		//Almacenamos en la variable num
		int min=teclado.nextInt();
		System.out.println("Inserte Numero seg");
		int seg=teclado.nextInt();
		caja.setText(min+":0"+seg);
		time=min;
		Timer tm = new Timer (min,this);
		if(min==0){
			tm.stop();
		}else{
			tm.start();
			add(caja);
		}
	}
	public void logic(){//probamos solo con min de momento
		try{
			if (time>0){
				Thread.sleep(500);
				time--;
				caja.setText(""+time);	
			}
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		logic();
		repaint();
	}
			

}

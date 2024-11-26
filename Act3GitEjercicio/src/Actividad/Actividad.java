package Actividad;
import java.util.Random;
import java.util.Scanner;
public class Actividad {
	Random aleatorio= new Random();
	Scanner lector=new Scanner(System.in);
	public void entre2Numeros() {
		int numero1=lector.nextInt();
		int numero2=lector.nextInt();
		int numero3=lector.nextInt();
		for(int i=numero1;i<numero2; i+=7) {
			if((numero3<numero1) && (numero3>numero2)) {
				System.out.println("El tercer número está comprendido entre en número 1 y el número 2");
			}
		}
	}
	public int[] numerosAleatorios(){
		int numeros[]=new int[20];
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=aleatorio.nextInt(20);
			
		}
		return numeros;
	}
}

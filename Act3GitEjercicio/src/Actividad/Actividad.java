package Actividad;
import java.util.Random;
public class Actividad {
	public int[] numerosAleatorios(){
		int numeros[]=new int[20];
		Random aleatorio= new Random();
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=aleatorio.nextInt(20);
			
		}
		return numeros;
	}
}

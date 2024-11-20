package tarea3;
import java.util.Random;
public class Act3GitDesdeEclipse {
	
	public static int[] numerosAleatorios() {
		Random aleatorio= new Random();
		int numeros[]=new int [20];
		for(int i=1; i<numeros.length; i++) {
			numeros[i]=aleatorio.nextInt(10);
		}
		return numeros;
	}
}

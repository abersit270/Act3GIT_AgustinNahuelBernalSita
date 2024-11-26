package Actividad;
import java.util.Random;
import java.util.Scanner;
public class Actividad {
	Random aleatorio= new Random();
	Scanner lector=new Scanner(System.in);
	public int[] numerosAleatorios(){
		int numeros[]=new int[30];
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=aleatorio.nextInt(30);
			
		}
		return numeros;
	}
}

package Ejercicio2;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		/*2. Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
		mostrar un mensaje "Promocionado".*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la primera nota");
		int nota1=sc.nextInt();
		System.out.println("Introduce la segunda nota");
		int nota2=sc.nextInt();
		System.out.println("Introduce la tercera nota");
		int nota3=sc.nextInt();
		double media=(nota1+ nota2+nota3)/3;

		if(media>=7)
			System.out.println("Promocionado");
		else
			System.out.println("Suspenso");

	}

}

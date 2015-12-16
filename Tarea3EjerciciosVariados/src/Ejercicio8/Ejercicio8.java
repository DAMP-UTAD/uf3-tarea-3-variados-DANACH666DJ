package Ejercicio8;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		/*8. Realizar un programa que pida cargar una fecha cualquiera, luego verificar si
		dicha fecha corresponde a Navidad.*/
		
		Scanner sc=new Scanner(System.in);
		
		int fecha;
		int mes;
		System.out.println("Introduce una fecha");
		fecha=sc.nextInt();
		
		System.out.println("Introduce el mes");
		mes=sc.nextInt();
		
		if(fecha==25&&mes==12)
			System.out.println("Es navidad");
		else 
			System.out.println("No es navidad");
		


	}

}

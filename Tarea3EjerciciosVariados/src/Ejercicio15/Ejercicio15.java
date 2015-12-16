package Ejercicio15;
import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		/*15. Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
		cuántos tienen notas mayores o iguales a 7 y cuántos menores.*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Cuantas notas desea ingresar");
		int nota=sc.nextInt();
		int contador=0;
		
		while(nota>=contador){
			System.out.println("Ingrese nota");
			nota=sc.nextInt();
			if(nota>=7)
				contador++;
			else
				contador++;
			
		}
			System.out.println("El número de notas mayores es de :"+contador);
			System.out.println("El númerno de notas menores es de :"+contador);
		
	}

}

package Ejercicio15;
import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		/*15. Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
		cu�ntos tienen notas mayores o iguales a 7 y cu�ntos menores.*/
		
		Scanner sc=new Scanner(System.in);
		
		
		int contador=1;
		int mayor=0;
		int menor=0;
		
		while(contador<=10){
			System.out.println("Ingrese nota");
			int nota=sc.nextInt();
			contador++;
			if(nota>=7)
				mayor++;
			else
				menor++;
			
		}
			System.out.println("El n�mero de notas mayores es de :"+mayor);
			System.out.println("El n�merno de notas menores es de :"+menor);
		
	}

}

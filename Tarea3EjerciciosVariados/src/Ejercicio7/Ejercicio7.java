package Ejercicio7;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		/*7. Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
		siguiente información: cantidad total de preguntas que se le realizaron y la
		cantidad de preguntas que contestó correctamente. Se pide confeccionar un
		programa que ingrese los dos datos por teclado e informe el nivel del mismo
		según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
		Nivel máximo: Porcentaje>=90%
		Nivel medio: Porcentaje>=75% y <90%
		Nivel regular: Porcentaje>=50% y <75%
		Fuera de nivel: Porcentaje<50%*/
		
		Scanner sc=new Scanner(System.in);
		
		int preguntas;
		int respuestas;
		
		System.out.println("Las preguntas que le hicieron son");
		preguntas=sc.nextInt();
		System.out.println("Las respuestas que hizo fue");
		respuestas=sc.nextInt();
		
		if(respuestas>=90%preguntas)
			System.out.println("Nivel máximo");
		else if(respuestas>=75%preguntas)
			System.out.println("Nivel medio");
		else if(respuestas>=50%preguntas)
			System.out.println("Nivel regular");
		else
			System.out.println("Fuera de nivel");
		
		

	}

}

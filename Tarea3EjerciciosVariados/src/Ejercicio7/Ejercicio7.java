package Ejercicio7;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		/*7. Un postulante a un empleo, realiza un test de capacitaci�n, se obtuvo la
		siguiente informaci�n: cantidad total de preguntas que se le realizaron y la
		cantidad de preguntas que contest� correctamente. Se pide confeccionar un
		programa que ingrese los dos datos por teclado e informe el nivel del mismo
		seg�n el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
		Nivel m�ximo: Porcentaje>=90%
		Nivel medio: Porcentaje>=75% y <90%
		Nivel regular: Porcentaje>=50% y <75%
		Fuera de nivel: Porcentaje<50%*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Las preguntas que le hicieron son");
		int preguntas=sc.nextInt();
		System.out.println("Las respuestas que hizo fue");
		int respuestas=sc.nextInt();
		
		int porcentaje=(respuestas*100)/preguntas;
		
		
		
		if(porcentaje>=90)
			System.out.println("Nivel m�ximo");
		else if(porcentaje>=75&&porcentaje<90)
			System.out.println("Nivel medio");
		else if(porcentaje>=50&&porcentaje<75)
			System.out.println("Nivel regular");
		else
			System.out.println("Fuera de nivel");
		
		

	}

}

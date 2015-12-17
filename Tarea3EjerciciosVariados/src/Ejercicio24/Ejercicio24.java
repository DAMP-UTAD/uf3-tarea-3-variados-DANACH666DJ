package Ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		/*24. Confeccionar un programa que lea n pares de datos, cada par de datos
		corresponde a la medida de la base y la altura de un triángulo. El programa
		deberá informar:
		a) De cada triángulo la medida de su base, su altura y su superficie.
		b) La cantidad de triángulos cuya superficie es mayor a 12.*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduzca la cantidad de triángulos: ");
		int cantTri=scan.nextInt();
		int base,altura;
		float area;
		int cantidad12=0;
		//Proceso
		/*
		 * 1.-Pedir cantidad de triángulos
		 * 2.-Pedir base y altura de cada triángulo
		 * 3.-Calcular y mostrar área(base *altura/2)
		 * 4.-Llevar la cuenta de los mayores de 12
		 * 5.-Mostrar la cantidad
		 */
		for (int i = 0; i < cantTri; i++) {
			System.out.println("Introduzca la base: ");
			base=scan.nextInt();
			System.out.println("Introduzca la altura: ");
			altura=scan.nextInt();
			area=base*altura/2f;
			System.out.println("El área del triángulo es: "+area);
			if(area>12)
				cantidad12++;
			
		}
		//Presentación
		System.out.println("La cantidad de triángulos con área mayor que 12 es: "+cantidad12);

	}

}

package Ejercicio16;
import java.util.*;
public class Ejercicio16 {

	public static void main(String[] args) {
		/*16. Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura
		promedio de las personas.*/
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el número de alturas");
		int num=sc.nextInt();
		
		int contador=0;
		double altura=0;
		
		while(num>0){
			
			System.out.println("Introduce una altura");
			altura=altura+sc.nextInt();
			num--;contador++;
		}
		System.out.println("La altura media es : "+(altura/contador));
		
		


	}

}

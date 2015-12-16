package Ejercicio12;
import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		/*12. Escribir un programa que pida ingresar la coordenada de un punto en el plano,
		es decir dos valores enteros x e y (distintos a cero).
		Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto.
		(1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la coordenada x ");
		int x=sc.nextInt();
		System.out.println("Introduce la coordenada y ");
		int y=sc.nextInt();
		
		if(x>0&&y>0)
			System.out.println("Primer cuadrante");
		else if(x<0&&y>0)
			System.out.println("Segundo cuadrante");
		else if(y<0&&x>0)
			System.out.println("Tercer cuadrante");
		else if(y<0&&x<0)
			System.out.println("Cuarto cuadrante");
		
		

	}

}

package Ejercicio3;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99) mostrar
		un mensaje indicando si el n�mero tiene uno o dos d�gitos. (Tener en cuenta
		que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero)*/
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		
		System.out.println("Introduce un n�mero");
		num=sc.nextInt();
		
		if (num>=10) {
			System.out.println("El n�mero tiene dos d�gitos");
		}
		else
			System.out.println("El n�mero tiene s�lo un d�gito");

	}

}

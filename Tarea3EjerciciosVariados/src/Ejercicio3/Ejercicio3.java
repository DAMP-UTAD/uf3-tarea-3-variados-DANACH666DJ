package Ejercicio3;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		/*3. Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar
		un mensaje indicando si el número tiene uno o dos dígitos. (Tener en cuenta
		que condición debe cumplirse para tener dos dígitos, un número entero)*/
		
		Scanner sc=new Scanner(System.in);
		
		int num=0;
		
		System.out.println("Introduce un número");
		num=sc.nextInt();
		
		if (num>=10) {
			System.out.println("El número tiene dos dígitos");
		}
		else
			System.out.println("El número tiene sólo un dígito");

	}

}

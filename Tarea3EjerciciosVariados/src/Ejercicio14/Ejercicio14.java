package Ejercicio14;
import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		/*14. Escribir un programa en el cual: dada una lista de tres valores num�ricos
		distintos se calcule e informe su rango de variaci�n (debe mostrar el mayor y el
		menor de ellos)*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el primer n�mero");
		int num1=sc.nextInt();
		System.out.println("Introduce el segundo n�mero");
		int num2=sc.nextInt();
		System.out.println("Introduce el tercer n�mero");
		int num3=sc.nextInt();
		
		if(num1>num2&&num1>num3)
			System.out.println("El num1 es mayor a todos");
		else if(num2<num1&&num<num3)
			System.out.println("El num1 es menor a todos");
	}

}

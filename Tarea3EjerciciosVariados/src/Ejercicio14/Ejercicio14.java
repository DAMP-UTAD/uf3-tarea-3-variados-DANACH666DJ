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
		
		if(num1>num2&&num3>num1)
			System.out.println("El n�mero mayor es "+num3+" y el n�mero menor es "+num2);
		else if(num3>num1&&num2>num1)
			System.out.println("El n�mero mayor es "+num3+" y el n�mero menor es "+num1);
		else if(num3>num1&&num2>num3)
			System.out.println("El n�mero mayor es "+num2+" y el n�mero menor es "+num1);
		else if(num1>num3&&num2>num3)
			System.out.println("El n�mero mayor es "+num1+" y el n�mero menor es "+num3);
		else if(num1>num2&&num3>num2)
			System.out.println("El n�mero mayor es "+num1+" y el n�mero menor es "+num2);
		else if(num1>num3&&num2>num1)
			System.out.println("El n�mero mayor es "+num2+" y el n�mero menor es "+num3);
		
		
		
	}

}

package Ejercicio4;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		/*4. Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de
		ellos.*/
		
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		System.out.println("Introduce el número 1");
		num1=sc.nextInt();
		System.out.println("Introduce el número 2");
		num2=sc.nextInt();
		System.out.println("Introduce el número 3");
		num3=sc.nextInt();
		
		if (num1>num2&&num1>num3) {
			System.out.println(num1+" es mayor a todos");
		} else if(num2>num1&&num2>num3)
			System.out.println(num2+" es mayor a todos");
		  else if(num3>num1&&num3>num2)
			System.out.println(num3+" es mayor a todos");

		}
		


	}



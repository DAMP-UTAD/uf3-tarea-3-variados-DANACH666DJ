package Ejercicio17;
import java.util.*;
public class Ejercicio17 {

	public static void main(String[] args) {
		/*17. En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
		$500, realizar un programa que lea los sueldos que cobra cada empleado e
		informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de
		$300. Además el programa deberá informar el importe que gasta la empresa en
		sueldos al personal.*/
		
		Scanner sc=new Scanner(System.in);
		
		int contador=0;
		int medio=0;
		int mayor=0;
		int sueldo=0;
		System.out.println("Introduce un número de empleados");
		int num=sc.nextInt();
		
		while(num>0){
			
			System.out.println("Introduce el salario del empleado");
			int salario=sc.nextInt();
			sueldo=sueldo+salario;
			num--; contador++;
			
			if(salario>=100&& salario<=300){
				medio++;
			}else if(salario>=301){
				mayor++;
			}
			System.out.println("Hay "+mayor+" empleados que cobran más de 300 euros");
			System.out.println("Hay "+medio+" empleados que cobran entre 100 y 300 euros");
			System.out.println("La empresa tiene un gasto de "+sueldo+" euros");
		}
		

	}

}

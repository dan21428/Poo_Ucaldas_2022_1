
package poo1;
import java.util.Scanner;

public class poo {

	public static void main(String[] args) {
		
		double nota1, nota2, promedio = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite nota trimestre 1: ");
	     nota1 = sc.nextDouble();
	      System.out.print("Digite nota trimestre 2: ");
	      nota2 = sc.nextDouble();
	      
		promedio = nota1 + nota2;
		if(promedio >= 7) {
			System.out.println("El estudiante aprueba la Materia");
		}
		else {
			System.out.println("El estudiante no aprueba la Materia");
		}
		
	}

}
}
 

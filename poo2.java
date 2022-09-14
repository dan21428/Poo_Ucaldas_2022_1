package poo1;
import java.util.Scanner;

public class poo2 {

	public static void main(String[] args) {
		int nota1, nota2, promedio = 0;
		Scanner sc = new Scanner(System.in);
			System.out.print("Digite nota trimestre 1: ");
	     nota1 = sc.nextInt();
	      System.out.print("Digite nota trimestre 2: ");
	      nota2 = sc.nextInt();
	      
		promedio = nota1 + nota2;
		/*if(promedio >= 7) {
			System.out.println("El estudiante aprueba la Materia");
		}
		else if(promedio >= 5 && promedio < 7)
		{
			System.out.println("El estudiante tiene derecho a supletorio.");
		}
		else {
			System.out.println("el estudiante perdio");
		}*/
		switch(promedio) 
		{
		case 0,1,2,3,4:
			System.out.println("reprobo");
		break;
		case 5,6:
			System.out.println("tiene derecho a supletorio");
		break;
		default:
			System.out.println("Aprobo");
			break;
		}
		
	


	}

}

package patika;
import java.util.Scanner;
public class hypotenusfinder {

	public static void main(String[]args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Write the first edge : ");
	System.out.println("Write the second edge : ");
	
	double FirstEdge ;
	double SecondEdge ;
	FirstEdge = input.nextDouble();
	SecondEdge = input.nextDouble();
	 
	double hypotenus = FirstEdge * FirstEdge + SecondEdge * SecondEdge;
	 
	 System.out.println("Hypotenus : " + Math.sqrt(hypotenus));
	}
}

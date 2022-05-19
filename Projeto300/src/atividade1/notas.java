package atividade1;
import java.util.Scanner;
public class notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		
		float nota;
		float sum=0;
		 
		for (int i=1;i<=10;i++) {
			
			System.out.printf("Insira a %dº nota: ", i);
			
		     nota = ler.nextFloat();
		     sum+=nota;
		     
		}
		
		   float media = sum/10;

		   

			     System.out.println("A média das notas é: "+media);

			  

			   
        		
		
		
		
		
		
		
		
	}

}

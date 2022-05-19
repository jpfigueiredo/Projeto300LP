package atividade2;

import java.util.ArrayList;
import java.util.Scanner;

public class meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);

		
		
		ArrayList<String> meses = new ArrayList();
		
		meses.add("Janeiro");
		meses.add("Fevereiro");
		meses.add("Março");
		meses.add("Abril");
		meses.add("Maio");
		meses.add("Junho");
		meses.add("Julho");
		meses.add("Agosto");
		meses.add("Setembro");
		meses.add("Outubro");
		meses.add("Novembro");
		meses.add("Dezembro");
		
		int i;
		
		System.out.println("Insira o número do mês desejado\n");
		i = ler.nextInt();
		
		int n = meses.size();
	
		for (i=0; i<0; i++) {
			System.out.printf("O mês referente a este número é: %d- %s", i, meses.get(i));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

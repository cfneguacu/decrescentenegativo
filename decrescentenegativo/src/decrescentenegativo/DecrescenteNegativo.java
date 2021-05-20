package decrescentenegativo;

import java.util.Scanner;

public class DecrescenteNegativo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n,k,i,j,cont;
		System.out.print("Range dos numeros negativos que vou analisar de 0 a -k: Digite k");
		k = entrada.nextInt();
		System.out.print("Quantidade de Numeros negativos que preciso ");
		n = entrada.nextInt();
		int vetorNum[] = new int [n];
		int vetorDecrescente[] = new int[k];
		
		for (i = 0; i < n; i++) {
		
		System.out.print(">");

		vetorNum[i] = entrada.nextInt();	
			
		}
		
		for (i = 0; i < n; i++) {
			
			if(vetorNum[i] <=0) {
				
				vetorDecrescente[vetorNum[i]*-1] = vetorNum[i];
				
			}
				
		}
		
		System.out.println("Ordem Descrescente");

		for(i = 0 ; i < k ; i++) {
			
			if(vetorDecrescente[i] < 0 ) {
			
			System.out.println(vetorDecrescente[i]);
			
			}
			
		}
		
		
		

	}

}

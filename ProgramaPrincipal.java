package questão;

import java.util.Scanner;



public class ProgramaPrincipal {
	
	
	static int max = 10;
	
	public static void main(String[] args) {
		
		int trocas=0, comp=0;
		
		Scanner teclado = new Scanner(System.in);
		int vet[] = new int [max];
		
		
		for(int i =0; i<max; i++) {
			System.out.println("digite o valor para posição "+i+" do vetor");
			vet[i]=teclado.nextInt();
		}
		
		
		for(int i=0; i<max; i++) {
			System.out.println("posição:"+i+" valor: "+vet[i]);
		}
		
		for(int i = 0; i<vet.length; i++){
			for(int j = 0; j<vet.length-1; j++){
				
				if(vet[j] > vet[j + 1]){
					int aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
					trocas+=2;
				}
				comp++;
				
			}
		}
		System.out.println("\n\nBubblesort:\nhouveram "+comp+" comparações e "+trocas+" trocas!\n");
		for(int i=0;i<vet.length;i++) {
			System.out.println("posição:"+i+" valor: "+vet[i]);
		}
	}
}

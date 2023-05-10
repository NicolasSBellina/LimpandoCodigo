package quest�o;

import java.util.Scanner;



public class ProgramaPrincipal {

	public static void Bubble(int vetor[]){

		int trocas=0, comparacoes=0;

		for(int i = 0; i<vetor.length; i++){
			for(int j = 0; j<vetor.length-1; j++){
				
				if(vetor[j] > vetor[j + 1]){
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					trocas+=2;
				}
				comparacoes++;
				
			}
		}
		System.out.println("\n\nBubblesort:\nhouveram "+comparacoes+" compara��es e "+trocas+" trocas!\n");
		for(int i=0;i<vet.length;i++) {
			System.out.println("posi��o:"+i+" valor: "+vetor[i]);
		}

	}
	
	
	static int max = 10;
	
	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int [max];
		
		
		for(int i =0; i<max; i++) {
			System.out.println("digite o valor para posi��o "+i+" do vetor");
			vetor[i]=teclado.nextInt();
		}
		
		
		for(int i=0; i<max; i++) {
			System.out.println("posi��o:"+i+" valor: "+vetor[i]);
		}

		Bubble(vetor);
		
	}
}

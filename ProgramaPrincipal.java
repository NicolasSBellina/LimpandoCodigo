package quest�o;

import java.util.Scanner;



public class ProgramaPrincipal {

	public static void Bubble(int vetor[]){ // Função que realiza a organização do vetor printando-o. Contando a quantidade de comparações e trocas realizadas durante o processo.

		int trocas=0, comparacoes=0; 

		for(int i = 0; i<vetor.length; i++){ // Algoritimo de organização bubble sort.
			for(int j = 0; j<vetor.length-1; j++){
				
				if(vetor[j] > vetor[j + 1]){ 
					int aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					trocas+=2; // contador de trocas.
				}
				comparacoes++; // contador de comparações.
				
			}
		}
		System.out.println("\n\nBubblesort:\nhouveram "+comparacoes+" compara��es e "+trocas+" trocas!\n"); // printando o numero de trocas e comparações realizadas.
		for(int i=0;i<vet.length;i++) {
			System.out.println("posi��o:"+i+" valor: "+vetor[i]); // printando o vetor organizado.
		}

	}
	
	
	static int max = 10;
	
	public static void main(String[] args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int [max];
		
		
		for(int i =0; i<max; i++) { // Laço que pede que o usuario digite um valor para cada posição do vetor a ser organizado. 
			System.out.println("digite o valor para posi��o "+i+" do vetor"); 
			vetor[i]=teclado.nextInt();
		}
		
		
		for(int i=0; i<max; i++) {// printando o vetor digitado pelo usuario antes do algoritimo de organização.
			System.out.println("posi��o:"+i+" valor: "+vetor[i]); 
		}

		Bubble(vetor); // chamando a função de organização de vetor.
		
	}
}

package exercicio_um;

import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
		
		double soma = 0;		
		Scanner entrada = new Scanner(System.in);
		
		do{	
			for(double num = 0; num < soma; num++) {
				System.out.println("Digite um numero: ");
				num = entrada.nextDouble();

				if(num < 0){
					System.out.println("Números negativos não são válidos!");
				}else{
					soma += num;
					if(soma >= 300){
							System.out.println("O somatório é de: " + soma);
					};
				};
			};					
				
		}while(soma <= 300);
		
	}
}

package exercicio_tres;

import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor inicial:");
		double valorInicial = entrada.nextDouble();
		double jurosMensaisComIR = 0.35;
		double jurosMensaisSemIR = 0.3;
			
		for(int i = 1; i<=36; i++) {
			InvestimentoComIR comIR = new InvestimentoComIR(valorInicial, jurosMensaisComIR);
			InvestimentoSemIR semIR = new InvestimentoSemIR(valorInicial, jurosMensaisSemIR);
			
			System.out.println("Mes: " + i + " | Invenstimento sem IR: " + 
		    semIR.calcularLucro(i) + " | Investimento com IR: " + comIR.calcularLucro(i));
		}
		
	
			
	}
}

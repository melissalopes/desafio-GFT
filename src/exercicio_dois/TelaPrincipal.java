package exercicio_dois;

import java.util.Scanner;

public class TelaPrincipal {

	public static void main(String[] args) {
			
		
		double valorInicialComIR = 5000;
		double jurosMensaisComIR = 1.2;
		int mesesComIR = 17;
		
		InvestimentoComIR comIR = new InvestimentoComIR(valorInicialComIR, jurosMensaisComIR);
		System.out.println("Com IR: R$ " + comIR.calcularLucro(mesesComIR));
		
		double valorInicialSemIR = 3000;
		double jurosMensaisSemIR = 0.7;
		int mesesSemIR = 10;
		
		InvestimentoSemIR semIR = new InvestimentoSemIR(valorInicialSemIR, jurosMensaisSemIR);
		System.out.println("Sem IR: R$ " + semIR.calcularLucro(mesesSemIR));		
	}
}

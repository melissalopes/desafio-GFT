package exercicio_dois;

public class InvestimentoSemIR extends investimento{

	public InvestimentoSemIR(double valorInicial, double jurosMensais) {
		super(valorInicial, jurosMensais);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularLucro(int meses) {
		if(valorInicial < 1000) {
			System.out.println("O valor inicial (sem IR) não pode ser menor que zero");
			return 0;
		}else {			
			double juros = jurosMensais/100;
			double calculo = Math.pow(1.0+juros, meses);		
			
			return ((valorInicial*calculo) - valorInicial);
		}		
	}

}

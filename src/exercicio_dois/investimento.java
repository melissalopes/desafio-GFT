package exercicio_dois;

public class investimento {
	double valorInicial;
	double jurosMensais;
	
	public investimento(double valorInicial, double jurosMensais) {
		super();
		this.valorInicial = valorInicial;
		this.jurosMensais = jurosMensais;
	}
	
	public double calcularLucro(int meses) {
		
		double juros = jurosMensais/100;
		double calculo = Math.pow(1.0+juros, meses);
				
		return ((valorInicial*calculo) - valorInicial);

	}
	
}

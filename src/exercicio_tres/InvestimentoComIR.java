package exercicio_tres;

public class InvestimentoComIR extends investimento {

	public InvestimentoComIR(double valorInicial, double jurosMensais) {
		super(valorInicial, jurosMensais);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcularLucro(int meses) {
		
		double juros = jurosMensais/100;
		double calculo = Math.pow(1.0+juros, meses);
		double valorFinal = ((valorInicial*calculo) - valorInicial);
		double resultado = 0;
				
		if(meses < 6) {								
			return resultado = (valorFinal - (valorFinal*0.225));
		}else if(meses>=6 && meses<12) {						
			return resultado = (valorFinal - (valorFinal*0.2));
		}else if(meses>=12 && meses<24) {		
			return resultado = (valorFinal- (valorFinal*0.175));
		}else if(meses>=24) {
			return resultado = (valorFinal - (valorFinal*0.175));
		}
		return resultado;
	}

}

package br.com.fluentcode.jaxws.client.test;

import br.com.fluentcode.jaxws.client.artifact.Calculator;
import br.com.fluentcode.jaxws.client.artifact.CalculatorService;

public class Main {

	public static void main(String[] args) {
		CalculatorService service = new CalculatorService();
		Calculator calculator = service.getCalculatorPort();
		int result = calculator.add(2, 3);
		System.out.println(result);
	}

}

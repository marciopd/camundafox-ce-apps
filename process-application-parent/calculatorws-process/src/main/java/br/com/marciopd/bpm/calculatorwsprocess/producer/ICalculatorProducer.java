package br.com.marciopd.bpm.calculatorwsprocess.producer;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import com.parasoft.wsdl.calculator.Calculator;
import com.parasoft.wsdl.calculator.ICalculator;

public final class ICalculatorProducer {

	@Produces
	@ApplicationScoped
	public ICalculator produceICalculator() {
		return new Calculator().getICalculator();
	}

}

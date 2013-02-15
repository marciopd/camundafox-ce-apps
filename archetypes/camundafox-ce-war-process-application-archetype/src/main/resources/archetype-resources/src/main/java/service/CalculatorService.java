#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.parasoft.wsdl.calculator.ICalculator;

@Named
public class CalculatorService {

	@Inject
	private ICalculator calculator;

	protected void setCalculator(ICalculator calculator) {
		this.calculator = calculator;
	}

	public void add(Number x, Number y) {
		final float result = calculator.add(x.floatValue(), y.floatValue());
		System.out.println("Add result: " + result);
	}
}

#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import javax.inject.Named;

@Named
public class HelloWorldService {

	public void sayHello() {
		System.out.println("Merry Christmas!!");
	}
}

package com.example.fahrenheitconverter.JavaWSDLFahrenheitConverter;

import JavaWSDLFahrenheitConverter.forras.AFDTempConverterEndpointServiceSoapBinding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaWsdlFahrenheitConverterApplication {

	public static void main(String[] args) throws Exception {

		/**
		 * double fahrenheitValue = 0;
		 * 	double c = 37;
		 *
		 * AFDTempConverterEndpointServiceSoapBinding service = new AFDTempConverterEndpointServiceSoapBinding("http://www.learnwebservices.com/services/tempconverter");
		 * Double res = service.CelsiusToFahrenheit(c);
		 *
		 * 	fahrenheitValue = res;
		 * 	System.out.println(fahrenheitValue);
		 */

		SpringApplication.run(JavaWsdlFahrenheitConverterApplication.class, args);
	}

}

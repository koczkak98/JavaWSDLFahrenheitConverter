package JavaWSDLFahrenheitConverter.parser;

import JavaWSDLFahrenheitConverter.forras.AFDTempConverterEndpointServiceSoapBinding;
import org.jdom2.input.SAXBuilder;

public class Converter {

    public double getCelsiusToFahrenheit (double c) throws Exception {
        double fahrenheitValue = 0;

        AFDTempConverterEndpointServiceSoapBinding service = new AFDTempConverterEndpointServiceSoapBinding("http://www.learnwebservices.com/services/tempconverter");
        Double res = service.CelsiusToFahrenheit(c);

        fahrenheitValue = res;

        return fahrenheitValue;
    }

}

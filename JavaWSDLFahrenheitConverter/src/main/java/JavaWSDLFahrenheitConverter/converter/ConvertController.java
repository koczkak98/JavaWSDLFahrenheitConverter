package JavaWSDLFahrenheitConverter.converter;

import JavaWSDLFahrenheitConverter.forras.AFDTempConverterEndpointServiceSoapBinding;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertController {

    @GetMapping("/{celsius}")
    public String getCelsiusToFahrenheit
            (@PathVariable("celsius") double c)
            throws Exception
    {
        double fahrenheitValue = 0;

        AFDTempConverterEndpointServiceSoapBinding service = new AFDTempConverterEndpointServiceSoapBinding("http://www.learnwebservices.com/services/tempconverter");
        Double res = service.CelsiusToFahrenheit(c);

        fahrenheitValue = res;

        return ("F°: " + fahrenheitValue);
    }
}

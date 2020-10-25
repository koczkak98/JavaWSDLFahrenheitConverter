package com.example.fahrenheitconverter.JavaWSDLFahrenheitConverter.converter;

import JavaWSDLFahrenheitConverter.forras.AFDTempConverterEndpointServiceSoapBinding;
import com.example.fahrenheitconverter.JavaWSDLFahrenheitConverter.model.Fahrenheit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ConvertController {

    @GetMapping ("/")
    public String welcome (Model model)
    {
        /** Add F° */
        model.addAttribute("fahrenheit", new Fahrenheit());

        return "welcome.html";
    }

    @PostMapping("/")
    public String getCelsiusToFahrenheit
            (Fahrenheit fahrenheit, Model model) throws Exception {

            try {
                String fahrenheitValue = fahrenheit.getInput();

                System.out.println(fahrenheitValue);

                /** comma problem */
                if (fahrenheitValue.contains(",")) {
                    fahrenheitValue = fahrenheitValue.replace(",", ".");
                }

                AFDTempConverterEndpointServiceSoapBinding service = new AFDTempConverterEndpointServiceSoapBinding("http://www.learnwebservices.com/services/tempconverter");
                Double res = service.CelsiusToFahrenheit(Double.parseDouble(fahrenheitValue));


                model.addAttribute("result", res + " F°");
            }
            catch (IllegalArgumentException e)
            {
                model.addAttribute("error", "Incorrect type!");
            }
            catch (Exception e)
            {
                model.addAttribute("error", "Incorrect type!");
            }



        return "welcome.html";
    }
}

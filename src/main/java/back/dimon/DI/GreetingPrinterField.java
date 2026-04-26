package back.dimon.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterField {
    @Autowired
    @Qualifier("greetFormal")
    private GreetingService greetingService;

    GreetingPrinterField() {
    }

    public void print(String name) {
        System.out.println(greetingService.greet(name));
    }
}

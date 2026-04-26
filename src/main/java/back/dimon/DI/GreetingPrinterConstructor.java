package back.dimon.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterConstructor {
    private final GreetingService greetingService;

    GreetingPrinterConstructor(@Qualifier("greetFriend")GreetingService greetingService) {
        this.greetingService=greetingService;
    }

    public void print(String name) {
        System.out.println(greetingService.greet(name));
    }

}

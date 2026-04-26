package back.dimon.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("greetFormal")
public class FormalGreetingService implements GreetingService{

    @Override
    public String greet(String name) {
        return "Добро пожаловать " + name;
    }
}

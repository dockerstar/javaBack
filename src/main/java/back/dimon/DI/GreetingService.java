package back.dimon.DI;

import org.springframework.stereotype.Component;

@Component
public interface GreetingService {
    String greet(String name);
}

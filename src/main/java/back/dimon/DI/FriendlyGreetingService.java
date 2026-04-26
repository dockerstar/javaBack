package back.dimon.DI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("greetFriend")
@Primary
public class FriendlyGreetingService implements GreetingService{

    @Override
    public String greet(String name) {
        return "Здарова заебал, "+name;
    }
}

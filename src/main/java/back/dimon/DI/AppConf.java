package back.dimon.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("back.dimon.DI")
public class AppConf {

    @Bean
    public GreetingPrinterConstructor greetingPrinterConstructor(   GreetingService greetingService) {
        return new GreetingPrinterConstructor(greetingService);
    }
}

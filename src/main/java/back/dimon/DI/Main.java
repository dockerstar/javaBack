package back.dimon.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);

        GreetingPrinterSetter greetingPrinterSetter =context.getBean(GreetingPrinterSetter.class);
        greetingPrinterSetter.print("Димон");

        GreetingPrinterConstructor greetingPrinterConstructor = context.getBean(GreetingPrinterConstructor.class);
        greetingPrinterConstructor.print("Вася");

        GreetingPrinterField greetingPrinterField = context.getBean(GreetingPrinterField.class);
        greetingPrinterField.print("All");
    }
}

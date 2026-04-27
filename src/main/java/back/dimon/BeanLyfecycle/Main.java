package back.dimon.BeanLyfecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppLogger appLogger1 = context.getBean(AppLogger.class);
        AppLogger appLogger2 = context.getBean(AppLogger.class);

        System.out.println("al1 = al2: " + (appLogger1 == appLogger2));

        OperationContext operationContext1 = context.getBean(OperationContext.class);
        OperationContext operationContext2 = context.getBean(OperationContext.class);
        OperationContext operationContext3 = context.getBean(OperationContext.class);

        System.out.println("oc1 = oc2: " + (operationContext1 == operationContext2));

        context.close();
    }
}

package back.dimon.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("back.dimon.properties");

        PlannerService plannerService = context.getBean(PlannerService.class);
        plannerService.printConfig();

        context.close();
    }

}

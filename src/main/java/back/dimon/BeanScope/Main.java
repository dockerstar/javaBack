package back.dimon.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("back.dimon.BeanScope");

        JobRunner jobRunner1 = context.getBean(JobRunner.class);
        JobRunner jobRunner2 = context.getBean(JobRunner.class);
        jobRunner1.runOnce();
        jobRunner2.runOnce();
        System.out.println("BeanSCope");
    }
}

package back.dimon.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("back.dimon.aop")
@EnableAspectJAutoProxy
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        EmailService emailService = context.getBean(EmailService.class);
        UserService userService = context.getBean(UserService.class);

        emailService.send("al@mail.ru", "");
        userService.updateName(0L, "dima");
    }
}

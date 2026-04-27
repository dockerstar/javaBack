package back.dimon.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private String email;
    private String text;

    EmailService(String email, String text) {
        this.email=email;
        this.text=text;
    }

    EmailService() {}

    @NotNullArgs
    public void send(String email, String text) {
        System.out.println("Отправлено сообщение: %s, текст: %s".formatted(email, text));
    }
}

package back.dimon;

import org.springframework.stereotype.Component;

public class UserMessageService {
    public String createMessage(String name) {
        return "Привет, " + name + ", добро брат";
    }
}

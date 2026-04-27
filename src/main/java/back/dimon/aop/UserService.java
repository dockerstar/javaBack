package back.dimon.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;
@Component
public class UserService {
    private Long userId;
    private String name;

    public UserService(Long userId, String name) {
        this.name = name;
        this.userId = userId;
    }

    UserService() {}


    @NotNullArgs
    public void updateName(Long userId, String name) {
        System.out.println("Обновлено имя на " + name +" для " + userId);
    }
}

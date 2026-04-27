package back.dimon.BeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class TaskContext {
    private UUID id;

    @Autowired
    TaskContext(){
        this.id = UUID.randomUUID();
    }

    public UUID getUUID() {
        return id;
    }
}

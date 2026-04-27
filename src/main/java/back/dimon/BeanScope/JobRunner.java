package back.dimon.BeanScope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobRunner {
    private final ObjectProvider<TaskContext> taskContext;

    @Autowired
    JobRunner(ObjectProvider<TaskContext> taskContext) {
        this.taskContext = taskContext;
    }

    public void runOnce() {
        System.out.println(taskContext.getObject().getUUID());
    }
}

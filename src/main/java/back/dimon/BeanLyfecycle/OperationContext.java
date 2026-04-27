package back.dimon.BeanLyfecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class OperationContext {
    private final Long createAt = System.nanoTime();

    OperationContext() {
        System.out.println("OperationContext createAt: %s".formatted(createAt));
    }

    @PostConstruct
    public void init() {
        System.out.println("OperationContext init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("OperationContext destroy");
    }
}

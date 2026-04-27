package back.dimon.BeanLyfecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AppLogger {
    private final Long createAt = System.nanoTime();

    AppLogger() {
        System.out.println("AppLogger createAt: %s".formatted(createAt));
    }

    @PostConstruct
    public void init() {
        System.out.println("AppLogger init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("AppLogger destroy");
    }
}

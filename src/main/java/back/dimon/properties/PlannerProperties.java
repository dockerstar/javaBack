package back.dimon.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class PlannerProperties {
    private final int defaultDuration;
    private final int batchSize;

    PlannerProperties(@Value("${planner.default-duration}") int defaultDuration,
                      @Value("${planner.batch-size}") int batchSize) {
        this.defaultDuration=defaultDuration;
        this.batchSize=batchSize;
    }

    public int getDefaultDuration() {
        return defaultDuration;
    }

    public int getBatchSize() {
        return batchSize;
    }
}

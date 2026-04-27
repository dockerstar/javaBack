package back.dimon.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlannerService {
    private final boolean enabled;
    private final PlannerProperties plannerProperties;

    PlannerService(
            @Value("${planner.enabled}") boolean enabled ,PlannerProperties plannerProperties) {
        this.enabled=enabled;
        this.plannerProperties=plannerProperties;
    }

    public void printConfig() {
        System.out.println("enabled: "+enabled);
        System.out.println("duration: " + plannerProperties.getDefaultDuration());
        System.out.println("size: "+plannerProperties.getBatchSize());
    }


}

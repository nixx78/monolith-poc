package lv.nixx.poc.monolith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ArchitectureTest {

    ApplicationModules modules = ApplicationModules.of(DemoApplication.class);

    @Test
    void verifyDependencies() {
        modules.verify();
    }
}

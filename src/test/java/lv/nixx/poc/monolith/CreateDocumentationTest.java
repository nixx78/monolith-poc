package lv.nixx.poc.monolith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.docs.Documenter;

class CreateDocumentationTest {

    @Test
    void writeModuleDocumentation() {
        new Documenter(DemoApplication.class)
                .writeDocumentation();
    }
}


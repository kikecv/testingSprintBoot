package guru.springframework.sfgpetclinic;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controller")
public interface ControllerTests {

	static final Logger logger = Logger.getLogger(ControllerTests.class.getName());

	@BeforeAll
	default void beforeAll() {
		logger.info("Before all tests");
	
	}

	@AfterAll
	default void afterAllTests() {
		logger.info("After all tests");
	}

	@BeforeEach
	default void beforeEachTest(TestInfo testInfo) {
		logger.info(() -> String.format("About to execute [%s]", testInfo.getDisplayName()));
	}

	@AfterEach
	default void afterEachTest(TestInfo testInfo) {
		logger.info(() -> String.format("Finished executing [%s]", testInfo.getDisplayName()));
	}

}

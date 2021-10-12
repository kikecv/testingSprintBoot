package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repetido")
public interface ModelRepeatedTests {


	@BeforeEach
	default void beforeEachConsoleOutputer(TestInfo testInfo, RepetitionInfo repetionInfo) {
		System.out.println("Ejecutando pruebas -"+ testInfo.getDisplayName()
							+" - "+repetionInfo.getCurrentRepetition()
							+" | "+repetionInfo.getTotalRepetitions());
	}
}

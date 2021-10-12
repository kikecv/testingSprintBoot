package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;


import guru.springframework.sfgpetclinic.ModelRepeatedTests;

public class PersonRepeatedTests implements ModelRepeatedTests{


	@RepeatedTest(value =10,name ="{displayName}: {currentRepetition} - {totalRepetitions}")
	@DisplayName("Mi prueba repetida")
	void myRepeatTest() {
		
	}

	@RepeatedTest(5)
	void myRepeatTestWithDI() {
		
	}
	
	@RepeatedTest(value =5,name ="{displayName}: {currentRepetition} - {totalRepetitions}")
	@DisplayName("Mi prueba de asignacion repetida")
	void myAssignmentRepeated() {
		
	}
	
}

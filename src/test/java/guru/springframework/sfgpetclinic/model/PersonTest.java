package guru.springframework.sfgpetclinic.model;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;

import guru.springframework.sfgpetclinic.ModelTests;


class PersonTest implements ModelTests{

	@Test
	void groupedAssertions() {
		Person person = new Person(1l, "Enrique", "Carrillo");
		
		assertAll("Test Props Set",
				()->assertEquals("Enrique",person.getFirstName()),
				()->assertEquals("Carrillo",person.getLastName())
				);
	}
	
	@Test
	void groupedAssertionsMsgs() {
		Person person = new Person(1l, "Enrique", "Carrillo");
		
		assertAll("Test Props Set",
				()->assertEquals("Enrique",person.getFirstName(), "Primer nombre fallido"),
				()->assertEquals("Carrillo",person.getLastName())
				);
	}
	
	
	
}

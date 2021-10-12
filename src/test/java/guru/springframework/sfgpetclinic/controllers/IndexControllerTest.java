package guru.springframework.sfgpetclinic.controllers;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import guru.springframework.sfgpetclinic.ControllerTests;


class IndexControllerTest implements ControllerTests{

	IndexController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new IndexController();
	}

	@DisplayName("Test Proper View name is returned for index page")
	@Test
	void testIndex() {
		assertEquals("index", controller.index(),"Vista retornada erroena");
		
		assertThat(controller.index()).isEqualTo("index");
	}

	@DisplayName("Test exception")
	@Test
	void testOupsHandler() {
		//assertTrue("notimplemented".equals(controller.oupsHandler()),()-> "This is some expensive Message to build for my test");
		assertThrows(ValueNotFoundException.class, ()-> {
			controller.oupsHandler();
		});
	}
	
	@Disabled("Demo of timeout")
	@Test
	void testTimeOut() {
		
		assertTimeout(Duration.ofMillis(100), ()-> Thread.sleep(6000));
		System.out.println("I got here");
	}
	
	@Disabled("Demo of timeout")
	@Test
	void testTimeOutPrempt() {
		
		assertTimeoutPreemptively(Duration.ofMillis(100), ()-> Thread.sleep(6000));
		System.out.println("I got here 2243423532523");
	
	}
	
	@Test
	void testAssumptionTrue() {
		
		assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));

	}
	
	@Test
	void testAssumptionTrueAssumptionTrue() {
		
		assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU")));

	}
	
	@EnabledOnOs(OS.MAC)
	@Test
	void testMeOnMacOS() {
		
	}
	
	@EnabledOnOs(OS.WINDOWS)
	@Test
	void testMeOnWindows() {
		
	}

	@EnabledOnJre(JRE.JAVA_8)
	@Test
	void testMeOnJava8() {
		
	}
	
	@EnabledOnJre(JRE.JAVA_11)
	@Test
	void testMeOnJava11() {
		
	}
	
	@EnabledIfEnvironmentVariable(named = "USER",matches = "jt")
	@Test
	void testIFUserJT() {
		
	}
	
	@EnabledIfEnvironmentVariable(named = "USER",matches = "fred")
	@Test
	void testIFUserFred() {
		
	}



}

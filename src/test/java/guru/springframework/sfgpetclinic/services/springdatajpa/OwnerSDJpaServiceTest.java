package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpetclinic.model.Owner;

@Disabled("Disabled until we learn Mocking")
class OwnerSDJpaServiceTest {

	OwnerSDJpaService service;
	
	@BeforeEach
	void setUp(){
		service = new OwnerSDJpaService(null, null, null);
	}

	@Test
	void testOwnerSDJpaService() {
		
	}

	@Disabled
	@Test
	void testFindByLastName() {
		Owner founderOwner = service.findByLastName("Kike");
		
				
	}

	@Test
	void testFindAllByLastNameLike() {
		
	}

	@Test
	void testFindAll() {
		
	}

	@Test
	void testFindById() {
		
	}

	@Test
	void testSave() {
		
	}

	@Test
	void testDelete() {
		
	}

	@Test
	void testDeleteById() {
		
	}

}

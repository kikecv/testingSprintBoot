package guru.springframework.sfgpetclinic.services.map;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import guru.springframework.sfgpetclinic.model.Pet;

class PetMapServiceTest {

	PetMapService petMapService;

	@BeforeEach
	void setUp() {

		petMapService = new PetMapService();

		Pet pet1 = new Pet(1l);
		Pet pet2 = new Pet(2l);

		petMapService.save(pet1);
		petMapService.save(pet2);

	}

	@Test
	@DisplayName("Check to find all the peps")
	void testFindAll() {

		int pets = petMapService.findAll().size();
		assertEquals(2, pets);

	}

	@Test
	@DisplayName("Check pet is saved correctly")
	void testSave() {

		Long newIdPetToSave = 3l;
		Pet petToSave = new Pet(newIdPetToSave);
		petToSave.setName("Rocky");
	
		petMapService.save(petToSave);

		assertEquals("Rocky",petMapService.map.get(3l).getName());

	}
	
	@Test
	@DisplayName("Check pet is deleted correctly")
	void testDeleteById() {

		petMapService.deleteById(2l);

		assertEquals(1,petMapService.map.size());

	}
	
	@Test
	@DisplayName("Check pet is not null")
	void testSaveException() {

		
		Exception e = assertThrows(RuntimeException.class, ()->{
			petMapService.save(null);
		});

		assertEquals("Object cannot be null", e.getMessage());

	}

}

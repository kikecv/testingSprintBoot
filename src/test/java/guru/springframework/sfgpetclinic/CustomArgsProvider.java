package guru.springframework.sfgpetclinic;

import java.util.stream.Stream;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class CustomArgsProvider implements ArgumentsProvider {

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {

		return Stream.of(Arguments.of("FL", 7, 10), Arguments.of("OH", 4, 1), Arguments.of("MI",9, 11));
	}

	
}

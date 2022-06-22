package j;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		Optional emptyOptional = Optional.empty();
		Optional nonEmptyOptional = Optional.of("peter");
		Optional nonEmptyOrEmptyOptional1 = Optional.ofNullable("peter");
		Optional nonEmptyOrEmptyOptional2 = Optional.ofNullable(null);
		System.out.println(emptyOptional);
		System.out.println(nonEmptyOptional);
		System.out.println(nonEmptyOrEmptyOptional1);
		System.out.println(nonEmptyOrEmptyOptional2);
		
		
	}

}

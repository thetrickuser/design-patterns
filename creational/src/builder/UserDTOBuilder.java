package builder;

import java.time.LocalDate;

public interface UserDTOBuilder {

	// method to build parts
	UserDTOBuilder withFirstName(String fname);

	UserDTOBuilder withLastName(String lname);

	UserDTOBuilder withAddress(Address address);

	UserDTOBuilder withBirthday(LocalDate birthday);

	// method to assemble parts
	UserDTO build();

	// method to fetch already built product
	UserDTO getUserDTO();

}

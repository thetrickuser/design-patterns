package builder;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		UserDTO userDTO = directBuild(builder, user);
		System.out.println(userDTO);

	}

	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withAddress(user.getAddress()).withBirthday(user.getBirthday()).build();

	}

	/**
	 * 
	 * @return a sample User
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1997, 11, 10));
		user.setFirstName("Adhyan");
		user.setLastName("Suryan");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setCity("Patna");
		address.setState("Bihar");
		address.setStreet("Mithila Colony");
		address.setZipcode("800018");
		user.setAddress(address);

		return user;

	}

}

package builder;

public class UserWebDTO implements UserDTO {

	private String name;
	private String age;
	private String address;

	public UserWebDTO(String name, String age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserWebDTO [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return age;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

}

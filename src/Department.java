package application;

public class Department {
	String name;
	int id;
	String country;
	String city;

	public Department() {
		this.name = "Test";
		this.id = 123;
		this.country = "Neverland";
		this.city = "Gotham";
	}

	public Department(String name, int id, String country, String city) {
		this.name = name;
		this.id = id;
		this.country = country;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Department{" +
				"name='" + name + '\'' +
				", id=" + id +
				", country='" + country + '\'' +
				", city='" + city + '\'' +
				'}';
	}

	public boolean isEquals(Department other) {
		return (other.id == this.id);
	}

}

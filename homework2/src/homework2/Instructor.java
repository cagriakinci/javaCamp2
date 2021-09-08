package homework2;

public class Instructor extends User{
	private String biography;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String biography) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setBiography(biography);
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
}

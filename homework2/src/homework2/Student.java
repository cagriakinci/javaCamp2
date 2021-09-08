package homework2;

public class Student extends User{
	private int number;
	private String chosenCourse;
	private String level;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, int number, String chosenCourse, String level) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setNumber(number);
		this.setChosenCourse(chosenCourse);
		this.setLevel(level);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getChosenCourse() {
		return chosenCourse;
	}

	public void setChosenCourse(String chosenCourse) {
		this.chosenCourse = chosenCourse;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
}

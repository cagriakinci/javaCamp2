package homework2;

public class InstructorManager extends UserManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " "+instructor.getLastName()+" kurs ekledi.");
	}
	
	public void updateCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+ " kursu güncelledi.");
	}
}

package homework2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"Engin","Demiro�",
				"Yaz�l�m geli�tirmeye lisede \"yaz�l�m\" b�l�m�nde okurken ba�lad�m.");
		Student student = new Student(2,"�a�r�","Ak�nc�",7,"Java+React","%22");
		
		UserManager userManager = new UserManager();
		userManager.login(instructor);
		
		userManager.login(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.updateCourse(instructor);
		
		userManager.logout(instructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.enrollCourse(student);
		studentManager.courseEvaluation(student, "Kamp muhte�em ilerliyor.");
		
		userManager.logout(student);
	}

}

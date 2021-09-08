package homework2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor(1,"Engin","Demiroð",
				"Yazýlým geliþtirmeye lisede \"yazýlým\" bölümünde okurken baþladým.");
		Student student = new Student(2,"Çaðrý","Akýncý",7,"Java+React","%22");
		
		UserManager userManager = new UserManager();
		userManager.login(instructor);
		
		userManager.login(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.updateCourse(instructor);
		
		userManager.logout(instructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.enrollCourse(student);
		studentManager.courseEvaluation(student, "Kamp muhteşem ilerliyor.");
		
		userManager.logout(student);
	}

}

package homework2;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giri� yapt�.");
	}

	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " ��k�� yapt�.");
	}
}

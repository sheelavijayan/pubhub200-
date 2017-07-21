package Controller;

public class UserValidation {
	public static void validateLoginFields(String email, String password) throws Exception {

		if (email == null || email.equals("") || email.trim().equals("")) {
			throw new Exception("Email cannot be empty");
		} else if (password == null || password.equals("") || password.trim().equals("")) {
			throw new Exception("password cannot be empty");
		}

	}

}

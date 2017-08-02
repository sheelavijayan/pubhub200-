package test;

import java.sql.SQLException;

import com.sheela.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		User user = new User();

		user.setName("shilpa");
		user.setEmail("shilpa97@gmail.com");
		user.setPassword("ase");

		// userdao.register(user);
		// UserDAO userdao = new UserDAO();

		// String email = "shheela";
		// String password = "she";

		// User user = userdao.login(email, password);
		System.out.println(user);

	}

}

package Controller;

public class TestUserValidation {
	public static void main(String[] args){
		String email = "sd,sadm,";
		String password =" ss";
		
		try {
			UserValidation.validateLoginFields(email, password);
			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

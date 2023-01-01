package CustomsExceptions;

public class PasswordChecking {
	public static void main(String[] args) throws LogInException{
		String userName = "";
		String password = "";
		try {
		if(userName.equals("Pugazh") && password.equals("12345")) {
			System.out.println("access granted");
		}
		else {
			throw new LogInException("Invalid UserId or Password");
		}
		}catch(LogInException l) {
			System.out.println(l);
			l.printStackTrace();
		}
		System.out.println("please enter the valid user name");
	}
}

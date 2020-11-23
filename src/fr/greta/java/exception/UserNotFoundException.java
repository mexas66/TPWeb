package fr.greta.java.exception;

public class UserNotFoundException extends Exception {

	@Override
	public String getMessage() {
		return "Login et/ou mot de passe erroné(s)";
	}
	
}

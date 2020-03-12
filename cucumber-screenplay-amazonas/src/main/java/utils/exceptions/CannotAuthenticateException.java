package utils.exceptions;

public class CannotAuthenticateException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CannotAuthenticateException(String actorName) {

        super("The actor " + actorName + " does not have the ability to sign in to website (system under test)");
    }
}

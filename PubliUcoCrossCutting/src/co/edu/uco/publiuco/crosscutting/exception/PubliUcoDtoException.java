package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliUcoDtoException extends PubliUcoException {

	private static final long serialVersionUID = 2627588787833801268L;
	
	private PubliUcoDtoException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
	}
	
	public static PubliUcoDtoException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliUcoDtoException(technicalMessage, userMessage, rootCause);
	}
	public static PubliUcoDtoException create(final String userMessage) {
		return new PubliUcoDtoException(userMessage, userMessage, new Exception());
	}
	public static PubliUcoDtoException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoDtoException(technicalMessage, userMessage, new Exception());
	}

}

package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliUcoApiException extends PubliUcoException {

	private static final long serialVersionUID = -4228650668023637895L;
	
	private PubliUcoApiException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	public static PubliUcoApiException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new PubliUcoApiException(technicalMessage, userMessage, rootCause);
	}
	public static PubliUcoApiException create(final String userMessage) {
		return new PubliUcoApiException(userMessage, userMessage, new Exception());
	}
	public static PubliUcoApiException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoApiException(technicalMessage, userMessage, new Exception());
	}

}

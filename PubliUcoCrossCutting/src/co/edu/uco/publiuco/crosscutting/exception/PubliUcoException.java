package co.edu.uco.publiuco.crosscutting.exception;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;

public abstract class PubliUcoException extends RuntimeException {
	
	private static final long serialVersionUID = 1970164779442810420L;
	private ExceptionType type;
	private String userMessage;
	
	protected PubliUcoException(String technicalMessage, String userMessage, Throwable rootCause, ExceptionType type) {
		super(technicalMessage, rootCause);
		setUserMessage(userMessage);
		setType(type);
	}
	
	public final String getTechnicalMessage() {
		return UtilText.getUtilText().getDefaultIfEmpty(getMessage(), getUserMessage());
	}
	
	public final Throwable getRootCause() {
		return UtilObject.getDefault(getCause(), new Exception());
	}

	public final ExceptionType getType() {
		return type;
	}

	public final void setType(ExceptionType type) {
		this.type = UtilObject.getDefault(type, ExceptionType.GENERAL);
	}

	public final String getUserMessage() {
		return userMessage;
	}

	public final void setUserMessage(String userMessage) {
		this.userMessage = UtilText.getUtilText().getDefault(userMessage);
	}
	
	

}

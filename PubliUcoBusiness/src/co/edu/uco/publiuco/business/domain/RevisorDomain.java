package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class RevisorDomain extends PersonaDomain {
	
	private static final RevisorDomain DEFAULT_OBJECT = new RevisorDomain();
	private EstadoRevisorDomain estado;
	
	private RevisorDomain() {
		super();
		setEstado(EstadoRevisorDomain.getDefaultObject());
	}
	
	public RevisorDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDomain tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoRevisorDomain estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static RevisorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoRevisorDomain getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoRevisorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisorDomain.getDefaultObject());
	}

}

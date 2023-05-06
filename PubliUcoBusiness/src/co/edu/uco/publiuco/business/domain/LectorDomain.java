package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class LectorDomain extends PersonaDomain {

	private static final LectorDomain DEFAULT_OBJECT = new LectorDomain();
	private EstadoLectorDomain estado;
	
	private LectorDomain() {
		super();
		setEstado(EstadoLectorDomain.getDefaultObject());
	}
	
	public LectorDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDomain tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoLectorDomain estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static LectorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoLectorDomain getEstado() {
		return estado;
	}
	private final void setEstado(EstadoLectorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoLectorDomain.getDefaultObject());
	}

}

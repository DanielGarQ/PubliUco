package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class EscritorDomain extends PersonaDomain {
	
	private static final EscritorDomain DEFAULT_OBJECT = new EscritorDomain();
	private EstadoEscritorDomain estado;
	
	private EscritorDomain() {
		super();
		setEstado(EstadoEscritorDomain.getDefaultObject());
	}
	
	public EscritorDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDomain tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoEscritorDomain estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static EscritorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoEscritorDomain getEstado() {
		return estado;
	}
	private final void setEstado(EstadoEscritorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEscritorDomain.getDefaultObject());
	}

}

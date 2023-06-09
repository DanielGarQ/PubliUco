package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class RevisorEntity extends PersonaEntity {
	
	private static final RevisorEntity DEFAULT_OBJECT = new RevisorEntity();
	private EstadoRevisorEntity estado;
	
	private RevisorEntity() {
		super();
		setEstado(EstadoRevisorEntity.getDefaultObject());
	}
	
	public RevisorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionEntity tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoRevisorEntity estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static RevisorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoRevisorEntity getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoRevisorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisorEntity.getDefaultObject());
	}

}

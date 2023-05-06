package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class LectorEntity extends PersonaEntity {

	private static final LectorEntity DEFAULT_OBJECT = new LectorEntity();
	private EstadoLectorEntity estado;
	
	private LectorEntity() {
		super();
		setEstado(EstadoLectorEntity.getDefaultObject());
	}
	
	public LectorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionEntity tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoLectorEntity estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static LectorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoLectorEntity getEstado() {
		return estado;
	}
	private final void setEstado(EstadoLectorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoLectorEntity.getDefaultObject());
	}

}

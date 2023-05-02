package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class EscritorEntity extends PersonaEntity {
	
	private static final EscritorEntity DEFAULT_OBJECT = new EscritorEntity();
	private EstadoEscritorEntity estado;
	
	private EscritorEntity() {
		super();
		setEstado(EstadoEscritorEntity.getDefaultObject());
	}
	
	public EscritorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionEntity tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoEscritorEntity estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static EscritorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoEscritorEntity getEstado() {
		return estado;
	}
	private final void setEstado(EstadoEscritorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEscritorEntity.getDefaultObject());
	}

}

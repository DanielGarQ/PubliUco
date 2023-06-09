package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class LectorDTO extends PersonaDTO {
	
private EstadoLectorDTO estado;
	
	public LectorDTO() {
		super();
		setEstado(EstadoLectorDTO.create());
	}
	
	public LectorDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDTO tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoLectorDTO estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static LectorDTO create() {
		return new LectorDTO();
	}
	
	public final EstadoLectorDTO getEstado() {
		return estado;
	}
	public final LectorDTO setEstado(EstadoLectorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoLectorDTO.create());
		return this;
	}

}

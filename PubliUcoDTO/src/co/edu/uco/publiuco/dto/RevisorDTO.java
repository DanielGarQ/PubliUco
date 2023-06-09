package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class RevisorDTO extends PersonaDTO {
	
private EstadoRevisorDTO estado;
	
	public RevisorDTO() {
		super();
		setEstado(EstadoRevisorDTO.create());
	}
	
	public RevisorDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDTO tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoRevisorDTO estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static RevisorDTO create() {
		return new RevisorDTO();
	}
	
	public final EstadoRevisorDTO getEstado() {
		return estado;
	}
	public final RevisorDTO setEstado(final EstadoRevisorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisorDTO.create());
		return this;
	}

}

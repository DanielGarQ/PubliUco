package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class EscritorDTO extends PersonaDTO {
	
	private EstadoEscritorDTO estado;
	
	public EscritorDTO() {
		super();
		setEstado(EstadoEscritorDTO.create());
	}
	
	public EscritorDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDTO tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoEscritorDTO estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static EscritorDTO create() {
		return new EscritorDTO();
	}
	
	public final EstadoEscritorDTO getEstado() {
		return estado;
	}
	public final EscritorDTO setEstado(EstadoEscritorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoEscritorDTO.create());
		return this;
	}

}

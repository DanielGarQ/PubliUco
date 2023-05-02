package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class AdministradorCategoriaDTO extends PersonaDTO{
	
	
	private EstadoAdministradorCategoriaDTO estado;
	
	public AdministradorCategoriaDTO() {
		super();
		setEstado(EstadoAdministradorCategoriaDTO.create());
	}
	
	public AdministradorCategoriaDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDTO tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoAdministradorCategoriaDTO estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static AdministradorCategoriaDTO create() {
		return new AdministradorCategoriaDTO();
	}
	
	public final EstadoAdministradorCategoriaDTO getEstado() {
		return estado;
	}
	public final AdministradorCategoriaDTO setEstado(EstadoAdministradorCategoriaDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoAdministradorCategoriaDTO.create());
		return this;
	}
	
	
	

}

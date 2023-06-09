package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class AdministradorCategoriaEntity extends PersonaEntity{
	
	private static final AdministradorCategoriaEntity DEFAULT_OBJECT = new AdministradorCategoriaEntity();
	private EstadoAdministradorCategoriaEntity estado;
	
	private AdministradorCategoriaEntity() {
		super();
		setEstado(EstadoAdministradorCategoriaEntity.getDefaultObject());
	}
	
	public AdministradorCategoriaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionEntity tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoAdministradorCategoriaEntity estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static AdministradorCategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoAdministradorCategoriaEntity getEstado() {
		return estado;
	}
	private final void setEstado(EstadoAdministradorCategoriaEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoAdministradorCategoriaEntity.getDefaultObject());
	}
	
	
	

}

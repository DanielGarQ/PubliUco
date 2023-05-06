package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;

public final class AdministradorCategoriaDomain extends PersonaDomain{
	
	private static final AdministradorCategoriaDomain DEFAULT_OBJECT = new AdministradorCategoriaDomain();
	private EstadoAdministradorCategoriaDomain estado;
	
	private AdministradorCategoriaDomain() {
		super();
		setEstado(EstadoAdministradorCategoriaDomain.getDefaultObject());
	}
	
	public AdministradorCategoriaDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDomain tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono, EstadoAdministradorCategoriaDomain estado) {
		super(identificador, tipoIdentificacion, numeroIdentificacion, primerNombre, segundoNombre, primerApellido, segundoApellido, correo, numeroTelefono,tipoRelacionInstitucion, confirmacionCorreo, confirmacionNumeroTelefono);
		setEstado(estado);
	}
	
	public static AdministradorCategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final EstadoAdministradorCategoriaDomain getEstado() {
		return estado;
	}
	private final void setEstado(EstadoAdministradorCategoriaDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoAdministradorCategoriaDomain.getDefaultObject());
	}
	
	
	

}

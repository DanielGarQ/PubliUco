package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PersonaDTO {
	
	protected UUID identificador;
	protected TipoIdentificacionDTO tipoIdentificacion;
	protected String numeroIdentificacion;
	protected String primerNombre;
	protected String segundoNombre;
	protected String primerApellido;
	protected String segundoApellido;
	protected String correo;
	protected String numeroTelefono;
	protected TipoRelacionInstitucionDTO tipoRelacionInstitucion;
	protected boolean confirmacionCorreo;
	protected boolean confirmacionNumeroTelefono;
	
	public PersonaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setNumeroIdentificacion(UtilText.EMPTY);
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerApellido(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(correo);
		setNumeroTelefono(UtilText.EMPTY);
		setTipoRelacionInstitucion(TipoRelacionInstitucionDTO.create());
		setConfirmacionCorreo(confirmacionCorreo);
		setConfirmacionNumeroTelefono(confirmacionNumeroTelefono);
	}
	
	public PersonaDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDTO tipoRelacionInstitucion, boolean confirmacionCorreo,
			boolean confirmacionNumeroTelefono) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCorreo(correo);
		setNumeroTelefono(numeroTelefono);
		setTipoRelacionInstitucion(tipoRelacionInstitucion);
		setConfirmacionCorreo(confirmacionCorreo);
		setConfirmacionNumeroTelefono(confirmacionNumeroTelefono);
	}
	
	public static PersonaDTO create() {
		return new PersonaDTO();
	}
	
	public UUID getIdentificador() {
		return identificador;
	}
	public PersonaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public PersonaDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
		return this;
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public PersonaDTO setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
		return this;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public PersonaDTO setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
		return this;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public PersonaDTO setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		return this;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public PersonaDTO setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		return this;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public PersonaDTO setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		return this;
	}
	public String getCorreo() {
		return correo;
	}
	public PersonaDTO setCorreo(String correo) {
		this.correo = correo;
		return this;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public PersonaDTO setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		return this;
	}
	public TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
		return tipoRelacionInstitucion;
	}
	public PersonaDTO setTipoRelacionInstitucion(TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
		this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionDTO.create());
		return this;
	}
	public boolean isConfirmacionCorreo() {
		return confirmacionCorreo;
	}
	public PersonaDTO setConfirmacionCorreo(boolean confirmacionCorreo) {
		this.confirmacionCorreo = confirmacionCorreo;
		return this;
	}
	public boolean isConfirmacionNumeroTelefono() {
		return confirmacionNumeroTelefono;
	}
	public PersonaDTO setConfirmacionNumeroTelefono(boolean confirmacionNumeroTelefono) {
		this.confirmacionNumeroTelefono = confirmacionNumeroTelefono;
		return this;
	}

}

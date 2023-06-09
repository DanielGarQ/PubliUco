package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PersonaEntity {
	
	protected UUID identificador;
	protected TipoIdentificacionEntity tipoIdentificacion;
	protected String numeroIdentificacion;
	protected String primerNombre;
	protected String segundoNombre;
	protected String primerApellido;
	protected String segundoApellido;
	protected String correo;
	protected String numeroTelefono;
	protected TipoRelacionInstitucionEntity tipoRelacionInstitucion;
	protected boolean confirmacionCorreo;
	protected boolean confirmacionNumeroTelefono;
	
	protected PersonaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultobject());
		setNumeroIdentificacion(UtilText.EMPTY);
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerApellido(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(correo);
		setNumeroTelefono(UtilText.EMPTY);
		setTipoRelacionInstitucion(TipoRelacionInstitucionEntity.getDefaultObject());
		setConfirmacionCorreo(confirmacionCorreo);
		setConfirmacionNumeroTelefono(confirmacionNumeroTelefono);
	}
	
	public PersonaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionEntity tipoRelacionInstitucion, boolean confirmacionCorreo,
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

	public UUID getIdentificador() {
		return identificador;
	}
	public PersonaEntity setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	protected void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultobject());
	}
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	protected void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	protected void setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	protected void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	protected void setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	protected void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
	}
	public String getCorreo() {
		return correo;
	}
	protected void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	protected void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public TipoRelacionInstitucionEntity getTipoRelacionInstitucion() {
		return tipoRelacionInstitucion;
	}
	protected void setTipoRelacionInstitucion(TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
		this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionEntity.getDefaultObject());
	}
	public boolean isConfirmacionCorreo() {
		return confirmacionCorreo;
	}
	protected void setConfirmacionCorreo(boolean confirmacionCorreo) {
		this.confirmacionCorreo = confirmacionCorreo;
	}
	public boolean isConfirmacionNumeroTelefono() {
		return confirmacionNumeroTelefono;
	}
	protected void setConfirmacionNumeroTelefono(boolean confirmacionNumeroTelefono) {
		this.confirmacionNumeroTelefono = confirmacionNumeroTelefono;
	}

}

package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PersonaDomain {
	
	protected UUID identificador;
	protected TipoIdentificacionDomain tipoIdentificacion;
	protected String numeroIdentificacion;
	protected String primerNombre;
	protected String segundoNombre;
	protected String primerApellido;
	protected String segundoApellido;
	protected String correo;
	protected String numeroTelefono;
	protected TipoRelacionInstitucionDomain tipoRelacionInstitucion;
	protected boolean confirmacionCorreo;
	protected boolean confirmacionNumeroTelefono;
	
	protected PersonaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionDomain.getDefaultobject());
		setNumeroIdentificacion(UtilText.EMPTY);
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerApellido(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(correo);
		setNumeroTelefono(UtilText.EMPTY);
		setTipoRelacionInstitucion(TipoRelacionInstitucionDomain.getDefaultObject());
		setConfirmacionCorreo(confirmacionCorreo);
		setConfirmacionNumeroTelefono(confirmacionNumeroTelefono);
	}
	
	public PersonaDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String numeroTelefono,
			TipoRelacionInstitucionDomain tipoRelacionInstitucion, boolean confirmacionCorreo,
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
	public PersonaDomain setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	protected void setTipoIdentificacion(TipoIdentificacionDomain tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDomain.getDefaultobject());
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
	public TipoRelacionInstitucionDomain getTipoRelacionInstitucion() {
		return tipoRelacionInstitucion;
	}
	protected void setTipoRelacionInstitucion(TipoRelacionInstitucionDomain tipoRelacionInstitucion) {
		this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionDomain.getDefaultObject());
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

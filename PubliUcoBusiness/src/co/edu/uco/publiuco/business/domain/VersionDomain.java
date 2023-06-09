package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class VersionDomain {
	
	private static final VersionDomain DEFAULT_OBJECT = new VersionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private VersionDomain versionAnterior;
	private int numeroVersion;
	private Date fechaCreacion;
	private Date fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoVersionDomain estado;
	
	private VersionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDomain.getDefaultObject());
		setVersionAnterior(VersionDomain.getDefaultObject());
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(UtilText.getUtilText().getDefaultValue());
		setResumen(UtilText.getUtilText().getDefaultValue());
		setCuerpo(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoVersionDomain.getDefaultObject());
	}
	
	public VersionDomain(final UUID identificador, final PublicacionDomain publicacion, final VersionDomain versionAnterior, final int numeroVersion,
			final Date fechaCreacion, final Date fechaUltimaModificacion, final String titulo, final String resumen, final String cuerpo,
			final EstadoVersionDomain estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setVersionAnterior(versionAnterior);
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(titulo);
		setResumen(resumen);
		setCuerpo(cuerpo);
		setEstado(estado);
	}

	public static VersionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}
	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}
	public final VersionDomain getVersionAnterior() {
		return versionAnterior;
	}
	private final void setVersionAnterior(final VersionDomain versionAnterior) {
		this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionDomain.getDefaultObject());
	}
	public final int getNumeroVersion() {
		return numeroVersion;
	}
	private final void setNumeroVersion(final int numeroVersion) {
		this.numeroVersion = numeroVersion;
	}
	public final Date getFechaCreacion() {
		return fechaCreacion;
	}
	private final void setFechaCreacion(final Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public final Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	private final void setFechaUltimaModificacion(final Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
	}
	public final String getTitulo() {
		return titulo;
	}
	private final void setTitulo(final String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
	}
	public final String getResumen() {
		return resumen;
	}
	private final void setResumen(final String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
	}
	public final String getCuerpo() {
		return cuerpo;
	}
	private final void setCuerpo(final String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
	}
	public final EstadoVersionDomain getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoVersionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoVersionDomain.getDefaultObject());
	}
	
	

}

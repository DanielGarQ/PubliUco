package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class VersionEntity {
	
	private static final VersionEntity DEFAULT_OBJECT = new VersionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private VersionEntity versionAnterior;
	private int numeroVersion;
	private Date fechaCreacion;
	private Date fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoVersionEntity estado;
	
	private VersionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionEntity.getDefaultObject());
		setVersionAnterior(VersionEntity.getDefaultObject());
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(UtilText.getUtilText().getDefaultValue());
		setResumen(UtilText.getUtilText().getDefaultValue());
		setCuerpo(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoVersionEntity.getDefaultObject());
	}
	
	public VersionEntity(final UUID identificador, final PublicacionEntity publicacion, final VersionEntity versionAnterior, final int numeroVersion,
			final Date fechaCreacion, final Date fechaUltimaModificacion, final String titulo, final String resumen, final String cuerpo,
			final EstadoVersionEntity estado) {
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

	public static VersionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}
	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}
	public final VersionEntity getVersionAnterior() {
		return versionAnterior;
	}
	private final void setVersionAnterior(final VersionEntity versionAnterior) {
		this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionEntity.getDefaultObject());
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
	public final EstadoVersionEntity getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoVersionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoVersionEntity.getDefaultObject());
	}
	
	

}

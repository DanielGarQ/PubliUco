package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class VersionDTO {
	
	private UUID identificador;
	private PublicacionDTO publicacion;
	private VersionDTO versionAnterior;
	private int numeroVersion;
	private Date fechaCreacion;
	private Date fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoVersionDTO estado;
	
	public VersionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDTO.create());
		setVersionAnterior(VersionDTO.create());
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(UtilText.getUtilText().getDefaultValue());
		setResumen(UtilText.getUtilText().getDefaultValue());
		setCuerpo(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoVersionDTO.create());
	}
	
	public VersionDTO(final UUID identificador, final PublicacionDTO publicacion, final VersionDTO versionAnterior, final int numeroVersion,
			final Date fechaCreacion, final Date fechaUltimaModificacion, final String titulo, final String resumen, final String cuerpo,
			final EstadoVersionDTO estado) {
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

	public static VersionDTO create() {
		return new VersionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final VersionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}
	public final VersionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}
	public final VersionDTO getVersionAnterior() {
		return versionAnterior;
	}
	public final VersionDTO setVersionAnterior(final VersionDTO versionAnterior) {
		this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionDTO.create());
		return this;
	}
	public final int getNumeroVersion() {
		return numeroVersion;
	}
	public final VersionDTO setNumeroVersion(final int numeroVersion) {
		this.numeroVersion = numeroVersion;
		return this;
	}
	public final Date getFechaCreacion() {
		return fechaCreacion;
	}
	public final VersionDTO setFechaCreacion(final Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
		return this;
	}
	public final Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	public final VersionDTO setFechaUltimaModificacion(final Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = fechaUltimaModificacion;
		return this;
	}
	public final String getTitulo() {
		return titulo;
	}
	public final VersionDTO setTitulo(final String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
		return this;
	}
	public final String getResumen() {
		return resumen;
	}
	public final VersionDTO setResumen(final String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
		return this;
	}
	public final String getCuerpo() {
		return cuerpo;
	}
	public final VersionDTO setCuerpo(final String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
		return this;
	}
	public final EstadoVersionDTO getEstado() {
		return estado;
	}
	public final VersionDTO setEstado(final EstadoVersionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoVersionDTO.create());
		return this;
	}
	
	

}

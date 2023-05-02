package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisionDTO {
	
	private UUID identificador;
	private VersionDTO version;
	private TipoRevisionDTO tipoRevision;
	private Date fechaSolicitud;
	private Date fechaLimite;
	private Date fechaCompletitud;
	private EstadoRevisionDTO estado;
	
	public RevisionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setVersion(VersionDTO.create());
		setTipoRevision(TipoRevisionDTO.create());
		setFechaSolicitud(fechaSolicitud);
		setFechaLimite(fechaLimite);
		setFechaCompletitud(fechaCompletitud);
		setEstado(EstadoRevisionDTO.create());
	}
	
	public RevisionDTO(final UUID identificador, final VersionDTO version, final TipoRevisionDTO tipoRevision, final Date fechaSolicitud,
			final Date fechaLimite, final Date fechaCompletitud, final EstadoRevisionDTO estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipoRevision(tipoRevision);
		setFechaSolicitud(fechaSolicitud);
		setFechaLimite(fechaLimite);
		setFechaCompletitud(fechaCompletitud);
		setEstado(estado);
	}

	public static RevisionDTO create() {
		return new RevisionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final RevisionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final VersionDTO getVersion() {
		return version;
	}
	public final RevisionDTO setVersion(final VersionDTO version) {
		this.version = UtilObject.getDefault(version, VersionDTO.create());
		return this;
	}
	public final TipoRevisionDTO getTipoRevision() {
		return tipoRevision;
	}
	public final RevisionDTO setTipoRevision(final TipoRevisionDTO tipoRevision) {
		this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionDTO.create());
		return this;
	}
	public final Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	public final RevisionDTO setFechaSolicitud(final Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
		return this;
	}
	public final Date getFechaLimite() {
		return fechaLimite;
	}
	public final RevisionDTO setFechaLimite(final Date fechaLimite) {
		this.fechaLimite = fechaLimite;
		return this;
	}
	public final Date getFechaCompletitud() {
		return fechaCompletitud;
	}
	public final RevisionDTO setFechaCompletitud(final Date fechaCompletitud) {
		this.fechaCompletitud = fechaCompletitud;
		return this;
	}
	public final EstadoRevisionDTO getEstado() {
		return estado;
	}
	public final RevisionDTO setEstado(final EstadoRevisionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDTO.create());
		return this;
	}
	
	

}

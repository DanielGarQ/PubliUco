package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisionEntity {
	
	private static final RevisionEntity DEFAULT_OBJECT = new RevisionEntity();
	private UUID identificador;
	private VersionEntity version;
	private TipoRevisionEntity tipoRevision;
	private Date fechaSolicitud;
	private Date fechaLimite;
	private Date fechaCompletitud;
	private EstadoRevisionEntity estado;
	
	private RevisionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setVersion(VersionEntity.getDefaultObject());
		setTipoRevision(TipoRevisionEntity.getDefaultObject());
		setFechaSolicitud(fechaSolicitud);
		setFechaLimite(fechaLimite);
		setFechaCompletitud(fechaCompletitud);
		setEstado(EstadoRevisionEntity.getdefaultObject());
	}
	
	public RevisionEntity(final UUID identificador, final VersionEntity version, final TipoRevisionEntity tipoRevision, final Date fechaSolicitud,
			final Date fechaLimite, final Date fechaCompletitud, final EstadoRevisionEntity estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipoRevision(tipoRevision);
		setFechaSolicitud(fechaSolicitud);
		setFechaLimite(fechaLimite);
		setFechaCompletitud(fechaCompletitud);
		setEstado(estado);
	}

	public static RevisionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final VersionEntity getVersion() {
		return version;
	}
	private final void setVersion(final VersionEntity version) {
		this.version = UtilObject.getDefault(version, VersionEntity.getDefaultObject());
	}
	public final TipoRevisionEntity getTipoRevision() {
		return tipoRevision;
	}
	private final void setTipoRevision(final TipoRevisionEntity tipoRevision) {
		this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionEntity.getDefaultObject());
	}
	public final Date getFechaSolicitud() {
		return fechaSolicitud;
	}
	private final void setFechaSolicitud(final Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}
	public final Date getFechaLimite() {
		return fechaLimite;
	}
	private final void setFechaLimite(final Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public final Date getFechaCompletitud() {
		return fechaCompletitud;
	}
	private final void setFechaCompletitud(final Date fechaCompletitud) {
		this.fechaCompletitud = fechaCompletitud;
	}
	public final EstadoRevisionEntity getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoRevisionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionEntity.getdefaultObject());
	}
	
	

}

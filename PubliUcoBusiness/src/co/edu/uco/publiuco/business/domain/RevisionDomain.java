package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisionDomain {
	
	private static final RevisionDomain DEFAULT_OBJECT = new RevisionDomain();
	private UUID identificador;
	private VersionDomain version;
	private TipoRevisionDomain tipoRevision;
	private Date fechaSolicitud;
	private Date fechaLimite;
	private Date fechaCompletitud;
	private EstadoRevisionDomain estado;
	
	private RevisionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setVersion(VersionDomain.getDefaultObject());
		setTipoRevision(TipoRevisionDomain.getDefaultObject());
		setFechaSolicitud(fechaSolicitud);
		setFechaLimite(fechaLimite);
		setFechaCompletitud(fechaCompletitud);
		setEstado(EstadoRevisionDomain.getdefaultObject());
	}
	
	public RevisionDomain(final UUID identificador, final VersionDomain version, final TipoRevisionDomain tipoRevision, final Date fechaSolicitud,
			final Date fechaLimite, final Date fechaCompletitud, final EstadoRevisionDomain estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipoRevision(tipoRevision);
		setFechaSolicitud(fechaSolicitud);
		setFechaLimite(fechaLimite);
		setFechaCompletitud(fechaCompletitud);
		setEstado(estado);
	}

	public static RevisionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final VersionDomain getVersion() {
		return version;
	}
	private final void setVersion(final VersionDomain version) {
		this.version = UtilObject.getDefault(version, VersionDomain.getDefaultObject());
	}
	public final TipoRevisionDomain getTipoRevision() {
		return tipoRevision;
	}
	private final void setTipoRevision(final TipoRevisionDomain tipoRevision) {
		this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionDomain.getDefaultObject());
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
	public final EstadoRevisionDomain getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoRevisionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDomain.getdefaultObject());
	}
	
	

}

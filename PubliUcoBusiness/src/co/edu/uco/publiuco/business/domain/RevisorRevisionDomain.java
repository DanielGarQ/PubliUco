package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisorRevisionDomain {
	
	private static final RevisorRevisionDomain DEFAULT_OBJECT = new RevisorRevisionDomain();
	private UUID identificador;
	private RevisionDomain revision;
	private RevisorDomain revisor;
	private Date fechaAsignacion;
	private Date fechaCompletitud;
	private EstadoRevisionDomain estado;
	
	private RevisorRevisionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevision(RevisionDomain.getDefaultObject());
		setRevisor(RevisorDomain.getDefaultObject());
		setFechaAsignacion(fechaAsignacion);
		setFechaCompletitud(fechaCompletitud);
		setEstado(EstadoRevisionDomain.getdefaultObject());
	}
	
	public RevisorRevisionDomain(final UUID identificador, final RevisionDomain revision, final RevisorDomain revisor, final Date fechaAsignacion,
			final Date fechaCompletitud, final EstadoRevisionDomain estado) {
		super();
		setIdentificador(identificador);
		setRevision(revision);
		setRevisor(revisor);
		setFechaAsignacion(fechaAsignacion);
		setFechaCompletitud(fechaCompletitud);
		setEstado(estado);
	}
	
	public static RevisorRevisionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisionDomain getRevision() {
		return revision;
	}

	private final void setRevision(final RevisionDomain revision) {
		this.revision = UtilObject.getDefault(revision, RevisionDomain.getDefaultObject());
	}

	public final RevisorDomain getRevisor() {
		return revisor;
	}

	private final void setRevisor(final RevisorDomain revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorDomain.getDefaultObject());
	}

	public final Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	private final void setFechaAsignacion(final Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
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

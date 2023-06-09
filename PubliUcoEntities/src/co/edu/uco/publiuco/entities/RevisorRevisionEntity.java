package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisorRevisionEntity {
	
	private static final RevisorRevisionEntity DEFAULT_OBJECT = new RevisorRevisionEntity();
	private UUID identificador;
	private RevisionEntity revision;
	private RevisorEntity revisor;
	private Date fechaAsignacion;
	private Date fechaCompletitud;
	private EstadoRevisionEntity estado;
	
	private RevisorRevisionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevision(RevisionEntity.getDefaultObject());
		setRevisor(RevisorEntity.getDefaultObject());
		setFechaAsignacion(fechaAsignacion);
		setFechaCompletitud(fechaCompletitud);
		setEstado(EstadoRevisionEntity.getdefaultObject());
	}
	
	public RevisorRevisionEntity(final UUID identificador, final RevisionEntity revision, final RevisorEntity revisor, final Date fechaAsignacion,
			final Date fechaCompletitud, final EstadoRevisionEntity estado) {
		super();
		setIdentificador(identificador);
		setRevision(revision);
		setRevisor(revisor);
		setFechaAsignacion(fechaAsignacion);
		setFechaCompletitud(fechaCompletitud);
		setEstado(estado);
	}
	
	public static RevisorRevisionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisionEntity getRevision() {
		return revision;
	}

	private final void setRevision(final RevisionEntity revision) {
		this.revision = UtilObject.getDefault(revision, RevisionEntity.getDefaultObject());
	}

	public final RevisorEntity getRevisor() {
		return revisor;
	}

	private final void setRevisor(final RevisorEntity revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorEntity.getDefaultObject());
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

	public final EstadoRevisionEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoRevisionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionEntity.getdefaultObject());
	}
	
	
	

}

package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisorRevisionDTO {
	
	private UUID identificador;
	private RevisionDTO revision;
	private RevisorDTO revisor;
	private Date fechaAsignacion;
	private Date fechaCompletitud;
	private EstadoRevisionDTO estado;
	
	public RevisorRevisionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevision(RevisionDTO.create());
		setRevisor(RevisorDTO.create());
		setFechaAsignacion(fechaAsignacion);
		setFechaCompletitud(fechaCompletitud);
		setEstado(EstadoRevisionDTO.create());
	}
	
	public RevisorRevisionDTO(final UUID identificador, final RevisionDTO revision, final RevisorDTO revisor, final Date fechaAsignacion,
			final Date fechaCompletitud, final EstadoRevisionDTO estado) {
		super();
		setIdentificador(identificador);
		setRevision(revision);
		setRevisor(revisor);
		setFechaAsignacion(fechaAsignacion);
		setFechaCompletitud(fechaCompletitud);
		setEstado(estado);
	}
	
	public static RevisorRevisionDTO create() {
		return new RevisorRevisionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final RevisorRevisionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final RevisionDTO getRevision() {
		return revision;
	}

	public final RevisorRevisionDTO setRevision(final RevisionDTO revision) {
		this.revision = UtilObject.getDefault(revision, RevisionDTO.create());
		return this;
	}

	public final RevisorDTO getRevisor() {
		return revisor;
	}

	public final RevisorRevisionDTO setRevisor(final RevisorDTO revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorDTO.create());
		return this;
	}

	public final Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public final RevisorRevisionDTO setFechaAsignacion(final Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
		return this;
	}

	public final Date getFechaCompletitud() {
		return fechaCompletitud;
	}

	public final RevisorRevisionDTO setFechaCompletitud(final Date fechaCompletitud) {
		this.fechaCompletitud = fechaCompletitud;
		return this;
	}

	public final EstadoRevisionDTO getEstado() {
		return estado;
	}

	public final RevisorRevisionDTO setEstado(final EstadoRevisionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDTO.create());
		return this;
	}
	
	
	

}

package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionEntity {
	
	private UUID identificador;
	private EscritorPublicacionEntity escritorPublicacion;
	private ComentarioRevisorEntity comentarioRevisor;
	private Date fechaReporte;
	private Date fechaRevision;
	private EstadoObservacionRevisorEntity estado;
	private String observacion;
	
	public ObservacionRevisionEntity(final UUID identificador, final EscritorPublicacionEntity escritorPublicacion,
			final ComentarioRevisorEntity comentarioRevisor, final Date fechaReporte, final Date fechaRevision,
			final EstadoObservacionRevisorEntity estado, final String observacion) {
		super();
		setIdentificador(identificador);
		setEscritorPublicacion(escritorPublicacion);
		setComentarioRevisor(comentarioRevisor);
		setFechaReporte(fechaReporte);
		setFechaRevision(fechaRevision);
		setEstado(estado);
		setObservacion(observacion);
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final EscritorPublicacionEntity getEscritorPublicacion() {
		return escritorPublicacion;
	}

	private final void setEscritorPublicacion(final EscritorPublicacionEntity escritorPublicacion) {
		this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionEntity.getDefaultObject());
	}

	public final ComentarioRevisorEntity getComentarioRevisor() {
		return comentarioRevisor;
	}

	private final void setComentarioRevisor(final ComentarioRevisorEntity comentarioRevisor) {
		this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorEntity.getDefaultObject());
	}

	public final Date getFechaReporte() {
		return fechaReporte;
	}

	private final void setFechaReporte(final Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public final Date getFechaRevision() {
		return fechaRevision;
	}

	private final void setFechaRevision(final Date fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public	final EstadoObservacionRevisorEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoObservacionRevisorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorEntity.getDefaultobject());
	}

	public final String getObservacion() {
		return observacion;
	}

	private final void setObservacion(final String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
	}
	
	
	
	

}

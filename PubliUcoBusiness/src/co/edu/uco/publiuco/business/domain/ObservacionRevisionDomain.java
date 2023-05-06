package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionDomain {
	
	private UUID identificador;
	private EscritorPublicacionDomain escritorPublicacion;
	private ComentarioRevisorDomain comentarioRevisor;
	private Date fechaReporte;
	private Date fechaRevision;
	private EstadoObservacionRevisorDomain estado;
	private String observacion;
	
	public ObservacionRevisionDomain(final UUID identificador, final EscritorPublicacionDomain escritorPublicacion,
			final ComentarioRevisorDomain comentarioRevisor, final Date fechaReporte, final Date fechaRevision,
			final EstadoObservacionRevisorDomain estado, final String observacion) {
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

	public final EscritorPublicacionDomain getEscritorPublicacion() {
		return escritorPublicacion;
	}

	private final void setEscritorPublicacion(final EscritorPublicacionDomain escritorPublicacion) {
		this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionDomain.getDefaultObject());
	}

	public final ComentarioRevisorDomain getComentarioRevisor() {
		return comentarioRevisor;
	}

	private final void setComentarioRevisor(final ComentarioRevisorDomain comentarioRevisor) {
		this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorDomain.getDefaultObject());
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

	public	final EstadoObservacionRevisorDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoObservacionRevisorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorDomain.getDefaultobject());
	}

	public final String getObservacion() {
		return observacion;
	}

	private final void setObservacion(final String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
	}
	
	
	
	

}

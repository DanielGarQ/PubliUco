package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionDTO {
	
	private UUID identificador;
	private EscritorPublicacionDTO escritorPublicacion;
	private ComentarioRevisorDTO comentarioRevisor;
	private Date fechaReporte;
	private Date fechaRevision;
	private EstadoObservacionRevisorDTO estado;
	private String Observacion;
	
	public ObservacionRevisionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritorPublicacion(EscritorPublicacionDTO.create());
		setComentarioRevisor(ComentarioRevisorDTO.create());
		setFechaReporte(fechaReporte);
		setFechaRevision(fechaRevision);
		setEstado(EstadoObservacionRevisorDTO.create());
		setObservacion(UtilText.EMPTY);
	}
	
	public ObservacionRevisionDTO(final UUID identificador, final EscritorPublicacionDTO escritorPublicacion,
			final ComentarioRevisorDTO comentarioRevisor, final Date fechaReporte, final Date fechaRevision,
			final EstadoObservacionRevisorDTO estado, final String observacion) {
		super();
		setIdentificador(identificador);
		setEscritorPublicacion(escritorPublicacion);
		setComentarioRevisor(comentarioRevisor);
		setFechaReporte(fechaReporte);
		setFechaRevision(fechaRevision);
		setEstado(estado);
		setObservacion(observacion);
	}
	
	public static ObservacionRevisionDTO create() {
		return new ObservacionRevisionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final ObservacionRevisionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final EscritorPublicacionDTO getEscritorPublicacion() {
		return escritorPublicacion;
	}

	public final ObservacionRevisionDTO setEscritorPublicacion(final EscritorPublicacionDTO escritorPublicacion) {
		this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionDTO.create());
		return this;
	}

	public final ComentarioRevisorDTO getComentarioRevisor() {
		return comentarioRevisor;
	}

	public final ObservacionRevisionDTO setComentarioRevisor(final ComentarioRevisorDTO comentarioRevisor) {
		this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorDTO.create());
		return this;
	}

	public final Date getFechaReporte() {
		return fechaReporte;
	}

	public final ObservacionRevisionDTO setFechaReporte(final Date fechaReporte) {
		this.fechaReporte = fechaReporte;
		return this;
	}

	public final Date getFechaRevision() {
		return fechaRevision;
	}

	public final ObservacionRevisionDTO setFechaRevision(final Date fechaRevision) {
		this.fechaRevision = fechaRevision;
		return this;
	}

 public final EstadoObservacionRevisorDTO getEstado() {
		return estado;
	}

	public final ObservacionRevisionDTO setEstado(final EstadoObservacionRevisorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorDTO.create());
		return this;
	}

	public final String getObservacion() {
		return Observacion;
	}

	public final ObservacionRevisionDTO setObservacion(final String observacion) {
		Observacion = UtilText.getUtilText().applyTrim(observacion);
		return this;
	}
	
	
	
	

}

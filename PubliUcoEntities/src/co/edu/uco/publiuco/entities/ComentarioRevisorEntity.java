package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ComentarioRevisorEntity {
	
	private static final ComentarioRevisorEntity DEFAULT_OBJECT = new ComentarioRevisorEntity();
	private UUID identificador;
	private RevisorRevisionEntity revisorRevision;
	private TipoComentarioRevisorEntity tipoComentarioRevisor;
	private String comentario;
	
	private ComentarioRevisorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevisorRevision(RevisorRevisionEntity.getDefaultObject());
		setTipoComentarioRevisor(TipoComentarioRevisorEntity.getDefaultObject());
		setComentario(UtilText.EMPTY);
	}
	
	public ComentarioRevisorEntity(final UUID identificador, final RevisorRevisionEntity revisorRevision,
			final TipoComentarioRevisorEntity tipoComentarioRevisor, final String comentario) {
		super();
		setIdentificador(identificador);
		setRevisorRevision(revisorRevision);
		setTipoComentarioRevisor(tipoComentarioRevisor);
		setComentario(comentario);
	}
	
	public static ComentarioRevisorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisorRevisionEntity getRevisorRevision() {
		return revisorRevision;
	}

	private final void setRevisorRevision(final RevisorRevisionEntity revisorRevision) {
		this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionEntity.getDefaultObject());
	}

	public final TipoComentarioRevisorEntity getTipoComentarioRevisor() {
		return tipoComentarioRevisor;
	}

	private final void setTipoComentarioRevisor(final TipoComentarioRevisorEntity tipoComentarioRevisor) {
		this.tipoComentarioRevisor = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorEntity.getDefaultObject());
	}

	public final String getComentario() {
		return comentario;
	}

	private final void setComentario(final String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
	}
	
	

}

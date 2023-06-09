package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ComentarioLectorEntity {
	
	private static final ComentarioLectorEntity DEFAULT_OBJECT = new ComentarioLectorEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private ComentarioLectorEntity comentarioPadre;
	private String comentario;
	private Date fechaCalificacion;
	private EstadoComentarioLectorEntity estado;
	
	private ComentarioLectorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setComentarioPadre(ComentarioLectorEntity.getdefaultObject());
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(EstadoComentarioLectorEntity.getDefaultObject());
		
	}
	
	public ComentarioLectorEntity(final UUID identificador, final LectorEntity lector, final PublicacionEntity publicacion,
			final ComentarioLectorEntity comentarioPadre, final String comentario, final Date fechaCalificacion,
			final EstadoComentarioLectorEntity estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}

	public static ComentarioLectorEntity getdefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final LectorEntity getLector() {
		return lector;
	}
	private final void setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}
	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}
	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}
	public final ComentarioLectorEntity getComentarioPadre() {
		return comentarioPadre;
	}
	private final void setComentarioPadre(final ComentarioLectorEntity comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorEntity.getdefaultObject());
	}
	public final String getComentario() {
		return comentario;
	}
	private final void setComentario(final String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
	}
	public final Date getFechaCalificacion() {
		return fechaCalificacion;
	}
	private final void setFechaCalificacion(final Date fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
	}
	public final EstadoComentarioLectorEntity getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoComentarioLectorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoComentarioLectorEntity.getDefaultObject());
	}
	
	
	
	

}

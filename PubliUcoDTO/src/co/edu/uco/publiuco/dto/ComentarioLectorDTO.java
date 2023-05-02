package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ComentarioLectorDTO {
	
	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private String comentario;
	private Date fechaCalificacion;
	private EstadoComentarioLectorDTO estado;
	
	public ComentarioLectorDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setComentarioPadre(ComentarioLectorDTO.create());
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(EstadoComentarioLectorDTO.create());
		
	}
	
	public ComentarioLectorDTO(final UUID identificador, final LectorDTO lector, final PublicacionDTO publicacion,
			final ComentarioLectorDTO comentarioPadre, final String comentario, final Date fechaCalificacion,
			final EstadoComentarioLectorDTO estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}

	public static ComentarioLectorDTO create() {
		return new ComentarioLectorDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final ComentarioLectorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final LectorDTO getLector() {
		return lector;
	}
	public final ComentarioLectorDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}
	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}
	public final ComentarioLectorDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}
	public final ComentarioLectorDTO getComentarioPadre() {
		return comentarioPadre;
	}
	public final ComentarioLectorDTO setComentarioPadre(final ComentarioLectorDTO comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDTO.create());
		return this;
	}
	public final String getComentario() {
		return comentario;
	}
	public final ComentarioLectorDTO setComentario(final String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
		return this;
	}
	public final Date getFechaCalificacion() {
		return fechaCalificacion;
	}
	public final ComentarioLectorDTO setFechaCalificacion(final Date fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
		return this;
	}
	public final EstadoComentarioLectorDTO getEstado() {
		return estado;
	}
	public final ComentarioLectorDTO setEstado(final EstadoComentarioLectorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoComentarioLectorDTO.create());
		return this;
	}
	
	
	
	

}

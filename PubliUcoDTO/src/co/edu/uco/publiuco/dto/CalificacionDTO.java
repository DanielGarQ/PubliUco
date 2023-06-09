package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CalificacionDTO {
	
	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private Date fechaCalificacion;
	private int calificacion;
	
	public CalificacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
		
	}
	
	public CalificacionDTO(final UUID identificador, final LectorDTO lector, final PublicacionDTO publicacion, final Date fechaCalificacion,
			final int calificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
	}
	
	public static CalificacionDTO create() {
		return new CalificacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final CalificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final LectorDTO getLector() {
		return lector;
	}
	public final CalificacionDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}
	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}
	public final CalificacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}
	public final Date getFechaCalificacion() {
		return fechaCalificacion;
	}
	public final CalificacionDTO setFechaCalificacion(final Date fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
		return this;
	}
	public final int getCalificacion() {
		return calificacion;
	}
	public final CalificacionDTO setCalificacion(final int calificacion) {
		this.calificacion = calificacion;
		return this;
	}
	
	

}

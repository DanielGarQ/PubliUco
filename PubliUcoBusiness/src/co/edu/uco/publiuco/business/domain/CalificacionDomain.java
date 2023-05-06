package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CalificacionDomain {
	
	private static final CalificacionDomain DEFAULT_OBJECT = new CalificacionDomain();
	private UUID identificador;
	private LectorDomain lector;
	private PublicacionDomain publicacion;
	private Date fechaCalificacion;
	private int calificacion;
	
	private CalificacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
		
	}
	
	public CalificacionDomain(final UUID identificador, final LectorDomain lector, final PublicacionDomain publicacion, final Date fechaCalificacion,
			final int calificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
	}
	
	public static CalificacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final LectorDomain getLector() {
		return lector;
	}
	private final void setLector(final LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}
	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}
	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}
	public final Date getFechaCalificacion() {
		return fechaCalificacion;
	}
	private final void setFechaCalificacion(final Date fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
	}
	public final int getCalificacion() {
		return calificacion;
	}
	private final void setCalificacion(final int calificacion) {
		this.calificacion = calificacion;
	}
	
	

}

package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class HistorialAccesoPublicacionEntity {
	
	private static final HistorialAccesoPublicacionEntity DEFAULT_OBJECT = new HistorialAccesoPublicacionEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private Date fechaAcceso;
	
	private HistorialAccesoPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setFechaAcceso(fechaAcceso);
	}
	
	public HistorialAccesoPublicacionEntity(final UUID identificador, final LectorEntity lector, final PublicacionEntity publicacion,
			final Date fechaAcceso) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaAcceso(fechaAcceso);
	}

	public static HistorialAccesoPublicacionEntity getDefaultObject() {
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
	public final Date getFechaAcceso() {
		return fechaAcceso;
	}
	private final void setFechaAcceso(final Date fechaAcceso) {
		this.fechaAcceso = fechaAcceso;
	}
	
	

}

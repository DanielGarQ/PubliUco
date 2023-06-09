package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class HistorialAccesoPublicacionDTO {
	
	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private Date fechaAcceso;
	
	public HistorialAccesoPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setFechaAcceso(fechaAcceso);
	}
	
	public HistorialAccesoPublicacionDTO(final UUID identificador, final LectorDTO lector, final PublicacionDTO publicacion,
			final Date fechaAcceso) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaAcceso(fechaAcceso);
	}

	public static HistorialAccesoPublicacionDTO create() {
		return new HistorialAccesoPublicacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final HistorialAccesoPublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final LectorDTO getLector() {
		return lector;
	}
	public final HistorialAccesoPublicacionDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}
	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}
	public final HistorialAccesoPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}
	public final Date getFechaAcceso() {
		return fechaAcceso;
	}
	public final HistorialAccesoPublicacionDTO setFechaAcceso(final Date fechaAcceso) {
		this.fechaAcceso = fechaAcceso;
		return this;
	}
	
	

}

package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanPublicacionDTO {
	
	private UUID identificador;
	private PublicacionDTO publicacion;
	private double precio;
	private Date fechaDesde;
	private Date fechaHasta;
	private EstadoPlanDTO estado;
	
	public PlanPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDTO.create());
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(EstadoPlanDTO.create());
	}
	
	public PlanPublicacionDTO(UUID identificador, PublicacionDTO publicacion, double precio, Date fechaDesde,
			Date fechaHasta, EstadoPlanDTO estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(estado);
	}

	public static PlanPublicacionDTO create() {
		return new PlanPublicacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PlanPublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}
	public final PlanPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}
	public final double getPrecio() {
		return precio;
	}
	public final PlanPublicacionDTO setPrecio(final double precio) {
		this.precio = precio;
		return this;
	}
	public final Date getFechaDesde() {
		return fechaDesde;
	}
	public final PlanPublicacionDTO setFechaDesde(final Date fechaDesde) {
		this.fechaDesde = fechaDesde;
		return this;
	}
	public final Date getFechaHasta() {
		return fechaHasta;
	}
	public final PlanPublicacionDTO setFechaHasta(final Date fechaHasta) {
		this.fechaHasta = fechaHasta;
		return this;
	}
	public final EstadoPlanDTO getEstado() {
		return estado;
	}
	public final PlanPublicacionDTO setEstado(final EstadoPlanDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPlanDTO.create());
		return this;
	}
	
	

}

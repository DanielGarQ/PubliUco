package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanPublicacionEntity {
	
	private static final PlanPublicacionEntity DEFAULT_OBJECT = new PlanPublicacionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private double precio;
	private Date fechaDesde;
	private Date fechaHasta;
	private EstadoPlanEntity estado;
	
	private PlanPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionEntity.getDefaultObject());
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(EstadoPlanEntity.getDefaultObject());
	}
	
	public PlanPublicacionEntity(UUID identificador, PublicacionEntity publicacion, double precio, Date fechaDesde,
			Date fechaHasta, EstadoPlanEntity estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(estado);
	}

	public static PlanPublicacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}
	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}
	public final double getPrecio() {
		return precio;
	}
	private final void setPrecio(final double precio) {
		this.precio = precio;
	}
	public final Date getFechaDesde() {
		return fechaDesde;
	}
	private final void setFechaDesde(final Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public final Date getFechaHasta() {
		return fechaHasta;
	}
	private final void setFechaHasta(final Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public final EstadoPlanEntity getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoPlanEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPlanEntity.getDefaultObject());
	}
	
	

}

package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanPublicacionDomain {
	
	private static final PlanPublicacionDomain DEFAULT_OBJECT = new PlanPublicacionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private double precio;
	private Date fechaDesde;
	private Date fechaHasta;
	private EstadoPlanDomain estado;
	
	private PlanPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDomain.getDefaultObject());
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(EstadoPlanDomain.getDefaultObject());
	}
	
	public PlanPublicacionDomain(UUID identificador, PublicacionDomain publicacion, double precio, Date fechaDesde,
			Date fechaHasta, EstadoPlanDomain estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
		setEstado(estado);
	}

	public static PlanPublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}
	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
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
	public final EstadoPlanDomain getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoPlanDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPlanDomain.getDefaultObject());
	}
	
	

}

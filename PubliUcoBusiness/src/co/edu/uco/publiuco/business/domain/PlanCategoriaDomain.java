package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanCategoriaDomain {
	
	private static final PlanCategoriaDomain DEFAULT_OBJECT = new PlanCategoriaDomain();
	private UUID identificador;
	private CategoriaDomain categoria;
	private double precio;
	private Date fechaDesde;
	private Date fechahasta;
	private EstadoPlanDomain estado;
	
	private PlanCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDomain.getDefaultObject());
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechahasta(fechahasta);
		setEstado(EstadoPlanDomain.getDefaultObject());
	}
	
	public PlanCategoriaDomain(final UUID identificador, final CategoriaDomain categoria, final double precio, final Date fechaDesde, final Date fechahasta,
			EstadoPlanDomain estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechahasta(fechahasta);
		setEstado(estado);
	}
	
	public static PlanCategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final CategoriaDomain getCategoria() {
		return categoria;
	}
	private final void setCategoria(CategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDomain.getDefaultObject());
	}
	public final double getPrecio() {
		return precio;
	}
	private final void setPrecio(double precio) {
		this.precio = precio;
	}
	public final Date getFechaDesde() {
		return fechaDesde;
	}
	private final void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public final Date getFechahasta() {
		return fechahasta;
	}
	private final void setFechahasta(Date fechahasta) {
		this.fechahasta = fechahasta;
	}
	public final EstadoPlanDomain getEstado() {
		return estado;
	}
	private final void setEstado(EstadoPlanDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPlanDomain.getDefaultObject());
	}
	
	
	

}

package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanCategoriaEntity {
	
	private static final PlanCategoriaEntity DEFAULT_OBJECT = new PlanCategoriaEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private double precio;
	private Date fechaDesde;
	private Date fechahasta;
	private EstadoPlanEntity estado;
	
	private PlanCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntity.getDefaultObject());
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechahasta(fechahasta);
		setEstado(EstadoPlanEntity.getDefaultObject());
	}
	
	public PlanCategoriaEntity(final UUID identificador, final CategoriaEntity categoria, final double precio, final Date fechaDesde, final Date fechahasta,
			EstadoPlanEntity estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechahasta(fechahasta);
		setEstado(estado);
	}
	
	public static PlanCategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final CategoriaEntity getCategoria() {
		return categoria;
	}
	private final void setCategoria(CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
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
	public final EstadoPlanEntity getEstado() {
		return estado;
	}
	private final void setEstado(EstadoPlanEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPlanEntity.getDefaultObject());
	}
	
	
	

}

package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PlanCategoriaDTO {
	
	private UUID identificador;
	private CategoriaDTO categoria;
	private double precio;
	private Date fechaDesde;
	private Date fechahasta;
	private EstadoPlanDTO estado;
	
	public PlanCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDTO.create());
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechahasta(fechahasta);
		setEstado(EstadoPlanDTO.create());
	}
	
	public PlanCategoriaDTO(final UUID identificador, final CategoriaDTO categoria, final double precio, final Date fechaDesde, final Date fechahasta,
			EstadoPlanDTO estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechahasta(fechahasta);
		setEstado(estado);
	}
	
	public static PlanCategoriaDTO create() {
		return new PlanCategoriaDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PlanCategoriaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final CategoriaDTO getCategoria() {
		return categoria;
	}
	public final PlanCategoriaDTO setCategoria(CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}
	public final double getPrecio() {
		return precio;
	}
	public final PlanCategoriaDTO setPrecio(double precio) {
		this.precio = precio;
		return this;
	}
	public final Date getFechaDesde() {
		return fechaDesde;
	}
	public final PlanCategoriaDTO setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
		return this;
	}
	public final Date getFechahasta() {
		return fechahasta;
	}
	public final PlanCategoriaDTO setFechahasta(Date fechahasta) {
		this.fechahasta = fechahasta;
		return this;
	}
	public final EstadoPlanDTO getEstado() {
		return estado;
	}
	public final PlanCategoriaDTO setEstado(EstadoPlanDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPlanDTO.create());
		return this;
	}
	
	
	

}

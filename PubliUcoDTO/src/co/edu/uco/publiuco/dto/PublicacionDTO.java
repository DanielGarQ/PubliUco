package co.edu.uco.publiuco.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PublicacionDTO {
	
	private UUID identificador;
	private CategoriaDTO categoria;
	private TipoAccesoDTO tipoAcceso;
	private Date fechapublicacion;
	private VersionDTO ultimaVersion;
	private EstadoPublicacionDTO estado;
	
	public PublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDTO.create());
		setTipoAcceso(TipoAccesoDTO.create());
		setFechapublicacion(fechapublicacion);
		setUltimaVersion(VersionDTO.create());
		setEstado(EstadoPublicacionDTO.create());
	}
	
	public PublicacionDTO(final UUID identificador, final CategoriaDTO categoria, final TipoAccesoDTO tipoAcceso, final Date fechapublicacion,
			final VersionDTO ultimaVersion, final EstadoPublicacionDTO estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAcceso(tipoAcceso);
		setFechapublicacion(fechapublicacion);
		setUltimaVersion(ultimaVersion);
		setEstado(estado);
	}
	
	public static PublicacionDTO create() {
		return new PublicacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final CategoriaDTO getCategoria() {
		return categoria;
	}
	public final PublicacionDTO setCategoria(final CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}
	public final TipoAccesoDTO getTipoAcceso() {
		return tipoAcceso;
	}
	public final PublicacionDTO setTipoAcceso(final TipoAccesoDTO tipoAcceso) {
		this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoDTO.create());
		return this;
	}
	public final Date getFechapublicacion() {
		return fechapublicacion;
	}
	public final PublicacionDTO setFechapublicacion(final Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
		return this;
	}
	public final VersionDTO getUltimaVersion() {
		return ultimaVersion;
	}
	public final PublicacionDTO setUltimaVersion(final VersionDTO ultimaVersion) {
		this.ultimaVersion = UtilObject.getDefault(ultimaVersion, VersionDTO.create());
		return this;
	}
	public final EstadoPublicacionDTO getEstado() {
		return estado;
	}
	public final PublicacionDTO setEstado(final EstadoPublicacionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionDTO.create());
		return this;
	}
	
	

}

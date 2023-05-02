package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PublicacionEntity {
	
	private static final PublicacionEntity DEFAULT_OBJECT = new PublicacionEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private TipoAccesoEntity tipoAcceso;
	private Date fechapublicacion;
	private VersionEntity ultimaVersion;
	private EstadoPublicacionEntity estado;
	
	private PublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntity.getDefaultObject());
		setTipoAcceso(TipoAccesoEntity.getDefaultObject());
		setFechapublicacion(fechapublicacion);
		setUltimaVersion(VersionEntity.getDefaultObject());
		setEstado(EstadoPublicacionEntity.getDefaultObject());
	}
	
	public PublicacionEntity(final UUID identificador, final CategoriaEntity categoria, final TipoAccesoEntity tipoAcceso, final Date fechapublicacion,
			final VersionEntity ultimaVersion, final EstadoPublicacionEntity estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAcceso(tipoAcceso);
		setFechapublicacion(fechapublicacion);
		setUltimaVersion(ultimaVersion);
		setEstado(estado);
	}
	
	public static PublicacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final CategoriaEntity getCategoria() {
		return categoria;
	}
	private final void setCategoria(final CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
	}
	public final TipoAccesoEntity getTipoAcceso() {
		return tipoAcceso;
	}
	private final void setTipoAcceso(final TipoAccesoEntity tipoAcceso) {
		this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoEntity.getDefaultObject());
	}
	public final Date getFechapublicacion() {
		return fechapublicacion;
	}
	private final void setFechapublicacion(final Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}
	public final VersionEntity getUltimaVersion() {
		return ultimaVersion;
	}
	private final void setUltimaVersion(final VersionEntity ultimaVersion) {
		this.ultimaVersion = UtilObject.getDefault(ultimaVersion, VersionEntity.getDefaultObject());
	}
	public final EstadoPublicacionEntity getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoPublicacionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionEntity.getDefaultObject());
	}
	
	

}

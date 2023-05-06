package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PublicacionDomain {
	
	private static final PublicacionDomain DEFAULT_OBJECT = new PublicacionDomain();
	private UUID identificador;
	private CategoriaDomain categoria;
	private TipoAccesoDomain tipoAcceso;
	private Date fechapublicacion;
	private VersionDomain ultimaVersion;
	private EstadoPublicacionDomain estado;
	
	private PublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDomain.getDefaultObject());
		setTipoAcceso(TipoAccesoDomain.getDefaultObject());
		setFechapublicacion(fechapublicacion);
		setUltimaVersion(VersionDomain.getDefaultObject());
		setEstado(EstadoPublicacionDomain.getDefaultObject());
	}
	
	public PublicacionDomain(final UUID identificador, final CategoriaDomain categoria, final TipoAccesoDomain tipoAcceso, final Date fechapublicacion,
			final VersionDomain ultimaVersion, final EstadoPublicacionDomain estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAcceso(tipoAcceso);
		setFechapublicacion(fechapublicacion);
		setUltimaVersion(ultimaVersion);
		setEstado(estado);
	}
	
	public static PublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final CategoriaDomain getCategoria() {
		return categoria;
	}
	private final void setCategoria(final CategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDomain.getDefaultObject());
	}
	public final TipoAccesoDomain getTipoAcceso() {
		return tipoAcceso;
	}
	private final void setTipoAcceso(final TipoAccesoDomain tipoAcceso) {
		this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoDomain.getDefaultObject());
	}
	public final Date getFechapublicacion() {
		return fechapublicacion;
	}
	private final void setFechapublicacion(final Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}
	public final VersionDomain getUltimaVersion() {
		return ultimaVersion;
	}
	private final void setUltimaVersion(final VersionDomain ultimaVersion) {
		this.ultimaVersion = UtilObject.getDefault(ultimaVersion, VersionDomain.getDefaultObject());
	}
	public final EstadoPublicacionDomain getEstado() {
		return estado;
	}
	private final void setEstado(final EstadoPublicacionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionDomain.getDefaultObject());
	}
	
	

}

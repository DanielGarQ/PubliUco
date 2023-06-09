package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EscritorPublicacionEntity {
	
	private static final EscritorPublicacionEntity DEFAULT_OBJECT = new EscritorPublicacionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private EscritorEntity escritor;
	private TipoEscritorEntity tipoEscritor;
	
	private EscritorPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionEntity.getDefaultObject());
		setEscritor(EscritorEntity.getDefaultObject());
		setTipoEscritor(TipoEscritorEntity.getDefaultObject());
	}
	
	public EscritorPublicacionEntity(final UUID identificador, final PublicacionEntity publicacion, final EscritorEntity escritor,
			final TipoEscritorEntity tipoEscritor) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setEscritor(escritor);
		setTipoEscritor(tipoEscritor);
	}

	public static EscritorPublicacionEntity getDefaultObject() {
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
	public final EscritorEntity getEscritor() {
		return escritor;
	}
	private final void setEscritor(final EscritorEntity escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());
	}
	public final TipoEscritorEntity getTipoEscritor() {
		return tipoEscritor;
	}
	private final void setTipoEscritor(final TipoEscritorEntity tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorEntity.getDefaultObject());
	}
	
	
	

}

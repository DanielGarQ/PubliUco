package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EscritorPublicacionDomain {
	
	private static final EscritorPublicacionDomain DEFAULT_OBJECT = new EscritorPublicacionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private EscritorDomain escritor;
	private TipoEscritorDomain tipoEscritor;
	
	private EscritorPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDomain.getDefaultObject());
		setEscritor(EscritorDomain.getDefaultObject());
		setTipoEscritor(TipoEscritorDomain.getDefaultObject());
	}
	
	public EscritorPublicacionDomain(final UUID identificador, final PublicacionDomain publicacion, final EscritorDomain escritor,
			final TipoEscritorDomain tipoEscritor) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setEscritor(escritor);
		setTipoEscritor(tipoEscritor);
	}

	public static EscritorPublicacionDomain getDefaultObject() {
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
	public final EscritorDomain getEscritor() {
		return escritor;
	}
	private final void setEscritor(final EscritorDomain escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDomain.getDefaultObject());
	}
	public final TipoEscritorDomain getTipoEscritor() {
		return tipoEscritor;
	}
	private final void setTipoEscritor(final TipoEscritorDomain tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorDomain.getDefaultObject());
	}
	
	
	

}

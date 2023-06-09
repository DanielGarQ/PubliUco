package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PerfilDomain {
	
	private static final PerfilDomain DEFAULT_OBJECT = new PerfilDomain();
	private UUID identificador;
	private LectorDomain lector;
	private boolean recomendacionesCategoria;
	private boolean recomendacionesAutor;
	
	private PerfilDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setRecomendacionesCategoria(recomendacionesCategoria);
		setRecomendacionesAutor(recomendacionesAutor);
	}
	
	public PerfilDomain(final UUID identificador,final LectorDomain lector,final boolean recomendacionesCategoria, final boolean recomendacionesAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setRecomendacionesCategoria(recomendacionesCategoria);
		setRecomendacionesAutor(recomendacionesAutor);
	}
	
	public static PerfilDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final LectorDomain getLector() {
		return lector;
	}
	private final void setLector(LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}
	public final boolean isRecomendacionesCategoria() {
		return recomendacionesCategoria;
	}
	private final void setRecomendacionesCategoria(boolean recomendacionesCategoria) {
		this.recomendacionesCategoria = recomendacionesCategoria;
	}
	public final boolean isRecomendacionesAutor() {
		return recomendacionesAutor;
	}
	private final void setRecomendacionesAutor(boolean recomendacionesAutor) {
		this.recomendacionesAutor = recomendacionesAutor;
	}

}

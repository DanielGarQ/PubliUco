package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PerfilEntity {
	
	private static final PerfilEntity DEFAULT_OBJECT = new PerfilEntity();
	private UUID identificador;
	private LectorEntity lector;
	private boolean recomendacionesCategoria;
	private boolean recomendacionesAutor;
	
	private PerfilEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setRecomendacionesCategoria(recomendacionesCategoria);
		setRecomendacionesAutor(recomendacionesAutor);
	}
	
	public PerfilEntity(final UUID identificador,final LectorEntity lector,final boolean recomendacionesCategoria, final boolean recomendacionesAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setRecomendacionesCategoria(recomendacionesCategoria);
		setRecomendacionesAutor(recomendacionesAutor);
	}
	
	public static PerfilEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final LectorEntity getLector() {
		return lector;
	}
	private final void setLector(LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
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

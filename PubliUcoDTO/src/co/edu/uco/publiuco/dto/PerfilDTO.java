package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PerfilDTO {
	
	private UUID identificador;
	private LectorDTO lector;
	private boolean recomendacionesCategoria;
	private boolean recomendacionesAutor;
	
	public PerfilDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setRecomendacionesCategoria(recomendacionesCategoria);
		setRecomendacionesAutor(recomendacionesAutor);
	}
	
	public PerfilDTO(final UUID identificador,final LectorDTO lector,final boolean recomendacionesCategoria, final boolean recomendacionesAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setRecomendacionesCategoria(recomendacionesCategoria);
		setRecomendacionesAutor(recomendacionesAutor);
	}
	
	public static PerfilDTO create() {
		return new PerfilDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PerfilDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final LectorDTO getLector() {
		return lector;
	}
	public final PerfilDTO setLector(LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}
	public final boolean isRecomendacionesCategoria() {
		return recomendacionesCategoria;
	}
	public final PerfilDTO setRecomendacionesCategoria(boolean recomendacionesCategoria) {
		this.recomendacionesCategoria = recomendacionesCategoria;
		return this;
	}
	public final boolean isRecomendacionesAutor() {
		return recomendacionesAutor;
	}
	public final PerfilDTO setRecomendacionesAutor(boolean recomendacionesAutor) {
		this.recomendacionesAutor = recomendacionesAutor;
		return this;
	}
	
	

}

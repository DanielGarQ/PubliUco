package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class PalabraClavePublicacionDTO {
	
	private UUID identificador;
	private PublicacionDTO publicacion;
	private String palabraClave;
	
	public PalabraClavePublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDTO.create());
		setPalabraClave(UtilText.EMPTY);
	}
	
	public PalabraClavePublicacionDTO(final UUID identificador, final PublicacionDTO publicacion, final String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}

	public static PalabraClavePublicacionDTO create() {
		return new PalabraClavePublicacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PalabraClavePublicacionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}
	public final PalabraClavePublicacionDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}
	public final String getPalabraClave() {
		return palabraClave;
	}
	public final PalabraClavePublicacionDTO setPalabraClave(String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
		return this;
	}
	
	

}

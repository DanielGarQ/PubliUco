package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EstadoAdministradorCategoriaDTO {
	
	private UUID identificador;
	private String Nombre;
	private String descripcion;
	
	public EstadoAdministradorCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public EstadoAdministradorCategoriaDTO(final UUID identificador,final String nombre,final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static EstadoAdministradorCategoriaDTO create() {
		return new EstadoAdministradorCategoriaDTO();
	}
	

	public final UUID getIdentificador() {
		return identificador;
	}

	public final EstadoAdministradorCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final String getNombre() {
		return Nombre;
	}

	public final EstadoAdministradorCategoriaDTO setNombre(final String nombre) {
		Nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoAdministradorCategoriaDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

}

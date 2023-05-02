package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EstadoAdministradorCategoriaEntity {
	
	private static final EstadoAdministradorCategoriaEntity DEFAULT_OBJECT = new EstadoAdministradorCategoriaEntity();
	private UUID identificador;
	private String Nombre;
	private String descripcion;
	
	private EstadoAdministradorCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public EstadoAdministradorCategoriaEntity(final UUID identificador,final String nombre,final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static EstadoAdministradorCategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final String getNombre() {
		return Nombre;
	}

	private final void setNombre(final String nombre) {
		Nombre = UtilText.getUtilText().applyTrim(nombre);
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}

}

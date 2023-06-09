package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CategoriaEntity {
	
	private static final CategoriaEntity DEFAULT_OBJECT = new CategoriaEntity();
	private UUID identificador;
	private CategoriaEntity categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaEntity estado;
	
	private CategoriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoriaPadre(CategoriaEntity.getDefaultObject());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoCategoriaEntity.getDefaultObject());
	}
	
	public CategoriaEntity(final UUID identificador, final CategoriaEntity categoriaPadre, final String nombre,final String descripcion, final EstadoCategoriaEntity estado) {
		super();
		setIdentificador(identificador);
		setCategoriaPadre(categoriaPadre);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static CategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	public final CategoriaEntity getCategoriaPadre() {
		return categoriaPadre;
	}

	private final void setCategoriaPadre(CategoriaEntity categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaEntity.getDefaultObject());
	}

	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}
	public final String getDescripcion() {
		return descripcion;
	}
	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}

	public EstadoCategoriaEntity getEstado() {
		return estado;
	}

	private final void setEstado(EstadoCategoriaEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaEntity.getDefaultObject());
	}

}

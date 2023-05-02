package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CategoriaDTO {
	
	private UUID identificador;
	private CategoriaDTO categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaDTO estado;
	
	public CategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoriaPadre(CategoriaDTO.create());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoCategoriaDTO.create());
	}
	
	public CategoriaDTO(final UUID identificador, final CategoriaDTO categoriaPadre, final String nombre,final String descripcion, final EstadoCategoriaDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static CategoriaDTO create() {
		return new CategoriaDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final CategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final CategoriaDTO getCategoriaPadre() {
		return categoriaPadre;
	}

	public final CategoriaDTO setCategoriaPadre(CategoriaDTO categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDTO.create());
		return this;
	}

	public final String getNombre() {
		return nombre;
	}
	public final CategoriaDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final CategoriaDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	public EstadoCategoriaDTO getEstado() {
		return estado;
	}

	public final CategoriaDTO setEstado(EstadoCategoriaDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaDTO.create());
		return this;
	}

}

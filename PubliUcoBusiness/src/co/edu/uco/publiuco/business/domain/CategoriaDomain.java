package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class CategoriaDomain {
	
	private static final CategoriaDomain DEFAULT_OBJECT = new CategoriaDomain();
	private UUID identificador;
	private CategoriaDomain categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaDomain estado;
	
	private CategoriaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoriaPadre(CategoriaDomain.getDefaultObject());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoCategoriaDomain.getDefaultObject());
	}
	
	public CategoriaDomain(final UUID identificador, final CategoriaDomain categoriaPadre, final String nombre,final String descripcion, final EstadoCategoriaDomain estado) {
		super();
		setIdentificador(identificador);
		setCategoriaPadre(categoriaPadre);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static CategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	public final CategoriaDomain getCategoriaPadre() {
		return categoriaPadre;
	}

	private final void setCategoriaPadre(CategoriaDomain categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDomain.getDefaultObject());
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

	public EstadoCategoriaDomain getEstado() {
		return estado;
	}

	private final void setEstado(EstadoCategoriaDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaDomain.getDefaultObject());
	}

}

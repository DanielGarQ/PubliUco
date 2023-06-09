package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoIdentificacionEntity {
	
	private static final TipoIdentificacionEntity DEFAULT_OBJECT = new TipoIdentificacionEntity();
	private UUID identificador;
	private String codigo;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionEntity estado;
	
	private TipoIdentificacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCodigo(UtilText.EMPTY);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoIdentificacionEntity.getDefaultObject());
	}
	
	public TipoIdentificacionEntity(final UUID identificador,final String nombre,final String descripcion, final EstadoTipoIdentificacionEntity estado) {
		super();
		setIdentificador(identificador);
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoIdentificacionEntity getDefaultobject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	public final String getCodigo() {
		return codigo;
	}

	private final void setCodigo(String codigo) {
		this.codigo = UtilText.getUtilText().applyTrim(codigo);
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

	public EstadoTipoIdentificacionEntity getEstado() {
		return estado;
	}

	private final void setEstado(EstadoTipoIdentificacionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionEntity.getDefaultObject());
	}

}

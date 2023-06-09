package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoIdentificacionDTO {
	
	private UUID identificador;
	private String codigo;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionDTO estado;
	
	public TipoIdentificacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCodigo(UtilText.EMPTY);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoIdentificacionDTO.create());
	}
	
	public TipoIdentificacionDTO(final UUID identificador,final String nombre,final String descripcion, final EstadoTipoIdentificacionDTO estado) {
		super();
		setIdentificador(identificador);
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoIdentificacionDTO create() {
		return new TipoIdentificacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final TipoIdentificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final String getCodigo() {
		return codigo;
	}

	public final TipoIdentificacionDTO setCodigo(String codigo) {
		this.codigo = UtilText.getUtilText().applyTrim(codigo);
		return this;
	}

	public final String getNombre() {
		return nombre;
	}
	public final TipoIdentificacionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final TipoIdentificacionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	public EstadoTipoIdentificacionDTO getEstado() {
		return estado;
	}

	public final TipoIdentificacionDTO setEstado(EstadoTipoIdentificacionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionDTO.create());
		return this;
	}


}

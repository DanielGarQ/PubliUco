package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoAccesoDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoAccesoDTO estado;
	
	public TipoAccesoDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoAccesoDTO.create());
	}
	
	public TipoAccesoDTO(final UUID identificador,final String nombre,final String descripcion, final EstadoTipoAccesoDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoAccesoDTO create() {
		return new TipoAccesoDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final TipoAccesoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final TipoAccesoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final TipoAccesoDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	public EstadoTipoAccesoDTO getEstado() {
		return estado;
	}

	public final TipoAccesoDTO setEstado(EstadoTipoAccesoDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoAccesoDTO.create());
		return this;
	}

}

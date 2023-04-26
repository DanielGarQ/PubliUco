package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoRelacionInstitucionEntity {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionEntity estado;
	
	public TipoRelacionInstitucionEntity(final UUID identificador,final String nombre,final String descripcion, final EstadoTipoRelacionInstitucionEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final TipoRelacionInstitucionEntity setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}
	public final String getDescripcion() {
		return descripcion;
	}
	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}

	public EstadoTipoRelacionInstitucionEntity getEstado() {
		return estado;
	}

	private final void setEstado(EstadoTipoRelacionInstitucionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoRelacionInstitucionEntity.getDefaultObject());
	}

	
	

}



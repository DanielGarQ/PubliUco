package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoIdentificacionDomain {
	
	private static final TipoIdentificacionDomain DEFAULT_OBJECT = new TipoIdentificacionDomain();
	private UUID identificador;
	private String codigo;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionDomain estado;
	
	private TipoIdentificacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCodigo(UtilText.EMPTY);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoIdentificacionDomain.getDefaultObject());
	}
	
	public TipoIdentificacionDomain(final UUID identificador,final String nombre,final String descripcion, final EstadoTipoIdentificacionDomain estado) {
		super();
		setIdentificador(identificador);
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoIdentificacionDomain getDefaultobject() {
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

	public EstadoTipoIdentificacionDomain getEstado() {
		return estado;
	}

	private final void setEstado(EstadoTipoIdentificacionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionDomain.getDefaultObject());
	}

}

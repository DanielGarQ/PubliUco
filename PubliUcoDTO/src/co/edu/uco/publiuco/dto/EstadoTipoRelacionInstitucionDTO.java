package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EstadoTipoRelacionInstitucionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public EstadoTipoRelacionInstitucionDTO(final UUID identificador,final String nombre,final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static EstadoTipoRelacionInstitucionDTO create() {
		return new EstadoTipoRelacionInstitucionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final EstadoTipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final EstadoTipoRelacionInstitucionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final EstadoTipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	@Override
	public String toString() {
		return "EstadoTipoRelacionInstitucionDTO [identificador=" + identificador + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + "]";
	}
	
	public static void main(String[] args) {
		
		EstadoTipoRelacionInstitucionDTO objeto = new EstadoTipoRelacionInstitucionDTO();
		objeto.setIdentificador(UtilUUID.generateNewUUID());
		objeto.setNombre("Docente");
		objeto.setDescripcion("soy docente");
		System.out.println(objeto);
		
		EstadoTipoRelacionInstitucionDTO objetoDos = EstadoTipoRelacionInstitucionDTO.create().setDescripcion("soy docente").setIdentificador(UtilUUID.generateNewUUID()).setNombre("Docente");
		System.out.println(objetoDos);
	}
	

}



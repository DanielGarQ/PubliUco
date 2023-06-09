package co.edu.uco.publiuco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ReporteEntity {
	
	private static final ReporteEntity DEFAULT_OBJECT = new ReporteEntity();
	private UUID identificador;
	private LectorEntity lector;
	private ComentarioLectorEntity comentario;
	private TipoReporteEntity tipoReporte;
	private String razon;
	private Date fechaReporte;
	
	private ReporteEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setComentario(ComentarioLectorEntity.getdefaultObject());
		setTipoReporte(TipoReporteEntity.getDefaultObject());
		setRazon(UtilText.getUtilText().getDefaultValue());
		setFechaReporte(fechaReporte);
	}
	
	public ReporteEntity(final UUID identificador, final LectorEntity lector, final ComentarioLectorEntity comentario, final TipoReporteEntity tipoReporte,
			final String razon, final Date fechaReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
		setRazon(razon);
		setFechaReporte(fechaReporte);
	}
	
	public static ReporteEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final LectorEntity getLector() {
		return lector;
	}
	public final void setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}
	public final ComentarioLectorEntity getComentario() {
		return comentario;
	}
	public final void setComentario(final ComentarioLectorEntity comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorEntity.getdefaultObject());
	}
	public final TipoReporteEntity getTipoReporte() {
		return tipoReporte;
	}
	public final void setTipoReporte(final TipoReporteEntity tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteEntity.getDefaultObject());
	}
	public final String getRazon() {
		return razon;
	}
	public final void setRazon(final String razon) {
		this.razon = UtilText.getUtilText().applyTrim(razon);
	}
	public final Date getFechaReporte() {
		return fechaReporte;
	}
	public final void setFechaReporte(final Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}
	

}

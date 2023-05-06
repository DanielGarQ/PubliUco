package co.edu.uco.publiuco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ReporteDomain {
	
	private static final ReporteDomain DEFAULT_OBJECT = new ReporteDomain();
	private UUID identificador;
	private LectorDomain lector;
	private ComentarioLectorDomain comentario;
	private TipoReporteDomain tipoReporte;
	private String razon;
	private Date fechaReporte;
	
	private ReporteDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setComentario(ComentarioLectorDomain.getdefaultObject());
		setTipoReporte(TipoReporteDomain.getDefaultObject());
		setRazon(UtilText.getUtilText().getDefaultValue());
		setFechaReporte(fechaReporte);
	}
	
	public ReporteDomain(final UUID identificador, final LectorDomain lector, final ComentarioLectorDomain comentario, final TipoReporteDomain tipoReporte,
			final String razon, final Date fechaReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
		setRazon(razon);
		setFechaReporte(fechaReporte);
	}
	
	public static ReporteDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final LectorDomain getLector() {
		return lector;
	}
	public final void setLector(final LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}
	public final ComentarioLectorDomain getComentario() {
		return comentario;
	}
	public final void setComentario(final ComentarioLectorDomain comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorDomain.getdefaultObject());
	}
	public final TipoReporteDomain getTipoReporte() {
		return tipoReporte;
	}
	public final void setTipoReporte(final TipoReporteDomain tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteDomain.getDefaultObject());
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

package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class SuscripcionCategoriaDomain {
	
	private static final SuscripcionCategoriaDomain DEFAULT_OBJECT = new SuscripcionCategoriaDomain();
	private UUID identificador;
	private PerfilDomain perfil;
	private PlanCategoriaDomain planCategoria;
	
	private SuscripcionCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDomain.getDefaultObject());
		setPlanCategoria(PlanCategoriaDomain.getDefaultObject());
	}
	
	public SuscripcionCategoriaDomain(final UUID identificador, final PerfilDomain perfil, final PlanCategoriaDomain planCategoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanCategoria(planCategoria);
	}
	
	public static SuscripcionCategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PerfilDomain getPerfil() {
		return perfil;
	}

	private final void setPerfil(final PerfilDomain perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDomain.getDefaultObject());
	}

	public final PlanCategoriaDomain getPlanCategoria() {
		return planCategoria;
	}

	private final void setPlanCategoria(final PlanCategoriaDomain escritor) {
		this.planCategoria = UtilObject.getDefault(escritor, PlanCategoriaDomain.getDefaultObject());
	}

}

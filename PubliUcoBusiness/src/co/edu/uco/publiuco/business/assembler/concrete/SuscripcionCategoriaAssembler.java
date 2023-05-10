package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.SuscripcionCategoriaDomain;
import co.edu.uco.publiuco.dto.SuscripcionCategoriaDTO;
import co.edu.uco.publiuco.entities.SuscripcionCategoriaEntity;

public final class SuscripcionCategoriaAssembler implements Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> {
	
	private static final Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> INSTANCE = new SuscripcionCategoriaAssembler();

	private SuscripcionCategoriaAssembler() {
		super();
	}
	
	public static final Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public SuscripcionCategoriaDTO toDtoFromDomain(SuscripcionCategoriaDomain domain) {
		return SuscripcionCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setPerfil(PerfilAssembler.getinstance().toDtoFromDomain(domain.getPerfil())).setPlanCategoria(PlanCategoriaAssembler.getinstance().toDtoFromDomain(domain.getPlanCategoria()));
	}

	@Override
	public SuscripcionCategoriaDomain toDomainFromDto(SuscripcionCategoriaDTO dto) {
		return new SuscripcionCategoriaDomain(dto.getIdentificador(), PerfilAssembler.getinstance().toDomainFromDto(dto.getPerfil()), PlanCategoriaAssembler.getinstance().toDomainFromDto(dto.getPlanCategoria()));
	}

	@Override
	public SuscripcionCategoriaEntity toEntityFromDomain(SuscripcionCategoriaDomain domain) {
		return new SuscripcionCategoriaEntity(domain.getIdentificador(), PerfilAssembler.getinstance().toEntityFromDomain(domain.getPerfil()), PlanCategoriaAssembler.getinstance().toEntityFromDomain(domain.getPlanCategoria()));
	}

	@Override
	public SuscripcionCategoriaDomain toDomainFromEntity(SuscripcionCategoriaEntity entity) {
		return new SuscripcionCategoriaDomain(entity.getIdentificador(), PerfilAssembler.getinstance().toDomainFromEntity(entity.getPerfil()), PlanCategoriaAssembler.getinstance().toDomainFromEntity(entity.getPlanCategoria()));

	}

	@Override
	public List<SuscripcionCategoriaDomain> toDomainListFromEntityList(List<SuscripcionCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

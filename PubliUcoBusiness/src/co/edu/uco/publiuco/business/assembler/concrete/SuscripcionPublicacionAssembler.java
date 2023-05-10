package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.SuscripcionPublicacionDomain;
import co.edu.uco.publiuco.dto.SuscripcionPublicacionDTO;
import co.edu.uco.publiuco.entities.SuscripcionPublicacionEntity;

public final class SuscripcionPublicacionAssembler implements Assembler<SuscripcionPublicacionDomain, SuscripcionPublicacionDTO, SuscripcionPublicacionEntity>{
	
	private static final Assembler<SuscripcionPublicacionDomain, SuscripcionPublicacionDTO, SuscripcionPublicacionEntity> INSTANCE = new SuscripcionPublicacionAssembler();

	private SuscripcionPublicacionAssembler() {
		super();
	}
	
	public static final Assembler<SuscripcionPublicacionDomain, SuscripcionPublicacionDTO, SuscripcionPublicacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public SuscripcionPublicacionDTO toDtoFromDomain(SuscripcionPublicacionDomain domain) {
		return SuscripcionPublicacionDTO.create().setIdentificador(domain.getIdentificador()).setPerfil(PerfilAssembler.getinstance().toDtoFromDomain(domain.getPerfil())).setPlanPublicacion(PlanPublicacionAssembler.getinstance().toDtoFromDomain(domain.getPlanPublicacion())) ;
	}

	@Override
	public SuscripcionPublicacionDomain toDomainFromDto(SuscripcionPublicacionDTO dto) {
		return new SuscripcionPublicacionDomain(dto.getIdentificador(), PerfilAssembler.getinstance().toDomainFromDto(dto.getPerfil()), PlanPublicacionAssembler.getinstance().toDomainFromDto(dto.getPlanPublicacion()));
	}

	@Override
	public SuscripcionPublicacionEntity toEntityFromDomain(SuscripcionPublicacionDomain domain) {
		return new SuscripcionPublicacionEntity(domain.getIdentificador(), PerfilAssembler.getinstance().toEntityFromDomain(domain.getPerfil()), PlanPublicacionAssembler.getinstance().toEntityFromDomain(domain.getPlanPublicacion()));
	}

	@Override
	public SuscripcionPublicacionDomain toDomainFromEntity(SuscripcionPublicacionEntity entity) {
		return new SuscripcionPublicacionDomain(entity.getIdentificador(),PerfilAssembler.getinstance().toDomainFromEntity(entity.getPerfil()), PlanPublicacionAssembler.getinstance().toDomainFromEntity(entity.getPlanPublicacion()));

	}

	@Override
	public List<SuscripcionPublicacionDomain> toDomainListFromEntityList(List<SuscripcionPublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

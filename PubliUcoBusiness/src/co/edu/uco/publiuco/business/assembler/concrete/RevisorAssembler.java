package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RevisorDomain;
import co.edu.uco.publiuco.dto.RevisorDTO;
import co.edu.uco.publiuco.entities.RevisorEntity;

public final class RevisorAssembler implements Assembler<RevisorDomain, RevisorDTO, RevisorEntity> {
	
	private static final Assembler<RevisorDomain, RevisorDTO, RevisorEntity> INSTANCE = new RevisorAssembler();

	private RevisorAssembler() {
		super();
	}
	
	public static final Assembler<RevisorDomain, RevisorDTO, RevisorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public RevisorDTO toDtoFromDomain(RevisorDomain domain) {
		return RevisorDTO.create().setEstado(EstadoRevisorAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public RevisorDomain toDomainFromDto(RevisorDTO dto) {
		return new RevisorDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoRevisorAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public RevisorEntity toEntityFromDomain(RevisorDomain domain) {
		return new RevisorEntity(null, null, null, null, null, null, null, null, null, null, false, false, EstadoRevisorAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public RevisorDomain toDomainFromEntity(RevisorEntity entity) {
		return new RevisorDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoRevisorAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<RevisorDomain> toDomainListFromEntityList(List<RevisorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

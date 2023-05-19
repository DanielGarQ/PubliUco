package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoRevisorDomain;
import co.edu.uco.publiuco.dto.EstadoRevisorDTO;
import co.edu.uco.publiuco.entities.EstadoRevisorEntity;

public final class EstadoRevisorAssembler implements Assembler<EstadoRevisorDomain, EstadoRevisorDTO, EstadoRevisorEntity> {
	
	private static final Assembler<EstadoRevisorDomain, EstadoRevisorDTO, EstadoRevisorEntity> INSTANCE = new EstadoRevisorAssembler();

	private EstadoRevisorAssembler() {
		super();
	}
	
	public static final Assembler<EstadoRevisorDomain, EstadoRevisorDTO, EstadoRevisorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoRevisorDTO toDtoFromDomain(EstadoRevisorDomain domain) {
		return EstadoRevisorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoRevisorDomain toDomainFromDto(EstadoRevisorDTO dto) {
		return new EstadoRevisorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoRevisorEntity toEntityFromDomain(EstadoRevisorDomain domain) {
		return new EstadoRevisorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoRevisorDomain toDomainFromEntity(EstadoRevisorEntity entity) {
		return new EstadoRevisorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoRevisorDomain> toDomainListFromEntityList(final List<EstadoRevisorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<EstadoRevisorDTO> toDtoListFromDomainList(List<EstadoRevisorDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

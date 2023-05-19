package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RevisorRevisionDomain;
import co.edu.uco.publiuco.dto.RevisorRevisionDTO;
import co.edu.uco.publiuco.entities.RevisorRevisionEntity;

public final class RevisorRevisionAssembler implements Assembler<RevisorRevisionDomain, RevisorRevisionDTO, RevisorRevisionEntity> {
	
	private static final Assembler<RevisorRevisionDomain, RevisorRevisionDTO, RevisorRevisionEntity> INSTANCE = new RevisorRevisionAssembler();

	private RevisorRevisionAssembler() {
		super();
	}
	
	public static final Assembler<RevisorRevisionDomain, RevisorRevisionDTO, RevisorRevisionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public RevisorRevisionDTO toDtoFromDomain(RevisorRevisionDomain domain) {
		return RevisorRevisionDTO.create().setIdentificador(domain.getIdentificador()).setRevision(RevisionAssembler.getinstance().toDtoFromDomain(domain.getRevision())).setRevisor(RevisorAssembler.getinstance().toDtoFromDomain(domain.getRevisor())).setFechaAsignacion(domain.getFechaAsignacion()).setFechaCompletitud(domain.getFechaCompletitud()).setEstado(EstadoRevisionAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public RevisorRevisionDomain toDomainFromDto(RevisorRevisionDTO dto) {
		return new RevisorRevisionDomain(dto.getIdentificador(), RevisionAssembler.getinstance().toDomainFromDto(dto.getRevision()), RevisorAssembler.getinstance().toDomainFromDto(dto.getRevisor()), dto.getFechaAsignacion(), dto.getFechaCompletitud(), EstadoRevisionAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public RevisorRevisionEntity toEntityFromDomain(RevisorRevisionDomain domain) {
		return new RevisorRevisionEntity(domain.getIdentificador(), RevisionAssembler.getinstance().toEntityFromDomain(domain.getRevision()), RevisorAssembler.getinstance().toEntityFromDomain(domain.getRevisor()), domain.getFechaAsignacion(), domain.getFechaCompletitud(), EstadoRevisionAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public RevisorRevisionDomain toDomainFromEntity(RevisorRevisionEntity entity) {
		return new RevisorRevisionDomain(entity.getIdentificador(), RevisionAssembler.getinstance().toDomainFromEntity(entity.getRevision()), RevisorAssembler.getinstance().toDomainFromEntity(entity.getRevisor()), entity.getFechaAsignacion(), entity.getFechaCompletitud(), EstadoRevisionAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<RevisorRevisionDomain> toDomainListFromEntityList(List<RevisorRevisionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<RevisorRevisionDTO> toDtoListFromDomainList(List<RevisorRevisionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ComentarioRevisorDomain;
import co.edu.uco.publiuco.dto.ComentarioRevisorDTO;
import co.edu.uco.publiuco.entities.ComentarioRevisorEntity;

public final class ComentarioRevisorAssembler implements Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> {
	
	private static final Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> INSTANCE = new ComentarioRevisorAssembler();

	private ComentarioRevisorAssembler() {
		super();
	}
	
	public static final Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public ComentarioRevisorDTO toDtoFromDomain(ComentarioRevisorDomain domain) {
		return ComentarioRevisorDTO.create().setIdentificador(domain.getIdentificador()).setRevisorRevision(RevisorRevisionAssembler.getinstance().toDtoFromDomain(domain.getRevisorRevision())).setTipoComentarioRevisor(TipoComentarioRevisorAssembler.getinstance().toDtoFromDomain(domain.getTipoComentarioRevisor())).setComentario(domain.getComentario()) ;
	}

	@Override
	public ComentarioRevisorDomain toDomainFromDto(ComentarioRevisorDTO dto) {
		return new ComentarioRevisorDomain(dto.getIdentificador(), RevisorRevisionAssembler.getinstance().toDomainFromDto(dto.getRevisorRevision()), TipoComentarioRevisorAssembler.getinstance().toDomainFromDto(dto.getTipoComentarioRevisor()), dto.getComentario());
	}

	@Override
	public ComentarioRevisorEntity toEntityFromDomain(ComentarioRevisorDomain domain) {
		return new ComentarioRevisorEntity(domain.getIdentificador(), RevisorRevisionAssembler.getinstance().toEntityFromDomain(domain.getRevisorRevision()), TipoComentarioRevisorAssembler.getinstance().toEntityFromDomain(domain.getTipoComentarioRevisor()), domain.getComentario());
	}

	@Override
	public ComentarioRevisorDomain toDomainFromEntity(ComentarioRevisorEntity entity) {
		return new ComentarioRevisorDomain(entity.getIdentificador(), RevisorRevisionAssembler.getinstance().toDomainFromEntity(entity.getRevisorRevision()), TipoComentarioRevisorAssembler.getinstance().toDomainFromEntity(entity.getTipoComentarioRevisor()), entity.getComentario());

	}

	@Override
	public List<ComentarioRevisorDomain> toDomainListFromEntityList(List<ComentarioRevisorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

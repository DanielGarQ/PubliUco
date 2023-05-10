package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoComentarioRevisorDomain;
import co.edu.uco.publiuco.dto.TipoComentarioRevisorDTO;
import co.edu.uco.publiuco.entities.TipoComentarioRevisorEntity;

public final class TipoComentarioRevisorAssembler implements Assembler<TipoComentarioRevisorDomain, TipoComentarioRevisorDTO, TipoComentarioRevisorEntity> {
	
	private static final Assembler<TipoComentarioRevisorDomain, TipoComentarioRevisorDTO, TipoComentarioRevisorEntity> INSTANCE = new TipoComentarioRevisorAssembler();

	private TipoComentarioRevisorAssembler() {
		super();
	}
	
	public static final Assembler<TipoComentarioRevisorDomain, TipoComentarioRevisorDTO, TipoComentarioRevisorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoComentarioRevisorDTO toDtoFromDomain(TipoComentarioRevisorDomain domain) {
		return TipoComentarioRevisorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorDomain toDomainFromDto(TipoComentarioRevisorDTO dto) {
		return new TipoComentarioRevisorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorEntity toEntityFromDomain(TipoComentarioRevisorDomain domain) {
		return new TipoComentarioRevisorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorDomain toDomainFromEntity(TipoComentarioRevisorEntity entity) {
		return new TipoComentarioRevisorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<TipoComentarioRevisorDomain> toDomainListFromEntityList(final List<TipoComentarioRevisorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

}

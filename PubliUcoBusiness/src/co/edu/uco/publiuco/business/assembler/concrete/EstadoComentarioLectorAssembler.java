package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoComentarioLectorDomain;
import co.edu.uco.publiuco.dto.EstadoComentarioLectorDTO;
import co.edu.uco.publiuco.entities.EstadoComentarioLectorEntity;

public final class EstadoComentarioLectorAssembler implements Assembler<EstadoComentarioLectorDomain, EstadoComentarioLectorDTO, EstadoComentarioLectorEntity>{
	
	private static final Assembler<EstadoComentarioLectorDomain, EstadoComentarioLectorDTO, EstadoComentarioLectorEntity> INSTANCE = new EstadoComentarioLectorAssembler();

	private EstadoComentarioLectorAssembler() {
		super();
	}
	
	public static final Assembler<EstadoComentarioLectorDomain, EstadoComentarioLectorDTO, EstadoComentarioLectorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoComentarioLectorDTO toDtoFromDomain(EstadoComentarioLectorDomain domain) {
		return EstadoComentarioLectorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromDto(EstadoComentarioLectorDTO dto) {
		return new EstadoComentarioLectorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorEntity toEntityFromDomain(EstadoComentarioLectorDomain domain) {
		return new EstadoComentarioLectorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromEntity(EstadoComentarioLectorEntity entity) {
		return new EstadoComentarioLectorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoComentarioLectorDomain> toDomainListFromEntityList(final List<EstadoComentarioLectorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

}
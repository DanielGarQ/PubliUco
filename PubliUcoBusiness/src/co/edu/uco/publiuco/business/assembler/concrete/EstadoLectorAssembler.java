package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoLectorDomain;
import co.edu.uco.publiuco.dto.EstadoLectorDTO;
import co.edu.uco.publiuco.entities.EstadoLectorEntity;

public class EstadoLectorAssembler implements Assembler<EstadoLectorDomain, EstadoLectorDTO, EstadoLectorEntity> {
	
	private static final Assembler<EstadoLectorDomain, EstadoLectorDTO, EstadoLectorEntity> INSTANCE = new EstadoLectorAssembler();

	private EstadoLectorAssembler() {
		super();
	}
	
	public static final Assembler<EstadoLectorDomain, EstadoLectorDTO, EstadoLectorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoLectorDTO toDtoFromDomain(EstadoLectorDomain domain) {
		return EstadoLectorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoLectorDomain toDomainFromDto(EstadoLectorDTO dto) {
		return new EstadoLectorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoLectorEntity toEntityFromDomain(EstadoLectorDomain domain) {
		return new EstadoLectorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoLectorDomain toDomainFromEntity(EstadoLectorEntity entity) {
		return new EstadoLectorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoLectorDomain> toDomainListFromEntityList(final List<EstadoLectorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

}

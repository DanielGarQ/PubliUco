package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoTipoAccesoDomain;
import co.edu.uco.publiuco.dto.EstadoTipoAccesoDTO;
import co.edu.uco.publiuco.entities.EstadoTipoAccesoEntity;

public final class EstadoTipoAccesoAssembler implements Assembler<EstadoTipoAccesoDomain, EstadoTipoAccesoDTO, EstadoTipoAccesoEntity>{
	
	private static final Assembler<EstadoTipoAccesoDomain, EstadoTipoAccesoDTO, EstadoTipoAccesoEntity> INSTANCE = new EstadoTipoAccesoAssembler();

	private EstadoTipoAccesoAssembler() {
		super();
	}
	
	public static final Assembler<EstadoTipoAccesoDomain, EstadoTipoAccesoDTO, EstadoTipoAccesoEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoTipoAccesoDTO toDtoFromDomain(EstadoTipoAccesoDomain domain) {
		return EstadoTipoAccesoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoDomain toDomainFromDto(EstadoTipoAccesoDTO dto) {
		return new EstadoTipoAccesoDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoEntity toEntityFromDomain(EstadoTipoAccesoDomain domain) {
		return new EstadoTipoAccesoEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoDomain toDomainFromEntity(EstadoTipoAccesoEntity entity) {
		return new EstadoTipoAccesoDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoTipoAccesoDomain> toDomainListFromEntityList(final List<EstadoTipoAccesoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<EstadoTipoAccesoDTO> toDtoListFromDomainList(List<EstadoTipoAccesoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

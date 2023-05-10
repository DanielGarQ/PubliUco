package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoTipoIdentificacionDomain;
import co.edu.uco.publiuco.dto.EstadoTipoIdentificacionDTO;
import co.edu.uco.publiuco.entities.EstadoTipoIdentificacionEntity;

public final class EstadoTipoIdentificacionAssembler implements Assembler<EstadoTipoIdentificacionDomain, EstadoTipoIdentificacionDTO, EstadoTipoIdentificacionEntity> {
	
	private static final Assembler<EstadoTipoIdentificacionDomain, EstadoTipoIdentificacionDTO, EstadoTipoIdentificacionEntity> INSTANCE = new EstadoTipoIdentificacionAssembler();

	private EstadoTipoIdentificacionAssembler() {
		super();
	}
	
	public static final Assembler<EstadoTipoIdentificacionDomain, EstadoTipoIdentificacionDTO, EstadoTipoIdentificacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoTipoIdentificacionDTO toDtoFromDomain(EstadoTipoIdentificacionDomain domain) {
		return EstadoTipoIdentificacionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionDomain toDomainFromDto(EstadoTipoIdentificacionDTO dto) {
		return new EstadoTipoIdentificacionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionEntity toEntityFromDomain(EstadoTipoIdentificacionDomain domain) {
		return new EstadoTipoIdentificacionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionDomain toDomainFromEntity(EstadoTipoIdentificacionEntity entity) {
		return new EstadoTipoIdentificacionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoTipoIdentificacionDomain> toDomainListFromEntityList(final List<EstadoTipoIdentificacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}

}

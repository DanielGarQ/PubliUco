package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoPreferenciaDomain;
import co.edu.uco.publiuco.dto.EstadoPreferenciaDTO;
import co.edu.uco.publiuco.entities.EstadoPreferenciaEntity;

public final class EstadoPreferenciaAssembler implements Assembler<EstadoPreferenciaDomain, EstadoPreferenciaDTO, EstadoPreferenciaEntity>{
	
	private static final Assembler<EstadoPreferenciaDomain, EstadoPreferenciaDTO, EstadoPreferenciaEntity> INSTANCE = new EstadoPreferenciaAssembler();

	private EstadoPreferenciaAssembler() {
		super();
	}
	
	public static final Assembler<EstadoPreferenciaDomain, EstadoPreferenciaDTO, EstadoPreferenciaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoPreferenciaDTO toDtoFromDomain(EstadoPreferenciaDomain domain) {
		return EstadoPreferenciaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoPreferenciaDomain toDomainFromDto(EstadoPreferenciaDTO dto) {
		return new EstadoPreferenciaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoPreferenciaEntity toEntityFromDomain(EstadoPreferenciaDomain domain) {
		return new EstadoPreferenciaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoPreferenciaDomain toDomainFromEntity(EstadoPreferenciaEntity entity) {
		return new EstadoPreferenciaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoPreferenciaDomain> toDomainListFromEntityList(final List<EstadoPreferenciaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<EstadoPreferenciaDTO> toDtoListFromDomainList(List<EstadoPreferenciaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}

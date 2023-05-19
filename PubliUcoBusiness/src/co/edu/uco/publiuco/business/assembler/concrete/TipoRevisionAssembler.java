package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoRevisionDomain;
import co.edu.uco.publiuco.dto.TipoRevisionDTO;
import co.edu.uco.publiuco.entities.TipoRevisionEntity;

public final class TipoRevisionAssembler implements Assembler<TipoRevisionDomain, TipoRevisionDTO, TipoRevisionEntity> {
	
	private static final Assembler<TipoRevisionDomain, TipoRevisionDTO, TipoRevisionEntity> INSTANCE = new TipoRevisionAssembler();

	private TipoRevisionAssembler() {
		super();
	}
	
	public static final Assembler<TipoRevisionDomain, TipoRevisionDTO, TipoRevisionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoRevisionDTO toDtoFromDomain(TipoRevisionDomain domain) {
		return TipoRevisionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public TipoRevisionDomain toDomainFromDto(TipoRevisionDTO dto) {
		return new TipoRevisionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public TipoRevisionEntity toEntityFromDomain(TipoRevisionDomain domain) {
		return new TipoRevisionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public TipoRevisionDomain toDomainFromEntity(TipoRevisionEntity entity) {
		return new TipoRevisionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<TipoRevisionDomain> toDomainListFromEntityList(final List<TipoRevisionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<TipoRevisionDTO> toDtoListFromDomainList(List<TipoRevisionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

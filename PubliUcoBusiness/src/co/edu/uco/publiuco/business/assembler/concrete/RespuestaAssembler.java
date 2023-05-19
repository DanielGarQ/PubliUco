package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RespuestaDomain;
import co.edu.uco.publiuco.dto.RespuestaDTO;
import co.edu.uco.publiuco.entities.RespuestaEntity;

public final class RespuestaAssembler implements Assembler<RespuestaDomain, RespuestaDTO, RespuestaEntity>{
	
	private static final Assembler<RespuestaDomain, RespuestaDTO, RespuestaEntity> INSTANCE = new RespuestaAssembler();

	private RespuestaAssembler() {
		super();
	}
	
	public static final Assembler<RespuestaDomain, RespuestaDTO, RespuestaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public RespuestaDTO toDtoFromDomain(RespuestaDomain domain) {
		return RespuestaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public RespuestaDomain toDomainFromDto(RespuestaDTO dto) {
		return new RespuestaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public RespuestaEntity toEntityFromDomain(RespuestaDomain domain) {
		return new RespuestaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public RespuestaDomain toDomainFromEntity(RespuestaEntity entity) {
		return new RespuestaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<RespuestaDomain> toDomainListFromEntityList(final List<RespuestaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<RespuestaDTO> toDtoListFromDomainList(List<RespuestaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

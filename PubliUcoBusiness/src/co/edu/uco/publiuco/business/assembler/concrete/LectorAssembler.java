package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.LectorDomain;
import co.edu.uco.publiuco.dto.LectorDTO;
import co.edu.uco.publiuco.entities.LectorEntity;

public final class LectorAssembler implements Assembler<LectorDomain, LectorDTO, LectorEntity>{
	
	private static final Assembler<LectorDomain, LectorDTO, LectorEntity> INSTANCE = new LectorAssembler();

	private LectorAssembler() {
		super();
	}
	
	public static final Assembler<LectorDomain, LectorDTO, LectorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public LectorDTO toDtoFromDomain(LectorDomain domain) {
		return LectorDTO.create().setEstado(EstadoLectorAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public LectorDomain toDomainFromDto(LectorDTO dto) {
		return new LectorDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoLectorAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public LectorEntity toEntityFromDomain(LectorDomain domain) {
		return new LectorEntity(null, null, null, null, null, null, null, null, null, null, false, false, EstadoLectorAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public LectorDomain toDomainFromEntity(LectorEntity entity) {
		return new LectorDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoLectorAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<LectorDomain> toDomainListFromEntityList(List<LectorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<LectorDTO> toDtoListFromDomainList(List<LectorDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

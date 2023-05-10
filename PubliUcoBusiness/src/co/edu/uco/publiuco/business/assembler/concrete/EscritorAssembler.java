package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EscritorDomain;
import co.edu.uco.publiuco.dto.EscritorDTO;
import co.edu.uco.publiuco.entities.EscritorEntity;

public final class EscritorAssembler implements Assembler<EscritorDomain, EscritorDTO, EscritorEntity> {
	
	private static final Assembler<EscritorDomain, EscritorDTO, EscritorEntity> INSTANCE = new EscritorAssembler();

	private EscritorAssembler() {
		super();
	}
	
	public static final Assembler<EscritorDomain, EscritorDTO, EscritorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EscritorDTO toDtoFromDomain(EscritorDomain domain) {
		return EscritorDTO.create().setEstado(EstadoEscritorAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public EscritorDomain toDomainFromDto(EscritorDTO dto) {
		return new EscritorDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoEscritorAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public EscritorEntity toEntityFromDomain(EscritorDomain domain) {
		return new EscritorEntity(null, null, null, null, null, null, null, null, null, null, false, false, EstadoEscritorAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public EscritorDomain toDomainFromEntity(EscritorEntity entity) {
		return new EscritorDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoEscritorAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<EscritorDomain> toDomainListFromEntityList(List<EscritorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

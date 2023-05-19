package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EscritorPublicacionDomain;
import co.edu.uco.publiuco.dto.EscritorPublicacionDTO;
import co.edu.uco.publiuco.entities.EscritorPublicacionEntity;

public final class EscritorPublicacionAssembler implements Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity>{
	
	private static final Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity> INSTANCE = new EscritorPublicacionAssembler();

	private EscritorPublicacionAssembler() {
		super();
	}
	
	public static final Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EscritorPublicacionDTO toDtoFromDomain(EscritorPublicacionDomain domain) {
		return EscritorPublicacionDTO.create().setPublicacion(PublicacionAssembler.getinstance().toDtoFromDomain(domain.getPublicacion())).setEscritor(EscritorAssembler.getinstance().toDtoFromDomain(domain.getEscritor())).setTipoEscritor(TipoEscritorAssembler.getinstance().toDtoFromDomain(domain.getTipoEscritor())) ;
	}

	@Override
	public EscritorPublicacionDomain toDomainFromDto(EscritorPublicacionDTO dto) {
		return new EscritorPublicacionDomain(dto.getIdentificador(), PublicacionAssembler.getinstance().toDomainFromDto(dto.getPublicacion()), EscritorAssembler.getinstance().toDomainFromDto(dto.getEscritor()), TipoEscritorAssembler.getinstance().toDomainFromDto(dto.getTipoEscritor()));
	}

	@Override
	public EscritorPublicacionEntity toEntityFromDomain(EscritorPublicacionDomain domain) {
		return new EscritorPublicacionEntity(domain.getIdentificador(), PublicacionAssembler.getinstance().toEntityFromDomain(domain.getPublicacion()), EscritorAssembler.getinstance().toEntityFromDomain(domain.getEscritor()), TipoEscritorAssembler.getinstance().toEntityFromDomain(domain.getTipoEscritor()));
	}

	@Override
	public EscritorPublicacionDomain toDomainFromEntity(EscritorPublicacionEntity entity) {
		return new EscritorPublicacionDomain(entity.getIdentificador(), PublicacionAssembler.getinstance().toDomainFromEntity(entity.getPublicacion()), EscritorAssembler.getinstance().toDomainFromEntity(entity.getEscritor()), TipoEscritorAssembler.getinstance().toDomainFromEntity(entity.getTipoEscritor()));

	}

	@Override
	public List<EscritorPublicacionDomain> toDomainListFromEntityList(List<EscritorPublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<EscritorPublicacionDTO> toDtoListFromDomainList(List<EscritorPublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}

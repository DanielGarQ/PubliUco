package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PalabraClavePublicacionDomain;
import co.edu.uco.publiuco.dto.PalabraClavePublicacionDTO;
import co.edu.uco.publiuco.entities.PalabraClavePublicacionEntity;

public final class PalabraClavePublicacionAssembler implements Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> {
	
	private static final Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> INSTANCE = new PalabraClavePublicacionAssembler();

	private PalabraClavePublicacionAssembler() {
		super();
	}
	
	public static final Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PalabraClavePublicacionDTO toDtoFromDomain(PalabraClavePublicacionDomain domain) {
		return PalabraClavePublicacionDTO.create().setIdentificador(domain.getIdentificador()).setPublicacion(PublicacionAssembler.getinstance().toDtoFromDomain(domain.getPublicacion())).setPalabraClave(domain.getPalabraClave()) ;
	}

	@Override
	public PalabraClavePublicacionDomain toDomainFromDto(PalabraClavePublicacionDTO dto) {
		return new PalabraClavePublicacionDomain(dto.getIdentificador(),PublicacionAssembler.getinstance().toDomainFromDto(dto.getPublicacion()), dto.getPalabraClave());
	}

	@Override
	public PalabraClavePublicacionEntity toEntityFromDomain(PalabraClavePublicacionDomain domain) {
		return new PalabraClavePublicacionEntity(domain.getIdentificador(), PublicacionAssembler.getinstance().toEntityFromDomain(domain.getPublicacion()), domain.getPalabraClave());
	}

	@Override
	public PalabraClavePublicacionDomain toDomainFromEntity(PalabraClavePublicacionEntity entity) {
		return new PalabraClavePublicacionDomain(entity.getIdentificador(), PublicacionAssembler.getinstance().toDomainFromEntity(entity.getPublicacion()), entity.getPalabraClave());

	}

	@Override
	public List<PalabraClavePublicacionDomain> toDomainListFromEntityList(List<PalabraClavePublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<PalabraClavePublicacionDTO> toDtoListFromDomainList(List<PalabraClavePublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

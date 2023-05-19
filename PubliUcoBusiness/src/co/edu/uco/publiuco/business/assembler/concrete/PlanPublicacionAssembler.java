package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PlanPublicacionDomain;
import co.edu.uco.publiuco.dto.PlanPublicacionDTO;
import co.edu.uco.publiuco.entities.PlanPublicacionEntity;

public final class PlanPublicacionAssembler implements Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> {
	
	private static final Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> INSTANCE = new PlanPublicacionAssembler();

	private PlanPublicacionAssembler() {
		super();
	}
	
	public static final Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PlanPublicacionDTO toDtoFromDomain(PlanPublicacionDomain domain) {
		return PlanPublicacionDTO.create().setIdentificador(domain.getIdentificador()).setPublicacion(PublicacionAssembler.getinstance().toDtoFromDomain(domain.getPublicacion())).setPrecio(domain.getPrecio()).setFechaDesde(domain.getFechaDesde()).setFechaHasta(domain.getFechaHasta()).setEstado(EstadoPlanAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public PlanPublicacionDomain toDomainFromDto(PlanPublicacionDTO dto) {
		return new PlanPublicacionDomain(dto.getIdentificador(), PublicacionAssembler.getinstance().toDomainFromDto(dto.getPublicacion()), dto.getPrecio(), dto.getFechaDesde(), dto.getFechaHasta(), EstadoPlanAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public PlanPublicacionEntity toEntityFromDomain(PlanPublicacionDomain domain) {
		return new PlanPublicacionEntity(domain.getIdentificador(), PublicacionAssembler.getinstance().toEntityFromDomain(domain.getPublicacion()), domain.getPrecio(), domain.getFechaDesde(), domain.getFechaHasta(),EstadoPlanAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public PlanPublicacionDomain toDomainFromEntity(PlanPublicacionEntity entity) {
		return new PlanPublicacionDomain(entity.getIdentificador(),PublicacionAssembler.getinstance().toDomainFromEntity(entity.getPublicacion()), entity.getPrecio(), entity.getFechaDesde(), entity.getFechaHasta(), EstadoPlanAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<PlanPublicacionDomain> toDomainListFromEntityList(List<PlanPublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<PlanPublicacionDTO> toDtoListFromDomainList(List<PlanPublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

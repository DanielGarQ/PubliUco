package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ObservacionRevisionDomain;
import co.edu.uco.publiuco.dto.ObservacionRevisionDTO;
import co.edu.uco.publiuco.entities.ObservacionRevisionEntity;

public final class ObservacionRevisionAssembler implements Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> {
	
	private static final Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> INSTANCE = new ObservacionRevisionAssembler();

	private ObservacionRevisionAssembler() {
		super();
	}
	
	public static final Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public ObservacionRevisionDTO toDtoFromDomain(ObservacionRevisionDomain domain) {
		return ObservacionRevisionDTO.create().setIdentificador(domain.getIdentificador()).setEscritorPublicacion(EscritorPublicacionAssembler.getinstance().toDtoFromDomain(domain.getEscritorPublicacion())).setComentarioRevisor(ComentarioRevisorAssembler.getinstance().toDtoFromDomain(domain.getComentarioRevisor())).setFechaReporte(domain.getFechaReporte()).setFechaRevision(domain.getFechaRevision()).setEstado(EstadoObservacionRevisorAssembler.getinstance().toDtoFromDomain(domain.getEstado())).setObservacion(domain.getObservacion()) ;
	}

	@Override
	public ObservacionRevisionDomain toDomainFromDto(ObservacionRevisionDTO dto) {
		return new ObservacionRevisionDomain(dto.getIdentificador(), EscritorPublicacionAssembler.getinstance().toDomainFromDto(dto.getEscritorPublicacion()), ComentarioRevisorAssembler.getinstance().toDomainFromDto(dto.getComentarioRevisor()), dto.getFechaReporte(), dto.getFechaRevision(), EstadoObservacionRevisorAssembler.getinstance().toDomainFromDto(dto.getEstado()), dto.getObservacion());
	}

	@Override
	public ObservacionRevisionEntity toEntityFromDomain(ObservacionRevisionDomain domain) {
		return new ObservacionRevisionEntity(domain.getIdentificador(), EscritorPublicacionAssembler.getinstance().toEntityFromDomain(domain.getEscritorPublicacion()), ComentarioRevisorAssembler.getinstance().toEntityFromDomain(domain.getComentarioRevisor()), domain.getFechaReporte(), domain.getFechaRevision(), EstadoObservacionRevisorAssembler.getinstance().toEntityFromDomain(domain.getEstado()), domain.getObservacion());
	}

	@Override
	public ObservacionRevisionDomain toDomainFromEntity(ObservacionRevisionEntity entity) {
		return new ObservacionRevisionDomain(entity.getIdentificador(), EscritorPublicacionAssembler.getinstance().toDomainFromEntity(entity.getEscritorPublicacion()), ComentarioRevisorAssembler.getinstance().toDomainFromEntity(entity.getComentarioRevisor()), entity.getFechaReporte(), entity.getFechaRevision(), EstadoObservacionRevisorAssembler.getinstance().toDomainFromEntity(entity.getEstado()), entity.getObservacion());

	}

	@Override
	public List<ObservacionRevisionDomain> toDomainListFromEntityList(List<ObservacionRevisionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<ObservacionRevisionDTO> toDtoListFromDomainList(List<ObservacionRevisionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

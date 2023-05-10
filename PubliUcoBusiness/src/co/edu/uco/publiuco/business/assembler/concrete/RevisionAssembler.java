package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RevisionDomain;
import co.edu.uco.publiuco.dto.RevisionDTO;
import co.edu.uco.publiuco.entities.RevisionEntity;

public final class RevisionAssembler implements Assembler<RevisionDomain, RevisionDTO, RevisionEntity> {
	
	private static final Assembler<RevisionDomain, RevisionDTO, RevisionEntity> INSTANCE = new RevisionAssembler();

	private RevisionAssembler() {
		super();
	}
	
	public static final Assembler<RevisionDomain, RevisionDTO, RevisionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public RevisionDTO toDtoFromDomain(RevisionDomain domain) {
		return RevisionDTO.create().setIdentificador(domain.getIdentificador()).setVersion(VersionAssembler.getinstance().toDtoFromDomain(domain.getVersion())).setTipoRevision(TipoRevisionAssembler.getinstance().toDtoFromDomain(domain.getTipoRevision())).setFechaSolicitud(domain.getFechaSolicitud()).setFechaLimite(domain.getFechaLimite()).setFechaCompletitud(domain.getFechaCompletitud()).setEstado(EstadoRevisionAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public RevisionDomain toDomainFromDto(RevisionDTO dto) {
		return new RevisionDomain(dto.getIdentificador(), VersionAssembler.getinstance().toDomainFromDto(dto.getVersion()), TipoRevisionAssembler.getinstance().toDomainFromDto(dto.getTipoRevision()), dto.getFechaSolicitud(), dto.getFechaLimite(), dto.getFechaCompletitud(), EstadoRevisionAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public RevisionEntity toEntityFromDomain(RevisionDomain domain) {
		return new RevisionEntity(domain.getIdentificador(), VersionAssembler.getinstance().toEntityFromDomain(domain.getVersion()), TipoRevisionAssembler.getinstance().toEntityFromDomain(domain.getTipoRevision()), domain.getFechaSolicitud(), domain.getFechaLimite(), domain.getFechaCompletitud(), EstadoRevisionAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public RevisionDomain toDomainFromEntity(RevisionEntity entity) {
		return new RevisionDomain(entity.getIdentificador(), VersionAssembler.getinstance().toDomainFromEntity(entity.getVersion()), TipoRevisionAssembler.getinstance().toDomainFromEntity(entity.getTipoRevision()), entity.getFechaSolicitud(), entity.getFechaLimite(), entity.getFechaCompletitud(), EstadoRevisionAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<RevisionDomain> toDomainListFromEntityList(List<RevisionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

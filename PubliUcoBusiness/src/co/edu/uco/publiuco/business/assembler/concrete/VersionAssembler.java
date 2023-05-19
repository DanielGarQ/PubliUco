package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.VersionDomain;
import co.edu.uco.publiuco.dto.VersionDTO;
import co.edu.uco.publiuco.entities.VersionEntity;

public final class VersionAssembler implements Assembler<VersionDomain, VersionDTO, VersionEntity> {
	
	private static final Assembler<VersionDomain, VersionDTO, VersionEntity> INSTANCE = new VersionAssembler();

	private VersionAssembler() {
		super();
	}
	
	public static final Assembler<VersionDomain, VersionDTO, VersionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public VersionDTO toDtoFromDomain(VersionDomain domain) {
		return VersionDTO.create().setIdentificador(domain.getIdentificador()).setPublicacion(PublicacionAssembler.getinstance().toDtoFromDomain(domain.getPublicacion())).setVersionAnterior(VersionAssembler.getinstance().toDtoFromDomain(domain.getVersionAnterior())).setNumeroVersion(domain.getNumeroVersion()).setFechaCreacion(domain.getFechaCreacion()).setFechaUltimaModificacion(domain.getFechaUltimaModificacion()).setTitulo(domain.getTitulo()).setResumen(domain.getResumen()).setCuerpo(domain.getCuerpo()).setEstado(EstadoVersionAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public VersionDomain toDomainFromDto(VersionDTO dto) {
		return new VersionDomain(dto.getIdentificador(), PublicacionAssembler.getinstance().toDomainFromDto(dto.getPublicacion()), VersionAssembler.getinstance().toDomainFromDto(dto.getVersionAnterior()), dto.getNumeroVersion(), dto.getFechaCreacion(), dto.getFechaUltimaModificacion(), dto.getTitulo(), dto.getResumen(), dto.getCuerpo(), EstadoVersionAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public VersionEntity toEntityFromDomain(VersionDomain domain) {
		return new VersionEntity(domain.getIdentificador(),PublicacionAssembler.getinstance().toEntityFromDomain(domain.getPublicacion()), VersionAssembler.getinstance().toEntityFromDomain(domain.getVersionAnterior()), domain.getNumeroVersion(), domain.getFechaCreacion(), domain.getFechaUltimaModificacion(), domain.getTitulo(), domain.getResumen(), domain.getCuerpo(), EstadoVersionAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public VersionDomain toDomainFromEntity(VersionEntity entity) {
		return new VersionDomain(entity.getIdentificador(),PublicacionAssembler.getinstance().toDomainFromEntity(entity.getPublicacion()), VersionAssembler.getinstance().toDomainFromEntity(entity.getVersionAnterior()), entity.getNumeroVersion(), entity.getFechaCreacion(), entity.getFechaUltimaModificacion(), entity.getTitulo(), entity.getResumen(), entity.getCuerpo(), EstadoVersionAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<VersionDomain> toDomainListFromEntityList(List<VersionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<VersionDTO> toDtoListFromDomainList(List<VersionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

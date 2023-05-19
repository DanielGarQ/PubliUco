package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PublicacionDomain;
import co.edu.uco.publiuco.dto.PublicacionDTO;
import co.edu.uco.publiuco.entities.PublicacionEntity;

public final class PublicacionAssembler implements Assembler<PublicacionDomain, PublicacionDTO, PublicacionEntity> {
	
	private static final Assembler<PublicacionDomain, PublicacionDTO, PublicacionEntity> INSTANCE = new PublicacionAssembler();

	private PublicacionAssembler() {
		super();
	}
	
	public static final Assembler<PublicacionDomain, PublicacionDTO, PublicacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PublicacionDTO toDtoFromDomain(PublicacionDomain domain) {
		return PublicacionDTO.create().setIdentificador(domain.getIdentificador()).setCategoria(CategoriaAssembler.getinstance().toDtoFromDomain(domain.getCategoria())).setTipoAcceso(TipoAccesoAssembler.getinstance().toDtoFromDomain(domain.getTipoAcceso())).setFechapublicacion(domain.getFechapublicacion()).setUltimaVersion(VersionAssembler.getinstance().toDtoFromDomain(domain.getUltimaVersion())).setEstado(EstadoPublicacionAssembler.getinstance().toDtoFromDomain(domain.getEstado()));
	}

	@Override
	public PublicacionDomain toDomainFromDto(PublicacionDTO dto) {
		return new PublicacionDomain(dto.getIdentificador(),CategoriaAssembler.getinstance().toDomainFromDto(dto.getCategoria()),TipoAccesoAssembler.getinstance().toDomainFromDto(dto.getTipoAcceso()), dto.getFechapublicacion(), VersionAssembler.getinstance().toDomainFromDto(dto.getUltimaVersion()), EstadoPublicacionAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public PublicacionEntity toEntityFromDomain(PublicacionDomain domain) {
		return new PublicacionEntity(domain.getIdentificador(),CategoriaAssembler.getinstance().toEntityFromDomain(domain.getCategoria()), TipoAccesoAssembler.getinstance().toEntityFromDomain(domain.getTipoAcceso()), domain.getFechapublicacion(), VersionAssembler.getinstance().toEntityFromDomain(domain.getUltimaVersion()), EstadoPublicacionAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public PublicacionDomain toDomainFromEntity(PublicacionEntity entity) {
		return new PublicacionDomain(entity.getIdentificador(),CategoriaAssembler.getinstance().toDomainFromEntity(entity.getCategoria()), TipoAccesoAssembler.getinstance().toDomainFromEntity(entity.getTipoAcceso()), entity.getFechapublicacion(), VersionAssembler.getinstance().toDomainFromEntity(entity.getUltimaVersion()), EstadoPublicacionAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<PublicacionDomain> toDomainListFromEntityList(List<PublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<PublicacionDTO> toDtoListFromDomainList(List<PublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

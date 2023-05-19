package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoAccesoDomain;
import co.edu.uco.publiuco.dto.TipoAccesoDTO;
import co.edu.uco.publiuco.entities.TipoAccesoEntity;

public final class TipoAccesoAssembler implements Assembler<TipoAccesoDomain, TipoAccesoDTO, TipoAccesoEntity>{
	
	private static final Assembler<TipoAccesoDomain, TipoAccesoDTO, TipoAccesoEntity> INSTANCE = new TipoAccesoAssembler();

	private TipoAccesoAssembler() {
		super();
	}
	
	public static final Assembler<TipoAccesoDomain, TipoAccesoDTO, TipoAccesoEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoAccesoDTO toDtoFromDomain(TipoAccesoDomain domain) {
		return TipoAccesoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoAccesoAssembler.getinstance().toDtoFromDomain(domain.getEstado()));
	}

	@Override
	public TipoAccesoDomain toDomainFromDto(TipoAccesoDTO dto) {
		return new TipoAccesoDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(), EstadoTipoAccesoAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoAccesoEntity toEntityFromDomain(TipoAccesoDomain domain) {
		return new TipoAccesoEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(), EstadoTipoAccesoAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoAccesoDomain toDomainFromEntity(TipoAccesoEntity entity) {
		return new TipoAccesoDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),EstadoTipoAccesoAssembler.getinstance().toDomainFromEntity(entity.getEstado())) ;
	}
	
	public final List<TipoAccesoDomain> toDomainListFromEntityList(final List<TipoAccesoEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<TipoAccesoDTO> toDtoListFromDomainList(List<TipoAccesoDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

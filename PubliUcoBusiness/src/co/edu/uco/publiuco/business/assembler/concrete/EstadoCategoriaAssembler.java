package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoCategoriaDomain;
import co.edu.uco.publiuco.dto.EstadoCategoriaDTO;
import co.edu.uco.publiuco.entities.EstadoCategoriaEntity;

public class EstadoCategoriaAssembler implements Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity>{
	
	private static final Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> INSTANCE = new EstadoCategoriaAssembler();

	private EstadoCategoriaAssembler() {
		super();
	}
	
	public static final Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoCategoriaDTO toDtoFromDomain(EstadoCategoriaDomain domain) {
		return EstadoCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromDto(EstadoCategoriaDTO dto) {
		return new EstadoCategoriaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoCategoriaEntity toEntityFromDomain(EstadoCategoriaDomain domain) {
		return new EstadoCategoriaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromEntity(EstadoCategoriaEntity entity) {
		return new EstadoCategoriaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoCategoriaDomain> toDomainListFromEntityList(final List<EstadoCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<EstadoCategoriaDTO> toDtoListFromDomainList(List<EstadoCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}

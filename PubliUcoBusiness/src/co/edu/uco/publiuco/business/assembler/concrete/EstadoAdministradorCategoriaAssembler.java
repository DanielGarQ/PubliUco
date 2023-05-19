package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoAdministradorCategoriaDomain;
import co.edu.uco.publiuco.dto.EstadoAdministradorCategoriaDTO;
import co.edu.uco.publiuco.entities.EstadoAdministradorCategoriaEntity;

public final class EstadoAdministradorCategoriaAssembler implements Assembler<EstadoAdministradorCategoriaDomain, EstadoAdministradorCategoriaDTO, EstadoAdministradorCategoriaEntity>{

	private static final Assembler<EstadoAdministradorCategoriaDomain, EstadoAdministradorCategoriaDTO, EstadoAdministradorCategoriaEntity> INSTANCE = new EstadoAdministradorCategoriaAssembler();

	private EstadoAdministradorCategoriaAssembler() {
		super();
	}
	
	public static final Assembler<EstadoAdministradorCategoriaDomain, EstadoAdministradorCategoriaDTO, EstadoAdministradorCategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoAdministradorCategoriaDTO toDtoFromDomain(EstadoAdministradorCategoriaDomain domain) {
		return EstadoAdministradorCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoAdministradorCategoriaDomain toDomainFromDto(EstadoAdministradorCategoriaDTO dto) {
		return new EstadoAdministradorCategoriaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoAdministradorCategoriaEntity toEntityFromDomain(EstadoAdministradorCategoriaDomain domain) {
		return new EstadoAdministradorCategoriaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoAdministradorCategoriaDomain toDomainFromEntity(EstadoAdministradorCategoriaEntity entity) {
		return new EstadoAdministradorCategoriaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}
	
	public final List<EstadoAdministradorCategoriaDomain> toDomainListFromEntityList(final List<EstadoAdministradorCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
		
	}
	
	@Override
	public List<EstadoAdministradorCategoriaDTO> toDtoListFromDomainList(List<EstadoAdministradorCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}

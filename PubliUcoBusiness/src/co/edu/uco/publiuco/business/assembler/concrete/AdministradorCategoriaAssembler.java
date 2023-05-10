package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.AdministradorCategoriaDomain;
import co.edu.uco.publiuco.dto.AdministradorCategoriaDTO;
import co.edu.uco.publiuco.entities.AdministradorCategoriaEntity;

public final class AdministradorCategoriaAssembler implements Assembler<AdministradorCategoriaDomain, AdministradorCategoriaDTO, AdministradorCategoriaEntity> {
	
	private static final Assembler<AdministradorCategoriaDomain, AdministradorCategoriaDTO, AdministradorCategoriaEntity> INSTANCE = new AdministradorCategoriaAssembler();

	private AdministradorCategoriaAssembler() {
		super();
	}
	
	public static final Assembler<AdministradorCategoriaDomain, AdministradorCategoriaDTO, AdministradorCategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public AdministradorCategoriaDTO toDtoFromDomain(AdministradorCategoriaDomain domain) {
		return AdministradorCategoriaDTO.create().setEstado(EstadoAdministradorCategoriaAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public AdministradorCategoriaDomain toDomainFromDto(AdministradorCategoriaDTO dto) {
		return new AdministradorCategoriaDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoAdministradorCategoriaAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public AdministradorCategoriaEntity toEntityFromDomain(AdministradorCategoriaDomain domain) {
		return new AdministradorCategoriaEntity(null, null, null, null, null, null, null, null, null, null, false, false, EstadoAdministradorCategoriaAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public AdministradorCategoriaDomain toDomainFromEntity(AdministradorCategoriaEntity entity) {
		return new AdministradorCategoriaDomain(null, null, null, null, null, null, null, null, null, null, false, false, EstadoAdministradorCategoriaAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<AdministradorCategoriaDomain> toDomainListFromEntityList(List<AdministradorCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

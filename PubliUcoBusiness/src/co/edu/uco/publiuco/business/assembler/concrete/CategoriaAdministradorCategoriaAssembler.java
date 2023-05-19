package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.CategoriaAdministradorCategoriaDomain;
import co.edu.uco.publiuco.dto.CategoriaAdministradorCategoriaDTO;
import co.edu.uco.publiuco.entities.CategoriaAdministradorCategoriaEntity;

public final class CategoriaAdministradorCategoriaAssembler implements Assembler<CategoriaAdministradorCategoriaDomain, CategoriaAdministradorCategoriaDTO, CategoriaAdministradorCategoriaEntity> {
	
	private static final Assembler<CategoriaAdministradorCategoriaDomain, CategoriaAdministradorCategoriaDTO, CategoriaAdministradorCategoriaEntity> INSTANCE = new CategoriaAdministradorCategoriaAssembler();

	private CategoriaAdministradorCategoriaAssembler() {
		super();
	}
	
	public static final Assembler<CategoriaAdministradorCategoriaDomain, CategoriaAdministradorCategoriaDTO, CategoriaAdministradorCategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public CategoriaAdministradorCategoriaDTO toDtoFromDomain(CategoriaAdministradorCategoriaDomain domain) {
		return CategoriaAdministradorCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setCategoria(CategoriaAssembler.getinstance().toDtoFromDomain(domain.getCategoria())).setAdministradorCategoria(AdministradorCategoriaAssembler.getinstance().toDtoFromDomain(domain.getAdministradorCategoria())) ;
	}

	@Override
	public CategoriaAdministradorCategoriaDomain toDomainFromDto(CategoriaAdministradorCategoriaDTO dto) {
		return new CategoriaAdministradorCategoriaDomain(dto.getIdentificador(),CategoriaAssembler.getinstance().toDomainFromDto(dto.getCategoria()), AdministradorCategoriaAssembler.getinstance().toDomainFromDto(dto.getAdministradorCategoria()));
	}

	@Override
	public CategoriaAdministradorCategoriaEntity toEntityFromDomain(CategoriaAdministradorCategoriaDomain domain) {
		return new CategoriaAdministradorCategoriaEntity(domain.getIdentificador(),CategoriaAssembler.getinstance().toEntityFromDomain(domain.getCategoria()), AdministradorCategoriaAssembler.getinstance().toEntityFromDomain(domain.getAdministradorCategoria()));
	}

	@Override
	public CategoriaAdministradorCategoriaDomain toDomainFromEntity(CategoriaAdministradorCategoriaEntity entity) {
		return new CategoriaAdministradorCategoriaDomain(entity.getIdentificador(),CategoriaAssembler.getinstance().toDomainFromEntity(entity.getCategoria()), AdministradorCategoriaAssembler.getinstance().toDomainFromEntity(entity.getAdministradorCategoria()));

	}

	@Override
	public List<CategoriaAdministradorCategoriaDomain> toDomainListFromEntityList(List<CategoriaAdministradorCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<CategoriaAdministradorCategoriaDTO> toDtoListFromDomainList(List<CategoriaAdministradorCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}

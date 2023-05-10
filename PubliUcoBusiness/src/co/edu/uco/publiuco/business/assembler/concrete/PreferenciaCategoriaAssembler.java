package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PreferenciaCategoriaDomain;
import co.edu.uco.publiuco.dto.PreferenciaCategoriaDTO;
import co.edu.uco.publiuco.entities.PreferenciaCategoriaEntity;

public final class PreferenciaCategoriaAssembler implements Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity>{
	
	private static final Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity> INSTANCE = new PreferenciaCategoriaAssembler();

	private PreferenciaCategoriaAssembler() {
		super();
	}
	
	public static final Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PreferenciaCategoriaDTO toDtoFromDomain(PreferenciaCategoriaDomain domain) {
		return PreferenciaCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setPerfil(PerfilAssembler.getinstance().toDtoFromDomain(domain.getPerfil())).setCategoria(CategoriaAssembler.getinstance().toDtoFromDomain(domain.getCategoria())) ;
	}

	@Override
	public PreferenciaCategoriaDomain toDomainFromDto(PreferenciaCategoriaDTO dto) {
		return new PreferenciaCategoriaDomain(dto.getIdentificador(), PerfilAssembler.getinstance().toDomainFromDto(dto.getPerfil()), CategoriaAssembler.getinstance().toDomainFromDto(dto.getCategoria()));
	}

	@Override
	public PreferenciaCategoriaEntity toEntityFromDomain(PreferenciaCategoriaDomain domain) {
		return new PreferenciaCategoriaEntity(domain.getIdentificador(), PerfilAssembler.getinstance().toEntityFromDomain(domain.getPerfil()), CategoriaAssembler.getinstance().toEntityFromDomain(domain.getCategoria()));
	}

	@Override
	public PreferenciaCategoriaDomain toDomainFromEntity(PreferenciaCategoriaEntity entity) {
		return new PreferenciaCategoriaDomain(entity.getIdentificador(), PerfilAssembler.getinstance().toDomainFromEntity(entity.getPerfil()), CategoriaAssembler.getinstance().toDomainFromEntity(entity.getCategoria()));

	}

	@Override
	public List<PreferenciaCategoriaDomain> toDomainListFromEntityList(List<PreferenciaCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

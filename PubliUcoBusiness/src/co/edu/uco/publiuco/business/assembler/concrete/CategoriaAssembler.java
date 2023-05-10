package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.CategoriaDomain;
import co.edu.uco.publiuco.dto.CategoriaDTO;
import co.edu.uco.publiuco.entities.CategoriaEntity;

public final class CategoriaAssembler implements Assembler<CategoriaDomain, CategoriaDTO, CategoriaEntity> {
	
	private static final Assembler<CategoriaDomain, CategoriaDTO, CategoriaEntity> INSTANCE = new CategoriaAssembler();

	private CategoriaAssembler() {
		super();
	}
	
	public static final Assembler<CategoriaDomain,CategoriaDTO, CategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public CategoriaDTO toDtoFromDomain(CategoriaDomain domain) {
		return CategoriaDTO.create().setIdentificador(domain.getIdentificador()).setCategoriaPadre(CategoriaAssembler.getinstance().toDtoFromDomain(domain.getCategoriaPadre()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoCategoriaAssembler.getinstance().toDtoFromDomain(domain.getEstado()))) ;
	}

	@Override
	public CategoriaDomain toDomainFromDto(CategoriaDTO dto) {
		return new CategoriaDomain(dto.getIdentificador(),CategoriaAssembler.getinstance().toDomainFromDto(dto.getCategoriaPadre()), dto.getNombre(), dto.getDescripcion(),EstadoCategoriaAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public CategoriaEntity toEntityFromDomain(CategoriaDomain domain) {
		return new CategoriaEntity(domain.getIdentificador(),CategoriaAssembler.getinstance().toEntityFromDomain(domain.getCategoriaPadre()), domain.getNombre(), domain.getDescripcion(),EstadoCategoriaAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public CategoriaDomain toDomainFromEntity(CategoriaEntity entity) {
		return new CategoriaDomain(entity.getIdentificador(), CategoriaAssembler.getinstance().toDomainFromEntity(entity.getCategoriaPadre()), entity.getNombre(), entity.getDescripcion(),EstadoCategoriaAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<CategoriaDomain> toDomainListFromEntityList(List<CategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

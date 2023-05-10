package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PlanCategoriaDomain;
import co.edu.uco.publiuco.dto.PlanCategoriaDTO;
import co.edu.uco.publiuco.entities.PlanCategoriaEntity;

public final class PlanCategoriaAssembler implements Assembler<PlanCategoriaDomain, PlanCategoriaDTO, PlanCategoriaEntity>{
	
	private static final Assembler<PlanCategoriaDomain, PlanCategoriaDTO, PlanCategoriaEntity> INSTANCE = new PlanCategoriaAssembler();

	private PlanCategoriaAssembler() {
		super();
	}
	
	public static final Assembler<PlanCategoriaDomain, PlanCategoriaDTO, PlanCategoriaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PlanCategoriaDTO toDtoFromDomain(PlanCategoriaDomain domain) {
		return PlanCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setCategoria(CategoriaAssembler.getinstance().toDtoFromDomain(domain.getCategoria())).setPrecio(domain.getPrecio()).setFechaDesde(domain.getFechaDesde()).setFechahasta(domain.getFechahasta()).setEstado(EstadoPlanAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public PlanCategoriaDomain toDomainFromDto(PlanCategoriaDTO dto) {
		return new PlanCategoriaDomain(dto.getIdentificador(),CategoriaAssembler.getinstance().toDomainFromDto(dto.getCategoria()), dto.getPrecio(),dto.getFechaDesde(), dto.getFechahasta(), EstadoPlanAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public PlanCategoriaEntity toEntityFromDomain(PlanCategoriaDomain domain) {
		return new PlanCategoriaEntity(domain.getIdentificador(),CategoriaAssembler.getinstance().toEntityFromDomain(domain.getCategoria()), domain.getPrecio(), domain.getFechaDesde(),domain.getFechahasta(), EstadoPlanAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public PlanCategoriaDomain toDomainFromEntity(PlanCategoriaEntity entity) {
		return new PlanCategoriaDomain(entity.getIdentificador(),CategoriaAssembler.getinstance().toDomainFromEntity(entity.getCategoria()), entity.getPrecio(), entity.getFechaDesde(), entity.getFechahasta(), EstadoPlanAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<PlanCategoriaDomain> toDomainListFromEntityList(List<PlanCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoEscritorDomain;
import co.edu.uco.publiuco.dto.TipoEscritorDTO;
import co.edu.uco.publiuco.entities.TipoEscritorEntity;

public final class TipoEscritorAssembler implements Assembler<TipoEscritorDomain, TipoEscritorDTO, TipoEscritorEntity>{
	
	private static final Assembler<TipoEscritorDomain, TipoEscritorDTO, TipoEscritorEntity> INSTANCE = new TipoEscritorAssembler();

	private TipoEscritorAssembler() {
		super();
	}
	
	public static final Assembler<TipoEscritorDomain, TipoEscritorDTO, TipoEscritorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoEscritorDTO toDtoFromDomain(TipoEscritorDomain domain) {
		return TipoEscritorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoEscritorAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public TipoEscritorDomain toDomainFromDto(TipoEscritorDTO dto) {
		return new TipoEscritorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(),EstadoTipoEscritorAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoEscritorEntity toEntityFromDomain(TipoEscritorDomain domain) {
		return new TipoEscritorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(),EstadoTipoEscritorAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoEscritorDomain toDomainFromEntity(TipoEscritorEntity entity) {
		return new TipoEscritorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),EstadoTipoEscritorAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<TipoEscritorDomain> toDomainListFromEntityList(List<TipoEscritorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

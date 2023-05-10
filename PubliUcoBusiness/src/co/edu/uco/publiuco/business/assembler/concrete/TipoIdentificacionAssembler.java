package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoIdentificacionDomain;
import co.edu.uco.publiuco.dto.TipoIdentificacionDTO;
import co.edu.uco.publiuco.entities.TipoIdentificacionEntity;

public final class TipoIdentificacionAssembler implements Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> {
	
	private static final Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> INSTANCE = new TipoIdentificacionAssembler();

	private TipoIdentificacionAssembler() {
		super();
	}
	
	public static final Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoIdentificacionDTO toDtoFromDomain(TipoIdentificacionDomain domain) {
		return TipoIdentificacionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoIdentificacionAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public TipoIdentificacionDomain toDomainFromDto(TipoIdentificacionDTO dto) {
		return new TipoIdentificacionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(),EstadoTipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoIdentificacionEntity toEntityFromDomain(TipoIdentificacionDomain domain) {
		return new TipoIdentificacionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(),EstadoTipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoIdentificacionDomain toDomainFromEntity(TipoIdentificacionEntity entity) {
		return new TipoIdentificacionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),EstadoTipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<TipoIdentificacionDomain> toDomainListFromEntityList(List<TipoIdentificacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

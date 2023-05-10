package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.dto.TipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

public final class TipoRelacionInstitucionAssembler implements Assembler<TipoRelacionInstitucionDomain, TipoRelacionInstitucionDTO, TipoRelacionInstitucionEntity> {

	private static final Assembler<TipoRelacionInstitucionDomain, TipoRelacionInstitucionDTO, TipoRelacionInstitucionEntity> INSTANCE = new TipoRelacionInstitucionAssembler();

	private TipoRelacionInstitucionAssembler() {
		super();
	}
	
	public static final Assembler<TipoRelacionInstitucionDomain, TipoRelacionInstitucionDTO, TipoRelacionInstitucionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public TipoRelacionInstitucionDTO toDtoFromDomain(TipoRelacionInstitucionDomain domain) {
		return TipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoRelacionInstitucionAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public TipoRelacionInstitucionDomain toDomainFromDto(TipoRelacionInstitucionDTO dto) {
		return new TipoRelacionInstitucionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(),EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoRelacionInstitucionEntity toEntityFromDomain(TipoRelacionInstitucionDomain domain) {
		return new TipoRelacionInstitucionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(),EstadoTipoRelacionInstitucionAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoRelacionInstitucionDomain toDomainFromEntity(TipoRelacionInstitucionEntity entity) {
		return new TipoRelacionInstitucionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<TipoRelacionInstitucionDomain> toDomainListFromEntityList(List<TipoRelacionInstitucionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

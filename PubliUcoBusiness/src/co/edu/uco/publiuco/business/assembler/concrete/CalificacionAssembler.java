package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.CalificacionDomain;
import co.edu.uco.publiuco.dto.CalificacionDTO;
import co.edu.uco.publiuco.entities.CalificacionEntity;

public final class CalificacionAssembler implements Assembler<CalificacionDomain, CalificacionDTO, CalificacionEntity>{
	
	private static final Assembler<CalificacionDomain, CalificacionDTO, CalificacionEntity> INSTANCE = new CalificacionAssembler();

	private CalificacionAssembler() {
		super();
	}
	
	public static final Assembler<CalificacionDomain, CalificacionDTO, CalificacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public CalificacionDTO toDtoFromDomain(CalificacionDomain domain) {
		return CalificacionDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getinstance().toDtoFromDomain(domain.getLector())).setPublicacion(PublicacionAssembler.getinstance().toDtoFromDomain(domain.getPublicacion())).setFechaCalificacion(domain.getFechaCalificacion()).setCalificacion(domain.getCalificacion()) ;
	}

	@Override
	public CalificacionDomain toDomainFromDto(CalificacionDTO dto) {
		return new CalificacionDomain(dto.getIdentificador(), LectorAssembler.getinstance().toDomainFromDto(dto.getLector()), PublicacionAssembler.getinstance().toDomainFromDto(dto.getPublicacion()), dto.getFechaCalificacion(), dto.getCalificacion());
	}

	@Override
	public CalificacionEntity toEntityFromDomain(CalificacionDomain domain) {
		return new CalificacionEntity(domain.getIdentificador(), LectorAssembler.getinstance().toEntityFromDomain(domain.getLector()), PublicacionAssembler.getinstance().toEntityFromDomain(domain.getPublicacion()), domain.getFechaCalificacion(), domain.getCalificacion());
	}

	@Override
	public CalificacionDomain toDomainFromEntity(CalificacionEntity entity) {
		return new CalificacionDomain(entity.getIdentificador(), LectorAssembler.getinstance().toDomainFromEntity(entity.getLector()), PublicacionAssembler.getinstance().toDomainFromEntity(entity.getPublicacion()), entity.getFechaCalificacion(), entity.getCalificacion());

	}

	@Override
	public List<CalificacionDomain> toDomainListFromEntityList(List<CalificacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<CalificacionDTO> toDtoListFromDomainList(List<CalificacionDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}

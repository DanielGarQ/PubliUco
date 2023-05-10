package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.HistorialAccesoPublicacionDomain;
import co.edu.uco.publiuco.dto.HistorialAccesoPublicacionDTO;
import co.edu.uco.publiuco.entities.HistorialAccesoPublicacionEntity;

public final class HistorialAccesoPublicacionAssembler implements Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> {
	
	private static final Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> INSTANCE = new HistorialAccesoPublicacionAssembler();

	private HistorialAccesoPublicacionAssembler() {
		super();
	}
	
	public static final Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public HistorialAccesoPublicacionDTO toDtoFromDomain(HistorialAccesoPublicacionDomain domain) {
		return HistorialAccesoPublicacionDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getinstance().toDtoFromDomain(domain.getLector())).setPublicacion(PublicacionAssembler.getinstance().toDtoFromDomain(domain.getPublicacion())).setFechaAcceso(domain.getFechaAcceso()) ;
	}

	@Override
	public HistorialAccesoPublicacionDomain toDomainFromDto(HistorialAccesoPublicacionDTO dto) {
		return new HistorialAccesoPublicacionDomain(dto.getIdentificador(), LectorAssembler.getinstance().toDomainFromDto(dto.getLector()), PublicacionAssembler.getinstance().toDomainFromDto(dto.getPublicacion()), dto.getFechaAcceso());
	}

	@Override
	public HistorialAccesoPublicacionEntity toEntityFromDomain(HistorialAccesoPublicacionDomain domain) {
		return new HistorialAccesoPublicacionEntity(domain.getIdentificador(), LectorAssembler.getinstance().toEntityFromDomain(domain.getLector()), PublicacionAssembler.getinstance().toEntityFromDomain(domain.getPublicacion()), domain.getFechaAcceso());
	}

	@Override
	public HistorialAccesoPublicacionDomain toDomainFromEntity(HistorialAccesoPublicacionEntity entity) {
		return new HistorialAccesoPublicacionDomain(entity.getIdentificador(), LectorAssembler.getinstance().toDomainFromEntity(entity.getLector()), PublicacionAssembler.getinstance().toDomainFromEntity(entity.getPublicacion()), entity.getFechaAcceso());

	}

	@Override
	public List<HistorialAccesoPublicacionDomain> toDomainListFromEntityList(List<HistorialAccesoPublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

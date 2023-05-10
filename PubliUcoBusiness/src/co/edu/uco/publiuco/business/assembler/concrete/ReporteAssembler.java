package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ReporteDomain;
import co.edu.uco.publiuco.dto.ReporteDTO;
import co.edu.uco.publiuco.entities.ReporteEntity;

public final class ReporteAssembler implements Assembler<ReporteDomain, ReporteDTO, ReporteEntity>{
	
	private static final Assembler<ReporteDomain, ReporteDTO, ReporteEntity> INSTANCE = new ReporteAssembler();

	private ReporteAssembler() {
		super();
	}
	
	public static final Assembler<ReporteDomain, ReporteDTO, ReporteEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public ReporteDTO toDtoFromDomain(ReporteDomain domain) {
		return ReporteDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getinstance().toDtoFromDomain(domain.getLector())).setComentario(ComentarioLectorAssembler.getinstance().toDtoFromDomain(domain.getComentario())).setTipoReporte(TipoReporteAssembler.getinstance().toDtoFromDomain(domain.getTipoReporte())).setRazon(domain.getRazon()).setFechaReporte(domain.getFechaReporte()) ;
	}

	@Override
	public ReporteDomain toDomainFromDto(ReporteDTO dto) {
		return new ReporteDomain(dto.getIdentificador(), LectorAssembler.getinstance().toDomainFromDto(dto.getLector()), ComentarioLectorAssembler.getinstance().toDomainFromDto(dto.getComentario()), TipoReporteAssembler.getinstance().toDomainFromDto(dto.getTipoReporte()), dto.getRazon(), dto.getFechaReporte());
	}

	@Override
	public ReporteEntity toEntityFromDomain(ReporteDomain domain) {
		return new ReporteEntity(domain.getIdentificador(), LectorAssembler.getinstance().toEntityFromDomain(domain.getLector()), ComentarioLectorAssembler.getinstance().toEntityFromDomain(domain.getComentario()), TipoReporteAssembler.getinstance().toEntityFromDomain(domain.getTipoReporte()), domain.getRazon(), domain.getFechaReporte());
	}

	@Override
	public ReporteDomain toDomainFromEntity(ReporteEntity entity) {
		return new ReporteDomain(entity.getIdentificador(), LectorAssembler.getinstance().toDomainFromEntity(entity.getLector()), ComentarioLectorAssembler.getinstance().toDomainFromEntity(entity.getComentario()), TipoReporteAssembler.getinstance().toDomainFromEntity(entity.getTipoReporte()), entity.getRazon(), entity.getFechaReporte());

	}

	@Override
	public List<ReporteDomain> toDomainListFromEntityList(List<ReporteEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

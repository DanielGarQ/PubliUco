package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ComentarioLectorDomain;
import co.edu.uco.publiuco.dto.ComentarioLectorDTO;
import co.edu.uco.publiuco.entities.ComentarioLectorEntity;

public final class ComentarioLectorAssembler implements Assembler<ComentarioLectorDomain, ComentarioLectorDTO, ComentarioLectorEntity> {
	
	private static final Assembler<ComentarioLectorDomain, ComentarioLectorDTO, ComentarioLectorEntity> INSTANCE = new ComentarioLectorAssembler();

	private ComentarioLectorAssembler() {
		super();
	}
	
	public static final Assembler<ComentarioLectorDomain, ComentarioLectorDTO, ComentarioLectorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public ComentarioLectorDTO toDtoFromDomain(ComentarioLectorDomain domain) {
		return ComentarioLectorDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getinstance().toDtoFromDomain(domain.getLector())).setPublicacion(PublicacionAssembler.getinstance().toDtoFromDomain(domain.getPublicacion())).setComentarioPadre(ComentarioLectorAssembler.getinstance().toDtoFromDomain(domain.getComentarioPadre())).setComentario(domain.getComentario()).setFechaCalificacion(domain.getFechaCalificacion()).setEstado(EstadoComentarioLectorAssembler.getinstance().toDtoFromDomain(domain.getEstado())) ;
	}

	@Override
	public ComentarioLectorDomain toDomainFromDto(ComentarioLectorDTO dto) {
		return new ComentarioLectorDomain(dto.getIdentificador(),LectorAssembler.getinstance().toDomainFromDto(dto.getLector()), PublicacionAssembler.getinstance().toDomainFromDto(dto.getPublicacion()), ComentarioLectorAssembler.getinstance().toDomainFromDto(dto.getComentarioPadre()), dto.getComentario(), dto.getFechaCalificacion(), EstadoComentarioLectorAssembler.getinstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public ComentarioLectorEntity toEntityFromDomain(ComentarioLectorDomain domain) {
		return new ComentarioLectorEntity(domain.getIdentificador(), LectorAssembler.getinstance().toEntityFromDomain(domain.getLector()), PublicacionAssembler.getinstance().toEntityFromDomain(domain.getPublicacion()), ComentarioLectorAssembler.getinstance().toEntityFromDomain(domain.getComentarioPadre()), domain.getComentario(), domain.getFechaCalificacion(), EstadoComentarioLectorAssembler.getinstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public ComentarioLectorDomain toDomainFromEntity(ComentarioLectorEntity entity) {
		return new ComentarioLectorDomain(entity.getIdentificador(), LectorAssembler.getinstance().toDomainFromEntity(entity.getLector()), PublicacionAssembler.getinstance().toDomainFromEntity(entity.getPublicacion()), ComentarioLectorAssembler.getinstance().toDomainFromEntity(entity.getComentarioPadre()), entity.getComentario(), entity.getFechaCalificacion(), EstadoComentarioLectorAssembler.getinstance().toDomainFromEntity(entity.getEstado()));

	}

	@Override
	public List<ComentarioLectorDomain> toDomainListFromEntityList(List<ComentarioLectorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<ComentarioLectorDTO> toDtoListFromDomainList(List<ComentarioLectorDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}


}

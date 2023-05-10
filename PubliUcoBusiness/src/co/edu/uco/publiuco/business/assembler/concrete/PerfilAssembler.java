package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PerfilDomain;
import co.edu.uco.publiuco.dto.PerfilDTO;
import co.edu.uco.publiuco.entities.PerfilEntity;

public final class PerfilAssembler implements Assembler<PerfilDomain, PerfilDTO, PerfilEntity> {
	
	private static final Assembler<PerfilDomain, PerfilDTO, PerfilEntity> INSTANCE = new PerfilAssembler();

	private PerfilAssembler() {
		super();
	}
	
	public static final Assembler<PerfilDomain, PerfilDTO, PerfilEntity> getinstance(){
		return INSTANCE;
	}
	@Override
	public PerfilDTO toDtoFromDomain(PerfilDomain domain) {
		return PerfilDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getinstance().toDtoFromDomain(domain.getLector())).setRecomendacionesCategoria(domain.isRecomendacionesCategoria()).setRecomendacionesAutor(domain.isRecomendacionesAutor()) ;
	}

	@Override
	public PerfilDomain toDomainFromDto(PerfilDTO dto) {
		return new PerfilDomain(dto.getIdentificador(),LectorAssembler.getinstance().toDomainFromDto(dto.getLector()), dto.isRecomendacionesCategoria(), dto.isRecomendacionesAutor());
	}

	@Override
	public PerfilEntity toEntityFromDomain(PerfilDomain domain) {
		return new PerfilEntity(domain.getIdentificador(),LectorAssembler.getinstance().toEntityFromDomain(domain.getLector()), domain.isRecomendacionesCategoria(), domain.isRecomendacionesAutor());
	}

	@Override
	public PerfilDomain toDomainFromEntity(PerfilEntity entity) {
		return new PerfilDomain(entity.getIdentificador(),LectorAssembler.getinstance().toDomainFromEntity(entity.getLector()), entity.isRecomendacionesCategoria(), entity.isRecomendacionesAutor());

	}

	@Override
	public List<PerfilDomain> toDomainListFromEntityList(List<PerfilEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PreferenciaEscritorDomain;
import co.edu.uco.publiuco.dto.PreferenciaEscritorDTO;
import co.edu.uco.publiuco.entities.PreferenciaEscritorEntity;
public final class PreferenciaEscritorAssembler implements Assembler<PreferenciaEscritorDomain, PreferenciaEscritorDTO, PreferenciaEscritorEntity> {
	
	private static final Assembler<PreferenciaEscritorDomain, PreferenciaEscritorDTO, PreferenciaEscritorEntity> INSTANCE = new PreferenciaEscritorAssembler();

	private PreferenciaEscritorAssembler() {
		super();
	}
	
	public static final Assembler<PreferenciaEscritorDomain, PreferenciaEscritorDTO, PreferenciaEscritorEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PreferenciaEscritorDTO toDtoFromDomain(PreferenciaEscritorDomain domain) {
		return PreferenciaEscritorDTO.create().setIdentificador(domain.getIdentificador()).setPerfil(PerfilAssembler.getinstance().toDtoFromDomain(domain.getPerfil())).setEscritor(EscritorAssembler.getinstance().toDtoFromDomain(domain.getEscritor())) ;
	}

	@Override
	public PreferenciaEscritorDomain toDomainFromDto(PreferenciaEscritorDTO dto) {
		return new PreferenciaEscritorDomain(dto.getIdentificador(), PerfilAssembler.getinstance().toDomainFromDto(dto.getPerfil()), EscritorAssembler.getinstance().toDomainFromDto(dto.getEscritor()));
	}

	@Override
	public PreferenciaEscritorEntity toEntityFromDomain(PreferenciaEscritorDomain domain) {
		return new PreferenciaEscritorEntity(domain.getIdentificador(), PerfilAssembler.getinstance().toEntityFromDomain(domain.getPerfil()), EscritorAssembler.getinstance().toEntityFromDomain(domain.getEscritor()));
	}

	@Override
	public PreferenciaEscritorDomain toDomainFromEntity(PreferenciaEscritorEntity entity) {
		return new PreferenciaEscritorDomain(entity.getIdentificador(), PerfilAssembler.getinstance().toDomainFromEntity(entity.getPerfil()), EscritorAssembler.getinstance().toDomainFromEntity(entity.getEscritor()));

	}

	@Override
	public List<PreferenciaEscritorDomain> toDomainListFromEntityList(List<PreferenciaEscritorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}

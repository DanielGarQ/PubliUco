package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PersonaDomain;
import co.edu.uco.publiuco.dto.PersonaDTO;
import co.edu.uco.publiuco.entities.PersonaEntity;

public class PersonaAssembler implements Assembler<PersonaDomain, PersonaDTO, PersonaEntity>{
	
	protected static final Assembler<PersonaDomain, PersonaDTO, PersonaEntity> INSTANCE = new PersonaAssembler();

	protected PersonaAssembler() {
		super();
	}
	
	public static final Assembler<PersonaDomain, PersonaDTO, PersonaEntity> getinstance(){
		return INSTANCE;
	}
	
	@Override
	public PersonaDTO toDtoFromDomain(PersonaDomain domain) {
		return PersonaDTO.create().setIdentificador(domain.getIdentificador()).setTipoIdentificacion(TipoIdentificacionAssembler.getinstance().toDtoFromDomain(domain.getTipoIdentificacion())).setNumeroIdentificacion(domain.getNumeroIdentificacion()).setPrimerNombre(domain.getPrimerNombre()).setSegundoNombre(domain.getSegundoNombre()).setPrimerApellido(domain.getPrimerApellido()).setSegundoApellido(domain.getSegundoApellido()).setCorreo(domain.getCorreo()).setNumeroTelefono(domain.getNumeroTelefono()).setTipoRelacionInstitucion(TipoRelacionInstitucionAssembler.getinstance().toDtoFromDomain(domain.getTipoRelacionInstitucion())).setConfirmacionCorreo(domain.isConfirmacionCorreo()).setConfirmacionNumeroTelefono(domain.isConfirmacionNumeroTelefono()) ;
	}

	@Override
	public PersonaDomain toDomainFromDto(PersonaDTO dto) {
		return new PersonaDomain(dto.getIdentificador(), TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto.getTipoIdentificacion()), dto.getNumeroIdentificacion(),dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),dto.getSegundoApellido(),dto.getCorreo(),dto.getNumeroTelefono(),TipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto.getTipoRelacionInstitucion()),dto.isConfirmacionCorreo(), dto.isConfirmacionNumeroTelefono());
	}

	@Override
	public PersonaEntity toEntityFromDomain(PersonaDomain domain) {
		return new PersonaEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getinstance().toEntityFromDomain(domain.getTipoIdentificacion()), domain.getNumeroIdentificacion(), domain.getPrimerNombre(),domain.getSegundoNombre(),domain.getPrimerApellido(),domain.getSegundoApellido(),domain.getCorreo(),domain.getNumeroTelefono(),TipoRelacionInstitucionAssembler.getinstance().toEntityFromDomain(domain.getTipoRelacionInstitucion()),domain.isConfirmacionCorreo(),domain.isConfirmacionNumeroTelefono());
	}

	@Override
	public PersonaDomain toDomainFromEntity(PersonaEntity entity) {
		return new PersonaDomain(entity.getIdentificador(),TipoIdentificacionAssembler.getinstance().toDomainFromEntity(entity.getTipoIdentificacion()), entity.getNumeroIdentificacion(), entity.getPrimerNombre(),entity.getSegundoNombre(),entity.getPrimerApellido(),entity.getSegundoApellido(),entity.getCorreo(),entity.getNumeroTelefono(),TipoRelacionInstitucionAssembler.getinstance().toDomainFromEntity(entity.getTipoRelacionInstitucion()),entity.isConfirmacionCorreo(),entity.isConfirmacionNumeroTelefono());

	}

	@Override
	public List<PersonaDomain> toDomainListFromEntityList(List<PersonaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	@Override
	public List<PersonaDTO> toDtoListFromDomainList(List<PersonaDomain> domainList) {
		return domainList.stream().map(domain -> toDtoFromDomain(domain)).toList();
	}

}

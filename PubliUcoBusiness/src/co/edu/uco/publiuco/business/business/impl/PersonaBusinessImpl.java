package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PersonaAssembler;
import co.edu.uco.publiuco.business.business.PersonaBusiness;
import co.edu.uco.publiuco.business.domain.PersonaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PersonaEntity;

public class PersonaBusinessImpl implements PersonaBusiness{
	
	private DAOFactory daoFactory;

	public PersonaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PersonaDomain domain) {
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPersonaDAO().create(entity);

	}

	@Override
	public final List<PersonaDomain> list(final PersonaDomain domain) {
		
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PersonaEntity> resultEntityList = daoFactory.getPersonaDAO().read(entity);
		
		return PersonaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PersonaDomain domain) {
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPersonaDAO().update(entity);

		

	}

	@Override
	public final void drop(final PersonaDomain domain) {
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPersonaDAO().delete(entity);

	}

}

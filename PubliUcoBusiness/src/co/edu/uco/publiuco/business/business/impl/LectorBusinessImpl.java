package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.LectorAssembler;
import co.edu.uco.publiuco.business.business.LectorBusiness;
import co.edu.uco.publiuco.business.domain.LectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.LectorEntity;

public final class LectorBusinessImpl implements LectorBusiness{
	
	private DAOFactory daoFactory;

	public LectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final LectorDomain domain) {
		final LectorEntity entity = LectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getLectorDAO().create(entity);

	}

	@Override
	public final List<LectorDomain> list(final LectorDomain domain) {
		
		final LectorEntity entity = LectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<LectorEntity> resultEntityList = daoFactory.getLectorDAO().read(entity);
		
		return LectorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final LectorDomain domain) {
		final LectorEntity entity = LectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getLectorDAO().update(entity);

		

	}

	@Override
	public final void drop(final LectorDomain domain) {
		final LectorEntity entity = LectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getLectorDAO().delete(entity);

	}

}

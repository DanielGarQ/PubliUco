package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.RevisionAssembler;
import co.edu.uco.publiuco.business.business.RevisionBusiness;
import co.edu.uco.publiuco.business.domain.RevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.RevisionEntity;

public final class RevisionBusinessImpl implements RevisionBusiness{
	
	private DAOFactory daoFactory;

	public RevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final RevisionDomain domain) {
		final RevisionEntity entity = RevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisionDAO().create(entity);

	}

	@Override
	public final List<RevisionDomain> list(final RevisionDomain domain) {
		
		final RevisionEntity entity = RevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<RevisionEntity> resultEntityList = daoFactory.getRevisionDAO().read(entity);
		
		return RevisionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final RevisionDomain domain) {
		final RevisionEntity entity = RevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisionDAO().update(entity);

		

	}

	@Override
	public final void drop(final RevisionDomain domain) {
		final RevisionEntity entity = RevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisionDAO().delete(entity);

	}

}

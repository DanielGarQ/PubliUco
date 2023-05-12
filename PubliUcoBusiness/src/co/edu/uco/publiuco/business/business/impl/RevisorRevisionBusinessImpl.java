package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.RevisorRevisionAssembler;
import co.edu.uco.publiuco.business.business.RevisorRevisionBusiness;
import co.edu.uco.publiuco.business.domain.RevisorRevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.RevisorRevisionEntity;

public final class RevisorRevisionBusinessImpl implements RevisorRevisionBusiness{
	
	private DAOFactory daoFactory;

	public RevisorRevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final RevisorRevisionDomain domain) {
		final RevisorRevisionEntity entity = RevisorRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisorRevisionDAO().create(entity);

	}

	@Override
	public final List<RevisorRevisionDomain> list(final RevisorRevisionDomain domain) {
		
		final RevisorRevisionEntity entity = RevisorRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<RevisorRevisionEntity> resultEntityList = daoFactory.getRevisorRevisionDAO().read(entity);
		
		return RevisorRevisionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final RevisorRevisionDomain domain) {
		final RevisorRevisionEntity entity = RevisorRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisorRevisionDAO().update(entity);

		

	}

	@Override
	public final void drop(final RevisorRevisionDomain domain) {
		final RevisorRevisionEntity entity = RevisorRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisorRevisionDAO().delete(entity);

	}

}

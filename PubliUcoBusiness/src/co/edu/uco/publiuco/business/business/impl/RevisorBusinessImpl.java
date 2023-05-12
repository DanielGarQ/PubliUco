package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.RevisorAssembler;
import co.edu.uco.publiuco.business.business.RevisorBusiness;
import co.edu.uco.publiuco.business.domain.RevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.RevisorEntity;

public final class RevisorBusinessImpl implements RevisorBusiness{
	
	private DAOFactory daoFactory;

	public RevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final RevisorDomain domain) {
		final RevisorEntity entity = RevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisorDAO().create(entity);

	}

	@Override
	public final List<RevisorDomain> list(final RevisorDomain domain) {
		
		final RevisorEntity entity = RevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<RevisorEntity> resultEntityList = daoFactory.getRevisorDAO().read(entity);
		
		return RevisorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final RevisorDomain domain) {
		final RevisorEntity entity = RevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisorDAO().update(entity);

		

	}

	@Override
	public final void drop(final RevisorDomain domain) {
		final RevisorEntity entity = RevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRevisorDAO().delete(entity);

	}

}

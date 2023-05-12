package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorAssembler;
import co.edu.uco.publiuco.business.business.ComentarioRevisorBusiness;
import co.edu.uco.publiuco.business.domain.ComentarioRevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.ComentarioRevisorEntity;

public final class ComentarioRevisorBusinessImpl implements ComentarioRevisorBusiness {
	
	private DAOFactory daoFactory;

	public ComentarioRevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final ComentarioRevisorDomain domain) {
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getComentarioRevisorDAO().create(entity);

	}

	@Override
	public final List<ComentarioRevisorDomain> list(final ComentarioRevisorDomain domain) {
		
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<ComentarioRevisorEntity> resultEntityList = daoFactory.getComentarioRevisorDAO().read(entity);
		
		return ComentarioRevisorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final ComentarioRevisorDomain domain) {
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getComentarioRevisorDAO().update(entity);

		

	}

	@Override
	public final void drop(final ComentarioRevisorDomain domain) {
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getComentarioRevisorDAO().delete(entity);

	}

}

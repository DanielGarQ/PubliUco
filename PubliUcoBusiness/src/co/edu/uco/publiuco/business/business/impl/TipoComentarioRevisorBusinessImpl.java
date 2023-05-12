package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoComentarioRevisorAssembler;
import co.edu.uco.publiuco.business.business.TipoComentarioRevisorBusiness;
import co.edu.uco.publiuco.business.domain.TipoComentarioRevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoComentarioRevisorEntity;

public final class TipoComentarioRevisorBusinessImpl implements TipoComentarioRevisorBusiness{
	
	private DAOFactory daoFactory;

	public TipoComentarioRevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoComentarioRevisorDomain domain) {
		final TipoComentarioRevisorEntity entity = TipoComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoComentarioRevisorDAO().create(entity);

	}

	@Override
	public final List<TipoComentarioRevisorDomain> list(final TipoComentarioRevisorDomain domain) {
		
		final TipoComentarioRevisorEntity entity = TipoComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoComentarioRevisorEntity> resultEntityList = daoFactory.getTipoComentarioRevisorDAO().read(entity);
		
		return TipoComentarioRevisorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoComentarioRevisorDomain domain) {
		final TipoComentarioRevisorEntity entity = TipoComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoComentarioRevisorDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoComentarioRevisorDomain domain) {
		final TipoComentarioRevisorEntity entity = TipoComentarioRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoComentarioRevisorDAO().delete(entity);

	}

}

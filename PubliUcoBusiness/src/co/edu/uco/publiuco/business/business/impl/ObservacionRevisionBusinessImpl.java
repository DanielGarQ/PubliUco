package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ObservacionRevisionAssembler;
import co.edu.uco.publiuco.business.business.ObservacionRevisionBusiness;
import co.edu.uco.publiuco.business.domain.ObservacionRevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.ObservacionRevisionEntity;

public final class ObservacionRevisionBusinessImpl implements ObservacionRevisionBusiness{
	
	private DAOFactory daoFactory;

	public ObservacionRevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final ObservacionRevisionDomain domain) {
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getObservacionRevisionDAO().create(entity);

	}

	@Override
	public final List<ObservacionRevisionDomain> list(final ObservacionRevisionDomain domain) {
		
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<ObservacionRevisionEntity> resultEntityList = daoFactory.getObservacionRevisionDAO().read(entity);
		
		return ObservacionRevisionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final ObservacionRevisionDomain domain) {
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getObservacionRevisionDAO().update(entity);

		

	}

	@Override
	public final void drop(final ObservacionRevisionDomain domain) {
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getObservacionRevisionDAO().delete(entity);

	}

}

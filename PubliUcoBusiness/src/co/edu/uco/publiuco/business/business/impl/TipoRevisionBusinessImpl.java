package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoRevisionAssembler;
import co.edu.uco.publiuco.business.business.TipoRevisionBusiness;
import co.edu.uco.publiuco.business.domain.TipoRevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoRevisionEntity;

public final class TipoRevisionBusinessImpl implements TipoRevisionBusiness{
	
	private DAOFactory daoFactory;

	public TipoRevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoRevisionDomain domain) {
		final TipoRevisionEntity entity = TipoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRevisionDAO().create(entity);

	}

	@Override
	public final List<TipoRevisionDomain> list(final TipoRevisionDomain domain) {
		
		final TipoRevisionEntity entity = TipoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoRevisionEntity> resultEntityList = daoFactory.getTipoRevisionDAO().read(entity);
		
		return TipoRevisionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoRevisionDomain domain) {
		final TipoRevisionEntity entity = TipoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRevisionDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoRevisionDomain domain) {
		final TipoRevisionEntity entity = TipoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRevisionDAO().delete(entity);

	}

}

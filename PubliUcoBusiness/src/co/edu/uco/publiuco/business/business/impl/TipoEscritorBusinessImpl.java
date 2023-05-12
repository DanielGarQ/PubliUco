package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoEscritorAssembler;
import co.edu.uco.publiuco.business.business.TipoEscritorBusiness;
import co.edu.uco.publiuco.business.domain.TipoEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoEscritorEntity;

public final class TipoEscritorBusinessImpl implements TipoEscritorBusiness{
	
	private DAOFactory daoFactory;

	public TipoEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoEscritorDomain domain) {
		final TipoEscritorEntity entity = TipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoEscritorDAO().create(entity);

	}

	@Override
	public final List<TipoEscritorDomain> list(final TipoEscritorDomain domain) {
		
		final TipoEscritorEntity entity = TipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoEscritorEntity> resultEntityList = daoFactory.getTipoEscritorDAO().read(entity);
		
		return TipoEscritorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoEscritorDomain domain) {
		final TipoEscritorEntity entity = TipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoEscritorDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoEscritorDomain domain) {
		final TipoEscritorEntity entity = TipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoEscritorDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EscritorPublicacionAssembler;
import co.edu.uco.publiuco.business.business.EscritorPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.EscritorPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EscritorPublicacionEntity;

public final class EscritorPublicacionBusinessImpl implements EscritorPublicacionBusiness {
	
	private DAOFactory daoFactory;

	public EscritorPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EscritorPublicacionDomain domain) {
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEscritorPublicacionDAO().create(entity);

	}

	@Override
	public final List<EscritorPublicacionDomain> list(final EscritorPublicacionDomain domain) {
		
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EscritorPublicacionEntity> resultEntityList = daoFactory.getEscritorPublicacionDAO().read(entity);
		
		return EscritorPublicacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EscritorPublicacionDomain domain) {
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEscritorPublicacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EscritorPublicacionDomain domain) {
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEscritorPublicacionDAO().delete(entity);

	}

}

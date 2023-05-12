package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EscritorAssembler;
import co.edu.uco.publiuco.business.business.EscritorBusiness;
import co.edu.uco.publiuco.business.domain.EscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EscritorEntity;

public final class EscritorBusinessImpl implements EscritorBusiness{
	
	private DAOFactory daoFactory;

	public EscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EscritorDomain domain) {
		final EscritorEntity entity = EscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEscritorDAO().create(entity);

	}

	@Override
	public final List<EscritorDomain> list(final EscritorDomain domain) {
		
		final EscritorEntity entity = EscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EscritorEntity> resultEntityList = daoFactory.getEscritorDAO().read(entity);
		
		return EscritorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EscritorDomain domain) {
		final EscritorEntity entity = EscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEscritorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EscritorDomain domain) {
		final EscritorEntity entity = EscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEscritorDAO().delete(entity);

	}

}

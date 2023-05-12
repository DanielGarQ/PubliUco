package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PublicacionAssembler;
import co.edu.uco.publiuco.business.business.PublicacionBusiness;
import co.edu.uco.publiuco.business.domain.PublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PublicacionEntity;

public final class PublicacionBusinessImpl implements PublicacionBusiness {
	
	private DAOFactory daoFactory;

	public PublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PublicacionDomain domain) {
		final PublicacionEntity entity = PublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPublicacionDAO().create(entity);

	}

	@Override
	public final List<PublicacionDomain> list(final PublicacionDomain domain) {
		
		final PublicacionEntity entity = PublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PublicacionEntity> resultEntityList = daoFactory.getPublicacionDAO().read(entity);
		
		return PublicacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PublicacionDomain domain) {
		final PublicacionEntity entity = PublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPublicacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final PublicacionDomain domain) {
		final PublicacionEntity entity = PublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPublicacionDAO().delete(entity);

	}

}

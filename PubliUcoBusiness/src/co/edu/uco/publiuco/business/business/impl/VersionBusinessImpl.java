package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.VersionAssembler;
import co.edu.uco.publiuco.business.business.VersionBusiness;
import co.edu.uco.publiuco.business.domain.VersionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.VersionEntity;

public final class VersionBusinessImpl implements VersionBusiness{
	
	private DAOFactory daoFactory;

	public VersionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final VersionDomain domain) {
		final VersionEntity entity = VersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getVersionDAO().create(entity);

	}

	@Override
	public final List<VersionDomain> list(final VersionDomain domain) {
		
		final VersionEntity entity = VersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<VersionEntity> resultEntityList = daoFactory.getVersionDAO().read(entity);
		
		return VersionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final VersionDomain domain) {
		final VersionEntity entity = VersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getVersionDAO().update(entity);

		

	}

	@Override
	public final void drop(final VersionDomain domain) {
		final VersionEntity entity = VersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getVersionDAO().delete(entity);

	}

}

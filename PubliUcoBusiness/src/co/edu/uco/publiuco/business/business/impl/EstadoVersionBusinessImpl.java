package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoVersionAssembler;
import co.edu.uco.publiuco.business.business.EstadoVersionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoVersionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoVersionEntity;

public final class EstadoVersionBusinessImpl implements EstadoVersionBusiness{
	
	private DAOFactory daoFactory;

	public EstadoVersionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoVersionDomain domain) {
		final EstadoVersionEntity entity = EstadoVersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoVersionDAO().create(entity);

	}

	@Override
	public final List<EstadoVersionDomain> list(final EstadoVersionDomain domain) {
		
		final EstadoVersionEntity entity = EstadoVersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoVersionEntity> resultEntityList = daoFactory.getEstadoVersionDAO().read(entity);
		
		return EstadoVersionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoVersionDomain domain) {
		final EstadoVersionEntity entity = EstadoVersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoVersionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoVersionDomain domain) {
		final EstadoVersionEntity entity = EstadoVersionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoVersionDAO().delete(entity);

	}

}

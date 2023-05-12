package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoPlanAssembler;
import co.edu.uco.publiuco.business.business.EstadoPlanBusiness;
import co.edu.uco.publiuco.business.domain.EstadoPlanDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoPlanEntity;

public final class EstadoPlanBusinessImpl implements EstadoPlanBusiness{
	
	private DAOFactory daoFactory;

	public EstadoPlanBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoPlanDomain domain) {
		final EstadoPlanEntity entity = EstadoPlanAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPlanDAO().create(entity);

	}

	@Override
	public final List<EstadoPlanDomain> list(final EstadoPlanDomain domain) {
		
		final EstadoPlanEntity entity = EstadoPlanAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoPlanEntity> resultEntityList = daoFactory.getEstadoPlanDAO().read(entity);
		
		return EstadoPlanAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoPlanDomain domain) {
		final EstadoPlanEntity entity = EstadoPlanAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPlanDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoPlanDomain domain) {
		final EstadoPlanEntity entity = EstadoPlanAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPlanDAO().delete(entity);

	}

}

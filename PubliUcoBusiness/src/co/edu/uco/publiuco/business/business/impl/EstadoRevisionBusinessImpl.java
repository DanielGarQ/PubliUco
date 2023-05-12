package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoRevisionAssembler;
import co.edu.uco.publiuco.business.business.EstadoRevisionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoRevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoRevisionEntity;

public final class EstadoRevisionBusinessImpl implements EstadoRevisionBusiness{
	
	private DAOFactory daoFactory;

	public EstadoRevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoRevisionDomain domain) {
		final EstadoRevisionEntity entity = EstadoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRevisionDAO().create(entity);

	}

	@Override
	public final List<EstadoRevisionDomain> list(final EstadoRevisionDomain domain) {
		
		final EstadoRevisionEntity entity = EstadoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoRevisionEntity> resultEntityList = daoFactory.getEstadoRevisionDAO().read(entity);
		
		return EstadoRevisionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoRevisionDomain domain) {
		final EstadoRevisionEntity entity = EstadoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRevisionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoRevisionDomain domain) {
		final EstadoRevisionEntity entity = EstadoRevisionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRevisionDAO().delete(entity);

	}

}

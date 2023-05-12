package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoPublicacionAssembler;
import co.edu.uco.publiuco.business.business.EstadoPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoPublicacionEntity;

public final class EstadoPublicacionBusinessImpl implements EstadoPublicacionBusiness{
	
	private DAOFactory daoFactory;

	public EstadoPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoPublicacionDomain domain) {
		final EstadoPublicacionEntity entity = EstadoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPublicacionDAO().create(entity);

	}

	@Override
	public final List<EstadoPublicacionDomain> list(final EstadoPublicacionDomain domain) {
		
		final EstadoPublicacionEntity entity = EstadoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoPublicacionEntity> resultEntityList = daoFactory.getEstadoPublicacionDAO().read(entity);
		
		return EstadoPublicacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoPublicacionDomain domain) {
		final EstadoPublicacionEntity entity = EstadoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPublicacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoPublicacionDomain domain) {
		final EstadoPublicacionEntity entity = EstadoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPublicacionDAO().delete(entity);

	}

}

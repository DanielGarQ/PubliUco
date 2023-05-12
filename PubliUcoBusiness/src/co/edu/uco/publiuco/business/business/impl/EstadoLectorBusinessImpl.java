package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoLectorAssembler;
import co.edu.uco.publiuco.business.business.EstadoLectorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoLectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoLectorEntity;

public class EstadoLectorBusinessImpl implements EstadoLectorBusiness{
	
	private DAOFactory daoFactory;

	public EstadoLectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoLectorDomain domain) {
		final EstadoLectorEntity entity = EstadoLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoLectorDAO().create(entity);

	}

	@Override
	public final List<EstadoLectorDomain> list(final EstadoLectorDomain domain) {
		
		final EstadoLectorEntity entity = EstadoLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoLectorEntity> resultEntityList = daoFactory.getEstadoLectorDAO().read(entity);
		
		return EstadoLectorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoLectorDomain domain) {
		final EstadoLectorEntity entity = EstadoLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoLectorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoLectorDomain domain) {
		final EstadoLectorEntity entity = EstadoLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoLectorDAO().delete(entity);

	}

}

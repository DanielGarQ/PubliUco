package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoComentarioLectorAssembler;
import co.edu.uco.publiuco.business.business.EstadoComentarioLectorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoComentarioLectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoComentarioLectorEntity;

public final class EstadoComentarioLectorBusinessImpl implements EstadoComentarioLectorBusiness {
	
	private DAOFactory daoFactory;

	public EstadoComentarioLectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoComentarioLectorDomain domain) {
		final EstadoComentarioLectorEntity entity = EstadoComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoComentarioLectorDAO().create(entity);

	}

	@Override
	public final List<EstadoComentarioLectorDomain> list(final EstadoComentarioLectorDomain domain) {
		
		final EstadoComentarioLectorEntity entity = EstadoComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoComentarioLectorEntity> resultEntityList = daoFactory.getEstadoComentarioLectorDAO().read(entity);
		
		return EstadoComentarioLectorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoComentarioLectorDomain domain) {
		final EstadoComentarioLectorEntity entity = EstadoComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoComentarioLectorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoComentarioLectorDomain domain) {
		final EstadoComentarioLectorEntity entity = EstadoComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoComentarioLectorDAO().delete(entity);

	}

}

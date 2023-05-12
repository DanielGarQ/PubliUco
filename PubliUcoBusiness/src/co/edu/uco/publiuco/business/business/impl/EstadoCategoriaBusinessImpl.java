package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoCategoriaAssembler;
import co.edu.uco.publiuco.business.business.EstadoCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.EstadoCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoCategoriaEntity;

public final class EstadoCategoriaBusinessImpl implements EstadoCategoriaBusiness{
	
	private DAOFactory daoFactory;

	public EstadoCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoCategoriaDomain domain) {
		final EstadoCategoriaEntity entity = EstadoCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoCategoriaDAO().create(entity);

	}

	@Override
	public final List<EstadoCategoriaDomain> list(final EstadoCategoriaDomain domain) {
		
		final EstadoCategoriaEntity entity = EstadoCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoCategoriaEntity> resultEntityList = daoFactory.getEstadoCategoriaDAO().read(entity);
		
		return EstadoCategoriaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoCategoriaDomain domain) {
		final EstadoCategoriaEntity entity = EstadoCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoCategoriaDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoCategoriaDomain domain) {
		final EstadoCategoriaEntity entity = EstadoCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoCategoriaDAO().delete(entity);

	}

}

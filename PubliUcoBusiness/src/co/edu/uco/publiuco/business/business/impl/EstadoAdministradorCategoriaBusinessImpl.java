package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoAdministradorCategoriaAssembler;
import co.edu.uco.publiuco.business.business.EstadoAdministradorCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.EstadoAdministradorCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoAdministradorCategoriaEntity;

public final class EstadoAdministradorCategoriaBusinessImpl implements EstadoAdministradorCategoriaBusiness {
	
	private DAOFactory daoFactory;

	public EstadoAdministradorCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoAdministradorCategoriaDomain domain) {
		final EstadoAdministradorCategoriaEntity entity = EstadoAdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoAdministradorCategoriaDAO().create(entity);

	}

	@Override
	public final List<EstadoAdministradorCategoriaDomain> list(final EstadoAdministradorCategoriaDomain domain) {
		
		final EstadoAdministradorCategoriaEntity entity = EstadoAdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoAdministradorCategoriaEntity> resultEntityList = daoFactory.getEstadoAdministradorCategoriaDAO().read(entity);
		
		return EstadoAdministradorCategoriaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoAdministradorCategoriaDomain domain) {
		final EstadoAdministradorCategoriaEntity entity = EstadoAdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoAdministradorCategoriaDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoAdministradorCategoriaDomain domain) {
		final EstadoAdministradorCategoriaEntity entity = EstadoAdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoAdministradorCategoriaDAO().delete(entity);

	}

}

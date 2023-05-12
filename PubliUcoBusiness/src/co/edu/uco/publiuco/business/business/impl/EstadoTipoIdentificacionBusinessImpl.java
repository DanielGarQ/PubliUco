package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoIdentificacionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoIdentificacionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoIdentificacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoIdentificacionEntity;

public final class EstadoTipoIdentificacionBusinessImpl implements EstadoTipoIdentificacionBusiness{
	
	private DAOFactory daoFactory;

	public EstadoTipoIdentificacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoTipoIdentificacionDomain domain) {
		final EstadoTipoIdentificacionEntity entity = EstadoTipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoIdentificacionDAO().create(entity);

	}

	@Override
	public final List<EstadoTipoIdentificacionDomain> list(final EstadoTipoIdentificacionDomain domain) {
		
		final EstadoTipoIdentificacionEntity entity = EstadoTipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoTipoIdentificacionEntity> resultEntityList = daoFactory.getEstadoTipoIdentificacionDAO().read(entity);
		
		return EstadoTipoIdentificacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoTipoIdentificacionDomain domain) {
		final EstadoTipoIdentificacionEntity entity = EstadoTipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoIdentificacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoTipoIdentificacionDomain domain) {
		final EstadoTipoIdentificacionEntity entity = EstadoTipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoIdentificacionDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoSuscripcionAssembler;
import co.edu.uco.publiuco.business.business.EstadoSuscripcionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoSuscripcionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoSuscripcionEntity;

public final class EstadoSuscripcionBusinessImpl implements EstadoSuscripcionBusiness{
	
	private DAOFactory daoFactory;

	public EstadoSuscripcionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoSuscripcionDomain domain) {
		final EstadoSuscripcionEntity entity = EstadoSuscripcionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoSuscripcionDAO().create(entity);

	}

	@Override
	public final List<EstadoSuscripcionDomain> list(final EstadoSuscripcionDomain domain) {
		
		final EstadoSuscripcionEntity entity = EstadoSuscripcionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoSuscripcionEntity> resultEntityList = daoFactory.getEstadoSuscripcionDAO().read(entity);
		
		return EstadoSuscripcionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoSuscripcionDomain domain) {
		final EstadoSuscripcionEntity entity = EstadoSuscripcionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoSuscripcionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoSuscripcionDomain domain) {
		final EstadoSuscripcionEntity entity = EstadoSuscripcionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoSuscripcionDAO().delete(entity);

	}
	
	

}

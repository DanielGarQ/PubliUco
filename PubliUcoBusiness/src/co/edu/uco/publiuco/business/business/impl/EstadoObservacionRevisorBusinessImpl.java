package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoObservacionRevisorAssembler;
import co.edu.uco.publiuco.business.business.EstadoObservacionRevisorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoObservacionRevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoObservacionRevisorEntity;

public final class EstadoObservacionRevisorBusinessImpl implements EstadoObservacionRevisorBusiness{
	
	private DAOFactory daoFactory;

	public EstadoObservacionRevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoObservacionRevisorDomain domain) {
		final EstadoObservacionRevisorEntity entity = EstadoObservacionRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoObservacionRevisorDAO().create(entity);

	}

	@Override
	public final List<EstadoObservacionRevisorDomain> list(final EstadoObservacionRevisorDomain domain) {
		
		final EstadoObservacionRevisorEntity entity = EstadoObservacionRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoObservacionRevisorEntity> resultEntityList = daoFactory.getEstadoObservacionRevisorDAO().read(entity);
		
		return EstadoObservacionRevisorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoObservacionRevisorDomain domain) {
		final EstadoObservacionRevisorEntity entity = EstadoObservacionRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoObservacionRevisorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoObservacionRevisorDomain domain) {
		final EstadoObservacionRevisorEntity entity = EstadoObservacionRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoObservacionRevisorDAO().delete(entity);

	}

}

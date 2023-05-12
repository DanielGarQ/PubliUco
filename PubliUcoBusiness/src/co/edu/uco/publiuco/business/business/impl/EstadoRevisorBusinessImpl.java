package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoRevisorAssembler;
import co.edu.uco.publiuco.business.business.EstadoRevisorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoRevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoRevisorEntity;

public final class EstadoRevisorBusinessImpl implements EstadoRevisorBusiness{
	
	private DAOFactory daoFactory;

	public EstadoRevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoRevisorDomain domain) {
		final EstadoRevisorEntity entity = EstadoRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRevisorDAO().create(entity);

	}

	@Override
	public final List<EstadoRevisorDomain> list(final EstadoRevisorDomain domain) {
		
		final EstadoRevisorEntity entity = EstadoRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoRevisorEntity> resultEntityList = daoFactory.getEstadoRevisorDAO().read(entity);
		
		return EstadoRevisorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoRevisorDomain domain) {
		final EstadoRevisorEntity entity = EstadoRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRevisorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoRevisorDomain domain) {
		final EstadoRevisorEntity entity = EstadoRevisorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRevisorDAO().delete(entity);

	}

}

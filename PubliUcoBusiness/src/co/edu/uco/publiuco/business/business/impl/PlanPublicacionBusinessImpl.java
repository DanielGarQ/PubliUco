package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PlanPublicacionAssembler;
import co.edu.uco.publiuco.business.business.PlanPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.PlanPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PlanPublicacionEntity;

public final class PlanPublicacionBusinessImpl implements PlanPublicacionBusiness{
	
	private DAOFactory daoFactory;

	public PlanPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PlanPublicacionDomain domain) {
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPlanPublicacionDAO().create(entity);

	}

	@Override
	public final List<PlanPublicacionDomain> list(final PlanPublicacionDomain domain) {
		
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PlanPublicacionEntity> resultEntityList = daoFactory.getPlanPublicacionDAO().read(entity);
		
		return PlanPublicacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PlanPublicacionDomain domain) {
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPlanPublicacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final PlanPublicacionDomain domain) {
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPlanPublicacionDAO().delete(entity);

	}

}

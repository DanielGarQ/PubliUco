package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PlanCategoriaAssembler;
import co.edu.uco.publiuco.business.business.PlanCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.PlanCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PlanCategoriaEntity;

public final class PlanCategoriaBusinessImpl implements PlanCategoriaBusiness{
	
	private DAOFactory daoFactory;

	public PlanCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PlanCategoriaDomain domain) {
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPlanCategoriaDAO().create(entity);

	}

	@Override
	public final List<PlanCategoriaDomain> list(final PlanCategoriaDomain domain) {
		
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PlanCategoriaEntity> resultEntityList = daoFactory.getPlanCategoriaDAO().read(entity);
		
		return PlanCategoriaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PlanCategoriaDomain domain) {
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPlanCategoriaDAO().update(entity);

		

	}

	@Override
	public final void drop(final PlanCategoriaDomain domain) {
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPlanCategoriaDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.CalificacionAssembler;
import co.edu.uco.publiuco.business.business.CalificacionBusiness;
import co.edu.uco.publiuco.business.domain.CalificacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.CalificacionEntity;

public final class CalificacionBusinessImpl implements CalificacionBusiness{
	
	private DAOFactory daoFactory;

	public CalificacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final CalificacionDomain domain) {
		final CalificacionEntity entity = CalificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCalificacionDAO().create(entity);

	}

	@Override
	public final List<CalificacionDomain> list(final CalificacionDomain domain) {
		
		final CalificacionEntity entity = CalificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<CalificacionEntity> resultEntityList = daoFactory.getCalificacionDAO().read(entity);
		
		return CalificacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final CalificacionDomain domain) {
		final CalificacionEntity entity = CalificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCalificacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final CalificacionDomain domain) {
		final CalificacionEntity entity = CalificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCalificacionDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.SuscripcionPublicacionAssembler;
import co.edu.uco.publiuco.business.business.SuscripcionPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.SuscripcionPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.SuscripcionPublicacionEntity;

public final class SuscripcionPublicacionBusinessImpl implements SuscripcionPublicacionBusiness{
	
	private DAOFactory daoFactory;

	public SuscripcionPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final SuscripcionPublicacionDomain domain) {
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionPublicacionDAO().create(entity);

	}

	@Override
	public final List<SuscripcionPublicacionDomain> list(final SuscripcionPublicacionDomain domain) {
		
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<SuscripcionPublicacionEntity> resultEntityList = daoFactory.getSuscripcionPublicacionDAO().read(entity);
		
		return SuscripcionPublicacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final SuscripcionPublicacionDomain domain) {
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionPublicacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final SuscripcionPublicacionDomain domain) {
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionPublicacionDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.HistorialAccesoPublicacionAssembler;
import co.edu.uco.publiuco.business.business.HistorialAccesoPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.HistorialAccesoPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.HistorialAccesoPublicacionEntity;

public final class HistorialAccesoPublicacionBusinessImpl implements HistorialAccesoPublicacionBusiness{
	
	private DAOFactory daoFactory;

	public HistorialAccesoPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final HistorialAccesoPublicacionDomain domain) {
		final HistorialAccesoPublicacionEntity entity = HistorialAccesoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getHistorialAccesoPublicacionDAO().create(entity);

	}

	@Override
	public final List<HistorialAccesoPublicacionDomain> list(final HistorialAccesoPublicacionDomain domain) {
		
		final HistorialAccesoPublicacionEntity entity = HistorialAccesoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<HistorialAccesoPublicacionEntity> resultEntityList = daoFactory.getHistorialAccesoPublicacionDAO().read(entity);
		
		return HistorialAccesoPublicacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final HistorialAccesoPublicacionDomain domain) {
		final HistorialAccesoPublicacionEntity entity = HistorialAccesoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getHistorialAccesoPublicacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final HistorialAccesoPublicacionDomain domain) {
		final HistorialAccesoPublicacionEntity entity = HistorialAccesoPublicacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getHistorialAccesoPublicacionDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoIdentificacionAssembler;
import co.edu.uco.publiuco.business.business.TipoIdentificacionBusiness;
import co.edu.uco.publiuco.business.domain.TipoIdentificacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoIdentificacionEntity;

public final class TipoIdentificacionBusinessImpl implements TipoIdentificacionBusiness{
	
	private DAOFactory daoFactory;

	public TipoIdentificacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().create(entity);

	}

	@Override
	public final List<TipoIdentificacionDomain> list(final TipoIdentificacionDomain domain) {
		
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoIdentificacionEntity> resultEntityList = daoFactory.getTipoIdentificacionDAO().read(entity);
		
		return TipoIdentificacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().delete(entity);

	}

}

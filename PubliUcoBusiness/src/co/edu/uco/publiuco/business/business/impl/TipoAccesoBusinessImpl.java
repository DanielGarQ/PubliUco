package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoAccesoAssembler;
import co.edu.uco.publiuco.business.business.TipoAccesoBusiness;
import co.edu.uco.publiuco.business.domain.TipoAccesoDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoAccesoEntity;

public final class TipoAccesoBusinessImpl implements TipoAccesoBusiness{
	
	private DAOFactory daoFactory;

	public TipoAccesoBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoAccesoDomain domain) {
		final TipoAccesoEntity entity = TipoAccesoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoAccesoDAO().create(entity);

	}

	@Override
	public final List<TipoAccesoDomain> list(final TipoAccesoDomain domain) {
		
		final TipoAccesoEntity entity = TipoAccesoAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoAccesoEntity> resultEntityList = daoFactory.getTipoAccesoDAO().read(entity);
		
		return TipoAccesoAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoAccesoDomain domain) {
		final TipoAccesoEntity entity = TipoAccesoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoAccesoDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoAccesoDomain domain) {
		final TipoAccesoEntity entity = TipoAccesoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoAccesoDAO().delete(entity);

	}

}

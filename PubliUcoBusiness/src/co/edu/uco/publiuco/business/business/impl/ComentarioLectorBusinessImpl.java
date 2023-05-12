package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ComentarioLectorAssembler;
import co.edu.uco.publiuco.business.business.ComentarioLectorBusiness;
import co.edu.uco.publiuco.business.domain.ComentarioLectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.ComentarioLectorEntity;

public final class ComentarioLectorBusinessImpl implements ComentarioLectorBusiness {
	
	private DAOFactory daoFactory;

	public ComentarioLectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final ComentarioLectorDomain domain) {
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getComentarioLectorDAO().create(entity);

	}

	@Override
	public final List<ComentarioLectorDomain> list(final ComentarioLectorDomain domain) {
		
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<ComentarioLectorEntity> resultEntityList = daoFactory.getComentarioLectorDAO().read(entity);
		
		return ComentarioLectorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final ComentarioLectorDomain domain) {
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getComentarioLectorDAO().update(entity);

		

	}

	@Override
	public final void drop(final ComentarioLectorDomain domain) {
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getComentarioLectorDAO().delete(entity);

	}

}

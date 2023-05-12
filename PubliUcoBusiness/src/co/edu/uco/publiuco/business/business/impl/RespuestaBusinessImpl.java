package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.RespuestaAssembler;
import co.edu.uco.publiuco.business.business.RespuestaBusiness;
import co.edu.uco.publiuco.business.domain.RespuestaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.RespuestaEntity;

public final class RespuestaBusinessImpl implements RespuestaBusiness {
	
	private DAOFactory daoFactory;

	public RespuestaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final RespuestaDomain domain) {
		final RespuestaEntity entity = RespuestaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRespuestaDAO().create(entity);

	}

	@Override
	public final List<RespuestaDomain> list(final RespuestaDomain domain) {
		
		final RespuestaEntity entity = RespuestaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<RespuestaEntity> resultEntityList = daoFactory.getRespuestaDAO().read(entity);
		
		return RespuestaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final RespuestaDomain domain) {
		final RespuestaEntity entity = RespuestaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRespuestaDAO().update(entity);

		

	}

	@Override
	public final void drop(final RespuestaDomain domain) {
		final RespuestaEntity entity = RespuestaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRespuestaDAO().delete(entity);

	}

}

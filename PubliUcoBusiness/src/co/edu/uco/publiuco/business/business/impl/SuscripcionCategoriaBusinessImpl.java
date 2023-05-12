package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.SuscripcionCategoriaAssembler;
import co.edu.uco.publiuco.business.business.SuscripcionCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.SuscripcionCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.SuscripcionCategoriaEntity;

public final class SuscripcionCategoriaBusinessImpl implements SuscripcionCategoriaBusiness{
	
	private DAOFactory daoFactory;

	public SuscripcionCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final SuscripcionCategoriaDomain domain) {
		final SuscripcionCategoriaEntity entity = SuscripcionCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionCategoriaDAO().create(entity);

	}

	@Override
	public final List<SuscripcionCategoriaDomain> list(final SuscripcionCategoriaDomain domain) {
		
		final SuscripcionCategoriaEntity entity = SuscripcionCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<SuscripcionCategoriaEntity> resultEntityList = daoFactory.getSuscripcionCategoriaDAO().read(entity);
		
		return SuscripcionCategoriaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final SuscripcionCategoriaDomain domain) {
		final SuscripcionCategoriaEntity entity = SuscripcionCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionCategoriaDAO().update(entity);

		

	}

	@Override
	public final void drop(final SuscripcionCategoriaDomain domain) {
		final SuscripcionCategoriaEntity entity = SuscripcionCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionCategoriaDAO().delete(entity);

	}

}

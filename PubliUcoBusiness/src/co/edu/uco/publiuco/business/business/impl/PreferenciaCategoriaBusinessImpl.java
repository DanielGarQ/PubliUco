package co.edu.uco.publiuco.business.business.impl;

import java.util.List;
import co.edu.uco.publiuco.business.assembler.concrete.PreferenciaCategoriaAssembler;
import co.edu.uco.publiuco.business.business.PreferenciaCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.PreferenciaCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PreferenciaCategoriaEntity;

public final class PreferenciaCategoriaBusinessImpl implements PreferenciaCategoriaBusiness{
	
	private DAOFactory daoFactory;

	public PreferenciaCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().create(entity);

	}

	@Override
	public final List<PreferenciaCategoriaDomain> list(final PreferenciaCategoriaDomain domain) {
		
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PreferenciaCategoriaEntity> resultEntityList = daoFactory.getPreferenciaCategoriaDAO().read(entity);
		
		return PreferenciaCategoriaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().update(entity);

		

	}

	@Override
	public final void drop(final PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.AdministradorCategoriaAssembler;
import co.edu.uco.publiuco.business.business.AdministradorCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.AdministradorCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.AdministradorCategoriaEntity;

public final class AdministradorCategoriaBusinessImpl implements AdministradorCategoriaBusiness {
	
	private DAOFactory daoFactory;

	public AdministradorCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final AdministradorCategoriaDomain domain) {
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getAdministradorCategoriaDAO().create(entity);

	}

	@Override
	public final List<AdministradorCategoriaDomain> list(final AdministradorCategoriaDomain domain) {
		
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<AdministradorCategoriaEntity> resultEntityList = daoFactory.getAdministradorCategoriaDAO().read(entity);
		
		return AdministradorCategoriaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final AdministradorCategoriaDomain domain) {
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getAdministradorCategoriaDAO().update(entity);

		

	}

	@Override
	public final void drop(final AdministradorCategoriaDomain domain) {
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getAdministradorCategoriaDAO().delete(entity);

	}

}

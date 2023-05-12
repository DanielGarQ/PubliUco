package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PreferenciaEscritorAssembler;
import co.edu.uco.publiuco.business.business.PreferenciaEscritorBusiness;
import co.edu.uco.publiuco.business.domain.PreferenciaEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PreferenciaEscritorEntity;

public final class PreferenciaEscritorBusinessImpl implements PreferenciaEscritorBusiness{
	
	private DAOFactory daoFactory;

	public PreferenciaEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PreferenciaEscritorDomain domain) {
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaEscritorDAO().create(entity);

	}

	@Override
	public final List<PreferenciaEscritorDomain> list(final PreferenciaEscritorDomain domain) {
		
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PreferenciaEscritorEntity> resultEntityList = daoFactory.getPreferenciaEscritorDAO().read(entity);
		
		return PreferenciaEscritorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PreferenciaEscritorDomain domain) {
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaEscritorDAO().update(entity);

		

	}

	@Override
	public final void drop(final PreferenciaEscritorDomain domain) {
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaEscritorDAO().delete(entity);

	}

}

package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.TipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.TipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

public final class TipoRelacionInstitucionBusinessImpl implements TipoRelacionInstitucionBusiness{
	
	private DAOFactory daoFactory;

	public TipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoRelacionInstitucionDomain domain) {
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRelacionInstitucionDAO().create(entity);

	}

	@Override
	public final List<TipoRelacionInstitucionDomain> list(final TipoRelacionInstitucionDomain domain) {
		
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoRelacionInstitucionEntity> resultEntityList = daoFactory.getTipoRelacionInstitucionDAO().read(entity);
		
		return TipoRelacionInstitucionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoRelacionInstitucionDomain domain) {
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRelacionInstitucionDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoRelacionInstitucionDomain domain) {
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRelacionInstitucionDAO().delete(entity);

	}

}

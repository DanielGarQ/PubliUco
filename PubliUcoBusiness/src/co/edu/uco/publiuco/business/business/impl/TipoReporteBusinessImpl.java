package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoReporteAssembler;
import co.edu.uco.publiuco.business.business.TipoReporteBusiness;
import co.edu.uco.publiuco.business.domain.TipoReporteDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoReporteEntity;

public final class TipoReporteBusinessImpl implements TipoReporteBusiness{
	
	private DAOFactory daoFactory;

	public TipoReporteBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoReporteDomain domain) {
		final TipoReporteEntity entity = TipoReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoReporteDAO().create(entity);

	}

	@Override
	public final List<TipoReporteDomain> list(final TipoReporteDomain domain) {
		
		final TipoReporteEntity entity = TipoReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoReporteEntity> resultEntityList = daoFactory.getTipoReporteDAO().read(entity);
		
		return TipoReporteAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoReporteDomain domain) {
		final TipoReporteEntity entity = TipoReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoReporteDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoReporteDomain domain) {
		final TipoReporteEntity entity = TipoReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoReporteDAO().delete(entity);

	}

}

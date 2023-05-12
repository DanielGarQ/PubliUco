package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ReporteAssembler;
import co.edu.uco.publiuco.business.business.ReporteBusiness;
import co.edu.uco.publiuco.business.domain.ReporteDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.ReporteEntity;

public final class ReporteBusinessImpl implements ReporteBusiness{
	
	private DAOFactory daoFactory;

	public ReporteBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final ReporteDomain domain) {
		final ReporteEntity entity = ReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getReporteDAO().create(entity);

	}

	@Override
	public final List<ReporteDomain> list(final ReporteDomain domain) {
		
		final ReporteEntity entity = ReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<ReporteEntity> resultEntityList = daoFactory.getReporteDAO().read(entity);
		
		return ReporteAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final ReporteDomain domain) {
		final ReporteEntity entity = ReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getReporteDAO().update(entity);

		

	}

	@Override
	public final void drop(final ReporteDomain domain) {
		final ReporteEntity entity = ReporteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getReporteDAO().delete(entity);

	}

}

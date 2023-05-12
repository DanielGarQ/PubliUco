package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoEscritorAssembler;
import co.edu.uco.publiuco.business.business.EstadoEscritorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoEscritorEntity;

public final class EstadoEscritorBusinessImpl implements EstadoEscritorBusiness{
	
	private DAOFactory daoFactory;

	public EstadoEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoEscritorDomain domain) {
		final EstadoEscritorEntity entity = EstadoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoEscritorDAO().create(entity);

	}

	@Override
	public final List<EstadoEscritorDomain> list(final EstadoEscritorDomain domain) {
		
		final EstadoEscritorEntity entity = EstadoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoEscritorEntity> resultEntityList = daoFactory.getEstadoEscritorDAO().read(entity);
		
		return EstadoEscritorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoEscritorDomain domain) {
		final EstadoEscritorEntity entity = EstadoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoEscritorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoEscritorDomain domain) {
		final EstadoEscritorEntity entity = EstadoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoEscritorDAO().delete(entity);

	}

}

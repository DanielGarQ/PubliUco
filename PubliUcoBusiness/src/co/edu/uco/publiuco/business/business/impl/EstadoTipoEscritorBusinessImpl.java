package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoEscritorAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoEscritorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoEscritorEntity;

public final class EstadoTipoEscritorBusinessImpl implements EstadoTipoEscritorBusiness{
	
	private DAOFactory daoFactory;

	public EstadoTipoEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoTipoEscritorDomain domain) {
		final EstadoTipoEscritorEntity entity = EstadoTipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoEscritorDAO().create(entity);

	}

	@Override
	public final List<EstadoTipoEscritorDomain> list(final EstadoTipoEscritorDomain domain) {
		
		final EstadoTipoEscritorEntity entity = EstadoTipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoTipoEscritorEntity> resultEntityList = daoFactory.getEstadoTipoEscritorDAO().read(entity);
		
		return EstadoTipoEscritorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoTipoEscritorDomain domain) {
		final EstadoTipoEscritorEntity entity = EstadoTipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoEscritorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoTipoEscritorDomain domain) {
		final EstadoTipoEscritorEntity entity = EstadoTipoEscritorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoEscritorDAO().delete(entity);

	}

}

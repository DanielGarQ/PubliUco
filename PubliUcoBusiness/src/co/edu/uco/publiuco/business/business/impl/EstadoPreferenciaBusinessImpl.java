package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoPreferenciaAssembler;
import co.edu.uco.publiuco.business.business.EstadoPreferenciaBusiness;
import co.edu.uco.publiuco.business.domain.EstadoPreferenciaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoPreferenciaEntity;

public final class EstadoPreferenciaBusinessImpl implements EstadoPreferenciaBusiness{
	
	private DAOFactory daoFactory;

	public EstadoPreferenciaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoPreferenciaDomain domain) {
		final EstadoPreferenciaEntity entity = EstadoPreferenciaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPreferenciaDAO().create(entity);

	}

	@Override
	public final List<EstadoPreferenciaDomain> list(final EstadoPreferenciaDomain domain) {
		
		final EstadoPreferenciaEntity entity = EstadoPreferenciaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoPreferenciaEntity> resultEntityList = daoFactory.getEstadoPreferenciaDAO().read(entity);
		
		return EstadoPreferenciaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoPreferenciaDomain domain) {
		final EstadoPreferenciaEntity entity = EstadoPreferenciaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPreferenciaDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoPreferenciaDomain domain) {
		final EstadoPreferenciaEntity entity = EstadoPreferenciaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoPreferenciaDAO().delete(entity);

	}

}

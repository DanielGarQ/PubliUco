package co.edu.uco.publiuco.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.crosscutting.exception.PubliUcoBusinessException;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionBusinessImpl implements EstadoTipoRelacionInstitucionBusiness {

	private DAOFactory daoFactory;

	public EstadoTipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoTipoRelacionInstitucionDomain domain) {
		
		UUID identificador;
		EstadoTipoRelacionInstitucionEntity entityTmp;
		List<EstadoTipoRelacionInstitucionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = EstadoTipoRelacionInstitucionEntity.createWithIdentificador(identificador);
			result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = EstadoTipoRelacionInstitucionEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El stado de tipo relaciuon institucion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw PubliUcoBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new EstadoTipoRelacionInstitucionDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(entity);

	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {
		
		final EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoTipoRelacionInstitucionEntity> resultEntityList = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entity);
		
		return EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoTipoRelacionInstitucionDomain domain) {
		final EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().delete(entity);

	}

}

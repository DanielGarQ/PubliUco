package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoTipoRelacionInstitucionBusinessImpl;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliUcoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliUcoException;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

public final class EstadoTipoRelacionInstitucionFacadeImpl implements EstadoTipoRelacionInstitucionFacade {
	
	private final DAOFactory daoFactory;
	private final EstadoTipoRelacionInstitucionBusiness business;
	
	public EstadoTipoRelacionInstitucionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new EstadoTipoRelacionInstitucionBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(EstadoTipoRelacionInstitucionDTO dto) {
		try {
			daoFactory.iniciarTransaccion();
			final EstadoTipoRelacionInstitucionDomain domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto);
			
			business.register(domain);
			
			daoFactory.confirmarTransaccion();
		}catch (final PubliUcoException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage="Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo relacion para una institución. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			var technicalMessage="Se ha presentado una excepción no conocida al momento de registrar el nuevo estado tipo relación institucion. por favor valide la traza completa de la excepciópresentada...";
			
			throw PubliUcoBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDTO> list(EstadoTipoRelacionInstitucionDTO dto) {
		final var domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainListFromEntityList(dto);
	}

	@Override
	public void modify(EstadoTipoRelacionInstitucionDTO dto) {
		try {
			daoFactory.iniciarTransaccion();
			final EstadoTipoRelacionInstitucionDomain domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto);
			
			business.modify(domain);
			
			daoFactory.confirmarTransaccion();
		}catch (final PubliUcoException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage="Se ha presentado un problema tratando de modificar la informacion del estado tipo relacion para una institución. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			var technicalMessage="Se ha presentado una excepción no conocida al momento de modificar el estado tipo relación institucion. por favor valide la traza completa de la excepciópresentada...";
			
			throw PubliUcoBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(EstadoTipoRelacionInstitucionDTO dto) {
		try {
			daoFactory.iniciarTransaccion();
			final EstadoTipoRelacionInstitucionDomain domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto);
			
			business.drop(domain);
			
			daoFactory.confirmarTransaccion();
		}catch (final PubliUcoException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage="Se ha presentado un problema tratando de eliminar el tipo relacion para una institución. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			var technicalMessage="Se ha presentado una excepción no conocida al momento de eliminar el nuevo estado tipo relación institucion. por favor valide la traza completa de la excepciópresentada...";
			
			throw PubliUcoBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}

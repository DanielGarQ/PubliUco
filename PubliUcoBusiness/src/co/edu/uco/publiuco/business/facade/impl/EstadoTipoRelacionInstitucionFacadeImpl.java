package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoTipoRelacionInstitucionBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliUcoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliUcoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoRelacionInstitucionFacadeImplMessages;
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
			final var domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final PubliUcoException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= EstadoTipoRelacionInstitucionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoTipoRelacionInstitucionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDTO> list(final EstadoTipoRelacionInstitucionDTO dto) {
		try {
			final var domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return EstadoTipoRelacionInstitucionAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final PubliUcoException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= EstadoTipoRelacionInstitucionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoTipoRelacionInstitucionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(EstadoTipoRelacionInstitucionDTO dto) {
		try {
			
			final var domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final PubliUcoException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = EstadoTipoRelacionInstitucionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoTipoRelacionInstitucionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(EstadoTipoRelacionInstitucionDTO dto) {
		try {
			
			final var domain = EstadoTipoRelacionInstitucionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final PubliUcoException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= EstadoTipoRelacionInstitucionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoTipoRelacionInstitucionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw PubliUcoBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}

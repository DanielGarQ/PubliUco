package co.edu.uco.publiuco.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.publiuco.api.controller.response.Response;
import co.edu.uco.publiuco.api.validator.estadotiporelacioninstitucion.RegistrarEstadoTipoRelacionInstitucionValidation;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.business.facade.impl.EstadoTipoRelacionInstitucionFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliUcoException;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

@RestController
@RequestMapping("publiuco/api/v1/estadotiporelacioninstitucion")
public final class EstadoTipoRelacionInstitucionController {
	
	private Logger log = LoggerFactory.getLogger(EstadoTipoRelacionInstitucionController.class);
	
	private EstadoTipoRelacionInstitucionFacade facade;
	
	@GetMapping("/dummy")
	public EstadoTipoRelacionInstitucionDTO dummy() {
		return EstadoTipoRelacionInstitucionDTO.create();
	}
	
	@GetMapping
	public ResponseEntity<Response<EstadoTipoRelacionInstitucionDTO>> list(@RequestBody EstadoTipoRelacionInstitucionDTO dto){
		
		List<EstadoTipoRelacionInstitucionDTO> list = new ArrayList<>();
		
		List<String> messages = new ArrayList<>();
		messages.add("Estados de tipos de relación institucion consultados exitosamente");
		
		Response<EstadoTipoRelacionInstitucionDTO> response = new Response<>(list, messages);
		
		return new ResponseEntity<Response<EstadoTipoRelacionInstitucionDTO>>(response, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO listById(@PathVariable UUID id){
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(id);
	}
	
	@PostMapping
	public ResponseEntity<Response<EstadoTipoRelacionInstitucionDTO>> create(@RequestBody EstadoTipoRelacionInstitucionDTO dto) {
		
		var statusCode = HttpStatus.OK;
		var response = new Response<EstadoTipoRelacionInstitucionDTO>();
		
		try {
			var result = RegistrarEstadoTipoRelacionInstitucionValidation.validate(dto);
			
			if (result.getMessages().isEmpty()) {
				facade = new EstadoTipoRelacionInstitucionFacadeImpl();
				facade.register(dto);
				response.getMessages().add("El nuevo tipo relación institucion se ha registrado de forma satidfactoria");
			}else {
				statusCode = HttpStatus.BAD_REQUEST;
				response.setMessages(result.getMessages());
			}
			
		}catch(PubliUcoException exception) {
			statusCode = HttpStatus.BAD_REQUEST;
			response.getMessages().add(exception.getUserMessage());
			log.error(exception.getType().toString().concat("-").concat(exception.getTechnicalMessage()), exception);
		}catch (final Exception exception) {
			statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			response.getMessages().add("Se ha presentadop un problema inesperado, por favor intente de nuevo. Si el problema persiste contacte al administrador de la aplicacion");
			log.error("se ha presentado un problmea inesperado.Por favor validar la consola de errores...", exception);
			exception.printStackTrace();
		}
		
		return new ResponseEntity<>(response, statusCode);
	}
	
	@PutMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO update(@PathVariable UUID id, @RequestBody EstadoTipoRelacionInstitucionDTO dto) {
		return dto.setIdentificador(id);
	}
	
	@DeleteMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO delete(@PathVariable UUID id) {
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(id);
	}


}

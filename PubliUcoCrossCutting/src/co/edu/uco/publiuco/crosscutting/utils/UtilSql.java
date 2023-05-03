package co.edu.uco.publiuco.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliUcoCrossCuttingException;

public class UtilSql {
	
	private UtilSql() {
		super();
	}
	
	public static boolean connectionIsOpen(final Connection connection) {
		if (UtilObject.isNull(connection)) {
			throw PubliUcoCrossCuttingException.create("No es posible validar si una conexion esta abierta cuando se encuentra nula....");
		}
		try {
			return !connection.isClosed();
		}catch(final SQLException exception) {
			var userMessage = "Se ha presentado un problmea tratando de" + "validar si una conexion con la fuente de informacion" + "estaba o no abierta";
			var technicalMessage = "Se ha presentado una exception de tipo SQLException" + "tratando de validar si la conexion estaba o no abierta. Por favor" + "valida la traza de errores completa de la excepción presentada...";
			
		}
		
	}

}

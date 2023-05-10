package co.edu.uco.publiuco.crosscutting.utils;

public final class Messages {
	
	public static final class UtilSqlMessages{
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problmea tratando de validar si una conexion con la fuente de informacion estaba o no abierta";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "Se ha presentado una exception de tipo SQLException tratando de validar si la conexion está abierta cuando se encuentra nula... ";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado una exception de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepción presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado una exception inesperada de tipo Exception tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepción presentada...";
	}

}

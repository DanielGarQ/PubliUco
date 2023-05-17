package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.uco.publiuco.crosscutting.exception.PubliUcoDataException;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.relational.SqlDAO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionSqlServerDAO extends SqlDAO<EstadoTipoRelacionInstitucionEntity> implements EstadoTipoRelacionInstitucionDAO {
	
	public EstadoTipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final EstadoTipoRelacionInstitucionEntity entity) {
		
		var sqlStatement = "INSERT INTO EstadoTipoRelacionInstitucion(codigo, nombre, descripcion) VALUES (?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getDescripcion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información del nuevo Estado";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información del nuevo Estado";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionEntity> read(final EstadoTipoRelacionInstitucionEntity entity) {
		var sqlStatement = new StringBuilder();
		var parameters = new ArrayList<>();
		
		sqlStatement.append(prepareSelect());
		sqlStatement.append(prepareFrom());
		sqlStatement.append(prepareWhere(entity, parameters));
		sqlStatement.append(prepareOrderBy());
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement.toString())){
			
			
		} catch (SQLException exception) {
			
		} catch (Exception exception) {
			
		}
		return null;
	}

	@Override
	public final void update(final EstadoTipoRelacionInstitucionEntity entity) {
		
		var sqlStatement = "UPDATE EstadoTipoRelacionInstitucion SET nombre= ?, Descripcion= ? WHERE codigo=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getDescripcion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información del nuevo Estado";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del nuevo Estado";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final EstadoTipoRelacionInstitucionEntity entity) {
		var sqlStatement = "DELETE FROM EstadoTipoRelacionInstitucion WHERE codigo=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información del nuevo Estado";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información del nuevo Estado";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw PubliUcoDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected String prepareSelect() {
		return "SELECT identificador, nombre, descripcion";
	}

	@Override
	protected String prepareFrom() {
		return "FROM EstadoTipoRelacionInstitucion";
	}

	@Override
	protected String prepareWhere(EstadoTipoRelacionInstitucionEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(null, null);
		var setWhere = true;
		
		return where.toString();
		
		if(!UtilObject.isNull(entity)) {
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getNombre())) {
				parameters.add(entity.getNombre());
				where.append(setWhere ? "WHERE " : "AND").append("nombre=? ");
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getDescripcion())) {
				parameters.add(entity.getDescripcion());
				where.append("WHERE descripçion LIKE %?%");
			}
		}
	}

	@Override
	protected String prepareOrderBy() {
		return "ORDER BY nombre ASC";
	}

}

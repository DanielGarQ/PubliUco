package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoTipoIdentificacionEntity;

public interface EstadoTipoIdentificacionDAO {
	
void create(EstadoTipoIdentificacionEntity entity);
	
	List<EstadoTipoIdentificacionEntity> read(EstadoTipoIdentificacionEntity entity);
	
	void update(EstadoTipoIdentificacionEntity entity);
	
	void delete(EstadoTipoIdentificacionEntity entity);

}

package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.RespuestaEntity;

public interface RespuestaDAO {
	
void create(RespuestaEntity entity);
	
	List<RespuestaEntity> read(RespuestaEntity entity);
	
	void update(RespuestaEntity entity);
	
	void delete(RespuestaEntity entity);

}

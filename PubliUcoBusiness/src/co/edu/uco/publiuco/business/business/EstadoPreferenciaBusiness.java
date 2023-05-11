package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoPreferenciaDomain;

public interface EstadoPreferenciaBusiness {
	
void register(EstadoPreferenciaDomain domain);
	
	List<EstadoPreferenciaDomain> list(EstadoPreferenciaDomain domain);
	
	void modify(EstadoPreferenciaDomain domain);
	
	void drop(EstadoPreferenciaDomain domain);

}

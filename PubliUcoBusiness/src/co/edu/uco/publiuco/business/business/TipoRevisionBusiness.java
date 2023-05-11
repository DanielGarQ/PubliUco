package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.TipoRevisionDomain;

public interface TipoRevisionBusiness {
	
void register(TipoRevisionDomain domain);
	
	List<TipoRevisionDomain> list(TipoRevisionDomain domain);
	
	void modify(TipoRevisionDomain domain);
	
	void drop(TipoRevisionDomain domain);

}

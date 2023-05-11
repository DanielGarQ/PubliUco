package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.PersonaDomain;

public interface PersonaBusiness {
	
void register(PersonaDomain domain);
	
	List<PersonaDomain> list(PersonaDomain domain);
	
	void modify(PersonaDomain domain);
	
	void drop(PersonaDomain domain);

}

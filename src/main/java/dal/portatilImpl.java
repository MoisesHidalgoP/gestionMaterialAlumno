package dal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class portatilImpl implements portatilServicio {
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public void insertarAltaPortatil(portatil alta) {
		// TODO Auto-generated method stub
		em.persist(alta);
	}

}
